//binary search tree

//           5
//        /     \
//      3         9
//    /  \       / \
//.  1    4     8   10 
//
class Node{
    int data;
    Node left;
    Node right;
    
    public Node(int data){
        this.data = data;
    }
}
class Functions{
    Node rootNode = null;
    Node currentNode = null;
    
    void addNode(int data){
        Node newNode = new Node(data);
        if(rootNode == null)
          rootNode = newNode;
         else{
            currentNode = rootNode;
            while(true){
                if(newNode.data > currentNode.data){
                    if (currentNode.right != null)
                        currentNode = currentNode.right;
                    else{
                        currentNode.right = newNode;
                        break;
                    }
                }
                else{
                   if(currentNode.left != null)
                        currentNode = currentNode.left;
                    else{
                        currentNode.left = newNode;
                         break;
                   }
               }
            }
        }
    }
    void testDisplay(){
        currentNode = rootNode;
        while(currentNode != null){
        //System.out.println(currentNode.data);
        currentNode= currentNode.right;
        }
    }
     void nodeInOrder(Node currentNode){
        //left
       if(currentNode.left != null)
          nodeInOrder(currentNode.left);
       //root
       System.out.println(currentNode.data);
       //right
       if(currentNode.right != null)
          nodeInOrder(currentNode.right);
     }
     

    void nodePreOrder(Node currentNode){
        //root
        System.out.println(currentNode.data);
        //left
        if(currentNode.left != null)
          nodePreOrder(currentNode.left);
        //right
        if(currentNode.right != null)
          nodePreOrder(currentNode.right);
    }
    
    void nodePostOrder(Node currentNode){
        //left
        if(currentNode.left != null)
          nodePostOrder(currentNode.left);
        //right
        if(currentNode.right != null)
          nodePostOrder(currentNode.right);
        //root
        System.out.println(currentNode.data);
    }
}


public class MyClass{
    public static void main(String args[]){
    Functions utility = new Functions();
    // sample BSt input
       utility.addNode(5);
       utility.addNode(9);
       utility.addNode(8);
       utility.addNode(10);
       utility.addNode(3);
       utility.addNode(1);
       utility.addNode(4);
       
       System.out.println("____inorder___________"); // 1 3 4 5 8 9 10
       utility.nodeInOrder(utility.rootNode);
       System.out.println("____preorder___________"); // 5 3 1 4 9 8 10
       utility.nodePreOrder(utility.rootNode);
       System.out.println("____postorder___________"); // 1 4 3 8 10 9 5
       utility.nodePostOrder(utility.rootNode);
    }
}
