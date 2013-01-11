/*recursive version*/
public static int binarySearch(int a [] ,int x, int start, int end){
	if(start > end) return -1;
	int mid = end +(start- end )/2;
	if(a[mid]==x) return mid;
	if(a[mid]<x) return binarySearch(a,x,mid+1,end);
	return binarySearch(a,x,start,mid-1);
}

/*non-recursive version*/
public static int binarySearch(int a [], int x){
	int start=0;int end =a.length-1;int mid;
	while(start<=end){
		mid=end+(start-end)/2;
		if(a[mid]==x) return mid;
		else if(a[mid]<x) start = mid+1;
		else end = mid -1;
	}
	return -1;
}	

