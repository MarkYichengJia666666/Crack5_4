import java.util.ArrayList;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
/**;
 * Created by jiayicheng on 17/8/27.
 */

 //* Definition for a binary tree node.
 public class random {
     int val;
      random left;
      random right;
      random(int x) { val = x; }
  }

class Solution {
int total=0;
    public int sumNumbers(random root) {

        int sum=0;
        sumNum(root,sum);
        return total;
    }
     void sumNum(random root,int sum)
    {
        if(root==null) return;

        sum=sum*10+root.val;

if(root.left==null&&root.right==null)
{
    total+=sum;
    return;
}
sumNum(root.left,sum);
        sumNum(root.right,sum);

    }
}
