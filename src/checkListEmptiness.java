import LinkedListClass.LinkedList;

public class checkListEmptiness {
    public static void main (String[] args) {
        LinkedList List1 = new LinkedList();
        LinkedList List2 = new LinkedList();
        
        List1.setName("Lista 1");
        List2.setName("Lista 2");
        List1.append(4);

        System.out.println(List1.isEmptyStatement());
        System.out.println("\n" + List2.isEmptyStatement());
    }
}
