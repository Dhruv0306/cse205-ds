// class MyCircularQueue {
//     int maxSize, head = 0, tail = -1;
//     int[] data;
//     public MyCircularQueue(int k) {
//         data = new int[k];
//         maxSize = k;
//     }
//     public boolean enQueue(int val) {
//         if (isFull()) return false;
//         tail = (tail + 1) % maxSize;
//         data[tail] = val;
//         return true;
//     }
//     public boolean deQueue() {
//         if (isEmpty()) return false;
//         if (head == tail) {
//             head = 0;
//             tail = -1;
//         } else head = (head + 1) % maxSize;
//         return true;
//     }
//     public int Front() {
//         return isEmpty() ? -1 : data[head];
//     }
//     public int Rear() {
//         return isEmpty() ? -1 : data[tail];
//     }
//     public boolean isEmpty() {
//         return tail == -1;
//     }
//     public boolean isFull() {
//         return !isEmpty() && (tail + 1) % maxSize == head;
//     }
// }
class ListNode {
    int val;
    ListNode next;
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class MyCircularQueue {
    int maxSize, size = 0;
    ListNode head = null, tail = null;
    public MyCircularQueue(int k) {
        maxSize = k;
    }
    public boolean enQueue(int val) {
        if (isFull()) return false;
        ListNode newNode = new ListNode(val, null);
        if (isEmpty()) head = tail = newNode;
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
        return true;
    }
    public boolean deQueue() {
        if (isEmpty()) return false;
        head = head.next;
        size--;
        return true;
    }
    public int Front() {
        return isEmpty() ? -1 : head.val;
    }
    public int Rear() {
        return isEmpty() ? -1 : tail.val;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == maxSize;
    }
}