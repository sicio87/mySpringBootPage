package eu.karols.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	// inject via application.properties
	@Value("${index.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String index(Map<String, Object> model) {
		model.put("message", this.message);
		return "index";
	}
}
