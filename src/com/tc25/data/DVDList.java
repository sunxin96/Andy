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
		dvdList.add(new DVD(idCreate(),"Ƥ����",0,null,1));
		dvdList.add(new DVD(idCreate(),"������",0,null,1));
		dvdList.add(new DVD(idCreate(),"��Ӱ",0,null,1));
		dvdList.add(new DVD(idCreate(),"���뱦��",0,null,1));
		dvdList.add(new DVD(idCreate(),"�ǹ���",0,null,1));
		dvdList.add(new DVD(idCreate(),"������",0,null,1));
		dvdList.add(new DVD(idCreate(),"������",0,null,1));
		dvdList.add(new DVD(idCreate(),"����Ůսʿ",0,null,1));
		dvdList.add(new DVD(idCreate(),"���������",0,null,1));
		dvdList.add(new DVD(idCreate(),"�������",0,null,1));
		
	}
}
