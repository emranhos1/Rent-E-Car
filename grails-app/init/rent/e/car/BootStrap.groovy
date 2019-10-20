package rent.e.car

import com.eh.bdc.InitializationService

class BootStrap {

    def init = { servletContext ->
        InitializationService.initialize()
    }
    def destroy = {
    }
}