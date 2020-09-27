package com.assignment.oodpp;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Object store interface which describes the functionalities of the object
 * store. This interface is not thread safe. Any classes implementing this
 * interface must be made thread safe.
 * 
 * @author Pabasara
 * @author Mahindapala
 *
 */
public interface ObjectStore {
	/**
	 * This method store an <b> object </b> in the object store and return the <b>
	 * id </b>
	 * 
	 * @param object
	 * @return <code> int </code> index of the stored object
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	int store(Object object) throws FileNotFoundException, IOException, ClassNotFoundException;

	/**
	 * This method returns an <b> object </b> when the <b> id </b> is given
	 * 
	 * @param index
	 * @return <code> Object </code> object according to the index
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	Object retrieve(int index) throws FileNotFoundException, IOException, ClassNotFoundException;

	/**
	 * This method clears the object store
	 * 
	 * @throws IOException
	 * 
	 */
	void clear() throws IOException;
}
