package clases;

/**
 * Clase Array en la que genero un array como atributo y hago el metodo de busqueda lineal.
 * @author 	Gonzalo Vicente Cepeda
 * @version 1.0
 * @since 	2019-03-15 
 */
public class Array {
	
	private int array[] = { 5, 1, 22, 9, 12, 6, 4, 8, 15, 21, 18, 17, 2, 11, 6};
	
	/**
	 * Metodo busquedaLineal en el que partiendo de un numero recogido como parametro, lo busco en el array atributo de la clase,
	 * recorriendo el array de izquierda a derecha hasta que lo encuentre o hasta que llegue al final del array.
	 * @param n - Numero entero
	 * @return Nos devolvera un booleano TRUE si el numero se encuentra en el array o FALSE si nose encuentra.
	 */
	public boolean busquedaLineal (int n) {
		boolean sw = false;
		for (int i = 0; i < this.array.length && sw == false; i++) {
			if (this.array[i] == n) {
				sw = true;
			}
		}
		return sw;
	}

}
