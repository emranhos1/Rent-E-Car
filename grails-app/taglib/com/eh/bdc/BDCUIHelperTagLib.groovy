package com.eh.bdc
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/6/2019
 * version 2.0.0.00
 */
class BDCUIHelperTagLib {
    static namespace = "BDCUIHelper"

    AuthenticationService authenticationService

    def renderErrorMessage = { attrs, body ->
        def model = attrs.model
        String fieldName = attrs.fieldName
        String errorMessage = attrs.errorMessage ? g.message(code: attrs.errorMessage) : g.message(code: "invalid.input")
        if (model && model.errors && model.errors.getFieldError(fieldName)){
            out << "<small class='form-text text-danger fadeIn''><strong>${errorMessage}</strong></small>"
        }
    }

    def adminActionMenu = { attrs, body ->
        out << '<div class="collapse navbar-collapse" id="navbarCollapse">'
        out << '<ul class="navbar-nav mr-auto">'
        out << '<li class="nav-item active">'
        out << g.link(controller: "admin", action: "index", class: "nav-link"){g.message(code:"admin.dashboard")}
        out << '</li><li class="nav-item active">'
        out << g.link(controller: "main", action: "index", class: "nav-link"){g.message(code:"registration.form")}
        out << '</li><li class="nav-item active">'
        out << '</li><li class="nav-item active">'
        out << g.link(controller: "outlet", action: "index", class: "nav-link"){g.message(code:"outlet.details")}
        out << '</li><li class="nav-item active">'
        out << g.link(controller: "rentECar", action: "index", class: "nav-link"){g.message(code:"rentECar.details")}
        out << '</li><li class="nav-item active">'
        out << g.link(controller: "main", action: "resetPassword", class: "nav-link"){g.message(code:"reset.password")}
        out << '</li>'
        out << '</ul></div>'
        out << '<li class="nav-item dropdown show">'
        out << g.link(class:"nav-link dropdown-toggle", "data-toggle":"dropdown"){/*g.message(code:"admin.name")*/ authenticationService.getAdminName()}
        out << '<div class="dropdown-menu">'
        out << g.link(controller: "main", action: "resetPassword", class: "dropdown-item"){g.message(code:"reset.password")}
        out << g.link(controller: "authentication", action: "logout", class: "dropdown-item"){g.message(code:"logout")}
        out << "</div></li>"
    }

    def appBaseURL = { attrs, body ->
        out << AppUtil.baseURL();
    }
}
