import java.util.Scanner;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

class Functions{
    Node head= null;
    Node currentNode=null;
    
    public void newNodeCreation(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            currentNode = newNode;
        }
        else{
         currentNode.next = newNode;
         currentNode = newNode;
        }
    }
    
    public void displayAllNodeData(){
        currentNode = head;
       while(currentNode != null) {
           System.out.println(currentNode.data);
           currentNode = currentNode.next;
       }
    }
    
}

public class MyClass{
    public static void main(String args[]){
        Functions utility = new Functions();
        System.out.println();
        for(int i=1 ; i<=5; i++){
            utility.newNodeCreation(i);
        }
        utility.displayAllNodeData();
    }
}
