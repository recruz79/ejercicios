package com.recs.algoritmos.linkedlist;


public class LinkedListExample {
	
	private class Node<E> { 
        private E data;  // dato de cualquier tipo 
        private Node<E> after; //link al siguiente nodo 
        private Node<E> before; //link al anterior nodo 
                // Getters y Setters 
                
        private int size; 
        private Node<E> head; 
        private Node<E> tail; 
        
        public E getData() { 
            return data; 
        } 

        public void setData(E data) { 
            this.data = data; 
        } 

        public Node<E> getAfter() { 
            return after; 
        } 

        public void setAfter(Node<E> link) { 
            this.after = link; 
        } 

        public Node<E> getBefore() { 
            return before; 
        } 

        public void setBefore(Node<E> link) { 
            this.before = link; 
        } 
  
                // el constructor inicializa las variables con los valores recibidos 
        public Node(E data, Node<E> after, Node<E> before) { 
            this.data = data; 
            this.after = after; 
            this.before = before; 
        } 
        
        public void add(E item) { 
            Node<E> newNode = new Node<E>(item, tail, tail.getBefore()); // crea un nodo con el dato recivido 
            tail.getBefore().setAfter(newNode); // el nuevo nodo sera el link siguiente al que era el ultimo nodo 
            tail.setBefore(newNode);  
            size++; 
        } 

    }
	
}
