package ExcelBooks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTextFile {
	public static List<List<String>> readtxtFile(String filepath) {
		List<List<String>> wordList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split(" "); // Split the line into words by spaces
				List<String> wordLine = new ArrayList<>();
				for (String word : words) {
					wordLine.add(word);
				}
				wordList.add(wordLine); // Add the list of words to the 2D list
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		int i=0;

		// Print the 2D list
		for (List<String> wordLine : wordList) {
			i++;
			if(i<20) {
			for (String word : wordLine) {
				System.out.print(word + " ");
			}
			System.out.println(); // Move to the next line
		}
		}

		return wordList;
	}

	public static void main(String[] args) {
		// Provide the path to your text file
		String filePath = "./src/test/java/ExcelBooks/sample.txt";

		readtxtFile(filePath);
	}
}
