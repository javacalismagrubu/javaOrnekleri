
public class Odev1LinkedList<T extends Comparable<T>> extends AbstractLinkedList<T> {

    @Override
    public void insertInOrder(T value) {
        // TODO Auto-generated method stub

    }

    @Override
    public AbstractLinkedList<T> reverse() {
        Odev1LinkedList node = (Odev1LinkedList)getHead();
        Odev1LinkedList temp;
        if(node == null)
            return null;
        
        while(node.next != null){
                temp.addFirst(node.value);
        }
        return null;
    }

    @Override
    public AbstractLinkedList<T> concatenate(AbstractLinkedList<T> list) {
        // TODO Auto-generated method stub
        return null;
    }

}