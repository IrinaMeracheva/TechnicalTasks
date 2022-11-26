package pages.testpages;

import com.telerikacademy.testframework.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class SubmittedValuesPage extends BasePage {

    public SubmittedValuesPage(WebDriver driver) {
        super(driver, "home.page");
    }
    public void assertSubmittedForm() {
        actions.assertTextElement("explanation.locator", "You submitted a form. The details below show the" +
                " values you entered for processing.");
        actions.assertElementPresent("checkbox.one.assert.locator");
        actions.assertElementPresent("checkbox.two.assert.locator");
        actions.assertElementPresent("checkbox.three.assert.locator");
        actions.assertElementPresent("radio.button.one.assert");
        actions.assertElementPresent("dropdown.item.one.assert");
    }
}
