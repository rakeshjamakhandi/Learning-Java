package JavaProblems;

public class X {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i<=n&&j==i|| i<=n&&j==n-i) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
