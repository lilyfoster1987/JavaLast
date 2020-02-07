
import java.util.ArrayList;
import java.util.List;

public class Certification {

	public static void main(String[] args) {
		base b1=new ex();
		base b2=new drived();
		base b3=new ex();
		//b1=(base) b3;
		//base b4=(drived) b3;
		b1.test();
		b2.test();
		List color=new ArrayList();
		color.add("gree");
		color.add("re");
		color.add("bl");
		color.add("yee");
		color.remove(2);
		color.add(3,"cyan");
		System.out.println(color);
		

	}

}
class base{
	public void test() {
		System.out.println("base");
	}
}
class drived extends base{
	public void test() {
		System.out.println("drived");
	}
}
class ex extends drived{
	public void test() {
		System.out.println("ex");
		
	}
}