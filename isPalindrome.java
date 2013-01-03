public  class isPalindrome{

public static class LinkedNode{

public int data;
public LinkedNode next;

}
	  public static Boolean isPdrome(LinkedNode head,int len){

    	  if(head==null||head.next==null||len==1||len==2&&head.data==head.next.data)
               return true;
    	   LinkedNode runner=head;
    	  int length=len;
    	  while(length-1>0){
    	     length--;
    	     runner=runner.next;
    	  }
            if(runner.data==head.data)
    	    return isPdrome(head.next,len-2);
              else return false;

    	  }

/*differnt approach , reverse the linked list and then compare the origin one with the reversed one ,space complexity */
   public static LinkedNode reverseList(LinkedNode head){

    	  if(head.next==null||head==null)
    	   return head;
    	  if(head.next.next==null)
    	  {
    	  head.next.next=head;
    	  LinkedNode newHead=head.next;
    	  head.next=null;
    	  return newHead;
    	  }
    	  LinkedNode cur=head;
    	  LinkedNode pur=head.next;
    	  LinkedNode eur=head.next.next;
    	  pur.next=cur;
    	  cur.next=null;
    	  while(eur!=null){
    	  cur=pur;
    	  pur=eur;
    	  eur=eur.next;
    	  pur.next=cur;
    	  }
    	  return pur;
    	  }


/*recursive approach to reverse a list*/
    public static LinkedNode revList(LinkedNode head){
		if(head==null||head.next==null) return head;
                LinkedNode cur=revList(head.next);
                head.next.next=head;
                head.next=null;
               return cur;   
}



	
		


/*using stack based iterative approach*/
/*suppose we don't know the size of the linkedlist*/
   public static Boolean  isp(LinkedNode head){

LinkedNode slow=head;
LinkedNode fast=head;
Stack<Integer> fstHalf = new Stack<Integer>();
while(fast!=null&&fast.next!=null){
fstHalf.push(slow.data);
slow=slow.next;
fast=fast.next.next;
}
/*skip middle elements if the length is odd*/
if(fast!=null)
   slow=slow.next;

while(slow!=null){

if(fstHalf.pop()!=slow.data)
   return false;
slow=slow.next;
}
return true;

}

public static void main(String [] args){

LinkedNode head = new LinkedNode();
LinkedNode a1= new LinkedNode();
LinkedNode a2= new LinkedNode();
LinkedNode a3= new LinkedNode();
LinkedNode a4= new LinkedNode();
LinkedNode a5= new LinkedNode();
LinkedNode a6= new LinkedNode();
head.data = 1;
head.next = a1;
a1.data=2;
a1.next=a2;
a2.data=3;
a2.next=a3;
a3.data=4;
a3.next=a4;
a4.data=3;
a4.next=a5;
a5.data=2;
a5.next=a6;
a6.data=1;
a6.next=null;
LinkedNode runner= head;
int len =0;
while(runner!=null){
   len++;
   runner=runner.next;
}
System.out.println("the linked list is palindrome: "+isPdrome(head,len));

}


}
