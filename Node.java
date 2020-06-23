class Node {
    Object data;
    Node link;

    Node(Object data) {
        this.data = data;
    }

    Node(Object data, Node link) {
        this.data = data;
        this.link = link;
    }

    public Object getData() {
        return this.data;
    }

    public Node getLink() {
        return this.link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}