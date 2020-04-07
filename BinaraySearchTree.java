
public class BinaraySearchTree<E extends Comparable<E>> {
    protected TreeNode<E> root;
    protected int size = 0;
    public BinaraySearchTree(){

    }
        public boolean remove(TreeNode<E> treeNode, E e) {
            if (treeNode == null) {
                return false;
            }
            if (e.compareTo(treeNode.element) < 0) {
                return remove(treeNode.left, e);
            } else if (e.compareTo(treeNode.element) > 0) {
                return remove(treeNode.right, e);
            } else {
                if (treeNode.left == null) {
                    treeNode = treeNode.right;
                } else if (treeNode.right == null) {
                    treeNode = treeNode.left;
                } else {
                    TreeNode<E> temp = treeNode.left;
                    while (temp.right != null) {
                        temp = temp.right;
                    }
                    treeNode.element = temp.element;
                    return remove(treeNode.left, temp.element);
                }
            }
            return true;
        }
    }

