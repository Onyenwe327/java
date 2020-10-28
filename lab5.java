public class lab5 {
    public Node head = null;
    public Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {
                System.out.print(" " + current.data);
                current = current.next;
            } while (current != head);

            System.out.println();
        }
    }

    public void reverse(Node current) {
        if (current.next == head) {
            System.out.print(" " + current.data);

            return;
        }

        reverse(current.next);
        System.out.print(" " + current.data);
    }

    public static void main(String[] args) {
        lab5 cl = new lab5();
        cl.add(0);
        cl.add(4);
        cl.add(123);
        cl.add(45);
        cl.add(234);
        cl.add(636);
        System.out.println("Original List: ");
        cl.display();
        System.out.println("Reversed List: ");
        cl.reverse(cl.head);
    }

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
