package com.coding.kotas;

import com.coding.kota.Kota;
import com.coding.kota.Kyu;

public class Example extends Kota{

	@Override
	public String identification() {
		// TODO Auto-generated method stub
		return "5547cc7dcad755e480000004";
	}

	@Override
	public Kyu kyu() {
		// TODO Auto-generated method stub
		return Kyu.FIVE;
	}

	@Override
	public int duration() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean successful() {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		
	}
	
}
