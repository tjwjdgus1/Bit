package org.wooyakko.unitTest;

import org.wooyakko.*;

public class DiceTest
{
	public static void main(String[] args)
	{
		Dice dice = new Dice();
		dice.rollDice(1);
		System.out.println();
		
		dice.rollDice(2);		
		System.out.println();
		
		dice.rollDice(3);
	}
}