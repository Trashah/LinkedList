import LinkedListClass.LinkedList;

public class biggestNumber {
    public static void main (String[] args) {
        LinkedList List1 = new LinkedList();
        List1.setName("Lista 1");

        List1.append(87);
        List1.append(4);
        List1.append(23);
        List1.append(1);
        List1.append(90);

        System.out.println("El numero mas grande en la " + List1.getName() + " es: " + List1.getBiggestValue());
    }
    
}
