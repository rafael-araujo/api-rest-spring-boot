package br.com.bb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.Entity.CategoryEntity;
import br.com.bb.Service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	@RequestMapping(value="/listAll", method=RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<CategoryEntity> listObj = service.findAll();
		return ResponseEntity.ok().body(listObj);
	}

}
