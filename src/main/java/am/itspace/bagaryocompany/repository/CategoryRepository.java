package am.itspace.bagaryocompany.repository;

import am.itspace.bagaryocompany.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
