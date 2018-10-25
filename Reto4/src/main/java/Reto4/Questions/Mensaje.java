package Reto4.Questions;

import java.util.List;

import Reto4.UserInterface.IngresarDatos;
import Reto4.Model.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Mensaje implements Question<Boolean>{
	
	private List<Datos> datos;
	
	
	public Mensaje(List<Datos> datos) {
			this.datos = datos;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		Boolean resultado = false;
		String confirmar = Text.of(IngresarDatos.VALIDA_MENSAJE).viewedBy(actor).asString();
		String validar = datos.get(0).getLetrero();
		if (confirmar.equals(validar)) {
			resultado = true;
		}
		return resultado;
	}
	
	public static Mensaje esla(List<Datos> politicas) {
		return new Mensaje(politicas);
	}

}
