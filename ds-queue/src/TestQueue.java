
public class TestQueue {

	public static void main(String[] args) {
		QueueArray queue = new QueueArray(3);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
//		queue.enQueue(4);
		System.out.println(queue.peek());
		System.out.println(queue.deQueue());
		queue.traverse();
	}

}
