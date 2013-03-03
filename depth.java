public static int depth(Node root,int d){
	if(root == null) return d-1;
	else return Math.MAX(depth(root.left, d+1),depth(root.right,d+1);
}

//easily modified to return the min depth.

