package com.assignment.oodpp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileObjectStore implements ObjectStore {
	private List<Object> objects;

	public FileObjectStore() {
		objects = new ArrayList<Object>();
	}

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

			}
		}
		return objects.indexOf(object);
	}

	public Object retrieve(int index) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("objects.txt"));
		objects = (List<Object>) is.readObject();
		is.close();
		return objects.get(index);

	}

}
