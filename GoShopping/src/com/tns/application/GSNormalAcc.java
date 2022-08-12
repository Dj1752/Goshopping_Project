package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		
	}

	public void bookProduct(float book) {
		System.out.println("normal user charges"+ getCharges()+" with delivery charges is"+getDeliveryCharges());
	}
	public String toString() {
		return super.toString();
	}
}
