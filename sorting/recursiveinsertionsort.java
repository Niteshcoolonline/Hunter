class recursiveinsertionsort{
	public static void main(String[] args){
		int[] a={5,6,4,7,3,2};
		int n=a.length;
		recursiveinsertionsort ris=new recursiveinsertionsort();
		ris.insertion(a,n);
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
	void insertion(int[] a,int n){
		if(n<=1){
			return;
		}
		else{
			insertion(a,n-1);
			int j=n-2;
			int key=a[n-1];
			while(j>=0&&a[j]>key){
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
	}
}