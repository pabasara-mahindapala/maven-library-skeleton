package com.assignment.oodpp;

/**
 * This is the factory class which return the relevant
 * <code> ObjectStore </code> when the <code> StoreType </code> is given
 * 
 * @author Pabasara
 * @author Mahindapala
 *
 */
public class StoreFactory {

	/**
	 * This method returns a <code> ObjectStore </code> according to the given type
	 * 
	 * @param type
	 * @return a <code> ObjectStore </code> of type InMemory or File
	 */
	public static ObjectStore create(StoreType type) {
		if (type == StoreType.INMEMORY) {
			return new InMemoryObjectStore();
		} else if (type == StoreType.FILE) {
			return new FileObjectStore();
		} else {
			return null;
		}

	}

}
