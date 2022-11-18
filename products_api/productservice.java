package Product_Details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import Product_Details.Product;
import Product_Details.ProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import Category_Details.Category;

@Service
public class ProductService 
{
 @Autowired
	
	ProductRepository productrepository;
public List<Product> getProduct()
{
	List<Product> plist=new ArrayList();
	productrepository.findAll().forEach(plist::add);
	return plist;
}

public Optional<Product> getProduct(String product_id)
{
	return productrepository.findById(product_id);
}

public ModelAndView addProduct(Product p)
{
	productrepository.save(p);
	return new ModelAndView("success");
}

public void deleteProduct(String product_id)
{
	productrepository.deleteById(product_id);
}

public void updateProduct(String product_id,Product p)
{
      productrepository.save(p);
}
}
