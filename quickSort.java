/*three way quicksort that takes into account duplicate variables*/
public static void quickSort(int [] a, int low,int high){
    if(a==null||low>=high) return;
    int i=low;
    int lt=low;
    int gt=high;
    while(i<=gt){
	if(a[i]<a[lt]){
	    exch(a,lt,i);
 	    lt++;
 	    i++;
	}
	else if(a[i]>a[lt]){
	    exch(a,i,gt);
	     gt--;
	}
	else {i++;}
	
    }
    quickSort(a,low,lt-1);
    quickSort(a,gt+1,high);
}
