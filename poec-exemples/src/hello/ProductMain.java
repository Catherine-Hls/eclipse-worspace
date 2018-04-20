package hello;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;


public class ProductMain {

	public static void main(String[] args) {
		
		Product p1 = new Product("voiture rouge", 10);
		Product p2 = new Product("voiture rouge", 10);
		
		System.out.println(p1 == p2);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals("toto"));
		
		HashSet<Product> productsSet = new HashSet<Product>();
		productsSet.add(p1);
		productsSet.add(p2);
		
		System.out.println(productsSet.size());
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.toString());
		System.out.println(p1);
		
		System.out.println("coucou".toString());

		
		ProductByTitleLengthComparator comparatorByTitleLength = new ProductByTitleLengthComparator();
		System.out.println(comparatorByTitleLength.compare(p1, p2));
		
		Product p3 = new Product("ordinateur bleu", 5);
		System.out.println(comparatorByTitleLength.compare(p1, p3));
		
		ProductByPriceComparator comparatorByPrice = new ProductByPriceComparator();
		System.out.println(comparatorByPrice.compare(p1, p2));
		System.out.println(comparatorByPrice.compare(p1, p3));
		
		
		
		ArrayList<Product> productsList = new ArrayList<Product>();
		productsList.add(p1);
		productsList.add(p2);
		productsList.add(p3);
		System.out.println(productsList);
		
		productsList.sort(comparatorByTitleLength);
		System.out.println(productsList);
		
		productsList.sort(comparatorByPrice);
		System.out.println(productsList);
		
		productsSet.add(p3);
		
		ArrayList<Product> anotherProductList 
			= new ArrayList<Product>(productsSet); // puis trier la liste

		
		TreeSet<Product> productsTreeSet 
			= new TreeSet<Product>(comparatorByPrice);
		
		productsTreeSet.add(p1);
		productsTreeSet.add(p3);
		productsTreeSet.add(p2);
		
		System.out.println(productsTreeSet);
		
	}

}
