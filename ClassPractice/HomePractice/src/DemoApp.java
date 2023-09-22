
public class DemoApp {

	public static void main(String[] args) {
		Demo d=new Demo();
		Demo d1=new Demo();

		d.no_of_wing=3;
		d.color="white";
		d.brand="Toshibha";
		d1.color="black";
		
		d.fanCanRotate();
		d1.fanBlowsAir();
		d.fanCanRotate();
	    System.out.println(d.no_of_wing+" wings of "+d.color+ " "+d.brand+" fan");
	}

}
