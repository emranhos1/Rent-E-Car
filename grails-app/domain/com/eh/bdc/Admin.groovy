package com.eh.bdc
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/6/2019
 * version 2.0.0.00
 */
class Admin {

    String id
    String username
    String password
    String firstName
    String lastName
    String phoneNo
    static constraints = {
        username(nullable: false, unique: true, blank: false)
        password(blank: false)
        firstName(nullable: false)
        lastName(nullable: false)
        phoneNo(nullable: false)
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
