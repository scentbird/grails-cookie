package grails.plugin.cookie.test

import grails.plugin.cookie.CookieService

import javax.servlet.http.Cookie

class TestService {
    CookieService cookieService

    Cookie findCookie(String name){
        cookieService.findCookie(name)
    }
}
