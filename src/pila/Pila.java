package pila;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

import error.PilaLlenaException;

public class Pila {

	// el formato de lista escogido es un ArrayList
	private ArrayList<Integer> pila = new ArrayList<Integer>();

	// constructor del ArrayList Pila
	public Pila() {
		pila = new ArrayList<Integer>();

	}

	// operacion para añadir número
	public void add(int numero) throws Exception {

		// si la pila está llena que salte una excepción diciendo que la pila está llena
		if (pila.size() >= 30) {

			PilaLlenaException error = new PilaLlenaException("La pila está llena");
			throw error;

			// si la pila no está llena, añadir el número
		} else {
			pila.add(numero);

		}
	}

	// extraer el número que se encuentre en la posición 0, osea en el principio
	public void get() {

		// para que no salte un error cuando el tamaño de pila es 0,
		// hacer un if que si el tamaño es 0 no haga nada
		if (pila.size() == 0) {
		} else
			pila.remove(0);

	}

	public boolean isLleno() {
		boolean devolver = false;

		if (pila.size() >= 30)
			devolver = true;

		return devolver;
	}

	/**
	 * operacion para comprobar si el ArrayList está vacio
	 * 
	 * @return boolean
	 */
	public boolean isVacio() {
		boolean devolver = false;

		if (pila.isEmpty() == true)
			devolver = true;

		return devolver;
	}

	/**
	 * operacion para saber cuantos números hay
	 * 
	 * @return int
	 */
	public int cantidad() {
		int cantidades = 0;
		// igualar cantidades al tamaño actual del ArrayList
		cantidades = pila.size();

		return cantidades;
	}
	
	// toString que permite imprimir el ArrayList
	@Override
	public String toString() {
		return "Pila [" + pila + "]";
	}

}
