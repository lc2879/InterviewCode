//An array is of size N with integers between 0 and 1024(repetitions allowed). 
//Another array of integers is of size M with no constraints on the numbers. 
//Find which elements of first array are present in the second array. 
//(If you are using extra memory, think of minimizing that still, using bitwise operators)
public static void findNum(int []a, int [] b, int n, int m){

	if(a==null || b == null || n==0|| m == 0)return ;
	final int size= (1025+7)/8;
	char [] tmp = new char [size];
	for(int i=0;i<n;i++){
		int index = a[i] / 8;
		int bit =a[i]% 8;
		tmp[index] |= 1<<bit;
		}


