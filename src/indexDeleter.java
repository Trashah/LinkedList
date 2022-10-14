import LinkedListClass.LinkedList;

public class indexDeleter {
    public static void main (String[] args) {
        LinkedList List1 = new LinkedList();
        List1.setName("Lista 1");

        List1.append(87);
        List1.append(4);
        List1.append(23);
        List1.append(1);
        
        System.out.print(List1.getValueWithIndex(2));
        List1.deleteWithIndex(2);
        System.out.print("\n" + List1.getValueWithIndex(2));
    }
}