package br.com.bb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bb.Entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{

}
