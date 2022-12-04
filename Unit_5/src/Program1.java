class Program1 {
	
	public static int sumFivesRange(int a, int b){
		int n = 0;
        for(int i = a; i <= b; i++){
            if(i % 5 == 0){
                n += i;
            }
        }
        return n;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(sumFivesRange(5,15)); //30
		System.out.println(sumFivesRange(11,28)); //60
	}
}