package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Task {
    private HomePage homepage;
    public static Abrir Utest() {
        return instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homepage));
    }
}