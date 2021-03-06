package problem4.linkedList;

public class MyLinkedList {
    private Node first;
    private Node last;

    public void addLast(int data){
        Node node = new Node(data);
        if(first == null){
            first = last = node;
            return;
        }
        last.setNext(node);
        last = node;
    }
    public void deleteFirst(){
        if(first == null){
            first = last = null;
            return;
        }
        Node second = first.getNext();
        first.setNext(null);
        first = second;
    }
    public  void display(){
        Node current = first;
        while (current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
    public Node search(int data){
        Node current = first;
        while (current != null){
            if(current.getData() == data){
                return current;
            }
            current = current.getNext();
        }
        return null;
    }
}


