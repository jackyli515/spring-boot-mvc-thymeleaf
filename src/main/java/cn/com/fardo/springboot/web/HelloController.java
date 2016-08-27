/**
 * 
 */
package cn.com.fardo.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lmq
 *
 */
@Controller
public class HelloController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "Hello World!!";
	}
	
	@RequestMapping("/")
	public String index(ModelMap map){
		map.addAttribute("host", "http://www.163.com?ll");
		return "index";
	}
}
