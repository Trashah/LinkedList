import LinkedListClass.LinkedList;

public class countValue {
    public static void main (String[] args) {
        LinkedList List1 = new LinkedList();
        List1.setName("Lista 1");

        List1.append(87);
        List1.append(4);
        List1.append(1);
        List1.append(23);
        List1.append(1);
        List1.append(1);
        List1.append(90);

        int givenValue = 1;
        System.out.println("El valor " + givenValue + " aparece en la " + List1.getName() + " " + List1.countGivenValue(givenValue) + " veces");
    }
}
