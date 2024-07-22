package Steps;

import org.junit.Assert;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;

public class HomePage extends BaseClass{
	@Given("user validate Home Page Title")
	public void user_validate_home_page_title() {
	   String homeTitle=driver.getTitle();
	   Assert.assertEquals(homeTitle, "OrangeHRM");
	}
}
