public class Pattern8 {

	public static void main(String[] args) {
		int n = 7;
		
		for(int i = n; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}