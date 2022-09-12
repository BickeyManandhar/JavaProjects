package com.session.hibernate.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.session.hibernate.demo.dto.ProductDTO;
import com.session.hibernate.demo.models.Product;

@Repository
public class ProductsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void updateProduct(ProductDTO productDTO) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.saveOrUpdate(productDTO);
		session.getTransaction().commit();
		//sessionFactory.getCurrentSession().update(productDTO);
	}
	//save or update the table
	public void saveProduct(ProductDTO productDTO) {
		sessionFactory.getCurrentSession().saveOrUpdate(productDTO);
	}
	
	public List<ProductDTO> listProducts(Integer pageNumber, Integer pageSize){
		//select * from products;
		Query query = sessionFactory.getCurrentSession().createQuery("From ProductDTO");
        query.setMaxResults(pageSize);
        query.setFirstResult(pageNumber * pageSize);
        return query.getResultList();
    }

    // 1 2 3 4 5 6 7 8 9 10
    //pagesize = 3;
    //Page 1 = 1, 2, 3
    //Page 2 = 4, 5, 6

    //pageSize = 3, PageNumber = 1 * 3= 3
	
	public ProductDTO getProduct(String productId) throws Exception {
		//select * from products where product_Id = 'aksjcbkd'
		List<ProductDTO> productDTOList = sessionFactory.getCurrentSession().createQuery("From ProductDTO where product_id = '"+ productId +"'").getResultList();
		if(productDTOList.size()>0) {
			return productDTOList.get(0);
		}else {
			//throw new Exception ("Product Not Found. ");
			return null;
		}
	}
}
