package controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class DemoController {
	@RequestMapping("/index.do")
	public String demo() {
		System.out.println("进入Controller控制器");
		return "index";
	}
}
 