package com.exercises;

import com.beans.node.impl.RWNodeImpl;

/**
 * Exercise 1
 * @author Angel L. Fernandez
 */
public class Exercise1 {
	
	/**
	 * Print a Node list
	 * @param node Node list to print
	 */
	public static void printList(RWNodeImpl node){
		while(node.getNext() != null){
			System.out.println(node.getName());
			node = node.getNext();
		}
		System.out.println(node.getName());
	}
	
}
