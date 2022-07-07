package Linklist;

import Linklist.CreateLinkList.Node;

public class LinkList {

	Node head;
	Node tail;

	// push to stack
	public Node push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			this.head = newNode;
		} else {
			tail.next = newNode;
		}
		this.tail = newNode;
		return newNode;
	}

	// check whether the stack is empty
	public void print() {
		Node newNode = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (newNode != null) {
				if (newNode.next != null) {
					System.out.print(newNode.data + "->");
				} else
					System.out.println(newNode.data);
				newNode = newNode.next;
			}
		}
	}

	// peak to Stack
	public Node peak() {
		Node newNode = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (newNode.next != null) {
				newNode = newNode.next;
			}
		}
		return newNode;
	}

	// pop to Stack
	public Node pop() {
		Node newNode = this.head;
		if (head == null) {
			while (newNode.next != null) {
				System.out.println("Popped Element : " + newNode.next.next.data);
				newNode = newNode.next;
				newNode.next = null;
			}
		}
		return newNode;
	}

}
