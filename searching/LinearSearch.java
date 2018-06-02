class LinearSearch{
	public static void main(String[] args){
		int num=10;
		int[] a={10,20,30,40,50};
		for(int i=0;i<a.length;i++){
			if(a[i]==num){
				System.out.println(i);
				break;
			}
		}
	}
}