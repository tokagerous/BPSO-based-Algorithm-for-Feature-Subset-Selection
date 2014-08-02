import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class readData {
	public static void getDataset() {
		String line;
		BufferedReader input = null;
		try {
			input = new BufferedReader(new FileReader("iris.data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			line = input.readLine();
			while (line != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ",");

				while (tokenizer.hasMoreTokens()) {
					String data = tokenizer.nextToken();
					System.out.println(data);
				}

				line = input.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open file" + input);
		} catch (IOException e) {
			System.out.println("Unable to read from file" + input);
		}

	}
}