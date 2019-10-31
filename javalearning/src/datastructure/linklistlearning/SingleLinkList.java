package datastructure.linklistlearning;

import datastructure.CustomSingleLinkList;
import datastructure.CustomSingleLinkList.Node;

public class SingleLinkList {
	
	public static void main(String args[]) {
		
		
		CustomSingleLinkList  customLinkList = new CustomSingleLinkList();
		Node headNode= new Node("sunil kumar singh");
		headNode.setNext(new Node("kumud singh"));
		headNode.getNext().setNext(new Node("Animesh Mrinal"));
		customLinkList.node=headNode;
		customLinkList.addInFront("ggggg");
		customLinkList.insertAfterThisNode(0, "a");
		customLinkList.insertAfterThisNode(1, "b");
		customLinkList.insertAfterThisNode(4, "a");
		/*
		customLinkList.insertAfterThisNode(3, "c");*/
		customLinkList.printList();
		
		//System.out.println(headNode);
	}

}
