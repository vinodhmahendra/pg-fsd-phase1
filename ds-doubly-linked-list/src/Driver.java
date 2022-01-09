
public class Driver {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.createDLL(1);
		dll.insertDLL(2, 0);
		dll.insertDLL(3, 1);
		dll.insertDLL(4, 7);
		dll.traverseDLL();
//		System.out.println(dll.head.value);
		
		System.out.println("==============================");
		dll.reverseTraverseDLL();
		System.out.println(dll.searchNode(3));
		dll.deleteDLL();
		System.out.println(dll.searchNode(3));

	}

}
