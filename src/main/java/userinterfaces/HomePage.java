package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class HomePage extends PageObject {

    public static final Target MENU = Target.the("Menu").located(By.className("material-icons"));
    public static final Target JOIN_TODAY = Target.the("Join Today").located(By.className("unauthenticated-nav-bar__dropdown-menu-sign-up"));

}
