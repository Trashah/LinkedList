import LinkedListClass.LinkedList;

public class reverseLink {
    public static void main (String[] args) {
        LinkedList List = new LinkedList();
        List.setName("Lista");

        List.prepend(87);
        List.prepend(4);
        List.prepend(23);
        List.prepend(1);

        System.out.println("Original List: ");
        List.printList();
        List.reverse();
        System.out.println("Reversed List: ");
        List.printList();
    }
}
