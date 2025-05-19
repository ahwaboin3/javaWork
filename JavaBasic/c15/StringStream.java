package c15;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StringStream {
	public static void main(String[] args) {
		//스트림 생성하기:배열
		String[] names= {"Yoon","Lee","Park"};
		//Arrays 클래스에 Stream<T> steam(T[] array)
		Stream<String> stm=Arrays.stream(names);
		stm.forEach(s->System.out.println(s));
		StringStream[] ss=new StringStream[10];
		Stream<StringStream> ssstm=Arrays.stream(ss);
		
		//Int 타입 배열 -> IntStream stream(int[] array)
		//DoubleStream
		double[] ds= {1.1,2.2,3.3};
		DoubleStream dstm=Arrays.stream(ds);
	}

}
