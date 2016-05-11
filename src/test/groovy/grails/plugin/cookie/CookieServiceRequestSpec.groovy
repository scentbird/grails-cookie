package grails.plugin.cookie

import grails.test.mixin.TestFor
import grails.util.GrailsWebMockUtil
import org.grails.web.servlet.mvc.GrailsWebRequest
import org.grails.web.util.WebUtils
import org.springframework.mock.web.MockHttpServletRequest
import org.springframework.mock.web.MockHttpServletResponse
import org.springframework.mock.web.MockServletContext
import spock.lang.Specification
import spock.lang.Unroll

import javax.servlet.http.Cookie
import javax.servlet.http.HttpServletRequest

@TestFor(CookieService)
class CookieServiceRequestSpec extends Specification {

    def setupSpec() {
        GrailsWebMockUtil.bindMockWebRequest()
    }

    @Unroll
    def "findCookie() return cookie and is case-sensitive by name: #name #expectedCookieName"() {
        given:
        def cookie = new Cookie('cookie_name', 'cookie_val')
        WebUtils.retrieveGrailsWebRequest().currentRequest.cookies = [cookie]
        expect:
        service.findCookie(name)?.name == expectedCookieName
        where:
        name          | expectedCookieName
        'cookie_name' | 'cookie_name'
        'CoOkIe_NaMe' | null
    }

    @Unroll
    def "getCookie() return cookie value and is case-sensitive by name: #name #expectedValue"() {
        given:
        WebUtils.retrieveGrailsWebRequest().currentRequest.cookies = [new Cookie('cookie_name', 'cookie_val')]
        expect:
        service.getCookie(name) == expectedValue
        where:
        name          | expectedValue
        'cookie_name' | 'cookie_val'
        'CoOkIe_NaMe' | null
    }
}
