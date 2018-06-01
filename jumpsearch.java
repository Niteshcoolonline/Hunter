class jumpsearch{
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8,9,10,12,15,16,20,25,26};
		int num=12;
		int r=a.length;
		int prev=0;
		int steps=(int)Math.sqrt(r);
		while(a[Math.min(steps,r)-1]<num){
			prev=steps;
			steps+=(int)Math.sqrt(r);
			if(prev>=r){
				return;
			}
		}
		while(a[prev]<num){
			prev++;
			if(prev==Math.min(steps,r)){
				return;
			}
		}
		if(a[prev]==num){
			System.out.println(prev);
		}
		else{
			return;
		}
	}
}