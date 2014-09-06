package com.programaciongratis.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**En este ejemplo vamos a ver como funcionan
 * los diferentes tipos de mapas en Java.
 * 
 * @author lnoria
 *
 */
public class HashMapEjemploMain {

	public static void main(String[] args) {
		
		Map<String, String> ids = new HashMap<String, String>();
		
		ids.put("lucho", "Guerrero25X");
		ids.put("pepito", "PepitoElMatador15Z");
		ids.put("jaimito", "ElInsaciable");
		
		/**Ahora vamos a mostrar los valores que tenemos.
		/* Para recorrer a traves de los valores de nuestro mapa
		 * usamos un entrySet. EntrySet nos permite recorrer los
		 * valores del mapa e invocar la llave (key) y su valor
		 * correspondiente (value).
		 */
		for (Entry<String, String> id : ids.entrySet()) {
			
			// ¡"key" es un valor unico!
			System.out.println("Key (llave):" + id.getKey());
			
			// "value" NO es un valor unico, asi que puede repetirse.
			System.out.println("Value (valor): " + id.getValue() +"\n");
			
		}
		
		//--------------------------------------------------------------
		// Ahora vamos a borrar un valor de nuestro mapa
		
		String llaveASerRemovida = "lucho";
		
		// primero checkeo si la llave existe en mi mapa
		if (ids.containsKey(llaveASerRemovida)) {
			
			// si existe la remuevo.
			ids.remove(llaveASerRemovida);
		} else {
			// si no existe solo muestro un mensaje.
			System.out.println("¡La llave no existe!");
		}
		
		// Ahora vuelvo a mostrar los valores de nuestro mapa.
		
		System.out.println("Nuevos valores de nuestro mapa:");
		
		for (Entry<String, String> id : ids.entrySet()) {
			System.out.println("Key: " + id.getKey());
			System.out.println("Value: " + id.getValue() + "\n");
		}
		
		//----------------------------------------------------------------
		// Ahora vamos a actualizar un valor de nuestro mapa
		
		String llaveAActualizar = "jaimito";
		
		if (ids.containsKey(llaveAActualizar)) {
			ids.put(llaveAActualizar, "JaimitoElInsaciable25cm");
		} else {
			System.out.println(llaveAActualizar + " no esta en el mapa!");
		}
		
		System.out.println("Valores actualizados:");
		for (Entry<String, String> id : ids.entrySet()) {
			System.out.println("Key: " + id.getKey());
			System.out.println("Value: " + id.getValue() + "\n");
		}

	}

}
