package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserForm extends PageObject {

    public static final Target FIRST_NAME = Target.the("First name:").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Last name:").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("E-mail:").located(By.id("email"));
    public static final Target BIRTH_MONTH = Target.the("Birth Month:").located(By.xpath("//option[contains(text(),'March')]"));
    public static final Target BIRTH_DAY = Target.the("Birth Day:").located(By.xpath("//option[contains(@label,'4')]"));
    public static final Target BIRTH_YEAR = Target.the("Birth Year:").located(By.xpath("//select[@id='birthYear']//*[contains(@label,'2000')]"));
    public static final Target NEXT_LOCATION = Target.the("Next: Location").located(By.xpath("//span[contains(text(),'Next: Location')]"));
    public static final Target CITY = Target.the("City:").located(By.xpath("//input[@id='city']"));
    public static final Target ZIP = Target.the("ZIP or Postal Code:").located(By.xpath("//input[@id='zip']"));
    public static final Target NEXT_DEVICES = Target.the("Next: Devices").located(By.xpath("//span[contains(text(),'Next: Devices')]"));
    public static final Target NEXT_LAST_STEP = Target.the("Next: Last Step").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));
    public static final Target PASSWORD = Target.the("Next: Last Step").located(By.xpath("//input[@id='password']"));
    public static final Target CONFIRM_PASSWORD = Target.the("Next: Last Step").located(By.xpath("//input[@id='confirmPassword']"));
    //public static final Target CHK1 = Target.the("Stay informed checkbox").located(By.className("checkmark signup-consent__checkbox signup-consent__checkbox--highlight"));
    public static final Target CHK2 = Target.the("Terms of use").located(By.xpath("//*[contains(@ng-class,'{error: userForm.termOfUse.$error.required}')]"));
    public static final Target CHK3 = Target.the("Privacity & Security Policy").located(By.xpath("//*[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]"));
    public static final Target COMPLETE_SETUP = Target.the("Complete Setup:").located(By.xpath("//span[contains(text(),'Complete Setup')]"));

}
