package org.wooyakko;

import java.util.HashMap;
import java.util.Iterator;

public class PlayerManager
{

	// ���� ���� 
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
		Iterator<String> it = userTable.keySet().iterator();	// HashMap�� ��� key ���� Iterator object�� ��´�

		// ������ �̹� ���� ������ �˻�
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
		
		// ������ �� á���� �˻� 
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
		// ������ �޽����� ������ ���� Ȯ���ߴ���, �˾ƺ��� ���� 
		boolean doUsersConfirmServerMsg = false;
		
		// ���� ���� ���� ����� �������� �޽��� ����
				
		return doUsersConfirmServerMsg;
	}
	
	
	
}
