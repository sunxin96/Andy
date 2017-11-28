package com.tc25.data;

import java.util.ArrayList;

import com.tc25.bean.DVD;

public class DVDList {

	private ArrayList<DVD> dvdList = new ArrayList<>();
	private ArrayList<Integer> idList = new ArrayList<>();
	
	public int idCreate() {
		idList.add(idList.size()+1);
		return idList.size();
	}
	
	public void init() {
		dvdList.add(new DVD(idCreate(),"皮卡丘",0,null,1));
		dvdList.add(new DVD(idCreate(),"奥特曼",0,null,1));
		dvdList.add(new DVD(idCreate(),"火影",0,null,1));
		dvdList.add(new DVD(idCreate(),"数码宝贝",0,null,1));
		dvdList.add(new DVD(idCreate(),"亚古兽",0,null,1));
		dvdList.add(new DVD(idCreate(),"鸡儿受",0,null,1));
		dvdList.add(new DVD(idCreate(),"海贼王",0,null,1));
		dvdList.add(new DVD(idCreate(),"美少女战士",0,null,1));
		dvdList.add(new DVD(idCreate(),"月礼服假面",0,null,1));
		dvdList.add(new DVD(idCreate(),"格里格里",0,null,1));
		
	}
}
