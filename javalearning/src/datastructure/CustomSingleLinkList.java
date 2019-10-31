package datastructure;


public class CustomSingleLinkList{
	public  Node node;
	public static class Node {
		private String name;
		private Node next;
		
		public Node(String name) {
			this.name=name;
		}
		
		public Node(String name,Node next) {
			this.name= name;
			this.next= next;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		public String getName() {
			return this.name;
		}
		
		public void setNext(Node next) {
			this.next=next;
		}
		
		public Node getNext() {
			return this.next;
		}

		@Override
		public String toString() {
			return "Node [name=" + name + ", next=" + next + "]";
		}
	}
	
	public void printList() {
		Node n=this.node;
		while(n!=null) {
			System.out.println(n.name);
			n=n.next;
		}
	}
	
	public void addInFront(String name) {
		Node n= new Node(name, node);
		this.node=n;
	}
	
	public void insertAfterThisNode(int n,String name) {
		
		if(n==0) {
			Node node= new Node(name, this.node.next);
			this.node.next=node;
		}else {
			Node node=this.node;
			while(n>0) {
				node=node.next;
				if(node==null)
				{
					throw new ArrayIndexOutOfBoundsException();
				}
				n--;
			}
			Node newNode= new Node(name, node.next);
			node.next=newNode;
		}
		
	}
	
}
