package deneme;
public class LabBinarySearchTree<T extends Comparable<T>> extends BinarySearchTree<T> {
    public LabBinarySearchTree(){
        //Bu metodu değiştirmeyin
    }
    public LabBinarySearchTree(BTNode<T> root) {
        //Bu metodu değiştirmeyin
        super(root);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BTNode<T> root = getRoot();    
        if(root == null)
            return null;
        
       return klon(root);
    }

    public BTNode<T> klon(BTNode<T> node){
                return new BTNode<T>(node.value, node.left!=null?klon(node.left):null, node.right!=null?klon(node.right):null);

    }

    @Override
    public BTNode<T> successor(T value) {
        BTNode<T> root = getRoot();
        BTNode<T> temp;
        if(root == null)
            return null;
        
        root =  root.right;

        while(root != null)
            find(root, value);
        return null;
    }

    @Override
    public BTNode<T> predecessor(T value) {
        return null;
    }

    @Override
    public BTNode<T> findParent(BTNode<T> node) {
        BTNode<T> root = getRoot();

        while(root != null){
            if(root.value.compareTo(node.value) > 0){
                if(root.left.value.compareTo(node.value) == 0)
                    return root;
                root = root.left;}
           else if(root.value.compareTo(node.value) < 0){
                if(root.right.value.compareTo(node.value) == 0){
                    return root;
                }
                                root = root.right;

           }
            

        }
        
     
        return root;
    }


}
