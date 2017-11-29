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
		dvdList.add(new DVD(idCreate(),"һ������",0,null,1));
		dvdList.add(new DVD(idCreate(),"�ɵ�����",0,null,1));
		dvdList.add(new DVD(idCreate(),"��������",0,null,1));
		dvdList.add(new DVD(idCreate(),"���Ʋ��",0,null,1));
		dvdList.add(new DVD(idCreate(),"�ɽ�����",0,null,1));
		dvdList.add(new DVD(idCreate(),"�ǳ���",0,null,1));
		dvdList.add(new DVD(idCreate(),"����",0,null,1));
		dvdList.add(new DVD(idCreate(),"Ӷ������",0,null,1));
		dvdList.add(new DVD(idCreate(),"Fate/Zero",0,null,1));
		dvdList.add(new DVD(idCreate(),"��ҩ֮��",0,null,1));
		
	}
}
