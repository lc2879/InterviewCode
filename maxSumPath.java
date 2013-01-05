
/*how to reconstruct the solution?*/
public static int  maxSumPath( Node root ){
    if(root==null) return 0;
    int maxCurrent;
    int leftMax=root.value+maxSumPath(root.left);
    int rightMax=root.value+maxSumPath(root.right);
    maxCurrent = Math.max(leftMax,rightMax);
    root.direction = leftMax>rightMax?0:1;
    return maxCurrent;
}
