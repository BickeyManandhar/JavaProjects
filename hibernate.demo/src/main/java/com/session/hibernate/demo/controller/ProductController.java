package com.session.hibernate.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.session.hibernate.demo.exceptions.ServerErrorException;
import com.session.hibernate.demo.models.Product;
import com.session.hibernate.demo.models.UpdateProductRequest;
import com.session.hibernate.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping(value = "/v1/api/product")
	public ResponseEntity<String> saveProduct(@RequestBody Product saveProductRequest) {
		productService.saveProduct(saveProductRequest);
		return new ResponseEntity<>("Product saved Successfully", HttpStatus.OK);
	}

	@GetMapping(value = "/v1/api/product")
	public ResponseEntity<List<Product>> listProducts(@RequestParam Integer pageNumber, @RequestParam Integer pageSize) {
		return new ResponseEntity<>(productService.listProducts(pageNumber, pageSize), HttpStatus.OK);
	}

	// There are 3 way that we can pass data to an API
	// 1. @RequestBody - Post Method
	// 2. @PathVariable - Get Method
	// 3. @RequestParam - Get Method

	/*
	 * @GetMapping(value="/v1/api/product/{productId}") public
	 * ResponseEntity<Product> getProduct(@PathVariable String productId){ try {
	 * return new
	 * ResponseEntity<>(productService.getProduct(productId),HttpStatus.OK); } catch
	 * (Exception e) { // TODO Auto-generated catch block return new
	 * ResponseEntity<>(null,HttpStatus.NOT_FOUND); }
	 */

	@GetMapping(value = "/v1/api/product/id")
	public ResponseEntity<Object> getProductById(@RequestParam String productId) throws Exception {
		try {
			return new ResponseEntity<>(productService.getProduct(productId), HttpStatus.OK);// condition 1: if product is found in database
		} catch (ServerErrorException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(e.getMessage(), e.getStatus());//condition 2 and 3: if product with provided id does not exist in DB/incorrect or if the server is down
		}
	}

	@PutMapping(value = "/v1/api/product")
	public ResponseEntity<Product> updateProduct(@RequestBody UpdateProductRequest updateProductRequest)
			throws Exception {
		return new ResponseEntity<>(productService.updateProduct(updateProductRequest), HttpStatus.OK);
	}
}