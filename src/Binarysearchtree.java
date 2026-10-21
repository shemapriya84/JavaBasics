import java.util.Scanner;

public class Binarysearchtree {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    public static Node Insert(Node root,int value){
        if(root == null){
            return new Node(value);
        }
        if(value<root.data){
            root.left = Insert(root.left,value);
        }
        else if(value>root.data){
            root.right = Insert(root.right,value);
        }
        return root;
    }
    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data < key){
            return search(root.right,key);
        }
        return search(root.left , key);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            root = Insert(root,value);
        }
        int k = sc.nextInt();
        Inorder(root);
        boolean result=search(root,k);
        System.out.println(result);
        sc.close();
    }
}
