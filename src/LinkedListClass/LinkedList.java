package LinkedListClass;
import LinkedListClass.NodeClass.Node;

public class LinkedList {
    public Node head;
    public String name;

    public LinkedList() {}

    public void setName(String string) {
        name = string;
    }

    public String getName() {
        return name;
    }

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            Node temp = current;
            current = current.next;
            current.prev = temp;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.prev = null;
        newHead.next = head;
        if (head != null) {
            head.prev = newHead;
        }
        head = newHead;
    }

    public int countNodes() {
        if (head == null) return 0;
        Node current = head;
        int counter = 1;
        while (current.next != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public void printList() {
        if (head == null) return;
        Node current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != null);
    }

    public void deleteWithValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void deleteWithIndex(int givenIndex) {
        if (head == null) return;
        int currentIndex = 0;
        Node current = head;
        while (current.next != null) {
            if (currentIndex == givenIndex - 1) {
                current.next = current.next.next;
                return;
            }
            currentIndex++;
            current = current.next;
        }
    }

    public int getValueWithIndex(int givenIndex) {
        if (head == null) return -1;
        int currentIndex = 0;
        Node current = head;
        while (current.next != null) {
            if (currentIndex == givenIndex) {
                break;
            }
            currentIndex++;
            current = current.next;
        }
        return current.data;
    }

    public boolean isEmpty() {
        if (head == null) return true;
        else return false;
    }

    public String isEmptyStatement() {
        String statement;
        if (this.isEmpty()) {
            statement = "La lista '" + name + "' esta vacia.";
        }
        else {
            statement = "La lista '" + name + "' no esta vacia.";
        }
        return statement;
    }

    public int getBiggestValue() {
        int biggestNumber = -1;
        if (head == null) return biggestNumber;
        Node current = head;
        biggestNumber = current.data;
        while (current.next != null) {
            if (current.data > biggestNumber) biggestNumber = current.data;
            current = current.next;
        }
        return biggestNumber;
    }

    public void createNodeInBetween(int previousIndex, int nextIndex) {
        int previousValue = this.getValueWithIndex(previousIndex);
        int nextValue = this.getValueWithIndex(nextIndex);
        int newValue = nextValue - previousValue;
        if (newValue < 0) newValue -= newValue * 2;
        this.append(newValue);
    }

    public int getMiddleValue() {
        int middleIndex = this.countNodes() / 2;
        return this.getValueWithIndex(middleIndex);
    }

    public void reverse() {
        Node temp = null;
        Node current = head;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
 
        if (temp != null) {
            head = temp.prev;
        }
    }

    public int countGivenValue(int givenValue) {
        int counter = 0;
        Node current = head;
        while (current.next != null) {
            if (current.data == givenValue) counter++;
            current = current.next;
        }
        return counter;
    }
}