class Queue {
    private Node queueStart;
    public int length;

    Queue() {
        this.length = 0;
    }

    private void removeQueueStart() {
        this.queueStart = null;
    }

    private void setQueueStart(Node start) {
        this.queueStart = start;
    }

    private Node getQueueStart() {
        return this.queueStart;
    }

    public void add(Object item) {
        if (getQueueStart() == null) {
            setQueueStart(new Node(item));
        }
        else {
            Node queueEnd = getQueueStart();
            while (queueEnd.getLink() != null) {
                queueEnd = queueEnd.getLink();
            }
            queueEnd.setLink(new Node(item));
        }
        this.length += 1;
    }

    public Object pop() {
        Object queueStartData = getQueueStart().getData();
        if (getQueueStart().getLink() != null) {
            setQueueStart(getQueueStart().getLink());
        } else {
            removeQueueStart();
            this.length = 0;
        }
        this.length -= 1;
        return queueStartData;
    }
}