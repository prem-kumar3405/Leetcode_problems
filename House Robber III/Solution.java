       this.right = right;
 *     }
 * }
 */
class Solution {
    public int rob(TreeNode root) {
        return dfs(root,true);
    }
    public int dfs(TreeNode root,Boolean flag){
        if(root==null) return 0;

        int sum=0;
        if(flag){
          sum+=Math.max((root.val+dfs(root.right,!flag)+
              dfs(root.left,!flag)),(dfs(root.right,flag)+dfs(root.left,flag)));
        }
        else
        {
            return dfs(root.left,!flag)+
            dfs(root.right,!flag);
        }
        return sum;
    }
}