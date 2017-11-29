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
		dvdList.add(new DVD(idCreate(),"Ò»ÏÉÄÑÇó",0,null,1));
		dvdList.add(new DVD(idCreate(),"ÏÉµÀÇóË÷",0,null,1));
		dvdList.add(new DVD(idCreate(),"·²ÈËĞŞÏÉ",0,null,1));
		dvdList.add(new DVD(idCreate(),"¶·ÆÆ²Ôñ·",0,null,1));
		dvdList.add(new DVD(idCreate(),"ÏÉ½£ÆæÏÀ",0,null,1));
		dvdList.add(new DVD(idCreate(),"ĞÇ³½±ä",0,null,1));
		dvdList.add(new DVD(idCreate(),"ÅÌÁú",0,null,1));
		dvdList.add(new DVD(idCreate(),"Ó¶±øÌìÏÂ",0,null,1));
		dvdList.add(new DVD(idCreate(),"Fate/Zero",0,null,1));
		dvdList.add(new DVD(idCreate(),"´ºÒ©Ö®Áé",0,null,1));
		
	}
}
