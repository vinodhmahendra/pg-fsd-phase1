
public class Driver {

	public static void main(String[] args) {
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		csll.createCSLL(5);
		csll.insertCSLL(2, 0);
		csll.insertCSLL(4, 1);
		
		csll.traverseCSLL();

		System.out.println(csll.searchNode(4));
	}

}
