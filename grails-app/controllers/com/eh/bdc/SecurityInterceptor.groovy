package com.eh.bdc
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/7/2019
 * version 2.0.0.00
 */
class SecurityInterceptor {

    AuthenticationService authenticationService

    SecurityInterceptor() {
        matchAll().excludes(controller: "authentication")/*.excludes(controller: "main")*/
    }

    boolean before() {
        if (!authenticationService.isAuthenticated()) {
            redirect(controller: "authentication", action: "login")
            return false
        }
        return true
    }
}
