public class Queue {
    private final double[] elements;
    private int size;
    public Queue() {
        elements = new double[32];
        size = 0;
    }
    public void enQueue(double v) {
        if (isFull()) {
            throw new IllegalStateException("队列已满");
        }
        elements[size++] = v;
    }
    public double deQueue() {
        if (isEmpty()) {
            throw new IllegalStateException("队列为空");
        }
        double value = elements[0];
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return value;
    }
    public double getHead() {
        if (isEmpty()) {
            throw new IllegalStateException("队列为空");
        }
        return elements[0];
    }
    public double getTail() {
        if (isEmpty()) {
            throw new IllegalStateException("队列为空");
        }
        return elements[size - 1];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == elements.length;
    }
    public int getSize() {
        return size;
    }
}
void main(){
    Queue queue = new Queue();
    queue.enQueue(1.1);
    queue.enQueue(2.2);
    queue.enQueue(3.3);
    IO.println(queue.getHead());
    IO.println(queue.getTail());
    IO.println(queue.getSize());
    IO.println(queue.deQueue());
    IO.println(queue.getHead());
    IO.println(queue.getSize());
    IO.println(queue.isEmpty());
    IO.println(queue.isFull());
}
