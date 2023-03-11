public class myQueue {
    private int maxSize; // Kích thước tối đa của queue
    private int[] queueArray; // Mảng lưu trữ dữ liệu của queue
    private int front; // Vị trí đầu của queue
    private int rear; // Vị trí cuối của queue
    private int nItems; // Số lượng phần tử trong queue

    public myQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            rear++;
            queueArray[rear] = value;
            nItems++;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int temp = queueArray[front];
            front++;
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return temp;
        }
    }

    public int peek() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}
