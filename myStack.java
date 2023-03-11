public class myStack {
    private int maxSize; // Kích thước tối đa của stack
    private int[] stackArray; // Mảng lưu trữ dữ liệu của stack
    private int top; // Vị trí đỉnh của stack

    public myStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            stackArray[top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int temp = stackArray[top];
            top--;
            return temp;
        }
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
