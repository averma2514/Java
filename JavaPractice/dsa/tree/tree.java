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
            //
            // while(true){
            //     if(data<current.data){
            //         current.left = newnode;
            //         break;
            //     }else{
            //         current = current.right;
            //         if(current == null){
            //             current = newnode;
            //             break;
            //         }
            //     }
            // }
        }
    }
    

}