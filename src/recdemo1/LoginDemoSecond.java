package recdemo1;

import org.apache.logging.log4j.*;

public class LoginDemoSecond {
    
	private static Logger  demologger = LogManager.getLogger(LoginDemoSecond.class.getName());
	public static void main(String[] args) {
		
		System.out.println("This is system");
		//these are lines for the default the logs statements
		//if you are run the java file then print only error because firstly add the configuration file
		demologger.info("Click Successfull");
		demologger.error("DB Connection Failed");
		demologger.debug("This is debug");
		demologger.fatal("This is fatal");
		
		/* if additivity false means not print the duplicate logs value and if additivity is true then 
		 * logs print the twice because root is the parent node and level if trace then it means print all the logs
		 */
		
		
		demologger.info("Click Successfull");
		demologger.error("DB Connection Failed");
		demologger.debug("This is debug");
		demologger.fatal("This is fatal");
		demologger.info("Click Successfull");
		demologger.error("DB Connection Failed");
		demologger.debug("This is debug");
		demologger.fatal("This is fatal");
	}

}
