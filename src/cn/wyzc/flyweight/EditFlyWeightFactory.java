package cn.wyzc.flyweight;

import java.util.HashMap;

public class EditFlyWeightFactory {
	private HashMap<Character, Edit> hm = new HashMap<Character, Edit>();
	public Edit getIntance(Character c){
		Edit edit = hm.get(c);
		if(edit==null){
			edit = new Edit(c);
			hm.put(c, edit);
		}
		return edit;
	}
}
