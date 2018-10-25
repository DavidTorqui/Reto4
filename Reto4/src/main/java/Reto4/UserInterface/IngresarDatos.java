package Reto4.UserInterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.grupobancolombia.com/wps/portal/personas/dejanos-llamarte")
public class IngresarDatos extends PageObject{
	
	public static final Target NOMBRE = Target.the("INGRESA EL NOMBRE").located(By.xpath("//form[@id=\"frm_webcallback_\"]/div/span/div/div[@class='campo']/input"));
	public static final Target TIPO_DOCUMENTO = Target.the("INGRESA EL TIPO DE DOCUMENTO").located(By.xpath("//*[@id=\"tipo\"]"));
	public static final Target NUMERO_DOCUMENTO = Target.the("INGRESA EL NUMERO DE DOCUMENTO").located(By.xpath("//*[@id=\"documento\"]"));
	public static final Target CORREO = Target.the("INGRESA EL CORREO").located(By.xpath("//*[@id=\"correo\"]"));
	public static final Target CONFIRMAR_CORREO = Target.the("INGRESA EL CORREO NUEVAMENTE").located(By.xpath("//*[@id=\"confirmar\"]"));
	public static final Target PAIS = Target.the("INGRESA EL PAIS").located(By.xpath("//*[@id=\"pais\"]"));
	public static final Target CIUDAD = Target.the("INGRESA LA CIUDAD").located(By.xpath("//*[@id=\"ciudad\"]"));
	public static final Target NUMERO_TELEFONICO = Target.the("INGRESA EL NUMERO TELEFONICO").located(By.xpath("//*[@id=\"telefono\"]"));
	public static final Target ASUNTO = Target.the("INGRESA EL ASUNTO").located(By.xpath("//*[@id=\"asunto\"]"));
	public static final Target TIEMPO = Target.the("INGRESA EL TIEMPO PARA LA LLAMADA").located(By.xpath("//*[@id=\"tiempo\"]"));
	public static final Target CHECK_LIST = Target.the("SELECCIONA EL CHECK LIST").located(By.xpath("//*[@id=\"formulario\"]/fieldset/ul/li/label"));
	public static final Target VALIDA_MENSAJE = Target.the("VALIDA QUE EL MENSAJE SEA CORRECTO").located(By.id("mtexto"));
}
