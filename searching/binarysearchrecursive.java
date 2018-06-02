class binarysearchrecursive{
	public static void main(String[] args){
		int[] a={10,20,30,40,50};
		int num=30;
		int l=a.length;
		binary b=new binary();
		int result=b.searchit(a,0,l-1,num);
		
		System.out.println(result);
	}
}
class binary{
	int searchit(int[] a, int l, int r, int num){
		if(r>1){
			int mid=1+(r-1)/2;
		
			if(a[mid]==num){
				return mid;
			}
			if(a[mid]>num){
				return searchit(a,l,mid-1,num);
			}
			else{
				return searchit(a,mid+1,r, num);
			}
		}
		return -1;
	}
}