class towerofhanoi{
	
	static void toh(int n, char source, char inter, char destination){
		
		if(n==1){
			System.out.println("Disk from "+source +"to "+destination);
			return;
		}
		//moving from n-1 from source to intermediate using destination as auxiliary
		toh(n-1, source, destination, inter);
		
		//moving the nth disk from source to destination
		System.out.println("Move disk"+n+"from"+source+"to"+destination);

		toh(n-1,inter,source,destination);
	}
	
	public static void main(String[] args){
		int n =5;
		toh(n,'A','B','C');
	}
}