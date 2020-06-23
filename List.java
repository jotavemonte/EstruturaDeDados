import java.util.Map;
import java.util.HashMap;

public class List {
    private Map<Integer, Node> indexMap = new HashMap<Integer, Node>();
    public int length = 0;
    private Node lastNode;

    private Map<Integer, Node> getIndexMap() {
        return this.indexMap;
    }

    private void setIndexMap(Map<Integer, Node> indexMap) {
        this.indexMap = indexMap;
    }

    private void removeLastNode() {
        this.lastNode = null;
    }

    private void setLastNode(Node lastNode) {
        this.lastNode = lastNode;        
    }

    private Node getLastNode() {
        return this.lastNode;
    }

    List() {}

    List(Iterable array) {
        add(array);
    }

    private void resetIndexMap() {
        setIndexMap(new HashMap<Integer, Node>());
        Map<Integer, Node> indexMap = getIndexMap();
        
        int lastNodeIndex = this.length - 1;
        Node lastNode = getLastNode();

        for (int i = lastNodeIndex; i >= 0; i--) {
            indexMap.put(i, lastNode);
            if (lastNode.getLink() != null) {
                lastNode = lastNode.getLink();
            }
        }
    }

    private Object removeNode(int nodeIndex) {
        Map<Integer, Node> indexMap = getIndexMap();
        Node targetNode = indexMap.get(nodeIndex);
        Node previousNode = targetNode.getLink();
        if (this.length == 1) {
            removeLastNode();
        }
        else if (nodeIndex == this.length - 1) {
            setLastNode(previousNode);
        }
        else {
            Node nextNode = indexMap.get(nodeIndex + 1);
            nextNode.setLink(previousNode);
        }
        this.length--;
        return targetNode.getData();
    }

    private void addItem(Object item) {
        Node newNode;
        Map<Integer, Node> indexMap = getIndexMap();
        if (getLastNode() == null) {
            newNode = new Node(item);
        }
        else {
            newNode = new Node(item, getLastNode());
        }
        setLastNode(newNode);
        indexMap.put(this.length, newNode);
        this.length++;
    }

    public void add(Object object) {
        addItem(object);
    }

    public void add(Object[] object) {
        for (Object element: object) {
            addItem(element);
        }
    }

    private Object popItem(int index) {
        Object popedData;
        popedData = removeNode(index);
        resetIndexMap();
        return popedData;
    }

    public Object pop() {
        return popItem(this.length - 1);
    }

    public Object pop(int index) {
        return popItem(index);
    }

    public Object get(int index) {
        return getIndexMap().get(index).getData();
    }
}