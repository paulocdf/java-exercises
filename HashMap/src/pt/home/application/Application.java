package pt.home.application;

import pt.home.business.MyHashMap;
import pt.home.business.impl.MyHashMapImpl;

/*
 * Exerc�cio: Constru��o de uma hashmap caseira
 * 	
 *  Input/Outpus: Hashmap recebe uma chave e um valor. A partir da chave � constru�do um inteiro com um n�vel baixo de colis�o.
 *  O inteiro � usado para saber em que posi��o de um array � colocado o valor.
 *  
 *  
 */

public class Application {

	public static void main(String[] args) {
		MyHashMap<Integer, Integer> customMap = new MyHashMapImpl<>();
		
		customMap.put(3, 300);
		

	}

}
