package org.tangyouhua.pom.tests;

import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApacheCommonsTest {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(SLF4JTest.class);
	    
		float[] farr = {1.1f, 1.2f, 1.3f};
		logger.info(ArrayUtils.toString(farr));

		farr = ArrayUtils.removeElements(farr, 1.1f);
		logger.info(ArrayUtils.toString(farr));
	}
}
