//binary tree

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
class Fucntions{
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
     void NodeInOrder(Node currentNode){
        //left
       if(currentNode.left != null)
          NodeInOrder(currentNode.left);
       //root
       System.out.println(currentNode.data);
       //right
       if(currentNode.right != null)
          NodeInOrder(currentNode.right);
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
    
    void NodePostOrder(Node currentNode){
        //left
        if(currentNode.left != null)
          NodePostOrder(currentNode.left);
        //right
        if(currentNode.right != null)
          NodePostOrder(currentNode.right);
        //root
        System.out.println(currentNode.data);
    }
}


public class MyClass{
    public static void main(String args[]){
    Fucntions utility = new Fucntions();
    // sample BSt input
       utility.addNode(5);
       utility.addNode(9);
       utility.addNode(8);
       utility.addNode(10);
       utility.addNode(3);
       utility.addNode(1);
       utility.addNode(4);
       
       System.out.println("____inorder___________");
       utility.NodeInOrder(utility.rootNode);
       System.out.println("____preorder___________");
       utility.nodePreOrder(utility.rootNode);
       System.out.println("____postorder___________");
       utility.NodePostOrder(utility.rootNode);
    }
}
