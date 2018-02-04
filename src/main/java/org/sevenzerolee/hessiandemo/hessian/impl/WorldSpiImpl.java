package org.sevenzerolee.hessiandemo.hessian.impl;

import org.apache.log4j.Logger;
import org.sevenzerolee.hessiandemo.hessian.WorldSpi;

/**
 * 
 * @author lee
 *
 * @since 2018年2月4日
 *
 */
public class WorldSpiImpl implements WorldSpi {
	
	static final Logger log = Logger.getLogger(WorldSpiImpl.class);

	@Override
	public String call() {
		log.info("### world call");
		
		return "world call";
	}

}
