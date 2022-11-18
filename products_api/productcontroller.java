package Product_Details;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

	@RestController
	public class ProductController {

		
	@Autowired
	ProductService productservice;

	@RequestMapping(method=RequestMethod.GET, value="/product")
	public List<Product> getProducts()
	{
		return productservice.getProduct();
	}

	@RequestMapping(method=RequestMethod.GET, value="/product/{id}")
	public Optional<Product> getProduct(@PathVariable String product_id)
	{
	   return productservice.getProduct(product_id);	
	}

	@RequestMapping(method=RequestMethod.POST, value="/product")
	public ModelAndView addProduct(@RequestBody Product p1)
	{
		return productservice.addProduct(p1);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/product/{id}")
	public void deleteProduct(@PathVariable String product_id)
	{
		productservice.deleteProduct(product_id);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/product/{product_id}")
	public void updateProduct(@PathVariable String product_id, @RequestBody Product p)
	{
	  productservice.updateProduct(product_id,p);
	}
	}


