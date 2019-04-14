package com.project;

public class Calculations {
	private Double temp;
	private Double acount1;
	private Double scount1;
	private Double hcount1;
	private Double ccount1;
	private Double ncount1;
	private Double count1;
	Calculations(int acount, int scount, int hcount, int ccount, int ncount, int count)
	{
		acount1 = new Double(acount);
		scount1 = new Double(scount);
		hcount1 = new Double(hcount);
		ccount1 = new Double(ccount);
		ncount1 = new Double(ncount);
		count1 = new Double(count);
		
	}
	public double aProb()
	{
		this.temp = acount1 / count1;
	//	System.out.println(temp);
		return temp;
	}
	public double sProb()
	{
		this.temp = scount1 / count1;
	//	System.out.println(temp);
		return temp;
	}
	public double hProb()
	{
		this.temp = hcount1 / count1;
	//	System.out.println(temp);
		return temp;
	}
	public double nProb()
	{
		this.temp = ncount1 / count1;
	//	System.out.println(temp);
		return temp;
	}
	public double cProb()
	{
		this.temp = ccount1 / count1;
	//	System.out.println(temp);
		return temp;
	}
	
}
