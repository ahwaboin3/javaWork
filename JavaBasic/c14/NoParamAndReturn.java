package c14;

import java.util.Random;

public class NoParamAndReturn {
	public static void main(String[] args) {
		Generator gen;
		gen=()->{
			Random rand=new Random();
			return rand.nextInt(50);
		};
		System.out.println(gen.rand());
		Random rand=new Random();
		gen=()->{return rand.nextInt(45);};
		gen=()->rand.nextInt(45);
	}

}
