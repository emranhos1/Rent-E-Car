package com.eh.bdc

import grails.web.servlet.mvc.GrailsParameterMap
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/9/2019
 * version 2.0.0.00
 */
class AdminService {

    def list(GrailsParameterMap params) {
        params.max = params.max ?: GlobalConfig.itemsPerPage()
        List<Admin> adminList = Admin.createCriteria().list(params) {
            if (params?.colName && params?.colValue) {
                like(params.colName, "%" + params.colValue + "%")
            }
            if (!params.sort) {
                order("id", "desc")
            }
        }
        return [list: adminList, count: Admin.count()]
    }
}
