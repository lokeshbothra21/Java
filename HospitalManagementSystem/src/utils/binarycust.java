package utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.core.Doctor;

public interface binarycust 
{
	//serialization ---> Map to BinaryFile
	static void encodebinary(Map<String,Doctor> cmap,String filename)
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename)))//<---- objectoutput,fileoutput
		{
			out.writeObject(cmap);  //<----- method
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	//deserialization
	static Map<String,Doctor> decodebinary(String filename)
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename)))
		{
			Map<String,Doctor>cmap=new HashMap<>();
			cmap=(Map<String, Doctor>) in.readObject();
			return cmap;
		} catch (ClassNotFoundException | IOException e) {
			
			e.printStackTrace();
			return new HashMap<>();
		}
	}
	
	static void writecharfile(Map<String,Doctor> cmap, String filename)
	{
		try(PrintWriter pw=new PrintWriter(new FileWriter(filename)))
		{
			cmap.values().stream().forEach(pw::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void readcharfile(String filename)
	{
		try(BufferedReader br=new BufferedReader(new FileReader(filename)))
		{
			
			
			br.lines().forEach(s->System.out.println(s));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
