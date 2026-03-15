import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;
    Node tail = null;

    public void insert(int y) {
        Node sn = new Node(y);

        if (head == null) {
            head = sn;
            tail = sn;
        } else {
            tail.next = sn;
            tail = sn;
        }
    }

    public void insfirst(int v) {
        Node n = new Node(v);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void insend(int v) {
        Node n = new Node(v);

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void delfirst() {
        if (head != null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }


    public void delend() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner run = new Scanner(System.in);
        LinkedList obj = new LinkedList();

        int u = run.nextInt();

        for (int i = 0; i < u; i++) {
            int y = run.nextInt();
            obj.insert(y);
        }

        int first = run.nextInt();
        obj.insfirst(first);

        int end = run.nextInt();
        obj.insend(end);

        obj.delfirst();
        obj.delend();

        obj.display();
    }
}