package p1;

import java.util.Scanner;

public class RepeatedCharacters {
String var="good",var1="good";
	public static void main(String[] args) {
		RepeatedCharacters object=new RepeatedCharacters();
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String[] array=object.getStringArray(input+" ");
		array=object.getResultantArray(array);
		scanner.close();
	}

	public  String[] getResultantArray(String[] array) {
		for(int i=0;i<array.length;i++)
		{
			array[i]=getModifiedString(array[i]);
			
			System.out.println(array[i]);
		}
		
		
		return array;
	}

	public String getModifiedString(String string) {
		String output="";
		char[] repeat =new char[string.length()];
		int count=0;
		for(int i=0;i<string.length();i++)
		{
			for(int j=i+1;j<string.length();j++)
			{
				if(string.charAt(i)==string.charAt(j))
				{
					repeat[count++]=string.charAt(i);
					
				}
			}
		}
		int j=0,i=0;
		//System.out.println(string);
		for( j=0;j<string.length();j++)
		{
		for( i=0;i<count;i++)
		{
			
			
				if(repeat[i]==string.charAt(j)) {
					output+=(char)((int)string.charAt(j)-1);
					break;}
				
					
				
			}
		if(i==count)
			output+=string.charAt(j);
		
		
		}
		
		return output;
	}

	public  String[] getStringArray(String input) {
		//System.out.println(input);
			String word="";int k=0;
			String[] words=new String [input.length()];
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=' ')
				word+=input.charAt(i);
			else
			{
				words[k++]=word;
				word="";}
			
		}
		String[] words1=new String[k];
		for(int i=0;i<k;i++) {
			words1[i]=words[i];
			//System.out.println(words[i]);
			}
		return words1;
	}

}
