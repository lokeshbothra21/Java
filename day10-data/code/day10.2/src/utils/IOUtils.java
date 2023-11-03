package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

import com.shop.core.Product;

public interface IOUtils {
//add a method to restore product details from a bin file using de-ser.
	@SuppressWarnings("unchecked")
	static Map<Integer,Product> restoreProductDetails(String fileName) throws IOException,ClassNotFoundException{
		// chain of i/o strms
		// Java App <---- OIS <---- FIS (bin file)
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			return (Map<Integer,Product>)in.readObject();
		}catch (Exception e) {
			//in case of any errs : return empty map to the caller
			//e.printStackTrace();
			System.out.println(e);
			return new HashMap<>();
			
		}
	}
}
