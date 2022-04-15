package saka1029.tensuhyo.run.r0204;

import java.util.logging.Logger;

public class Commons {

    static final String ENCODING = "utf-8";
    static final String GENGO = "令和";
    static final String YEAR = "02";
    static final String OLD_GENGO = "令和";
	static final String OLD_YEAR = "01";

	static Logger getLogger(String name) {
        System.setProperty("java.util.logging.config.file", "logging.properties");
	    return Logger.getLogger(name);
	}

}