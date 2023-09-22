
public class New {

	public static int main(int no){
		int count=0;
		while(no!=0) {
			no=no/10;
			count++;
		}
		System.out.println(count);
		return count;
	}
}
