package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
private static final float charges =0.0f;
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	public float getCharges() {
            return GSPrimeAcc.charges;	
	}
	
		public void bookProduct(float book) {
			System.out.println("prime user charges"+ getCharges());
		}
		public String toString() {
			return super.toString();
		}
	}

	

