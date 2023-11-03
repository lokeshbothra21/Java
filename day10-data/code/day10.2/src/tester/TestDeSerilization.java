package tester;

import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

import static utils.IOUtils.restoreProductDetails;

public class TestDeSerilization {

	public static void main(String[] args) {
		// restore product details
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			Map<Integer, Product> productDetails = restoreProductDetails(sc.nextLine());
			System.out.println("All products : ");
			productDetails.forEach((k, v) -> System.out.println(v));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
