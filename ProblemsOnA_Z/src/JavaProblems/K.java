package JavaProblems;

public class K {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for (int j=0;j<=n;j++) {
				if (j==n/2 || (i<=n/2&&j==n-i)|| (i>=n/2&& j==i)){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
