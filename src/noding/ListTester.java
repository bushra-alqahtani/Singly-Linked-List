package noding;

public class ListTester {

	public static void main(String[] args) {
		LinkedList sll = new LinkedList(null);
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.printValues();
        System.out.println(" now i will remove last tow nodes then print agin \n ");
        sll.remove();
        sll.remove();
        sll.printValues();

	}

}
