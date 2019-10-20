package com.eh.bdc
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/7/2019
 * version 2.0.0.00
 */
class RentECarController {

    RentECarService rentECarService

    def index() {
        def response = rentECarService.list(params)
        [rentECarList: response.list, total:response.count]
    }

    def details(Integer id) {
        def response = rentECarService.getById(id)
        if (!response){
            redirect(controller: "rentECar", action: "index")
        }else{
            [rentECar: response]
        }
    }

    def create() {
        [rentECar: flash.redirectParams]
    }

    def save() {
        def response = rentECarService.save(params)
        if (!response.isSuccess) {
            flash.redirectParams = response.model
            flash.message = AppUtil.infoMessage(g.message(code: "unable.to.save.rentECar"), false)
            redirect(controller: "rentECar", action: "create")
        }else{
            flash.message = AppUtil.infoMessage(g.message(code: "saved.rentECar"))
            redirect(controller: "rentECar", action: "create")
        }
    }

    def edit(Integer id) {
        if (flash.redirectParams) {
            [rentECar: flash.redirectParams]
        } else {
            def response = rentECarService.getById(id)
            if (!response) {
                flash.message = AppUtil.infoMessage(g.message(code: "not.responding"), false)
                redirect(controller: "rentECar", action: "index")
            } else {
                [rentECar: response]
            }
        }
    }

    def update() {
        def response = rentECarService.getById(params.id)
        if (!response){
            flash.message = AppUtil.infoMessage(g.message(code: "not.responding"), false)
            redirect(controller: "rentECar", action: "index")
        }else{
            response = rentECarService.update(response, params)
            if (!response.isSuccess){
                flash.redirectParams = response.model
                flash.message = AppUtil.infoMessage(g.message(code: "unable.to.update.rentECar"), false)
                redirect(controller: "rentECar", action: "edit")
            }else{
                flash.message = AppUtil.infoMessage(g.message(code: "updated.rentECar"))
                redirect(controller: "rentECar", action: "index")
            }
        }
    }

    def delete(Integer id) {
        def response = rentECarService.getById(id)
        if (!response){
            flash.message = AppUtil.infoMessage(g.message(code: "not.responding"), false)
            redirect(controller: "rentECar", action: "index")
        }else{
            response = rentECarService.delete(response)
            if (!response){
                flash.message = AppUtil.infoMessage(g.message(code: "unable.to.delete.rentECar"), false)
            }else{
                flash.message = AppUtil.infoMessage(g.message(code: "deleted.rentECar"))
            }
            redirect(controller: "rentECar", action: "index")
        }
    }
}
