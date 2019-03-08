package br.com.bb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bb.Entity.ProductEntity;
import br.com.bb.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
//	@RequestMapping(value="/listByCategory/{id}", method=RequestMethod.GET)
//	public ResponseEntity<?> listByCategory() {
//		List<ProductEntity> listObj = service.listByCategory();
//		return ResponseEntity.ok().body(listObj);
//	}
	
}
