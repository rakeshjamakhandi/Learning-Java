package studyopedia;
public class Demo {

public static void main(String[] args) {
	int i=1;
	rajini: while(i<=5) {
		int j=1;
		tamanna: while(j<=5){
			System.out.print("Hi");
			j++;
			if(j==2) {
				break tamanna;
			}
			break rajini;
			}
		System.out.println();
		i++;
	}
}}





