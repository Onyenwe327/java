

public class Array {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public void ArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr= new int[maxSize];
        front=-1;
        rear=-1;
    }
    public boolean isFull(){
        return rear==maxSize-1;
    }
    public boolean isEmpty(){
        return rear==front;
    }
    public void addQueue(int n){
        if(isFull()){
            System.out.println("queue is full");
            return;            
        }
        rear++;
        arr[rear]=n;
    }
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("");
           // System.out.println();
        }
        front++;
        return arr[front];
    }
    public void showQueue(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }
    public int headQueue(){
        if(isEmpty()){
           // System.out.println("empty");
            throw new RuntimeException("");
        }
        return arr[front+1];
    }
}
