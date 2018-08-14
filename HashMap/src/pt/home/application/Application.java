package pt.home.application;

import pt.home.business.MyHashMap;
import pt.home.business.impl.MyHashMapImpl;

/*
 * Exercício: Construção de uma hashmap caseira
 * 	
 *  Input/Outpus: Hashmap recebe uma chave e um valor. A partir da chave é construído um inteiro com um nível baixo de colisão.
 *  O inteiro é usado para saber em que posição de um array é colocado o valor.
 *  
 *  
 */

public class Application {

	public static void main(String[] args) {
		MyHashMap<Integer, Integer> customMap = new MyHashMapImpl<>();
		
		customMap.put(3, 300);
		

	}

}
