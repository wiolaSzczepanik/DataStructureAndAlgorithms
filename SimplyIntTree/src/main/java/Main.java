public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(3);
        tree.insert(8);
        tree.insert(4);
        tree.insert(1);
        tree.insert(10);
        tree.insert(15);
        tree.insert(9);
        System.out.println("Origin tree: ");
        tree.displayTree(tree.root);


    }
}
