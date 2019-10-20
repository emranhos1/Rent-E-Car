package com.eh.bdc
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/9/2019
 * version 2.0.0.00
 */
class AuthenticationService {

    private static final String AUTHORIZED = "AUTHORIZED"

    def setAdminAuthorization(Admin admin) {
        def authorization = [isLoggedIn: true, admin: admin]
        AppUtil.getAppSession()[AUTHORIZED] = authorization
    }

    def doLogin(String username, String password){
        password = password.encodeAsMD5()
        Admin admin = Admin.findByUsernameAndPassword(username, password)
        if (admin){
            setAdminAuthorization(admin)
            return true
        }
        return false
    }

    boolean isAuthenticated(){
        def authorization = AppUtil.getAppSession()[AUTHORIZED]
        if (authorization && authorization.isLoggedIn){
            return true
        }
        return false
    }

    def getAdmin(){
        def authorization = AppUtil.getAppSession()[AUTHORIZED]
        return authorization?.admin
    }

    def getAdminName(){
        def admin = getAdmin()
        return "${admin.firstName} ${admin.lastName}"
    }
}
