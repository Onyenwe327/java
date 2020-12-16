public class BinaryTreeDemo {

    public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();
      Node root = new Node(1, "+");
      Node node2 = new Node(2, "*");
      Node node3 = new Node(3, "*");
      Node node4 = new Node(4, "2");
      Node node5 = new Node(5, "-");
      Node node6 = new Node(6, "3");
      Node node7 = new Node(7, "b");
      Node node8 = new Node(8, "a");
      Node node9 = new Node(9, "1");
      root.setLeft(node2);
      root.setRight(node3);
      node2.setLeft(node4);
      node2.setRight(node5);
      node5.setLeft(node8);
      node5.setRight(node9);
      node3.setLeft(node6);
      node3.setRight(node7);
      tree.setRoot(root);
      System.out.print("\r");
      tree.printExpression();
    }
  }
  
  class BinaryTree {
  
    private Node root;
  
    public void setRoot(Node root) {
      this.root = root;
    }
  
    public void printExpression() {
      if (this.root != null) {
        this.root.printExpression();
      } else {
        System.out.println("empty binary tree");
      }
    }
  }
  
  class Node {
  
    private int no;
    private String name;
    private Node left;
    private Node right;
  
    public Node(int no, String name) {
      this.no = no;
      this.name = name;
    }
  
    public int getNo() {
      return no;
    }
  
    public void setNo(int no) {
      this.no = no;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public Node getLeft() {
      return left;
    }
  
    public void setLeft(Node left) {
      this.left = left;
    }
  
    public Node getRight() {
      return right;
    }
  
    public void setRight(Node right) {
      this.right = right;
    }
  
    public String toString() {
      return name;
    }
    //遍历算法
    public void printExpression() {
      if (this.left != null) {
        System.out.print("(");
        this.left.printExpression();
      }
  
      System.out.print(this);
      if (this.right != null) {
        this.right.printExpression();
        System.out.print(")");
      }
    }
  }
  