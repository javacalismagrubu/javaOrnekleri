
package odev1;

public class Odev1LinkedList<T extends Comparable<T>> extends AbstractLinkedList<T> {
    @Override
    public void insertInOrder(T value) {
        Node<T> node = getHead();
        boolean flag = false;
        if(node == null){
            addFirst(value);
            flag = true;
        }
        else if(value.compareTo(node.value) < 0 )
            addFirst(value);
        else{
            while(node.next != null){
                if(value.compareTo(node.next.value) < 0){
                    Node<T> temp = new Node<>(value , node.next); 
                    node.next = temp;
                    flag = true;
                    break;
                }
                
                node = node.next;
                
            }
            
            if(!flag){
                addLast(value);
            }
        }
        
    }

    @Override
    public AbstractLinkedList<T> reverse() {
        Node<T> node = getHead();
        Odev1LinkedList<T> temp = new Odev1LinkedList<>();
        if(node == null)
            return null;
        
        while(node != null){
            temp.addFirst(node.value);
            node = node.next;
        }
        
        return (AbstractLinkedList < T >)temp;
        
    }

    @Override
    public AbstractLinkedList<T> concatenate(AbstractLinkedList<T> list) {
        Node<T> node = getHead();
        Odev1LinkedList<T> temp = new Odev1LinkedList<>();
        if(node == null)
            return null;
        
        while(node.next != null){
            temp.addLast(node.value);
            node = node.next;
        }
        temp.addLast(node.value);
        
        Node<T> tempList = list.head;
        while(tempList.next != null){
            temp.addLast(tempList.value);
            tempList = tempList.next;
        }
        temp.addLast(tempList.value);
        
        return (AbstractLinkedList<T>)temp;
    }
    
}
