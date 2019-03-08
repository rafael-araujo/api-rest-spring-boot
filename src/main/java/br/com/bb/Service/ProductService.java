package br.com.bb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bb.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
//	public List<CategoryEntity> listByCategory(){
//		Optional<Categoria> obj = repository.findById(id);
//	}
}
