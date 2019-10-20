package com.eh.bdc
/**
 * User: MD. EMRAN HOSSAIN <emranhos1@gmail.com>
 * Date: 10/14/2019
 * version 2.0.0.00
 */
class InitializationService {

    static initialize() {
        initAdmin()
        initData()
    }

    private static initAdmin() {
        def username = ["admin", "emranhos1"]
        def firstName = ["Admin", "Md. Emran"]
        def lastName = ["admin", "Hossain"]
        def password = ["admin", "123456"]
        if (Admin.count() == 0) {
            for (int i = 0; i < 2; i++) {
                Admin admin = new Admin()
                admin.username = username[i]
                admin.firstName = firstName[i]
                admin.lastName = lastName[i]
                admin.password = password[i]
                admin.save(flash: true)
            }
        }
    }

    private static initData() {
        def firstName = ["Md. Helal", "Md. Emran","Kalam"]
        def lastName = ["Uddin", "Hossain", "Khan"]
        def email  = ["helal@gmail.com", "emranhos1@gmail.com", "kalam@gmail.com"]
        def mobileNo = ["01715909280", "01670932273", "01919470902"]
        def nidNo = ["19860987670009876", "19890987670009876", "19890987670009865"]
        def businessName = ["Air Condition", "Departmental Store", "Tea Stole"]
        def businessAddress = ["Moghbazar Wireless", "Moghbazar", "Moucak"]
        def businessCategoryId = ["1", "2", "3"]
        def tinNo = ["1234567890", "0987654321", "0987654322"]
        def tradLicence = ["567656765", "0987897876", "0987897878"]
        def tradLicencePhoto = ["", "", ""]
        def password = ["123456", "123456", "123456"]
        def entryDate = [new Date(), new Date(), new Date()]

        int i = 0
        if (RentECar.count() == 0) {
            for (i = 0; i < 2; i++) {
                RentECar rentECar = new RentECar()
                rentECar.firstName = firstName[i]
                rentECar.lastName = lastName[i]
                rentECar.email = email[i]
                rentECar.mobileNo = mobileNo[i]
                rentECar.nidNo = nidNo[i]
                rentECar.businessName = businessName[i]
                rentECar.businessAddress = businessAddress[i]
                rentECar.tinNo = tinNo[i]
                rentECar.tradLicence = tradLicence[i]
                rentECar.tradLicencePhoto = tradLicencePhoto[i]
                rentECar.password = password[i]
                rentECar.entryDate = entryDate[i]
                rentECar.save(flash: true)
            }
        }
        if (Outlet.count() == 0) {
            for (i = 2; i < 3; i++) {
                Outlet outlet = new Outlet()
                outlet.firstName = firstName[i]
                outlet.lastName = lastName[i]
                outlet.email = email[i]
                outlet.mobileNo = mobileNo[i]
                outlet.nidNo = nidNo[i]
                outlet.businessName = businessName[i]
                outlet.businessAddress = businessAddress[i]
                outlet.businessCategoryId = businessCategoryId[i]
                outlet.tinNo = tinNo[i]
                outlet.tradeLicence = tradLicence[i]
                outlet.tradeLicencePhoto = tradLicencePhoto[i]
                outlet.password = password[i]
                outlet.entryDate = entryDate[i]
                outlet.save(flash: true)
            }
        }
    }
}
