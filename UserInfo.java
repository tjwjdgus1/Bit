package org.wooyakko;

import java.util.ArrayList;

public class UserInfo
{
	//  변수 선언 
	private String userId = "";
	private String email = "";
	private String nickName = "";
	private int gameMoney = 0;
	private int gameCash = 0;
	private Insignia insigniaInfo;
	private ArrayList userOwnCardList = new ArrayList();
	
	// 생성자
	public  UserInfo()
	{	
	}

	// getter & setter 
	public String getUserId() {
		return userId;
	}

	public String getEmail() {
		return email;
	}

	public String getNickName() {
		return nickName;
	}

	public int getGameMoney() {
		return gameMoney;
	}

	public int getGameCash() {
		return gameCash;
	}

	public Insignia getInsigniaInfo() {
		return insigniaInfo;
	}

	public ArrayList getUserOwnCardList() {
		return userOwnCardList;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setGameMoney(int gameMoney) {
		this.gameMoney = gameMoney;
	}

	public void setGameCash(int gameCash) {
		this.gameCash = gameCash;
	}

	public void setInsigniaInfo(Insignia insigniaInfo) {
		this.insigniaInfo = insigniaInfo;
	}

	public void setUserOwnCardList(ArrayList userOwnCardList) {
		this.userOwnCardList = userOwnCardList;
	}
	
	public void refresh()
	{
		//
	}
};