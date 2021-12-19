
public class Driver {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.createSinglyLinkedList(5);
		sll.traverseSinglyLinkedList();
		//System.out.println(sll.head.value);
		
		sll.insertInLinekedList(6, 1);
		sll.traverseSinglyLinkedList();
		sll.insertInLinekedList(7, 3);
		sll.traverseSinglyLinkedList();
		
		sll.insertInLinekedList(9, 0);
		sll.traverseSinglyLinkedList();
		sll.insertInLinekedList(10, 2);
		sll.traverseSinglyLinkedList();
		
		sll.insertInLinekedList(6, 3);
		sll.traverseSinglyLinkedList();
	}

}
