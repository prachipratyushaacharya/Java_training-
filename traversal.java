public class traversal {
    public static void main(String[] args) {

    }
}

void PreOrder(BinaryTreeNode root) {
    if (root != null) {
        System.out.print(root.data + " ");
        PreOder(root.left);
        PreOder(root.right);
    }
}

void PreOrder(BinaryTreeNode root) {
    if (root != null) {
        System.out.print(root.data + " ");
        PreOder(root.left);
        PreOder(root.right);
    }
}

void PostOrder(BinaryTreeNode root) {
    if (root != null) {
        System.out.print(root.data + " ");
        PostOrder(root.left);
        PostOrder(root.right);
    }
}