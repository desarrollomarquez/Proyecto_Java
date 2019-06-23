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
		 
		 
	        Map<Integer, String> HOSTING = new HashMap<>();
	       
	        HOSTING.put(1, "linode.com");
	        HOSTING.put(2, "heroku.com");
	        HOSTING.put(3, "digitalocean.com");
	        HOSTING.put(4, "aws.amazon.com");

	        //Map -> Stream -> Filter -> Map
	        Map<Integer, String> collect = HOSTING.entrySet().stream()
	                .filter(map -> map.getKey() == 2)
	                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

	        //System.out.println(collect); //output : {2=heroku.com}

	        Map<Integer, String> collect2 = HOSTING.entrySet().stream()
	                .filter(map -> map.getKey() <= 3)
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

	        //System.out.println(collect2); //output : {1=linode.com, 2=heroku.com, 3=digitalocean.com}
	        
	        System.out.print("Stream -> Map");
	        System.out.print("\n");
	        
	      //HashMap -> Bolsa de Servidores
	        Map<Integer, String> SERVIDOR = new HashMap<>();
	        
	        SERVIDOR.put(1, "SMTP");
	        SERVIDOR.put(2, "WebApp");
	        SERVIDOR.put(3, "MovilApp");
	        SERVIDOR.put(4, "RDS");

	        //Map -> Stream -> Filter -> Map
	        Map<Integer, String> collect3 = SERVIDOR.entrySet().stream()
	                .filter(map -> map.getKey() == 4)
	                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

	        System.out.println(collect3); //output : {2=heroku.com}
	        
	        Map<Integer, String> collect4 = SERVIDOR.entrySet().stream()
	                .filter(map -> map.getKey() >= 3)
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

	        System.out.println(collect4); //output : {1=linode.com, 2=heroku.com, 3=digitalocean.com}
	    
	        Map<Integer, String> cliente = new HashMap<>();
	        
	        cliente.put(30, "Calle 100");
	        cliente.put(27, "Calle 312");
	        cliente.put(18, "Calle 76");
	       
	        //System.out.print(cliente);
	        
	        Map<Integer, String> collect5 = cliente.entrySet().stream()
	        		.filter(map -> map.getKey() > 20)
	        		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	       System.out.print(collect5);
	       System.out.print("\n");
	       
	       Set<Cliente> hashCliente = new HashSet<Cliente>();
	       
	   
	       
	}

}
