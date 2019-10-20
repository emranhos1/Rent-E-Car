package com.eh.bdc
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/7/2019
 * version 2.0.0.00
 */
class OutletController {

    OutletService outletService

    def index() {
        def response = outletService.list(params)
        [outletList: response.list, total:response.count]
    }

    def details(Integer id) {
        def response = outletService.getById(id)
        if (!response){
            redirect(controller: "outlet", action: "index")
        }else{
            [outlet: response]
        }
    }

    def create() {
        [outlet: flash.redirectParams]
    }

    def save() {
        def response = outletService.save(params)
        if (!response.isSuccess) {
            flash.redirectParams = response.model
            flash.message = AppUtil.infoMessage(g.message(code: "unable.to.save.outlet"), false)
            redirect(controller: "outlet", action: "create")
        }else{
            flash.message = AppUtil.infoMessage(g.message(code: "saved.outlet"))
            redirect(controller: "outlet", action: "create")
        }
    }

    def edit(Integer id) {
        if (flash.redirectParams) {
            [outlet: flash.redirectParams]
        } else {
            def response = outletService.getById(id)
            if (!response) {
                flash.message = AppUtil.infoMessage(g.message(code: "not.responding"), false)
                redirect(controller: "outlet", action: "index")
            } else {
                [outlet: response]
            }
        }
    }

    def update() {
        def response = outletService.getById(params.id)
        if (!response){
            flash.message = AppUtil.infoMessage(g.message(code: "not.responding"), false)
            redirect(controller: "outlet", action: "index")
        }else{
            response = outletService.update(response, params)
            if (!response.isSuccess){
                flash.redirectParams = response.model
                flash.message = AppUtil.infoMessage(g.message(code: "unable.to.update.outlet"), false)
                redirect(controller: "outlet", action: "edit")
            }else{
                flash.message = AppUtil.infoMessage(g.message(code: "updated.outlet"))
                redirect(controller: "outlet", action: "index")
            }
        }
    }

    def delete(Integer id) {
        def response = outletService.getById(id)
        if (!response){
            flash.message = AppUtil.infoMessage(g.message(code: "not.responding"), false)
            redirect(controller: "outlet", action: "index")
        }else{
            response = outletService.delete(response)
            if (!response){
                flash.message = AppUtil.infoMessage(g.message(code: "unable.to.delete.outlet"), false)
            }else{
                flash.message = AppUtil.infoMessage(g.message(code: "deleted.outlet"))
            }
            redirect(controller: "outlet", action: "index")
        }
    }
}
