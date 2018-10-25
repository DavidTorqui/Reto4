package Reto4.Tasks;

import java.util.List;

import org.openqa.selenium.WebDriver;

import Reto4.Model.Datos;
import Reto4.UserInterface.IngresarDatos;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;


public class Diligenciar implements Task {
	
	private List<Datos> datos;
	private static WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
	
	public Diligenciar(List<Datos> datos) {
		super();
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		driver.switchTo().frame("Demos");
		actor.attemptsTo(Type.theValue(datos.get(0).getNombre()).into(IngresarDatos.NOMBRE));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getTipo().trim()).from(IngresarDatos.TIPO_DOCUMENTO));
		actor.attemptsTo(Enter.theValue(datos.get(0).getNumerodocumento()).into(IngresarDatos.NUMERO_DOCUMENTO));
		actor.attemptsTo(Enter.theValue(datos.get(0).getCorreo()).into(IngresarDatos.CORREO));
		actor.attemptsTo(Enter.theValue(datos.get(0).getConfirmarcorreo()).into(IngresarDatos.CONFIRMAR_CORREO));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getPais().trim()).from(IngresarDatos.PAIS));
		actor.attemptsTo(Enter.theValue(datos.get(0).getCiudad()).into(IngresarDatos.CIUDAD));
		actor.attemptsTo(Enter.theValue(datos.get(0).getNumero()).into(IngresarDatos.NUMERO_TELEFONICO));
		actor.attemptsTo(Enter.theValue(datos.get(0).getAsunto()).into(IngresarDatos.ASUNTO));
		actor.attemptsTo(SelectFromOptions.byVisibleText(datos.get(0).getTiempo().trim()).from(IngresarDatos.TIEMPO));
		actor.attemptsTo(Click.on(IngresarDatos.CHECK_LIST));
	}
	
	public static Diligenciar el(List<Datos> ingresar) {
		return Tasks.instrumented(Diligenciar.class, ingresar);
	}

}
