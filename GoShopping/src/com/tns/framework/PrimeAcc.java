package com.tns.framework;

public class PrimeAcc extends ShopAcc{
	private boolean isPrime=true;
private static final float deliveryCharges=0.0f;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
		this.isPrime = isPrime;
	}
   public boolean getisPrime() {
	   return this.isPrime;
   }
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	public void bookProduct(float book) {}
	public String toString() {
		return super.toString() + "PrimeAcc{"+ "isPrime="+ isPrime+"}";

	}
}
