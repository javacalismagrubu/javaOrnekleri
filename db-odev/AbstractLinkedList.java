public abstract class AbstractLinkedList<T> {
    public class Node<T> {
        public T value;
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
    Node<T> head;

    public Node<T> getHead() {
        return head;
    }
    public void addFirst(T value) {
        head = new Node<>(value, head);
    }
    public void addLast(T value){
        if(head==null)
            head = new Node<>(value, null);
        else {
            Node<T> node = head;
            while (node.next!=null)
                node = node.next;
            node.next = new Node<>(value, null);
        }

    }
    public void print(){
        System.out.println(toString());
    }
    @Override
    public String toString(){
        if(head==null) return "boş";
        String r="";
        Node<T> node=head;
        while(node!=null) {
            r += node.value + (node.next!=null?" ":"");
            node=node.next;
        }
        return r;
    }

    public abstract void insertInOrder(T value);
    public abstract AbstractLinkedList<T> reverse();
    public abstract AbstractLinkedList<T> concatenate(AbstractLinkedList<T> list);
}
