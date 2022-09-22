package Jenkinspractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenPractice2Test {
	@Test
	public void jenPractice2() {
		String browser = System.getProperty("b");
		String url = System.getProperty("u");
		Reporter.log("Browser is --->>>"+browser, true);
		Reporter.log("URL is --->>>"+url, true);
	}

}