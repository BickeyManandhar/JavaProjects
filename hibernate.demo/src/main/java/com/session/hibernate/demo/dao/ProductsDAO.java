package com.session.hibernate.demo.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.session.hibernate.demo.dto.ProductDTO;
import com.session.hibernate.demo.models.Product;

@Repository
public class ProductsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void updateProduct(ProductDTO productDTO) {
		sessionFactory.getCurrentSession().update(productDTO);
	}
	//save or update the table
	public void saveProduct(ProductDTO productDTO) {
		sessionFactory.getCurrentSession().saveOrUpdate(productDTO);
	}
	
	public List<ProductDTO> listProducts(){
		//select * from products;
		return sessionFactory.getCurrentSession().createQuery("From ProductDTO").getResultList();
	}
	
	public ProductDTO getProduct(String productId) throws Exception {
		//select * from products where product_Id = 'aksjcbkd'
		List<ProductDTO> productDTOList = sessionFactory.getCurrentSession().createQuery("From ProductDTO where product_id = '"+ productId +"'").getResultList();
		if(productDTOList.size()>0) {
			return productDTOList.get(0);
		}else {
			throw new Exception ("Product Not Found. ");
		}
	}
}
