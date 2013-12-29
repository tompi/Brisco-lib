package com.brisco.Game;

import java.io.Serializable;

public class Bid implements Serializable {
	private static final long serialVersionUID = -6542266358158427983L;
	public boolean Pass;
	public int Level;
	public Suit Suit;
	public boolean Double;
	public boolean ReDouble;
	public int Explanation;
	public boolean Conventional;
	public BidQuality Quality;
	public boolean YourTurn;
}
