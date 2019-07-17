package com.gzwl.demo.controller.sys;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gzwl.demo.pojo.Employee;

@Controller

public class IndexController {
	@RequestMapping("/")
	public String indexPage() {
		Employee employee = (Employee) SecurityUtils.getSubject().getPrincipal();
		if (employee != null) {
			return "redirect:/sys/home";
		}
		return "login";
	}

}
