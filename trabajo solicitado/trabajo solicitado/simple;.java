class doble<T> {
    T data;
    doble<T> next, prev;

    doble(T data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class DoublyLinkedList<T> {
    private doble<T> head, tail;

    public DoublyLinkedList() {
        this.head = this.tail = null;
    }

    public void add(T data) {
        doble<T> newNode = new doble<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void edit(T oldData, T newData) {
        doble<T> current = head;
        while (current != null) {
            if (current.data.equals(oldData)) {
                current.data = newData;
                return;
            }
            current = current.next;
        }
    }

    public void delete(T data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }

        doble<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                if (current.next != null) {
                    current.next.prev = current;
                } else {
                    tail = current;
                }
                return;
            }
            current = current.next;
        }
    }
}