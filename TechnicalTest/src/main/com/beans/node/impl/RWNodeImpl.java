package com.beans.node.impl;

import com.beans.node.RWNode;

/**
 * Implementation for RWNode
 * @author Angel L. Fernandez
 */
public class RWNodeImpl implements RWNode {

	/**
	 * Name of the node
	 */
	private String name;
	
	/**
	 * Next node in the list
	 */
	private RWNodeImpl next;

	/**
	 * printReverseList executed mark 
	 */
	private boolean reverseExecuted;

	/**
	 * Constructor with argument
	 * @param name Name of the node
	 */
	public RWNodeImpl(String name) {
		this.name = name;
		this.next = null;
		this.reverseExecuted = false;
	}

	/**
	 * @return The name
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * @return The next node
	 */
	@Override
	public RWNodeImpl getNext() {
		return next;
	}

	/**
	 * @param next The next node to set
	 */
	public void setNext(RWNodeImpl next) {
		this.next = next;
	}

	/**
	 * @return reverseExecuted mark
	 */
	public boolean isReverseExecuted() {
		return reverseExecuted;
	}

	/**
	 * mark node as reverseExecuted
	 */
	public void reverseExecuted() {
		this.reverseExecuted = true;
	}

	/**
	 * Add node at the end
	 * @param node Node to add
	 */
	public void addNode(RWNodeImpl node) {
		RWNodeImpl temp = this;
		while (temp.getNext() != null){
			temp = temp.getNext();
		}
		temp.setNext(node);
	}
	
	/**
	 * Add node at the end
	 * @param name Name of the node to add
	 */
	public void addNode(String name) {
		RWNodeImpl temp = this;
		while (temp.getNext() != null){
			temp = temp.getNext();
		}
		temp.setNext(new RWNodeImpl(name));
	}
	
}
