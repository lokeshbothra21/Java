package lambda_expressions;
import static utils.ShopUtils.*;

import java.util.List;
import java.util.Map;

import com.shop.core.Category;
import com.shop.core.Product;
public class Test6 {

	public static void main(String[] args) {
		Map<Integer,Product> productMap = populateProductMap(populateProductList());
		productMap.forEach((k,v) -> System.out.println(v));
		Category cat=Category.BREAD;
		double discount=10;
		productMap.values()
		.stream()
		.filter(p->p.getProductCategory()==cat)
		.forEach(p->{
							p.setPrice(p.getPrice()-discount);
							System.out.println(p);
		});
	}

}
