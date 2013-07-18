package org.wooyakko;

import java.util.Random;

public class Dice
{
	// 변수 선언 
	int diceCnt;
	int diceShape = 6;
	int[] diceResult;	
	
	Random rnd = new Random();
	
	public Dice()
	{
	}
	
	// Method 
	public int[] rollDice(int diceCnt)
	{
		diceResult = new int[diceCnt];
		for (int i=0; i<diceCnt; i++)
		{
			diceResult[i] = 0;		
		}
		
		for (int i=0; i<diceCnt; i++)
		{
			diceResult[i] =rnd.nextInt(6)+1;	
		}

		for (int i=0; i<diceCnt; i++)
		{
			System.out.print(diceResult[i] + " ");			
		}
	
		return diceResult;
	}
}
