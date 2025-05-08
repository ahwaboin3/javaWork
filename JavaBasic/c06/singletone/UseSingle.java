package c06.singletone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseSingle {
	public static void main(String[] args) {
//		Singleton st1=new Singleton();
//		Singleton st2=new Singleton();
//		Singleton st3=new Singleton();
		Singleton st1=Singleton.getInstance();
		Singleton st2=Singleton.getInstance();
		System.out.println(st1);
		System.out.println(st2);
		
		List<String> list=new ArrayList();
		Iterator<String> itr=list.iterator();
	}

}






