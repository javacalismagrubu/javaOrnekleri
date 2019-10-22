package deneme;
public class Test{
public static void main(String[] args) {
    LabBinarySearchTree deneme =  new LabBinarySearchTree();

    deneme.add(10);
    deneme.add(20);
    deneme.add(30);
    deneme.add(9);
    deneme.add(7);
    deneme.add(8);

    BTNode<Integer> node  = new BTNode<>(30, null, null);
    deneme.findParent(node);

    System.out.println(deneme.findParent(node).value);
    BTNode<Integer> node2 = new BTNode<Integer>(7, null, null);
    System.out.println(deneme.findParent(node2).value);

    System.out.println(deneme.findParent(new BTNode<Integer>(8,null, null)).value);

}
}