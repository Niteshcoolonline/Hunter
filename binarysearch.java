class binarysearch{
	public static void main(String[] args){
		int[] a={10,20,30,40,50};
		int r=a.length-1;
		int l=0;
		int num=50;
		while(l<=r){
			int mid=l+(r-l)/2;
			if(a[mid]==num){
				System.out.println(mid);
				break;
			}
			if(a[mid]>num){
				r=mid-1;
			}
			else{
				l=mid+1;
			}
		}
	}
}