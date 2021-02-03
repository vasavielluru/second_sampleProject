package p1;

import java.util.Scanner;

public class MergeMenu {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			


				boolean stop = true;

				do {

					display();

					int option = sc.nextInt();
					sc.nextLine();
					switch (option) {
					case 1:
						int[] input = readInput();
						print(input);
						break;
					case 2:
						int[][] input1 = new int[2][4];
						input1 = getInput(input1, 2, 4);
						int[][] output = getMatrix(input1);
						for (int i = 0; i < output.length; i++) {
							for (int j = 0; j < output[i].length; j++) {
								System.out.println(output[i][j]);
							}
						}
						break;
					case 4:
						System.out.println("enter the input string");
						String inputstr = sc.nextLine();int k=0;
						
						String[] array = getStringArray(inputstr + " ");
						array = getReverse(array);
						
						String[] res1 = getResultant(array);
						
						
						res1 = merge(res1);
						for(int i=0;i<res1.length;i++)
							System.out.print(res1[i]+" ");
						
						
						break;
					case 3:
						System.out.println("enter the string");
						String alpa = sc.nextLine();
						System.out.println(caseConvert(alpa));
						break;
					case 5:
						stop = false;
						break;
					default:
						System.out.println("invalid choice");

					}

				} while (stop);
			}

			public static int[] readInput() {
				System.out.println("enter the length");
				int len = sc.nextInt();
				int[] inputs = new int[len];
				for (int i = 0; i < len; i++) {
					inputs[i] = sc.nextInt();
				}
				return inputs;
			}

			public static void print(int[] input) {
				for (int i = 0; i < input.length; i++) {
					System.out.println(input[i] + " ");
				}
			}

			public static int[][] getInput(int[][] input, int row, int col) {

				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						input[i][j] = sc.nextInt();
					}
				}

				return input;
			}

			public static int[][] getMatrix(int[][] input) {
				for (int i = 0; i < input.length; i++) {
					for (int j = 0; j < input[i].length; j++) {
						if (input[i][j] % 2 != 0) {
							input[i][j] = input[i][j] + 1;
						}
					}
				}

				return input;

			}

			public static String[] getStringArray(String input) {
				String word ="";
				int k = 0;
				String[] words = new String[input.length()];
				for (int i = 0; i < input.length(); i++) {
					if (input.charAt(i) != ' ') {
						word = word + input.charAt(i);
					} else {
						words[k++] = word;
						word ="";
					}
				}
				String[] words1 = new String[k];
				for (int i = 0; i < k; i++) {
					words1[i] = words[i];

				}

				return words1;
			}

			public static String[] getReverse(String[] array) {
				for (int i = 0; i < array.length; i++) {
					
						array[i]=getReverseWord(array[i]);
					
						

					
				}
				
				return array;
			}

			public static String getReverseWord(String string) {
				String res="";
				for (int i = string.length() - 1; i > -1; i--) {
					res+=string.charAt(i);
				}
				return res;
			}

			public static String[] getResultant(String[] array) {
				//String[] output = new String[array.length];
				for (int i = 0; i < array.length; i++) {
					array[i]=removeVowels(array[i]);
				}
				return array;
			}

			public static String removeVowels(String string) {
				String out = "";int index=0,k=0;
				for (int i = 0; i < string.length(); i++) {
					if( !(string.charAt(i)==' '||string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O'
							|| string.charAt(i) == 'U' || string.charAt(i) == 'a' || string.charAt(i) == 'e'
							|| string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')) {
						if(k==0)
						{
							index=i;
							k++;
						}
					}
				}
				for (int i = 0; i < string.length(); i++) {
					if (string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O'
							|| string.charAt(i) == 'U' || string.charAt(i) == 'a' || string.charAt(i) == 'e'
							|| string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
						out+=string.charAt(index);
					} else {
						out += string.charAt(i);
						
					}
				}
				
				return out;
			}

			public static String caseConvert(String string1) {
				String string2 ="";
				for (int i = 0; i < string1.length(); i++) {
					// if ((string1.charAt(i) >= 97 && string1.charAt(i) <= 122)
					// || (string1.charAt(i) >= 65 && string1.charAt(i) <= 90)) {
					if (string1.charAt(i) >= 'a' && string1.charAt(i) <= 'z') {
						string2 = string2 + (char) ((int) string1.charAt(i) - 32);

					} else if (string1.charAt(i) >= 'A' && string1.charAt(i) <= 'Z') {
						string2 = string2 + (char) ((int) string1.charAt(i) + 32);
					} else {
						string2 = string2 + string1.charAt(i);
					}

				}
				return string2;
			}

			public static String[] merge(String[] input) {
				int k = 0;
				String[] output = new String[input.length - 1];
				for (int i = 0; i < input.length-1; i++)

				{
					//System.out.println(input[i]);
					if (i == 1) {
						output[k]=input[i];
						
						output[k]+=input[i+1];
						
						k++;
					} else if (i > 1) {
						output[k++] = input[i + 1];

					} else {
						output[k++] = input[i];
						
					}
				}
				return output;
			}

			public static void display() {
				System.out.println("1.add 1D array:");
				System.out.println("2.add 2D array for odd elements replacement:");

				System.out.println("3.String case covert:");
				System.out.println("4.reverse words of string and merge :");

				System.out.println("5.exit");
				System.out.println("select an option:");
			}

		

}
