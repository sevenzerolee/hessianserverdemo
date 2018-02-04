package org.sevenzerolee.hessiandemo;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author lee
 *
 */
@RestController
public class HessianController {
	
	static final Logger log = Logger.getLogger(HessianController.class);
	
	@RequestMapping("call")
	public String call() {
		log.info("### call");
		
		return "OK";
	}

}
