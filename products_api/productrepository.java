package Product_Details;
import java.util.Optional;

import org.springframework.data.jpa.repository.*;

public interface ProductRepository extends JpaRepository<Product,Integer>
{

	Optional<Product> findById(String product_id);

	void deleteById(String product_id);

	

}
