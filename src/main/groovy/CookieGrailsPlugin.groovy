import grails.plugins.Plugin

class CookieGrailsPlugin extends Plugin {
    def grailsVersion = "3.0.0 > *"
    def author = 'Sergey Ponomarev'
    def authorEmail = 'stokito@gmail.com'
    def title = 'Cookie Plugin'
    def description = 'Makes dealing with cookies easy. Provides an injectable service and expands request with methods to easily get, set, and delete cookies with one line'
    def observe = ['controllers']
    def pluginExcludes = ['grails/plugin/cookie/test/**']
    def documentation = 'https://github.com/grails-plugin-consortium/grails-cookie'
    def license = 'APACHE'
    def developers = [
            [name: 'Christian Oestreich', email: 'acetrike@gmail.com', role: 'current maintainer'],
            [name: 'Dale Wiggins', email: 'dale@dalew.com', role: 'original author'],
            [name: 'Sergey Ponomarev', email: 'stokito@gmail.com']
    ]
    def issueManagement = [system: 'GITHUB', url: 'https://github.com/grails-plugin-consortium/grails-cookie/issues']
    def scm = [url: 'https://github.com/grails-plugin-consortium/grails-cookie']
}
