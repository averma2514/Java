package dsa.tree;

class Tree{
    Node root;

    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

       
    public void insert(int data){
        Node newnode = new Node(data);
        
        if(root == null){
            root = newnode;
        }else{
            Node current = root;

            while(true){
                if(data<current.data){
                    if(current.left == null){
                        current.left = newnode;
                        break;
                    }else{
                        current = current.left;
                    }
                }else{
                    if(current.right == null){
                        current.right = newnode;
                        break;
                    }else{
                        current = current.right;
                    }
                }
            }
        }
    }

    void inOrder(Node temp){
       if(temp!=null){
         inOrder(temp.left);
         System.out.println(temp.data + " ");            
         inOrder(temp.right);
      }
    }

    void preorder(Node temp){
       if(temp!=null){
        System.out.print(temp.data + " "); 
         preorder(temp.left);
                    
         preorder(temp.right);
      }
    }

    void inorder(Node temp){
       if(temp!=null){
         inorder(temp.left);
         System.out.print(temp.data + " ");            
         inorder(temp.right);
      }
    }

    void deorder(Node temp){
       if(temp!=null){
         deorder(temp.left);
         deorder(temp.right);
         System.out.print(temp.data + " "); 
      }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        //element entring in tree
        tree.insert(5);
        tree.insert(3);
        tree.insert(1);
        tree.insert(8);

        //printng element.
        System.out.print("Element in tree = > ");
        tree.preorder(tree.root);
        System.out.println();

        //printng element in incrising order.
        System.out.print("Element in tree in incrising order = > ");
        tree.inorder(tree.root);
        System.out.println();
        
        //printing element in decrising order.
        System.out.print("Element in tree in decrising order = > ");
        tree.deorder(tree.root);
        System.out.println();
    }
    

}