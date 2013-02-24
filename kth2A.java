public int kth(int []a , int []b, int k){
 
if(!(k>0)||a==null||b==null||a.length+b.length<k) return -1;

int i=0;
int j=0;
int step=0;
while(i<a.length&&j<b.length){
	if(a[i]>b[j]){ 
		j++;
		step++;
		if(step==k) return b[j];
	}
	else{
        	i++;
        	step++;
        	if(step==k) return a[i];
	}
}

if(i==a.length){
while(j<b.length){	j++;
	step++;
	 if(step==k) return b[j];
}
}
if(j==b.length){
while(i<a.length){  

       i++;
        step++;
	 if(step==k) return a[i];
}
}
}






