package Modelo;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Utilidades {
	
	// Menu principal
	
	public static void MenuPrincipal() {
		String[] opciones = { "Convertir monedas", "Convertir temperaturas" };
		JComboBox<String> opcionConversor = new JComboBox<String>(opciones);
		
		int opcionSeleccionada = JOptionPane.showOptionDialog(null, opcionConversor, "Seleccione una opción",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
		
		if (opcionSeleccionada == JOptionPane.OK_OPTION) {
            String opcionElegida = (String) opcionConversor.getSelectedItem();
            //JOptionPane.showMessageDialog(null, "Ha elegido: " + opcionElegida);
            
            
            switch (opcionElegida) {
            	case "Convertir monedas":
            		MenuConversorMonedas();
            		break;
            	case "Convertir temperaturas":
            		MenuConversorTemperaturas();
            		break;
            }
		} else if (opcionSeleccionada == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "El programa ha finalizado");
		}
            
	}
            
    // Menu conversor de monedas        
    public static void MenuConversorMonedas() {
    	
		String[] opcionesDeCambio = {"De peso argentino a dolar",
									"De peso argentino a euro",
									"De peso argentino a libra",
									"De peso argentino a yen",
									"De peso argentino a won coreano",
									"De dolar a peso argentino",
									"De euro a peso argentino",
									"De libra a peso argentino",
									"De yen a peso argentino",
									"De won coreano a peso argentino"};
		
		
		JComboBox<String> opcionesConversorMonedas = new JComboBox<String>(opcionesDeCambio);
		int opciondeCambio = JOptionPane.showOptionDialog(null, opcionesConversorMonedas, "Seleccione el cambio que desea hacer",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
		

		String cambioMoneda = (String)opcionesConversorMonedas.getSelectedItem();
		
		
		
		if (opciondeCambio == JOptionPane.OK_OPTION ) {
			//JOptionPane.showMessageDialog(null, "Queres cambiar de: " + cambioMoneda);
			
			try {
				double cantidad = obtenerValorNumerico();
				String cantidadObtenida = Moneda.convertirMoneda(cantidad, cambioMoneda);
				JOptionPane.showMessageDialog(null, cantidadObtenida);
				regresoMenuPrincipal();
			}catch (NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Cancelaste la operacion");
				regresoMenuPrincipal();
			}
			
			
	
		}else if (opciondeCambio == JOptionPane.CANCEL_OPTION ) {
			JOptionPane.showMessageDialog(null, "Cancelaste la operacion");
			regresoMenuPrincipal();
			
			
		}
    }
    
    // Menu conversor de temperatura
    public static void MenuConversorTemperaturas() {
    	String[] opcionesDeCambioDeTemperatura = {"De Celsius a Farenheit",
    											 "De Farenheit a Celsius"};
    	
		JComboBox<String> opcionesConversorTemperaturas = new JComboBox<String>(opcionesDeCambioDeTemperatura);
		
		int opciondeCambiodeTemperatura = JOptionPane.showOptionDialog(null, opcionesConversorTemperaturas, "Seleccione el cambio que desea hacer",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
		
		String cambioTemperatura = (String) opcionesConversorTemperaturas.getSelectedItem();
		
		if (opciondeCambiodeTemperatura == JOptionPane.OK_OPTION ) {
			//JOptionPane.showMessageDialog(null, "Queres cambiar de: " + cambioTemperatura);
			
			try{
				double cantidad = obtenerValorNumerico();
				String cantidadObtenida = Temperatura.convertirTemperatura(cantidad, cambioTemperatura);
				JOptionPane.showMessageDialog(null, cantidadObtenida);
				regresoMenuPrincipal();
			}catch (NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Cancelaste la operacion");
				regresoMenuPrincipal();
			}
			

		}else {
			JOptionPane.showMessageDialog(null, "Cancelaste la operacion");
			regresoMenuPrincipal();
			
		}
    }
	
	//Método de validacion de valores ingresados por el usuario
	public static double obtenerValorNumerico() {
        double valor = 0.0;
        boolean valorValido = false;

        while (!valorValido) {
            String input = JOptionPane.showInputDialog("¿Cuánto quieres cambiar?");

            try {
                valor = Double.parseDouble(input);
                valorValido = true; // Salir del bucle si el valor es válido
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un valor numérico válido.");
            }
        }

        return valor;
    }
	
	//Metodo de regreso al menu principal
	
	public static void regresoMenuPrincipal() {
		String[] opciones = {"Si", "No", "Cancelar"};
		int seleccion = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "...", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
		
		if (seleccion == 0) {
			MenuPrincipal();
		}else {
			JOptionPane.showMessageDialog(null, "El programa ha finalizado.");
		}
		
	}

}


