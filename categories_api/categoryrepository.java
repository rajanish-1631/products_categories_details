package Category_Details;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.*;
public interface CategoryRepository extends JpaRepository<Category,String>
{
Optional<Category> findById(String category_id);
}
