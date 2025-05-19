package c14;

public class TwoParamNoReturn {
	public static void main(String[] args) {
		Calculate c;
		c=(x,y)->System.out.println(x+y);
		c.cal(10, 5);
		c=(a,b)->System.out.println(a-b);
		c.cal(10, 5);
	}

}
