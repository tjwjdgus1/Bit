package org.wooyakko;

import java.util.HashMap;
import java.util.Iterator;

public class PlayerManager
{

	// 변수 선언 
	HashMap<String, GamePlayer> userTable;
	final private int MAX_USER_NUM = 400;
	private int curUserNum = 0;
	
	// constructor
	public PlayerManager(HashMap<String, GamePlayer> userTable, int curUserNum)
	{
		super();
		this.userTable = userTable;
		this.curUserNum = curUserNum;
		
		userTable = new HashMap<String, GamePlayer>();	
	}
	
/*	public PlayerManager()
	{
		super();
		PlayerManager(HashMap<id, > userTable, curUserNum);
	}
*/	
	
	
	// getter & setter
	public HashMap<String, GamePlayer> getMap() {
		return userTable;
	}
	public int getMaxUserNum() {
		return MAX_USER_NUM;
	}
	public int getCurUserNum() {
		return curUserNum;
	}
	public void setMap(HashMap<String, GamePlayer> userTable) {
		this.userTable = userTable;
	}
	public void setCurUserNum(int curUserNum) {
		this.curUserNum = curUserNum;
	}
	
	// Method	
	public boolean isAreadyLogined(String id)
	{
		boolean isUserLogged = false;
		Iterator<String> it = userTable.keySet().iterator();	// HashMap의 모든 key 값을 Iterator object에 담는다

		// 유저가 이미 접속 중인지 검사
		while(it.hasNext())
		{
			String key = (String)it.next();
			if (key.equals(id))
			{	
				isUserLogged = true;
				System.out.println(id);
			}	
			else
				System.out.println("no matching");
		}
			
		return isUserLogged;		
	}
	
	public boolean isServerFull()
	{
		boolean isServerFull = false;
		
		// 서버가 꽉 찼는지 검사 
		if(curUserNum == MAX_USER_NUM)
		{	
			isServerFull = true;
			System.out.println("Server is FULL!!");
		}
		else
			System.out.println("Server is not full.");
		
		
		return isServerFull;
	}
	
	public boolean writeAll()
	{
		// 서버의 메시지를 유저가 전부 확인했는지, 알아보는 변수 
		boolean doUsersConfirmServerMsg = false;
		
		// 서버 접속 중인 사용자 전원에게 메시지 전송
				
		return doUsersConfirmServerMsg;
	}
	
	
	
}
