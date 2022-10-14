import LinkedListClass.LinkedList;

public class countList {
    public static void main (String[] args) {
        LinkedList List1 = new LinkedList();
        List1.setName("Lista 1");

        List1.append(87);
        List1.append(4);
        List1.append(23);
        List1.append(1);
        
        System.out.println("La lista '" + List1.getName() + "' tiene " + List1.countNodes() + " nodos.");
    }
}