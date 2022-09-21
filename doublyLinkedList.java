class Node{
   int data;
   Node prev;
   Node next;
   
   public Node(int data){
       this.data = data;
   }
}
class Functions{
    Node head = null;
    Node currentNode;
    void createNewnode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            currentNode = newNode;
        }
        else{
            currentNode.next = newNode;
            newNode.prev = currentNode;
            currentNode = newNode;
        }
    }
    
    void displayAllNodes(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        
        currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        //To print in reverse
        System.out.println("=========");
        while(currentNode != null){
          System.out.println(currentNode.data);
          currentNode  = currentNode.prev;
        }
    }
}

public class MyClass{
    public static void main(String args[]){
     Functions utitly = new Functions();
     for(int i=1 ;i <= 5 ;i++){
        utitly.createNewnode(i);
     }
     utitly.displayAllNodes();
    }
}
