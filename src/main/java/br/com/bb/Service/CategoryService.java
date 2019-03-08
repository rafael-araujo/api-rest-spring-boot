package br.com.bb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bb.Entity.CategoryEntity;
import br.com.bb.Repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<CategoryEntity> findAll(){
		return repository.findAll();
	}
	
}
