package questions;

import userinterfaces.UserForm;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.Actor;

public class ValidarUsuario implements Question<String> {

    public static ValidarUsuario Creacion() {
        return new ValidarUsuario();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(UserForm.COMPLETE_SETUP).viewedBy(actor).asString();
    }
}