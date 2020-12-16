public class Stack {

    int capacity = 1;
    int stack[] = new int[capacity];
    int top = 0;
  
    public void push(int data) {
      if (size() == capacity) expand();
      stack[top] = data;
      top++;
    }
  
    private void expand() {
      int length = size();
      int newStack[] = new int[capacity * 2];
      System.arraycopy(stack, 0, newStack, 0, length);
      stack = newStack;
      capacity *= 2;
    }
  
    public int pop() {
      int data = 0;
      if (isEmpty()) {
        System.out.println("Stack is Empty");
      } else {
        top--;
        data = stack[top];
        stack[top] = 0;
        shrink();
      }
      return data;
    }
  
    private void shrink() {
      int length = size();
      if (length <= (capacity - 1)) capacity = capacity - 1;
      int newStack[] = new int[capacity];
      System.arraycopy(stack, 0, newStack, 0, length);
      stack = newStack;
    }
  
    public int peak() {
      int data;
      data = stack[top - 1];
      return data;
    }
  
    public int size() {
      return top;
    }
  
    public boolean isEmpty() {
      return top <= 0;
    }
  
    public void show() {
      for (int n : stack) {
        System.out.println(n + "");
      }
      System.out.println();
    }
  
    public static void main(String[] args) {
      Stack i = new Stack();
      i.push(15);
      i.show();
      i.push(8);
      i.show();
      i.push(10);
      i.show();
      i.push(3123);
      i.show();
      i.pop();
      i.show();
      i.size();
      System.out.println(i.pop());
      System.out.println(i.pop());
      System.out.println(i.pop());
      System.out.println(i.size());
    }
  }
  