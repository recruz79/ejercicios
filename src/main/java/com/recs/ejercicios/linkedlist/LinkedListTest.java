package com.recs.ejercicios.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {

	class Node<T> {
        T value;
        Node<T> next;
        Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
	
	static <T> Node<T> reverse(Node<T> head) {
        Node<T> previous = null, current = head;
        while(current != null) {      	
            Node<T> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
	
	static <T> Node<T> reverse2(Node<T> head) {
        if(head == null) {
            return null;
        } else if(head.next == null) {
            return head;
        } else {
            Node<T> rtail = reverse(head.next);
            rtail.next = head;
            head.next = null;
            return rtail;
        }
    }
	
	public static void showLinkedListValues(LinkedList<Integer> list) {
		for(Integer current: list) {
			System.out.println(current);
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Hello java world");
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(new Integer(3));
		list.add(new Integer(100));
		list.add(new Integer(5));
		list.add(new Integer(19));
		list.add(new Integer(34));
		list.add(new Integer(1));
		showLinkedListValues(list);
		ArrayList<Node<Integer>> nodeList = new ArrayList<Node<Integer>>();
		
	}
}