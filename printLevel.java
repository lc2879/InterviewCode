public static void printLevel( Node root){
    if(root==null) return ;
    Queue<Node> lst = new LinkedList<Node>();
    lst.add(root);
    int nCur =1 ;
    int nNext =0;
    while(!lst.isEmpty()){
	Node tmp = lst.remove();
	nCur--;
	if(tmp.left!=null){
	    lst.add(tmp.left);
	    nNext++;
	}
	if(tmp.right!=null){
	    lst.add(tmp.right);
	    nNext++;
	}
	System.out.print(tmp.value);
	if(nCur==0){
	    System.out.println();
	    nCur=nNext;
	    nNext=0;
	}

    }
       
}
