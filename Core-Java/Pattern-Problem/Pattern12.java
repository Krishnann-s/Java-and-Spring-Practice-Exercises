public class Pattern12 {

	public static void main(String[] args) {
	
		int num = 7;
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}