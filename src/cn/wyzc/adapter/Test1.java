package cn.wyzc.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test1 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("aa");
		v.add("bb");
		v.add("cc");
		Iterator<String> itor = v.iterator();
		while(itor.hasNext()){
			System.out.println(itor.next());
		}
		System.out.println("================");
		Enumeration<String> elements = v.elements();
		while(elements.hasMoreElements()){
			System.out.println(elements.nextElement());
		}
	}

}
