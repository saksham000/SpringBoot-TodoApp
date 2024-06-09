package com.firstwebapp.todoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //it is used to tell spring it is a bean for web app
public class SayHelloController {

    @RequestMapping("sayhello")
    @ResponseBody
    public String sayHello(){
        return "Hello World !";
    }

	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My First HTML Page with body");
		sb.append("</body");
		sb.append("</html>");
		return sb.toString();
	}

	@RequestMapping("sayhello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}