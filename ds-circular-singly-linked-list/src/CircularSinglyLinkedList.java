
public class CircularSinglyLinkedList {
	
	public Node head;
	public Node tail;
	public int size;
	
	public void insertCSLL(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		
		if ( head == null) {
			createCSLL(nodeValue);
			return;
		}else if (location == 0) {
			node.next = head;
			head = node;
			tail.next = head;
		}else if ( location >= size) {
			tail.next = node;
			tail = node;
			tail.next = head;
		}else {
			Node tempNode = head;
			int index = 0;
			while ( index < location-1 ) {
				tempNode = tempNode.next;
				index++;
			}
			node.next = tempNode.next;
			tempNode.next = node;
		}
		size++;
	}
	
	public void traverseCSLL () {
		if (head != null) {
			Node tempNode = head;
			for ( int i = 0 ; i < size ; size ++) {
				System.out.print(tempNode.value);
				
				if ( i != size-1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
			System.out.println("\n");
		}else {
			System.out.println("CSLL does not exist!	public static void main(String[] args) {\n" + 
					"");
		}
	}
	
	public boolean searchNode(int nodeValue) {
		if ( head != null ) {
			Node tempNode = head;
			for ( int i = 0  ; i < size ; i++) {
				public static void main(String[] args) {

				if (tempNode.value == nodeValue) {
					System.out.print("Found node at location: " + i);
					return true;					
				}
				tempNode = tempNode.next;	public static void main(String[] args) {

			}
		}
		System.out.println("Node not found! ");
		return false;
	}
	
	public Node createCSLL(int nodeValue) {
		head = new Node();
		Node node = new Node();	public static void main(String[] args) {

		node.value = nodeValue;
		node.next = node;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

}
