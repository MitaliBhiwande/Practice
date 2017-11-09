/*
Implementation of LinkedList Variations

Methods implemented:
1. Display Linked List
2. Reverse Linked List Iteratively
3. Reverse Linked List Recursively
4. Add to LinkedList
5. DetectLoop
6. Count Number of Nodes

*/
public class LinkedListProblems {
	
	public static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	static Node head= null;
	static Node tail= null;
	
	public static void main(String[] args) {
		LinkedListProblems l =new LinkedListProblems();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		System.out.println(displayList(head));
		// use either of two below to reverse LinkedList
		//System.out.println(displayList(reverseIterative(head)));
		//System.out.println(displayList(reverseRecursive(head)));
		if(detectCycle(head))
			System.out.println("Loop Detected");
		else
			System.out.println("No loop Present");
		System.out.println(countNodes(head));
		

	}

	private static int countNodes(Node node) {
		// TODO Auto-generated method stub
		int count=0;
		if(node == null)
			count=0;
		while(node != null){
			count++;
			node=node.next;
		}
		return count;
	}

	private static boolean detectCycle(Node node) {
		if(node==null)
			return false;
		Node slow=node;
        Node fast=node;
        
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true; 
        }
        
       return false; 
		
	}

	private static Node reverseRecursive(Node node) {
		Node temp;
		if(node==null||node.next==null)
			return node;
		temp=reverseRecursive(node.next);
		node.next.next=node;
		node.next=null;
		return temp;
		
	}

	private static Node reverseIterative(Node head) {
		if(head == null)
			return head;
		else{
			Node current = head;
			Node previous = null;
			Node next = null;
			while(current != null){
				next = current.next;
				current.next = previous; //change direction of pointers
				previous= current;
	            current = next;
			}
			return previous;
		}
		
	}

	private static String displayList(Node node) {
		if(node == null)
			return "Empty List";
		else{
			String out="";
			Node temp=node;
			while(temp !=null){
				out+=" <-- "+temp.data;
				temp=temp.next;
			}
			return out;
		}
		
	}

	private void add(int i) {
		Node temp = new Node(i);
		if(head==null && tail==null)
			head=tail=temp;
		else{
			temp.next=head;
			head=temp;
		}
		
		
	}

}
