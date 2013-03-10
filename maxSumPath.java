

public static wrapper{
	int max=0;
}

/*how to reconstruct the solution?*/
public static void  maxSumPath( Node root,int sum,wrapper max ){


    if(root.left==null&&root.right=null&&sum>max.max){ max.max= sum;return;}
    if(root.left!=null) maxSumPath(root.left,root.value+sum);
   if(root.right!=null)   maxSumPath(root.right,root.value+sum);
   return;
}
