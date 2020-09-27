package com.assignment.oodpp;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the dynamic object store which stores objects in memory. Implements
 * the {@link ObjectStore } interface.
 * 
 * @author Pabasara
 * @author Mahindapala
 * @see ObjectStore
 *
 */
public class InMemoryObjectStore implements ObjectStore {
	private List<Object> objects;

	public InMemoryObjectStore() {
		objects = new ArrayList<Object>();
	}

	/**
	 * This method store an <b> object </b> in the object store and return the <b>
	 * id </b>
	 * 
	 * @param object
	 * @return <code> int </code> index of the stored object
	 */
	public int store(Object object) {
		return objects.add(object) ? objects.indexOf(object) : -1;
	}

	/**
	 * This method returns an <b> object </b> when the <b> id </b> is given
	 * 
	 * @param index
	 * @return <code> Object </code> object according to the index
	 */
	public Object retrieve(int index) {
		return objects.get(index);
	}

	/**
	 * This method clears the object store
	 *
	 */
	public void clear() {
		objects.clear();

	}

}
