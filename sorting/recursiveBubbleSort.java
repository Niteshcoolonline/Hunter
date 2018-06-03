class recursiveBubbleSort{
	public static void main(String[] args){
		int[] a={5,6,4,7,3,2};
		int n=a.length;
		recursiveBubbleSort rbs=new recursiveBubbleSort();
		rbs.bubblesort(a,n);
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
	void bubblesort(int[] a, int n){
		if(n==1){
			return;
		}
		else{
			for(int i=0;i<n-1;i++){
				if(a[i]>a[i+1]){
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			bubblesort(a,n-1);
		}
	}
}