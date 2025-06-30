package com.example.logtest;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  class LogController {
	private static final Logger log = LoggerFactory.getLogger(LogController.class);

	@GetMapping("/log")
	public String logSomething() {
		log.info("202035117/김동윤");
		return "202035117/김동윤";
	}
}
