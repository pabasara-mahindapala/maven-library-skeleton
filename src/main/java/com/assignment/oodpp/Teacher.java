package com.assignment.oodpp;

import java.io.Serializable;

/**
 * This class is used to test the library by storing objects. The class is made
 * {@link Serializable } for storing in the file.
 * 
 * @author Pabasara
 * @author Mahindapala
 * @see Serializable
 *
 */
@SuppressWarnings("serial")
public class Teacher implements Serializable {
	private String name;
	private int age;
	private String address;

	/**
	 * @param name
	 * @param age
	 * @param address
	 */
	public Teacher(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	/**
	 * @return <code> String </code> name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return <code> int </code> age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return <code> String </code> address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
