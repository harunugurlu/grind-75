import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
}

public class LCABinarySearchTree {
    private List<TreeNode> search(TreeNode root, TreeNode p, List<TreeNode> path) {
        if(root == null) return null;

        if(root.val == p.val) {
            path.add(root);
            return path;
        }

        if(p.val < root.val) {
            path.add(root);
            search(root.left, p, path);
        }
        else if(p.val > root.val) {
            path.add(root);
            search(root.right, p, path);
        }
        return path;
    }

    private TreeNode lcaInPath(List<TreeNode> pathP, List<TreeNode> pathQ) {
        int pSize = pathP.size();
        int qSize = pathQ.size();
        int max = 0;

        for(int i = pSize-1; i >= 0; i--) {
            TreeNode currP = pathP.get(i);
            for(int j = qSize-1; j >= 0; j--) {
                TreeNode currQ = pathQ.get(j);
                if(currP.val == currQ.val) {
                    return currP;
                }
            }
        }

        return null;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();

        pathP = search(root, p, pathP);
        pathQ = search(root, q, pathQ);

        return lcaInPath(pathP, pathQ);
    }
}