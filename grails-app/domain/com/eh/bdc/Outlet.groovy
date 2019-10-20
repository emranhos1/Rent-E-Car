package com.eh.bdc
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/6/2019
 * version 2.0.0.00
 */
class Outlet {

    String id
    String firstName
    String lastName
    String email
    String mobileNo
    String nidNo
    String businessName
    String businessAddress
    String businessCategoryId
    String tradeLicence
    String tradeLicencePhoto
    String tinNo
    String password
    Date entryDate
    Date updateDate
    static constraints = {
        email(email: true, nullable: false, unique: true, blank: false)
        password(blank: false)
        lastName(nullable: true)
        mobileNo(blank: false)
        nidNo(blank: false)
        businessName(nullable: true)
        businessAddress(nullable: true)
        businessCategoryId(nullable: true)
        tradeLicence(blank: false)
        tradeLicencePhoto(nullable: true)
        tinNo(blank: false)
        entryDate(nullable: true)
        updateDate(nullable: true)
    }

    def beforeInsert (){
        this.password = this.password.encodeAsMD5()
    }

    def beforeUpdate(){
        this.password = this.password.encodeAsMD5()
    }

    static mapping = {
        version(false)
    }
}
