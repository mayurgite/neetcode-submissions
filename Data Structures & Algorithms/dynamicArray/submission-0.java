class DynamicArray {
    private int[] arr;
    private int capacity;
    private int size = 0;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (arr.length < size + 1) {
            resize();
        }

        arr[size] = n;

        size++;
    }

    public int popback() {
        int num = arr[size - 1];
        size--;

        return num;
    }

    public void resize() {
        capacity = capacity * 2;
        int[] tmp = new int[capacity];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        arr = tmp;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return arr.length;
    }
}
