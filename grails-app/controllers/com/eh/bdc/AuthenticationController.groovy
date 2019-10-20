package com.eh.bdc
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/9/2019
 * version 2.0.0.00
 */
class AuthenticationController {

    AuthenticationService authenticationService

    def login() {
        if (authenticationService.isAuthenticated()) {
            redirect(controller: "admin", action: "index")
        }
    }

    def doLogin() {
        if (authenticationService.doLogin(params.username, params.password)) {
            redirect(controller: "admin", action: "index")
        } else {
            flash.message = AppUtil.infoMessage(g.message(code: "username.password.not.valid"), false)
            redirect(controller: "authentication", action: "login")
        }
    }

    def logout() {
        session.invalidate()
        redirect(controller: "authentication", action: "login")
    }
}
