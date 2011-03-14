import geb.spock.GebSpec
 
class MySpec extends GebSpec {
 
    def "test something"() {
        when:
        go "/help"
        then:
        $("h1").text() == "Help"
    }
 
}
