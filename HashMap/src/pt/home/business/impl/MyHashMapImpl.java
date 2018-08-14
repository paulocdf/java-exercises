package pt.home.business.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import pt.home.business.MyHashMap;

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
public class MyHashMapImpl<K, V> implements MyHashMap<K, V> {

	private static final int INITIAL_CAPACITY = 10;

	/**
	 * Quando o array estiver a 50% da capacidade, então duplica-se o tamanho
	 */
	private static final int LOAD_FACTOR = 50;

	@SuppressWarnings("unchecked")
	private Entry<K, V>[] table = new Entry[INITIAL_CAPACITY];

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	// calculate the index bucket:
	// https://stackoverflow.com/questions/10879302/hashmap-implementation-in-java-how-does-the-bucket-index-calculation-work

	@Override
	public K put(K key, V value) {
		Entry<K, V> entry = new Entry<>(key, value);

		Object keyObj = (Object) key;
		int hashCode = keyObj.hashCode();

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	static class Entry<K, V> {
		private K key;
		private V value;
		Entry<K, V> nextElement;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
			this.nextElement = null;
		}

		public K getKey() {
			return this.key;
		}

		public V getValue() {
			return this.value;
		}

	}

}
