package com.test.java;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.*;

public class Test {
	
	private static Collection<? extends Cliente> clientes;

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
		
		
		 final Map hashMap = new HashMap();
		 final Map treeMap = new TreeMap();
		 final Map linkedHashMap = new LinkedHashMap();
		 
		 
		 Cliente juan = new Cliente("Juan", "22", "Calle 10", "1234");
		 Cliente pepe = new Cliente("Pepe", "21", "Calle 11", "5678");
		 //juan.setFullname("Luis");
		 //juan = pepe;
		 System.out.print(juan.fullname);	
		 
		// List names = (List) clientes.stream().map(Cliente::getFullname).collect(Collectors.toList());
		 //System.out.print(names);
		 
	
		  List<String> list = Arrays.asList(3, 6, 9, 12, 15); 
	
	}

}
