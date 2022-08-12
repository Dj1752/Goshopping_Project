package com.tns.application;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	
	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		GSPrimeAcc GsPrime = new GSPrimeAcc(accNo,accNm,charges,isPrime);
		System.out.println(GsPrime.toString());
		return GsPrime;
	}

	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		GSNormalAcc GsNormal = new GSNormalAcc(accNo,accNm,charges, deliveryCharges);
		System.out.println(GsNormal.toString());
		return GsNormal;
	}

}
