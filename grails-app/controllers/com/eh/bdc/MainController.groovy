package com.eh.bdc
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/10/2019
 * version 2.0.0.00
 */
class MainController {

    MainService mainService
    AuthenticationService authenticationService

    def index() { }

    def resetPassword(){ }

    def reset(){
        def response = mainService.matchPassword(params.password)
        if (!response.isSuccess) {
            flash.message = AppUtil.infoMessage(g.message(code: "previous.password.not.match"), false)
            redirect(controller: "main", action: "resetPassword")
        } else {
            if(params.password1 == params.password2){
                Admin admin = authenticationService.getAdmin()
                admin.setPassword(params.password1)
                admin.save(flush: true)
                if (!admin.hasErrors()){
                    flash.message = AppUtil.infoMessage(g.message(code: "password.changed"), true)
                    response.isSuccess = true
                }
            } else {
                flash.message = AppUtil.infoMessage(g.message(code: "new.password.not.match"), false)
            }
            redirect(controller: "main", action: "resetPassword")
        }
    }
}
