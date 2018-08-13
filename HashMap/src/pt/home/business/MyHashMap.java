package pt.home.business;

/*
 * Hashmap: An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
 * 
 * Collision: Habitualmente é com "chaining" que se resolvem. Ou seja, usa-se uma lista ligada para guardar os valores cujas chaves tiveram 
 * o mesmo hashcode. Estes valores são colocados na cabeça da lista.
 */

/*
 *This is a little off topic, but the load factor is by default 75%. Also, off topic again, 
 *this is why you want to set an initial capacity that is reflected with the number of total elements you think will be in the map,
 * because it gets increasingly expensive to refactor the map as the number of elements stored gets larger and larger.
 * You want to set the initial capacity just over the maximum number of elements you think will be stored to alleviate this cost later on. 
 */
public class MyHashMap<K, V> {

	
}
