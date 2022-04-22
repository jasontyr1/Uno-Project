package application;
/*
Card class – this will represent a single card (I don’t think this has to be abstract but idk)
We can include the number or symbols in which the card is(numbers for numbers and 	possibly characters to signify +4 and reverse, etc. Or even use some enums. (REVERSE, PLUS_FOUR)) we will also need to store a color in the card
methods:
createCard()-create a card with a random number/modifier, and a color
maybe methods to take care of modifier cards(plusFourPlay(), reversePlay())
OR a single method to handle all plays either in this class or another: 				cardPlay(Card playedCard, Card cardOnTopOfDiscardStack)
This can return something if the play the player is trying to make is invalid

*/
public final class Card {

	private int cardNum;//int representing the card's value, non-face cards have a value of -1
	private String cardColor; //color is a string instead of Color object as it's simpler when we only have 4 colors to deal with
	public enum Type{FACE, SKIP, REVERSE,WILD, DRAW2,DRAW4};//enumeration for skips, reverses, and draw cards
	private Type cardType;
	public Card(int number, String color)
	{
		setNum(number);
		setColor(color);
		switch(number){
		case 10:
			this.setType(Type.SKIP);
			break;
		case 11:
			this.setType(Type.REVERSE);
			break;
		case 12:
			this.setType(Type.DRAW2);
			break;
		case 13:
			this.setType(Type.WILD);
			break;
		case 14:
			this.setType(Type.DRAW4);
			break;
		default:
			this.setType(Type.FACE);
		}
	}
	public void setNum(int number)
	{
		this.cardNum = number;
	}
	public int getNum()
	{
		return this.cardNum;
	}
	public void setColor(String color)
	{
		this.cardColor = color.toLowerCase(); //convert to lower case to keep consistent for later comparisons
	}
	public String getColor()
	{
		return this.cardColor;
	}
	public void setType(Type cardType)
	{
		this.cardType = cardType;
	}
	public Type getType()
	{
		return this.cardType;
	}
	public String toString()
	{
		if(this.getType()==Type.FACE)
			return "["+this.getType()+" "+this.getColor()+" "+this.getNum()+"]";
		return "["+this.getType()+" "+this.getColor()+"]";//returns "[Type Color Num]"
	}
}