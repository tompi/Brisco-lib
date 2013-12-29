package com.brisco.Game;

import java.io.Serializable;

public class Card implements Serializable {
	private static final long serialVersionUID = -8292826584423577656L;
	public Suit Suit;
	public Denomination Denomination;

	public Card(Suit suit, Denomination denomination) {
		Suit = suit;
		Denomination = denomination;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Card)) {
			return false;
		}
		Card other = (Card) o;
		if (other.Suit == Suit && other.Denomination == Denomination) {
			return true;
		} else {
			return false;
		}
	}
}
