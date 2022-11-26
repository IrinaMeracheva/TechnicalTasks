package pages.testpages;

import com.github.javafaker.Faker;
import com.telerikacademy.testframework.pages.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class BasicFormPage extends BasePage {

    private String commentDescription = "";

    Random random = new Random();
    int randomCount;

    Faker faker = new Faker();
    String username = faker.name().username();
    String password = faker.internet().password();

    public BasicFormPage(WebDriver driver) {
        super(driver, "home.page");
    }

    public void inputUsernameAndPassword() {
        actions.clickElement("username.field");
        actions.typeValueInField(username, "username.field");
        actions.clickElement("password.field");
        actions.typeValueInField(password, "password.field");
    }

    public void inputComment() {

        generateDescription();

        actions.clickElement("comment.field");
        actions.typeValueInField(commentDescription, "comment.field");
    }

    public void clickCheckboxButton() {
        actions.clickElement("checkbox.one");
        actions.clickElement("checkbox.two");
    }

    public void clickRadioButton() {
        actions.clickElement("radio.button.one");
    }

    public void selectFromDropdown() {
        actions.clickElement("dropdown.menu");
        actions.selectFromDropdownByText("dropdown", "Drop Down Item 1");
    }

    public void submitWhenClickSubmitButton() {
        actions.clickElement("submit.button");
    }
    private void generateDescription() {

        randomCount = random.nextInt(20);
        while (randomCount >= 0) {
            String randomStr = RandomStringUtils.randomAlphabetic(33);
            String randomNumber = RandomStringUtils.randomNumeric(33);
            String randomAlphanumeric = RandomStringUtils.randomAlphanumeric(33);
            commentDescription = commentDescription.concat(randomStr).concat(" ").concat(randomNumber).concat(" ")
                    .concat(randomAlphanumeric).concat("\n");
            randomCount--;
        }
    }
}