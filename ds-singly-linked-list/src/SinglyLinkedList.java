
public class SinglyLinkedList {
	
	public Node head;
	public Node tail;
	
	public int size;
	
	public Node createSinglyLinkedList(int nodeValue) {
		head = new Node();
		
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		
		head= node;
		tail = node;
		
		size = 1;
		return head;
	}
	
	public void traverseSinglyLinkedList() {
		if (head == null) {
			System.out.println("SLLL doest not exist");
		}else {
			Node tempNode= head;
			for (int i = 0 ; i < size ; i++) {
				System.out.print(tempNode.value);
				
				if ( i != size -1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("\n");
	}
	
	public void insertInLinekedList(int nodeValue,int location) {
		Node node = new Node();
		node.value = nodeValue;
		
		if ( head  == null) {
			createSinglyLinkedList(nodeValue);
			return;
		}else if ( location == 0) {
			//System.out.println("insert start of singly linked list");
			node.next = head;
			head = node;
		}else if ( location >= size) {
//			System.out.println("insert end of singly linked list");
			node.next = null;
			tail.next = node;
			tail = node;
		}else {
//			System.out.println("middle");
			Node tempNode = head;
			int index = 0;
			while ( index < location -1) {
				tempNode = tempNode.next;
				index++;
			}
			
			Node nextNode = tempNode.next;
			tempNode.next = node;
			node.next = nextNode;
		}
		size ++;
		return;
	}

}
