package p1;

import java.util.Scanner;

public class Income {
	Scanner obj=new Scanner(System.in);
	double grossIncom=obj.nextDouble();
	String state;
	int dependents;
	public void printReturnTax()
	{
		System.out.println(calcTax());
	}
	public double calcTax()
	{
		double stateTax=0;
		if(grossIncom>30000)
		{
			stateTax=0.05*(grossIncom/100);
		}
		else
		{
			stateTax=0.06*(grossIncom/100);
		}
		return stateTax;
	}

}
