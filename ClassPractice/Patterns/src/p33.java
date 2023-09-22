
public class p33 {
	static void Stars() {
		for(int i=0;i<=10;i++) {
			int n=11;
			for(int j=0;j<=n;j++) {
				//System.out.print();
				if(i==0 || i==n/2 || j==0) {
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
