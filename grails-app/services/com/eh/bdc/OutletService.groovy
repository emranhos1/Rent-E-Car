package com.eh.bdc

import grails.web.servlet.mvc.GrailsParameterMap
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/7/2019
 * version 2.0.0.00
 */
class OutletService {

    def save(GrailsParameterMap params) {
        params.setProperty("entryDate", new Date())
        Outlet outlet = new Outlet(params)
        def response = AppUtil.saveResponse(false, outlet)
        if (outlet.validate()) {
            outlet.save(flush: true)
            if (!outlet.hasErrors()){
                response.isSuccess = true
            }
        }
        return response
    }

    def update(Outlet outlet, GrailsParameterMap params) {
        outlet.properties = params
        def response = AppUtil.saveResponse(false, outlet)
        if (outlet.validate()) {
            outlet.save(flush: true)
            if (!outlet.hasErrors()){
                response.isSuccess = true
            }
        }
        return response
    }

    def getById(Serializable id) {
        return Outlet.get(id)
    }

    def list(GrailsParameterMap params) {
        params.max = params.max ?: GlobalConfig.itemsPerPage()
        List<Outlet> outletList = Outlet.createCriteria().list(params) {
            if (params?.colName && params?.colValue) {
                like(params.colName, "%" + params.colValue + "%")
            }
            if (!params.sort) {
                order("id", "desc")
            }
        }
        return [list: outletList, count: Outlet.count()]
    }

    def delete(Outlet outlet) {
        try {
            outlet.delete(flush: true)
        } catch (Exception e) {
            println(e.getMessage())
            return false
        }
        return true
    }
}
