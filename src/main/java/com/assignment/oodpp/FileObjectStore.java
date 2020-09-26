package com.assignment.oodpp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the static object store which stores objects in a file. Implements
 * the <code> ObjectStore </code> interface.
 * 
 * @author Pabasara
 * @author Mahindapala
 * @see ObjectStore
 *
 */
public class FileObjectStore implements ObjectStore {
	private List<Object> objects;

	public FileObjectStore() {
		objects = new ArrayList<Object>();
	}

	/**
	 * This method store an <b> object </b> in the object store and return the <b>
	 * id </b>
	 * 
	 * @param object
	 * @return <code> int </code> index of the stored object
	 */
	@SuppressWarnings("unchecked")
	public int store(Object object) throws FileNotFoundException, IOException, ClassNotFoundException {
		File newFile = new File("objects.txt");

		if (newFile.length() > 0) {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("objects.txt"));
			objects = (List<Object>) is.readObject();
			is.close();
		}

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("objects.txt", false));

		objects.add(object);
		try {
			os.writeBytes("");
			os.writeObject(objects);
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null)
					os.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return objects.indexOf(object);
	}

	/**
	 * This method returns an <b> object </b> when the <b> id </b> is given
	 * 
	 * @param index
	 * @return <code> Object </code> object according to the index
	 */
	@SuppressWarnings("unchecked")
	public Object retrieve(int index) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("objects.txt"));
		objects = (List<Object>) is.readObject();
		is.close();
		return objects.get(index);

	}

	/**
	 * This method clears the object store
	 *
	 */
	public void clear() throws IOException {
		new FileWriter("objects.txt", false).close();

	}

}
