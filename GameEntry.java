
import java.util.*;


public class GameEntry {
    private String name;
    private int score;
    String getName() { return name; }
    int getScore() { return score; }
    private GameEntry(String n, int s) {
        name = n;
        score = s;
    }
    public static void main(String[] args) {                         // main function
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(new GameEntry("A", 00));
        list.add(new GameEntry("B", 10));
        list.add(new GameEntry("C", 20));
        list.add(new GameEntry("D", 30));
        list.add(new GameEntry("E", 40));
        list.add(new GameEntry("F", 50));
        list.add(new GameEntry("G", 60));
        list.add(new GameEntry("H", 70));
        list.add(new GameEntry("I", 80));
        list.add(new GameEntry("J", 90));

        while (true) {
            System.out.println(list + "\n");
            System.out.print("----'1'=Add score, '2'=Remove:, '3'=Quiz ----    Input:");
            Scanner temp = new Scanner(System.in);
            int choice = temp.nextInt();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.print("Enter score: ");
                int score = new Scanner(System.in).nextInt();
                list.add(new GameEntry(name, score));
            } else if (choice == 2) {
                System.out.print("Delete position: ");
                int position = new Scanner(System.in).nextInt();
                if (position > list.size() - 1) {
                    System.out.println("Incorrect input");
                    break;
                }
                list.remove(position);
            } else if (choice == 3) {
                System.exit(0);
            }
        }
    }
}



class DoublyLinkedList {
    private Node head;               
    private Node tail;                
    public static class Node {
        private GameEntry element;
        private Node perv;            
        private Node next;           
        Node(GameEntry e, Node p, Node n) {
            element = e;
            perv = p;
            next = n;
        }
    }
    DoublyLinkedList(){              
        head = new Node(null, null, null);
        tail = new Node(null, head, null);
        head.next = tail;
    }
    private Node getNode(int temp) {  
        Node node = head.next;
        for (int i = 0; i < temp; i++)
            node = node.next;
        return node;
    }

    public int size = 0;
    int size(){ return size; }



 
    public void add(GameEntry e){             
        if (size == 10) {                 
            removeSmall(e);
        } else {
            addLast(getNode(size()), e);
        }
    }
    private void addLast(Node newNode, GameEntry e) {   
        Node Node = new Node(e, newNode.perv, newNode);
        Node.perv.next = Node;
        newNode.perv = Node;
        size++;
    }
    private void remove(Node node){           
        node.perv.next = node.next;         
        node.next.perv = node.perv;
        size--;
    }
    void remove(int i){remove(getNode(i)); }

    public void removeSmall(GameEntry e) {    
        Node pervNode = head.next;           
        Node theNode = head.next;
        Node nextNode = head.next.next;
        if (show(e)){
            for (int i = 0; i < size() - 1; i++, nextNode = nextNode.next)
                if (nextNode.element.getScore() < pervNode.element.getScore())
                    theNode = nextNode;
            remove(theNode);
            addLast(getNode(size()), e);
        }
    }
    private boolean show(GameEntry e) {       
        Node node = head.next;                
        for (int i = 0; i < size(); i++, node = node.next)
            if (e.getScore() < node.element.getScore())
                return true;
        return false;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head.next;
        for (int i = 0; i < size; i++){
            sb.append("Name: " + current.element.getName() + "      Score: " + current.element.getScore() + "\n");
            current = current.next;
        }
        return sb.toString();
    }
}