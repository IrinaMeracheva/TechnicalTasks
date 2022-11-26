package test.cases;

import org.junit.Test;
import pages.testpages.BasicFormPage;
import pages.testpages.SubmittedValuesPage;

public class BasicFormPageTests extends BaseTestSetup{

    @Test
    public void submitForm() {

        BasicFormPage basicFormPage = new BasicFormPage(actions.getDriver());
        basicFormPage.inputUsernameAndPassword();
        basicFormPage.inputComment();
        basicFormPage.clickCheckboxButton();
        basicFormPage.clickRadioButton();
        basicFormPage.selectFromDropdown();
        basicFormPage.submitWhenClickSubmitButton();

        SubmittedValuesPage submittedValuesPage = new SubmittedValuesPage(actions.getDriver());
        submittedValuesPage.assertSubmittedForm();
    }
}
