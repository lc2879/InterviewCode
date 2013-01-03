public class rmDups{

   public static class LinkedNode{

	    	  public int data;
	    	  public LinkedNode next;

	    	  public LinkedNode()
	    	  {}
	    	  
	    	  }
public static void rmDuplicate(LinkedNode head){
if(head==null)return;
HashSet<Integer> ele = new HashSet<Integer>();
LinkedNode cur=head;
ele.add(cur.data);
while(cur.next!=null){

if(ele.contains(cur.next.data)){
cur.next=cur.next.next;
continue;
}
else{
   ele.add(cur.next.data);
   cur=cur.next;
}
}

}

public static void main (String [] args){


}
















}
