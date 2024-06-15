package main;
import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;
/**
 * Test class for the GenericLinkedList and GenericNode classes
 * @author rkelley/njohnson/hnilsson
 * Programming Project module 2 updated
 * CS131ON
 */
public class TestLinkedList {

	public static void main(String[] args) {
		
		GenericLinkedList<Integer> myList1=new GenericLinkedList<Integer>(); //Linked list of type Integer
		
		GenericNode<Integer> aNode1 = new GenericNode<Integer>();
		aNode1.setData(1);
		myList1.addNode(aNode1);
		aNode1 = new GenericNode<Integer>();
		aNode1.setData(2);
		myList1.addNode(aNode1);
		
		GenericNode<Integer> tempnode1=myList1.getList();
		do 
		{
			System.out.println(tempnode1.getData());
			tempnode1=tempnode1.getNextNode();
		} while (tempnode1 != null);
		
		GenericLinkedList<Double> myList2 = new GenericLinkedList<Double>(); //Linked list of type Double
		
		GenericNode<Double> aNode2 = new GenericNode<Double>();
		aNode2.setData(1.0);
		myList2.addNode(aNode2);
		aNode2 = new GenericNode<Double>();
		aNode2.setData(2.0);
		myList2.addNode(aNode2);
		
		GenericNode<Double> tempnode2=myList2.getList();
		do 
		{
			System.out.println(tempnode2.getData());
			tempnode2=tempnode2.getNextNode();
		} while (tempnode2 != null);
		
		GenericLinkedList<String> myList3 = new GenericLinkedList<String>(); // Linked list of type String
		
		GenericNode<String> aNode3 = new GenericNode<String>();
		aNode3.setData("Hello");
		myList3.addNode(aNode3);
		aNode3 = new GenericNode<String>();
		aNode3.setData("Hi");
		myList3.addNode(aNode3);
		
		GenericNode<String> tempnode3 = myList3.getList();
		do 
		{
			System.out.println(tempnode3.getData());
			tempnode3=tempnode3.getNextNode();
		} while (tempnode3 != null);

	}//end main

}//end class
