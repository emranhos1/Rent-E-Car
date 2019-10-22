package com.eh.bdc

class MainService {

    AuthenticationService authenticationService

    def matchPassword(String password){
        password = password.encodeAsMD5()
        Admin admin = authenticationService.getAdmin()
        def response = AppUtil.saveResponse(false, admin)
        if(admin.getPassword() == password){
            response.isSuccess = true
        }
        return response
    }
}
