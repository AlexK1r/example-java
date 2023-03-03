package DZ6;

/*
Учитывая {порядок следования} двоичного дерева, верните порядок обхода значений его узлов.
Пример:
Input: root = [1,null,2,3]
Output: [1,2,3]
*/

import java.util.ArrayList;
import java.util.Stack;
    
public class prog6 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(null), new TreeNode(2, new TreeNode(), new TreeNode(3)));
        System.out.println(TreeNode.preorderTraversal(root));        
        }
    }
    
class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {
    }    
    TreeNode(Integer val) {
        this.val = val;
    }    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    public static ArrayList<Integer> preorderTraversal(TreeNode root) {    
        ArrayList<Integer> res = new ArrayList<>();    
        if (root == null) return res;    
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);    
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.val != null) res.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return res;
    }
}