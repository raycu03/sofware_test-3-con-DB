package test
import groovy.json.JsonSlurper

class LoginController {

	def home(){}
    def login() { 
    }
    def loginAuth(String username, String password) { 
    	String apiStr="http://savio.utbvirtual.edu.co/login/token.php?username="+username+"&password="+password+"&service=moodle_mobile_app"
    	URL apiUrl = new URL(apiStr)
    	def card = new JsonSlurper().parseText(apiUrl.text)
    	if (card.token) {
    		redirect(action: "home")
    	}else{
    		redirect(action: "login")
    	}
    }
}
