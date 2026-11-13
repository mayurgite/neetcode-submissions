class MinStack {
    private final Stack<Integer> stack;
    NavigableSet<Integer> set;

    public MinStack() {
        stack = new Stack<>();
        set = new TreeSet<>();
    }

    public void push(int val) {
        stack.push(val);
        set.add(val);
    }

    public void pop() {
        int n = stack.pop();

        if (!stack.contains(n))
            set.remove(n);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return set.first();
    }
}
