package com.assignment.oodpp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.assignment.oodpp.InMemoryObjectStore;
import com.assignment.oodpp.Teacher;

public class InMemoryObjectStoreTest {

	@Test
	public void shouldReturnIdWhenObjectIsGiven() {
		InMemoryObjectStore store = new InMemoryObjectStore();
		Object obj1 = new Object();
		int id1 = store.store(obj1);
		assertEquals("Doesn't return id when object is stored", 0, id1);
	}

	@Test
	public void shouldReturnObjectWhenIdIsGiven() {
		InMemoryObjectStore store = new InMemoryObjectStore();
		Object obj1 = new Teacher("Test", 1, "Test");
		int id1 = store.store(obj1);
		Object newObj = store.retrieve(id1);
		assertEquals("Doesn't return object when id is given", obj1, newObj);
	}
}
