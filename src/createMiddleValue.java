import LinkedListClass.LinkedList;

public class createMiddleValue {
    public static void main (String[] args) {
        LinkedList List1 = new LinkedList();
        List1.setName("Lista 1");

        List1.append(87);
        List1.append(4);
        List1.append(23);
        List1.append(1);
        List1.append(90);

        System.out.println("Lista original:" );
        List1.printList();
        List1.createNodeInBetween(2, 3);
        System.out.println("Lista con valor agregado:");
        List1.printList();
    }
}
