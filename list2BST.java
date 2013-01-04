

/*recursive and non-recursive*/
/*list already in ascending order*/
/*uses wrapper class to pass parameters*/
public static class wp{
	LinkedNode head;
}

public static Node list2BST(wp head,int len){
if(!(len>0)) return null;
Node left=new Node();
left=(list2BST(head,len/2));
Node root=new Node();
root.left=left;
root.value=head.head.data;
head.head=head.head.next;
root.right=(list2BST(head,len-(len/2)-1));
return root;
}

