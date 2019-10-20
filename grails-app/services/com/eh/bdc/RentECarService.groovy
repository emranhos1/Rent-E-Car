package com.eh.bdc

import grails.web.servlet.mvc.GrailsParameterMap
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/7/2019
 * version 2.0.0.00
 */
class RentECarService {

    def save(GrailsParameterMap params) {
        params.setProperty("entryDate", new Date())
        RentECar rentECar = new RentECar(params)
        def response = AppUtil.saveResponse(false, rentECar)
        if (rentECar.validate()) {
            rentECar.save(flush: true)
            if (!rentECar.hasErrors()){
                response.isSuccess = true
            }
        }
        return response
    }

    def update(RentECar rentECar, GrailsParameterMap params) {
        rentECar.properties = params
        def response = AppUtil.saveResponse(false, rentECar)
        if (rentECar.validate()) {
            rentECar.save(flush: true)
            if (!rentECar.hasErrors()){
                response.isSuccess = true
            }
        }
        return response
    }

    def getById(Serializable id) {
        return RentECar.get(id)
    }

    def list(GrailsParameterMap params) {
        params.max = params.max ?: GlobalConfig.itemsPerPage()
        List<RentECar> rentECarList = RentECar.createCriteria().list(params) {
            if (params?.colName && params?.colValue) {
                like(params.colName, "%" + params.colValue + "%")
            }
            if (!params.sort) {
                order("id", "desc")
            }
        }
        return [list: rentECarList, count: RentECar.count()]
    }

    def delete(RentECar rentECar) {
        try {
            rentECar.delete(flush: true)
        } catch (Exception e) {
            println(e.getMessage())
            return false
        }
        return true
    }
}
