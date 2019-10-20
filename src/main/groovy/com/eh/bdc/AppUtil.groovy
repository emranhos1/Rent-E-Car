package com.eh.bdc

import org.grails.web.util.WebUtils
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/9/2019
 * version 2.0.0.00
 */
class AppUtil {
    static saveResponse(Boolean isSuccess, def model) {
        return [isSuccess: isSuccess, model: model]
    }

    static getAppSession() {
        return WebUtils.retrieveGrailsWebRequest().session
    }

    static infoMessage(String message, boolean status = true) {
        return [info: message, success: status]
    }

    static String baseURL(){
        return "${getAppSession().getServletContext().getContextPath()}/"
    }
}
