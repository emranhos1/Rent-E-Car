package com.eh.bdc
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/9/2019
 * version 2.0.0.00
 */
class GlobalConfig {

    public static final def USER_TYPE = [
            ADMINISTRATOR: "ADMIN",
            //OUTLER: "OUTLER",
            //RENT_E_CAR: "RENT_E_CAR",
    ]


    public static Integer itemsPerPage() {
        return 5
    }
}
