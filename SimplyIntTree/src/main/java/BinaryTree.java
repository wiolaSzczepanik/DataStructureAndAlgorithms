public class BinaryTree {
    public static Node root;
    public Node parent;

    public BinaryTree() {
        this.root = null;
        this.parent = null;
    }

    public void insert(int id){
        Node newNode = new Node(id);
        if(root ==null){
                root=newNode;
                return;
            }
            Node current = root;
            Node parent = null;
            while(true){
                parent = current;
                if(id<current.data){
                    current = current.left;
                    if(current==null){
                        parent.left= newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current==null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }

        public void displayTree(Node root){
            if(root!=null){
                displayTree(root.left);
                System.out.println(" "+root.data);
                displayTree(root.right);
            }
        }
    }


