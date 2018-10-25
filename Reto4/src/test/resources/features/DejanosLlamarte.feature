#language:es
#Author: your.email@your.domain.com

@tag
Característica: Verificar el funcionamiento de la pantalla dejanos llamarte expuesta por el grupo Bancolombia 
								Como usuario
								Quiero ingresar los datos al formulario
								Para que me contacten

	@tag1
  Esquema del escenario: Simulacion de usuario
  		Dado que david necesita ingresar a la pagina de dejanos llamarte Bancolombia
  		Cuando el realiza el registro del mismo en el aplicativo
  		| nombre	 | tipo		| numerodocumento		| correo	 | confirmarcorreo	 | pais 	| ciudad	 | numero 	| asunto	 | tiempo	  |
  		| <nombre> | <tipo> | <numerodocumento>	| <correo> | <confirmarcorreo> | <pais> | <ciudad> | <numero> | <asunto> | <tiempo> |
  		Entonces valida el mensaje de Politicas
  		| letrero   |
  		| <letrero> | 
  		Ejemplos:
  		| nombre	 | tipo										| numerodocumento		| correo	 					 | confirmarcorreo	 | pais 			| ciudad	 	 | numero 			| asunto										 | tiempo	 							| letrero |
  		| David 	 | Cédula de Ciudadanía		| 1090504428				| adtq15@gmail.com	 | adtq15@gmail.com	 | Colombia 	| Medellin	 | 3202411094 	| Solicitar TarjetaCredito	 | De 30 a 45 minutos	  | Autorizo de manera voluntaria, previa, expresa e informada a BANCOLOMBIA S.A para la recolección y posterior análisis de los datos aquí suministrados, con la finalidad de ser contactado y atender mis necesidades financieras. Así mismo, declaro que he sido informado sobre el derecho que tengo a conocer, actualizar y rectificar mis datos personales, solicitar prueba de la autorización, ser informado sobre el tratamiento que se ha dado a mis datos personales, presentar quejas ante la Superintendencia de Industria y Comercio (SIC), revocar la autorización otorgada y/o solicitar la supresión de mis datos en los casos en que sea procedente, conoce más sobre esta política dando click aquí|

