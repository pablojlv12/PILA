package go;

import pila.Pila;

public class Start {

	public static void main(String[] args) throws Exception  {

		Pila pila = new Pila();
    //bucle para añadir 40 número y a su vez borrarlos
		for (int i = 0; i < 40; i++) {
			int aleatorio = (int) (Math.random() * 100 + 1);
			pila.add(aleatorio);

	//si sobrepasa el límite que borre los numero que sobrepasan		
			if (pila.isLleno()) {

				pila.get();
			}
		}
    //bucle para vaciar el Array
		while(!pila.isVacio()) {
			
			pila.get();
		}
		
		
		
		System.out.println(pila);
	}
}