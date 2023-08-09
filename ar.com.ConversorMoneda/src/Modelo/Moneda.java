package Modelo;

public class Moneda {

	private String nombre;
	
	
	public Moneda(String nombre, double valorCompra, double valorVenta) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static String convertirMoneda(double cantidad, String tipoDeCambio) {
		switch (tipoDeCambio) {
			case "De peso argentino a dolar": {
				double cantidadObtenida = cantidad * 0.002;
				return "Cambiaste " + cantidad + " pesos argentinos por " + cantidadObtenida + " dolares"; 
				
			}
			case "De peso argentino a euro": {
				double cantidadObtenida = cantidad * 0.0015;
				return "Cambiaste " + cantidad + " pesos argentinos por " + cantidadObtenida + " euros";
				
			}
			case "De peso argentino a libra": {
				double cantidadObtenida = cantidad * 0.0018;
				return "Cambiaste " + cantidad + " pesos argentinos por " + cantidadObtenida + " libras";
				
			}
			case "De peso argentino a yen": {
				double cantidadObtenida = cantidad * 0.5;
				return "Cambiaste " + cantidad + " pesos argentinos por " + cantidadObtenida + " yenes";
				
			}
			case "De peso argentino a won coreano": {
				double cantidadObtenida = cantidad * 4.66;
				return "Cambiaste " + cantidad + " pesos argentinos por " + cantidadObtenida + " won coreano";
				
			}
			case "De dolar a peso argentino": {
				double cantidadObtenida = cantidad * 525;
				return "Cambiaste " + cantidad + " dolares por " + cantidadObtenida + " pesos argentinos";
				
			}
			case "De euro a peso argentino": {
				double cantidadObtenida = cantidad * 540;
				return "Cambiaste " + cantidad + " euros por " + cantidadObtenida + " pesos argentinos";
				
			}
			case "De libra a peso argentino": {
				double cantidadObtenida = cantidad * 550;
				return "Cambiaste " + cantidad + " libras por " + cantidadObtenida + " pesos argentinos";
			
			}
			case "De yen a peso argentino": {
				double cantidadObtenida = cantidad * 1.98;
				return "Cambiaste " + cantidad + " yenes por " + cantidadObtenida + " pesos argentinos";
			
			}
			case "De won coreano a peso argentino": {
				double cantidadObtenida = cantidad * 0.22;
				return "Cambiaste " + cantidad + " won coreanos por " + cantidadObtenida + " pesos argentinos";
			
			}
			default:{
				return "Ha ocurrido un error";
			}
		}
	}
}
	
	

