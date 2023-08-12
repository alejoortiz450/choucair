package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.ValidarUsuario;
import tasks.Abrir;
import tasks.CrearUsuario;
import userinterfaces.HomePage;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.CoreMatchers.containsString;

public class GlobalSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Alejandro");
    private HomePage homePage = new HomePage();

    @Before
    public void DoSomethingBefore() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Alejandro");
    }

    @Dado("^que alguien quiera acceder a la pagina Utest$")
    public void queAlguienQuieraAccederALaPaginaUtest() {
        theActorCalled("Alejandro").wasAbleTo(Abrir.Utest());
    }

    @Cuando("^el realiza el registro en la pagina$")
    public void elRealizaElRegistroEnLaPagina(List<UserData> userData) {
        OnStage.theActorInTheSpotlight().attemptsTo(CrearUsuario.RellenarForm((userData.get(0))));
    }

    @Entonces("^el verifica que se carga la informacion correctamente (.*)$")
    public void elVerificaQueSeCargaLaInformacionCorrectamente(String text) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarUsuario.Creacion(), containsString(text)));
    }
}