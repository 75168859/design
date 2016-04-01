package cn.wyzc.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumApdater implements Enumeration{
	private Iterator itor;
	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return itor.hasNext();
	}

	@Override
	public Object nextElement() {
		// TODO Auto-generated method stub
		return itor.next();
	}




}
