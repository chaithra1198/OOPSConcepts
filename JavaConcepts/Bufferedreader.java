package JavaConcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferedreader {

	public static void main(String[] args) throws IOException {
		
		String name;
		System.out.println("enter the string");
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		name=reader.readLine();
		System.out.println("entered name is "+ name);

	}

}
