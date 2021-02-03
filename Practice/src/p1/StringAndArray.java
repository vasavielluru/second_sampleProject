package p1;


import java.util.Scanner;

public class StringAndArray{
	static Scanner scan=new Scanner(System.in);
	public static void main(String args[])
	{
		
		int choice=0;
		do {
			menu();
			choice=scan.nextInt();
			switch(choice) {
			case 3:
				String[] str1=stringArrayManipulation();
				System.out.println(str1);
				
			break;
			case 4:
				String str=alphaNumericStringManipulation();
				System.out.println(str);
				break;
			case  5: System.out.println("Thank you");
			break;
			default: System.out.println("Invalid");
		}
		}while(choice!=0);
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("1.One Dimensional Array\n2.Two Dimensional Array"+ "\n3.String Manipulation\n4.String Array Manipulation\n5.exit");
		
	}

	private static String alphaNumericStringManipulation() {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		String numericString=scan.next();
		String str="";
		for(int i=0;i<numericString.length();i++)
		{
			if(numericString.charAt(i)>='a' && numericString.charAt(i)<='z')
			{
				str+=(char)(((int)numericString.charAt(i))-32);
			}
			else if(numericString.charAt(i)>='A' && numericString.charAt(i)<='Z') {
				str+=(char)(((int)numericString.charAt(i))+32);
			}
			else
				str+=numericString.charAt(i);
		}
		
		
		return str;
	}

	private static String[] stringArrayManipulation() {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		
		String inputString=scan.nextLine();
		String[] array=getStringArray(inputString+" ");
		array=getReverse(array);
		String[] result=getResultant(array);
		result=merge(result);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		return result;
	}

	private static String[] merge(String[] result) {
		// TODO Auto-generated method stub
		int k=0;
		String[] output=new String[result.length-1];
		for(int i=0;i<result.length;i++)
		{
			if(i==1)
			{
				output[k++]=result[i]+result[i+1];
			}
			else if(i>1)
			{
				output[k++]=result[i+1];
			}
			else
			{
				output[k++]=result[i];
			}
		}
		return output;
	}

	private static String[] getResultant(String[] array) {
		// TODO Auto-generated method stub
		String[] output=new String[array.length];
	for(int i=0;i<array.length;i++)
	{
		array[i]=removeVowels(array[i]);
	}
		return output;
	}

	private static String removeVowels(String string) {
		// TODO Auto-generated method stub
		String out="";
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='a'||string.charAt(i)=='a'
					||string.charAt(i)=='a'||string.charAt(i)=='a'
					||string.charAt(i)=='a')
			{
				out+='*';
			}
		}
		return out;
	}

	private static String[] getReverse(String[] array) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++)
		{
			if(i%2!=0)
			{
				array[i]=getReverseWord(array[i]);
				System.out.println(array[i]+" ");
			}
			else
			{
				array[i]=array[i];
				System.out.println(array[i]+" ");
			}
		}
		return array;
	}

	private static String getReverseWord(String string) {
		// TODO Auto-generated method stub
		String res=" ";
		for(int i=string.length()-1;i>-1;i--)
		{
			res+=string.charAt(i);
		}
		return res;
	}

	private static String[] getStringArray(String string) {
		// TODO Auto-generated method stub
		String word="";
		int k=0;
		String[] words=new String[string.length()];
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
				word=word+string.charAt(i);
			else
				words[k++]=word;
			word="";
		}
		String[] words1=new String[k];
		for(int i=0;i<k;i++)
		{
			words1[i]=words[i];
			
		}return words1;
	}
	
}