package com.test.java;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	private Collection<? extends Cliente> clientes;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("#### Hola Java 8 #### ");
		System.out.print("\n");
		//Collection SET...
		
		final Set<Integer> hashSet = new HashSet<Integer>(1_000_000);
		final Long startHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
		    hashSet.add(i);
		}
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));
		 
		final Set<Integer> treeSet = new TreeSet<Integer>();
		final Long startTreeSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
		    treeSet.add(i);
		}
		final Long endTreeSetTime = System.currentTimeMillis();
		System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));
		 
		final Set<Integer> linkedHashSet = new LinkedHashSet<Integer>(1_000_000);
		final Long startLinkedHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
		    linkedHashSet.add(i);
		}
		final Long endLinkedHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
		
		 ArrayList arrayList = new ArrayList();
		 LinkedList linkedList = new LinkedList();
		
		

	}

}
