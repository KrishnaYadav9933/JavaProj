package trees;

public class treeTraversal {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    static void nthLevel(Node root, int n){
        if(root==null) return;
        if(n==1){
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }
    static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    static int height(Node root){
        if(root==null ||(root.left==null && root.right==null)) return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
    static void BFS(Node root){
        int level=height(root)+1;
        for(int i=1; i<=level; i++){
            nthLevel(root, i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        root.left=a;
        root.right=b;
        Node c = new Node(40);
        Node d = new Node(50);
        a.left=c;
        a.right=d;
        Node e = new Node(60);
        Node f = new Node(70);
        b.left=e;
        b.right=f;
//        preorder(root);
//        System.out.println();
//        inorder(root);
//        System.out.println();
//        postorder(root);
      BFS(root);
    }
}
