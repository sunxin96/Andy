package com.tc25.data;

import java.util.ArrayList;
import java.util.HashMap;

import com.tc25.bean.User;

public class UserList {

	private static UserList instance;
	private  ArrayList<User> userList = new ArrayList<>();
	private  HashMap<String,String> accMap = new HashMap<>();
	private  ArrayList<Integer> idList = new ArrayList<>();
	
	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	public ArrayList<Integer> getIdList() {
		return idList;
	}

	public void setIdList(ArrayList<Integer> idList) {
		this.idList = idList;
	}

	
	
	
	private UserList() {
		init();
	}
	
	public static UserList getInstance() {
		if(instance == null) {
			instance = new UserList();
		}
		return instance;
	}
	
	public int idCreate() {
		idList.add(idList.size()+1);
		return idList.size();
		
	}
	

	
	public void init() {
		userList.add(new User(idCreate(),"ÃÖÁ¼","AAAAAA","123456","ÃÜÂë",true));
		userList.add(new User(idCreate(),"Ğ¡ÄÏ","BBBBBB","123456","ÃÜÂë",true));
		userList.add(new User(idCreate(),"´øÍÁ","CCCCCC","123456","ÃÜÂë",true));
		userList.add(new User(idCreate(),"¹íöŞ","DDDDDD","123456","ÃÜÂë",true));
		userList.add(new User(idCreate(),"µÏ´ïÀ­","EEEEEE","123456","ÃÜÂë",true));
		userList.add(new User(idCreate(),"Ğ«","FFFFFF","123456","ÃÜÂë",true));
		userList.add(new User(idCreate(),"½Ç¶¼","GGGGGG","123456","ÃÜÂë",true));
		userList.add(new User(idCreate(),"³¤ÃÅ","HHHHHH","123456","ÃÜÂë",true));
		userList.add(new User(idCreate(),"¾ø","IIIIII","123456","ÃÜÂë",true));
		userList.add(new User(idCreate(),"÷ø","JJJJJJ","123456","ÃÜÂë",true));
		accMap.put("AAAAAA","123456");
		accMap.put("BBBBBB","123456");
		accMap.put("CCCCCC","123456");
		accMap.put("DDDDDD","123456");
		accMap.put("EEEEEE","123456");
		accMap.put("FFFFFF","123456");
		accMap.put("GGGGGG","123456");
		accMap.put("HHHHHH","123456");
		accMap.put("IIIIII","123456");
		accMap.put("JJJJJJ","123456");
		
	}

	public HashMap<String,String> getAccMap() {
		return accMap;
	}

	public void addToAccMap(String userAcc,String userPwd) {
		accMap.put(userAcc,userPwd);
	}
	
}
