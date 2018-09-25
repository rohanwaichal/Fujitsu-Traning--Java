package NumberOfObjects;

public class Count {
	static int c=0;
	Count(){
		c++;
	}
 void display()
 {
	 System.out.println("The number of Objects created :"+c);
 }
	public static void main(String[] args) {
		Count a = new Count();
		Count b = new Count();
		Count c = new Count();
		a.display();


	}

}
