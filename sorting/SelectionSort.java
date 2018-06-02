class SelectionSort{
	public static void main(String[] args){
		int[] a={5,4,2,1,3};
		int n=a.length;
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(a[min]>a[j]){
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}