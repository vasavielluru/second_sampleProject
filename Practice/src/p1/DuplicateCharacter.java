package p1;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the input String");
		String input = obj.next();
		String output = getString(input);
		// System.out.println(output);
		output = getResult(output, input);
		System.out.println("The Resultant String is::" + output);
		obj.close();

	}

	public static String getResult(String output, String input) {
		// TODO Auto-generated method stub
		String output1 = "";
		int count, k = 0;
		int[] index = new int[output.length() + 2];
		for (int i = 0; i < output.length(); i++) {
			count = 0;
			for (int j = 0; j < input.length(); j++) {
				if (output.charAt(i) == input.charAt(j)) {

					count += 1;
					if (count == 2) {
//						
						index[k++] = j;

					}

				}

			}
		}
		index = getSort(index, k);

		for (int i = 0, m = 0; i < input.length(); i++) {
			if ((i == index[m]) && (m < k)) {
				output1 += "*";
				m++;
			} else
				output1 += input.charAt(i);
		}
		return output1;
	}

	public static int[] getSort(int[] index, int len) {

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (index[i] < index[j])
					index[i] = index[i] + index[j] - (index[j] = index[i]);
			}
		}

		return index;
	}

	public static String getString(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			int j;
			for (j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					break;

				}

			}
			if (j == input.length())
				output += input.charAt(i);

		}

		return output;
	}

}
