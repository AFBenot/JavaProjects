package com.exercises;

import com.beans.node.impl.RWNodeImpl;

/**
 * Exercise 2
 * @author Angel L. Fernandez
 */
public class Exercise2 {
	
	/**
	 * Print a Node list in reverse only one time
	 * @param node Node list to print
	 */
	public static void printListReverse(RWNodeImpl node){
		if(!node.isReverseExecuted()){
			if (node.getNext() != null){
				printListReverse(node.getNext());
			}
			System.out.println(node.getName());
			node.reverseExecuted();
		} else {
			System.out.println("It is not possible execute this method for this node.");		}
	}
	
}
