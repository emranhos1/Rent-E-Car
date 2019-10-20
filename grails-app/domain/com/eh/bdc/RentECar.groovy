package com.eh.bdc
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/6/2019
 * version 2.0.0.00
 */
class RentECar {

    String id
    String firstName
    String lastName
    String email
    String mobileNo
    String nidNo
    String businessName
    String businessAddress
    String tinNo
    String tradLicence
    String tradLicencePhoto
    String password
    Date entryDate
    Date updateDate
    static constraints = {
        email(email: true, nullable: false, unique: true, blank: false)
        password(blank: false)
        lastName(nullable: true)
        mobileNo(nullable: true)
        nidNo(nullable: true)
        businessName(nullable: true)
        businessAddress(nullable: true)
        tradLicence(nullable: true)
        tradLicencePhoto(nullable: true)
        tinNo(nullable: true)
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
