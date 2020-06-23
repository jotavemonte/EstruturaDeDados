class Stack {
    private Node stackTop;
    public int length;

    Stack() {
        this.length = 0;
    }

    private void removeStackTop() {
        this.stackTop = null;
    }

    private void setStackTop(Node top) {
        this.stackTop = top;
    }

    private Node getStackTop() {
        return this.stackTop;
    }

    public void add(Object data) {
        if (stackTop != null) {
            setStackTop(new Node(data, getStackTop()));
        } else {
            setStackTop(new Node(data));
        }
        this.length += 1;
    }

    public Object pop() {
        Object stackTopData = getStackTop().getData();
        if (getStackTop().getLink() != null) {
            setStackTop(getStackTop().getLink());
        } else {
            removeStackTop();
            this.length = 0;
        }
        this.length -= 1;
        return stackTopData;
    }
}