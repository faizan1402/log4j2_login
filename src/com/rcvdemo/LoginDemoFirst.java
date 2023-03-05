package com.rcvdemo;

import org.apache.logging.log4j.*;

public class LoginDemoFirst {
    
	private static Logger  demologger = LogManager.getLogger(LoginDemoFirst.class.getName());
	public static void main(String[] args) {
		
		System.out.println("This is system");
		//these are lines for the default the logs statements
		//if you are run the java file then print only error because firstly add the configuration file
		demologger.info("Click Successfull");
		demologger.error("DB Connection Failed");
		demologger.debug("This is debug");
		demologger.fatal("This is fatal");
		
		/*<Root level="trace">
		 * Root level trace basically all the logs print
		 * If you change the level trace then all the logs print but if you change the level ="fatal" then print the This is fatal
		 * And leve = "error" then print the logs Error  and print the DB Connection Failed
		 */
     
		
	}

}
