package br.com.bb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bb.Entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{

}
