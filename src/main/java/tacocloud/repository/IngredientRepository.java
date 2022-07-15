package tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import tacocloud.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
