package org.sevenzerolee.hessiandemo.hessian.impl;

import org.apache.log4j.Logger;
import org.sevenzerolee.hessiandemo.hessian.HelloSpi;

public class HelloSpiImpl implements HelloSpi {
	
	static final Logger log = Logger.getLogger(HelloSpiImpl.class);

	@Override
	public String call() {
		log.info("### call");
		return "call ok";
	}

}
