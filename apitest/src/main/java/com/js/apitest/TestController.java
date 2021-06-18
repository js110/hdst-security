package com.js.apitest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：js
 * @date ：Created in 2021-06-16 8:59
 * @description:
 * @version:
 */
@RestController
public class TestController {

	@RequestMapping("test")
	public String test() {
		return "test";
	}

}
