package ch02.ex16;

import java.util.ArrayList;

public class Queue {
    static class Node {
        private String string;
        private Node previous;
        private Node next;

        public Node(String string, Node previous, Node next) {
            this.string = string;
            this.previous = previous;
            this.next = next;
        }

        public Node(String string) {
            this(string, Queue.END, Queue.END);
        }

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "string='" + string + '\'' +
                    '}';
        }
    }

    private Node head;
    private Node tail;

    private static final Node END;

    static {
        END = new Node("[THIS IS THE END]");
        END.setNext(END);
        END.setPrevious(END);
    }

    public Queue() {
        tail = END;
        head = END;
    }

    public void add(String string) {
        Node originalTail = tail;
        tail = new Node(string, originalTail, END);
        originalTail.setNext(tail);
        if (head == END) {
            head = tail;
        }
    }

    public String remove() {
        Node originalHead = head;
        head = head.getNext();
        head.setPrevious(END);
        if (tail == originalHead) {
            tail = END;
        }
        return originalHead.getString();
    }

    @Override
    public String toString() {
        ArrayList<String> strings = new ArrayList<>();
        Node current = head;
        while (current != END) {
            strings.add(current.getString());
            current = current.getNext();
        }
        return String.format("Queue{%s}", strings);
    }
}
