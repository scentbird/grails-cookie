package grails.plugin.cookie

import grails.plugin.cookie.test.TestService
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(TestService)
class TestServiceSpec extends Specification {

    CookieService cookieService = Mock(CookieService)

    def setup(){
        service.cookieService = cookieService
    }

    def "invoke the cookie mock service method"(){
        when:
        def cookie = service.findCookie("demo")

        then:
        !cookie
        1 * cookieService.findCookie("demo") >> null
    }

}
