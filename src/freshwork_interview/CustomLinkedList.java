package freshwork_interview;

public class CustomLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

   static Node head = null, temp = null;  
  
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            temp = newNode;
        } else {
            temp.next = newNode;
            temp = newNode;
        }
    }
   void insert(int index, int data) {
    Node newNode = new Node(data);
    if (index == 0) {
        newNode.next = head;
        head = newNode;
        return;
    }
    
    Node current = head;
    int count = 0;
    while (current != null) {
        if (count == index - 1) {
            newNode.next = current.next;
            current.next = newNode;
            break;
        }
        current = current.next;
        count++;
    }
}

  void addFront(int data){
     Node newNode = new Node(data);
     newNode.next = head;
     head = newNode;
      
  }
    void print() {
        Node t = head;
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insert(5);
        list.insert(10);  
        list.insert(1,15);
        //list.addFront(8);
        list.print();  
    }
}
