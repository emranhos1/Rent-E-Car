package com.eh.bdc
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/9/2019
 * version 2.0.0.00
 */
class AdminController {

    RentECarService rentECarService
    OutletService outletService

    def index() {
        def rentECarResponse = rentECarService.list(params)
        def outletResponse = outletService.list(params)
        [outletList: outletResponse.list, total:outletResponse.count, rentECarList: rentECarResponse.list, total:rentECarResponse.count]
    }
}
