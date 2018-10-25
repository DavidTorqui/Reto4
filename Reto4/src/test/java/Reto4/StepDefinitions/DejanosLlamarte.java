package Reto4.StepDefinitions;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import Reto4.Model.Datos;
import Reto4.Questions.Mensaje;
import Reto4.Tasks.Abrir;
import Reto4.Tasks.Diligenciar;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class DejanosLlamarte {
	
	@Managed (driver="chrome")
	private WebDriver hisBrowser;
	private Actor david = Actor.named("David");
	
	@Before
	public void configuracionInicial() {
		david.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que david necesita ingresar a la pagina de dejanos llamarte Bancolombia$")
	public void queDavidNecesitaIngresarALaPaginaDeDejanosLlamarteBancolombia(){
		david.wasAbleTo(Abrir.lapaginaweb());
	}


	@Cuando("^el realiza el registro del mismo en el aplicativo$")
	public void elRealizaElRegistroDelMismoEnElAplicativo(List<Datos> formulario){
		david.attemptsTo(Diligenciar.el(formulario));
	}

	@Entonces("^valida el mensaje de Politicas$")
	public void validaElMensajeDePoliticas(List<Datos> politicas){
		david.should(GivenWhenThen.seeThat(Mensaje.esla(politicas), Matchers.equalTo(true)));
	}
}
