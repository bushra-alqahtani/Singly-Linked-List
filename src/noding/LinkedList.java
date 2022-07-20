package noding;

public class LinkedList {

	Node head;
	
	public LinkedList(Node head) {
		this.head=head;
	}
	
	public void add(int data) {
		Node n= new Node(data);
		//check the head 
		if (head == null) {
			head=n;
		}else {
			Node curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=n;
		}
	}
	
	Node remove(){
		Node curr=head;
		if (curr == null || curr.next==null) {
			head = null;
			return curr;
			
		}
		//next node or the node before the last node 
		Node nextNode= curr.next;
		while (curr.next != null) {
			if(nextNode.next==null) {
				curr.next=null;
		
			}
			curr=nextNode;
			nextNode=nextNode.next;	
		}
		return curr;
	}
	
    public void printValues() {
    	Node node = head;
		
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
    }
}
