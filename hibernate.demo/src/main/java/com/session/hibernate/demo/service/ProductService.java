package com.session.hibernate.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.session.hibernate.demo.dao.ProductsDAO;
import com.session.hibernate.demo.dto.ProductDTO;
import com.session.hibernate.demo.models.Product;
import com.session.hibernate.demo.models.UpdateProductRequest;


@Service
public class ProductService {

	//service layer need to communicate with DAO 
	@Autowired
	private ProductsDAO productsDAO;
	
	public void saveProduct(Product saveProductRequest) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductId(UUID.randomUUID().toString());
		productDTO.setProductName(saveProductRequest.getProductName());
		productDTO.setProductPrice(saveProductRequest.getProductPrice());
		
		productsDAO.saveProduct(productDTO);
	}
	
	//we do not return ProductDTO to api. so we are converting ProductDTO to products
	public List<Product> listProducts() {
		List<ProductDTO> productDTOList =  productsDAO.listProducts();
		List<Product> products = new ArrayList<>();
		
		for(ProductDTO productDTO : productDTOList) {
			Product product = new Product();
			product.setProductId(productDTO.getProductId());
			product.setProductName(productDTO.getProductName());
			product.setProductPrice(productDTO.getProductPrice());
			products.add(product);
		}
		return products;
	}
	
	public Product getProduct(String productId) throws Exception {
		ProductDTO productDTO = productsDAO.getProduct(productId);
		Product product = new Product();
		product.setProductId(productDTO.getProductId());
		product.setProductName(productDTO.getProductName());
		product.setProductPrice(productDTO.getProductPrice());
		
		return product;
		
	}
	
	public Product updateProduct(UpdateProductRequest updateProductRequest) throws Exception {
		ProductDTO productDTO = productsDAO.getProduct(updateProductRequest.getProductId());
		productDTO.setProductPrice(updateProductRequest.getProductPrice());
		productsDAO.updateProduct(productDTO);
		
		Product product = new Product();
		product.setProductId(productDTO.getProductId());
		product.setProductName(productDTO.getProductName());
		product.setProductPrice(productDTO.getProductPrice());
		
		return product;
	}
	
	
	
}
