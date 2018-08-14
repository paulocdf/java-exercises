package pt.home.business;

public interface MyHashMap<K, V> {

	public boolean containsKey(Object key);

	public boolean containsValue(Object value);

	/**
	 * Returns the value to which the specified key is mapped, or null if this map
	 * contains no mapping for the key.
	 * 
	 * @param key
	 *            the key of the hashmap
	 * @return the object associated to the hashmap key
	 */
	public V get(Object key);

	/**
	 * Associates the specified value with the specified key in this map (optional
	 * operation).
	 * 
	 * @param key
	 * @param value
	 */
	public K put(K key, V value);

}
