package application;

import java.util.*;

public class Deck {
	private ArrayList<Card> cardList;
	
	public Deck()
	{
		this.cardList = new ArrayList<Card>();
	}
	public void fillDeck() //default fillDeck method, fills the deck with the base 108 cards, essentially the setter
	{
		for(int currColor = 0; currColor < 8; currColor++)
		{
			for(int faceValue = 0; faceValue < 13; faceValue++)
			{
				if(currColor >= 4 && faceValue == 0) //this if statement is used to omit 4 zeros from the final deck
					faceValue++;
				switch(currColor) {
				case 0:
				case 4:
					this.cardList.add(new Card(faceValue,"RED"));
					break;
				case 1:
				case 5:
					this.cardList.add(new Card(faceValue,"YELLOW"));
					break;
				case 2:
				case 6:
					this.cardList.add(new Card(faceValue,"GREEN"));
					break;
				case 3:
				case 7:
					this.cardList.add(new Card(faceValue,"BLUE"));
					break;
				}
			}
		}
		for(int i = 0; i < 8; i++)
		{
			if(i>3)
				this.cardList.add(new Card(13, "BLACK"));
			else
				this.cardList.add(new Card(14,"BLACK"));
		}
	}
	public void fillDeck(ArrayList<Card> deck)//fillDeck overload, fills the deck with the given ArrayList of cards (used when reshuffling the discard pile)
	{
		if(!this.cardList.isEmpty()) //if the deck isn't empty...
		{
			System.out.println("Deck is not empty!"); //...print warning, then return
			return;
		}
		this.cardList = (ArrayList<Card>) deck.clone(); //Unchecked cast shouldn't be a problem as the values of Card Objects shouldn't be changed during gameplay
	}
	public void shuffle()
	{
		Collections.shuffle(this.getDeck()); //shuffle method using Collections.shuffle, more intuitive than just calling Collections.shuffle(Deck.getDeck()) every time
	}
	public ArrayList<Card> getDeck() //cardList getter, not sure if necessary
	{
		return this.cardList;
	}
	public Card drawCard()
	{
		if(this.cardList.isEmpty()) //if cardList is empty, we can't draw a card...
		{
			System.out.println("Deck is empty, cannot draw"); //...so we don't
			return null;
		}
		return this.cardList.remove(0);
	}
	public String toString()
	{
		String ret = "";
		for(int i = 1; i <= this.getDeck().size(); i++)//starts at 1 so the formatting using modulo works at the first index
		{
			ret+=this.cardList.get(i-1);
			if(i%13 == 0)//if i started at 0, the first card printed would be on its own line (don't want that)
				ret+=("\n");
		}
		return ret;
	}
}