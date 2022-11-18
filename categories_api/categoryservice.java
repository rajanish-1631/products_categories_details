package Category_Details;

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

@Service
public class CategoryService
{

@Autowired
CategoryRepository categoryrepository;

public List<Category>getCategory()
{
	List<Category> clist=new ArrayList();
	categoryrepository.findAll().forEach(clist::add);
	return clist;
}

public Optional<Category> getCategory(String category_id)
{
	return categoryrepository.findById(category_id);
}

public ModelAndView addCategory(Category c)
{
	categoryrepository.save(c);
	return new ModelAndView("success");
}

public void deleteCategory(String category_id)
{
	categoryrepository.deleteById(category_id);
}
	 
public void updateCategory(String category_id,Category c)
{
	categoryrepository.save(c);
	
}
}
