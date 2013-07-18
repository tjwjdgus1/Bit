package org.wooyakko;

import java.nio.channels.SocketChannel;

import javax.xml.soap.Node;

public class GamePlayer
{
	// 변수 선언 
	UserInfo userInfo;
	Room room;
	Card useCard;
	CardDeck cardDeck;
	SocketChannel sc;
	Node curPosition;
	Dice dice;
	FlagInfo flagInfo;
	enum STATE { None, ClientEntering, ClientEntered, LobbyEntering, LobbyEntered,LobbyLeave,
				WaitRoomEntering, WaitRoomEntered, WaitRoomLeave, GameStarting, InGame, GameEnding }
	boolean isReady;
	boolean isLoadCompleted;
	boolean isMapsetCompleted;
	boolean finishedMovement;
	boolean finishedBScene;
	boolean isSelectFirst;
	boolean isMyTurn;
	boolean isAIMode;
	STATE pState;
	
	// Method	
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public Room getRoom() {
		return room;
	}
	public Card getUseCard() {
		return useCard;
	}
	public CardDeck getCardDeck() {
		return cardDeck;
	}
	public SocketChannel getSc() {
		return sc;
	}
	public Node getCurPosition() {
		return curPosition;
	}
	public Dice getDice() {
		return dice;
	}
	public FlagInfo getFlagInfo() {
		return flagInfo;
	}
	public boolean isReady() {
		return isReady;
	}
	public boolean isLoadCompleted() {
		return isLoadCompleted;
	}
	public boolean isMapsetCompleted() {
		return isMapsetCompleted;
	}
	public boolean isFinishedMovement() {
		return finishedMovement;
	}
	public boolean isFinishedBScene() {
		return finishedBScene;
	}
	public boolean isSelectFirst() {
		return isSelectFirst;
	}
	public boolean isMyTurn() {
		return isMyTurn;
	}
	public boolean isAIMode() {
		return isAIMode;
	}
	public STATE getpState() {
		return pState;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public void setRomm(Room room) {
		this.room = room;
	}
	public void setUseCard(Card useCard) {
		this.useCard = useCard;
	}
	public void setCardDeck(CardDeck cardDeck) {
		this.cardDeck = cardDeck;
	}
	public void setSc(SocketChannel sc) {
		this.sc = sc;
	}
	public void setCurPosition(Node curPosition) {
		this.curPosition = curPosition;
	}
	public void setDice(Dice dice) {
		this.dice = dice;
	}
	public void setFlagInfo(FlagInfo flagInfo) {
		this.flagInfo = flagInfo;
	}
	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}
	public void setLoadCompleted(boolean isLoadCompleted) {
		this.isLoadCompleted = isLoadCompleted;
	}
	public void setMapsetCompleted(boolean isMapsetCompleted) {
		this.isMapsetCompleted = isMapsetCompleted;
	}
	public void setFinishedMovement(boolean finishedMovement) {
		this.finishedMovement = finishedMovement;
	}
	public void setFinishedBScene(boolean finishedBScene) {
		this.finishedBScene = finishedBScene;
	}
	public void setSelectFirst(boolean isSelectFirst) {
		this.isSelectFirst = isSelectFirst;
	}
	public void setMyTurn(boolean isMyTurn) {
		this.isMyTurn = isMyTurn;
	}
	public void setAIMode(boolean isAIMode) {
		this.isAIMode = isAIMode;
	}
	public void setpState(STATE pState) {
		this.pState = pState;
	}

	// 변수 초기화,  UserInfo 생성
	public void initPlayer(String id)
	{
		room =  null;
		useCard = null;
		cardDeck = null;
		sc = null;	// 소켓채널도 초기화??
		curPosition = null;	// Node 를 어떻게 초기화/...?? 
		dice = null;
		flagInfo = null;
		
		isReady = false;
		isLoadCompleted = false;
		isMapsetCompleted = false;
		finishedMovement = false;
		finishedBScene = false;
		isSelectFirst = false;
		isMyTurn = false;
		isAIMode = false;
		pState = STATE.None;
		
		// UserInfo 생성 
		userInfo  = null;
	 }	
}
