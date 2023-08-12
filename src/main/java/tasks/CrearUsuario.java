package tasks;

import models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.HomePage.JOIN_TODAY;
import static userinterfaces.HomePage.MENU;
import static userinterfaces.UserForm.*;

public class CrearUsuario implements Task {

    private UserData userData;

    public CrearUsuario(UserData userData){
        this.userData = userData;
    }

    public static CrearUsuario RellenarForm(UserData userData){
        return Tasks.instrumented(CrearUsuario.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(MENU),
                Click.on(JOIN_TODAY),
                Enter.theValue(userData.getStrName()).into(FIRST_NAME),
                Enter.theValue(userData.getStrLastName()).into(LAST_NAME),
                Enter.theValue(userData.getStrEmail()).into(EMAIL),
                Click.on(BIRTH_MONTH),
                Click.on(BIRTH_DAY),
                Click.on(BIRTH_YEAR),
                WaitUntil.the(NEXT_LOCATION, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(NEXT_LOCATION),
                Enter.theValue("Medellín").into(CITY),
                Enter.theValue("050033").into(ZIP),
                WaitUntil.the(NEXT_DEVICES, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(NEXT_DEVICES),
                WaitUntil.the(NEXT_LAST_STEP, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(NEXT_LAST_STEP),
                Enter.theValue(userData.getStrPassword()).into(PASSWORD),
                Enter.theValue(userData.getStrConfirmPassword()).into(CONFIRM_PASSWORD),
                //Click.on(CHK1),
                Click.on(CHK2),
                Click.on(CHK3),
                WaitUntil.the(COMPLETE_SETUP, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(COMPLETE_SETUP)
        );
    }

}
