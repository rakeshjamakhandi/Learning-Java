
public class p24 {
	static void Stars() {
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10;j++) {
				//System.out.print();
				if(i==10 || j==10) {
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
	