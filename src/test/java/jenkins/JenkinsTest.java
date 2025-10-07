package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest {

	@Test
	public void praticeJenkinTest() {
		Reporter.log("Hii jenkins",true);
		Reporter.log("Bye jenkins",true);
		Reporter.log("Hii Amruta",true);
		Reporter.log("bye Amruta",true);
	}
}
