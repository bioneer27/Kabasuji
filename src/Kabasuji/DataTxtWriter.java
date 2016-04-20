package Kabasuji;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class DataTxtWriter {

	public DataTxtWriter(String aFileName){
		fFilePath = aFileName;
	}
	
	public void txtAdd(String newValue) throws IOException{
		BufferedReader file = new BufferedReader(new FileReader(fFilePath));
        String line;String input = "";

        while ((line = file.readLine()) != null) input += line + '\n';
        file.close();
        input = input + '\n'+ newValue;
        System.out.println(input); 
        
        FileOutputStream fileOut = new FileOutputStream(fFilePath);
        fileOut.write(input.getBytes());
        fileOut.close();
	}
	
	public void txtDelete(String nameToFind) throws IOException{
		BufferedReader file = new BufferedReader(new FileReader(fFilePath));
        String line;String input = "";

        while ((line = file.readLine()) != null) input += line + '\n';
        file.close();
        input = input.replace(nameToFind, "");
        
        System.out.println(input); 
        
        FileOutputStream fileOut = new FileOutputStream("src/Data.txt");
        fileOut.write(input.getBytes());
        fileOut.close();
	}
	
//	public static void main(String[] args) throws IOException{
//		DataTxtWriter dtw = new DataTxtWriter("src/Data.txt");
//		dtw.txtAdd("LLEVEL6 = ,10");
//	}
	
	public void txtReplace(String nameToFind, String newValue) throws IOException{
		BufferedReader file = new BufferedReader(new FileReader(fFilePath));
        String line;String input = "";

        while ((line = file.readLine()) != null) input += line + '\n';
        file.close();
        input = input.replace(nameToFind, newValue);
        
        System.out.println(input); 
        
        FileOutputStream fileOut = new FileOutputStream(fFilePath);
        fileOut.write(input.getBytes());
        fileOut.close();
	}
	
	private final String fFilePath;
}