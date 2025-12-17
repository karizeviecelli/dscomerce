package com.devsuperior.uri2609.repositories;

import com.devsuperior.uri2609.dto.CategorySumDTO;
import com.devsuperior.uri2609.projections.CategorySumProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.uri2609.entities.Category;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {


    @Query(nativeQuery = true, value = "  SELECT c.name, sum(p.amount) " +
            "  FROM products p " +
            "  INNER JOIN categories c on c.id = p.id_categories " +
            "  group BY c.name")
    List<CategorySumProjection> search1();

    @Query( "  SELECT new com.devsuperior.uri2609.dto.CategorySumDTO(" +
            "obj.category.name, " +
            "sum(obj.amount)" +
            ")" +
            "  FROM Product obj " +
            "  group BY obj.category.name")
    List<CategorySumDTO> search2();
}
