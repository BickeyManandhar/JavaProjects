package com.session.hibernate.demo.models;

public class UpdateProductRequest {
	//we only want user to be able to change the product price
    private Float productPrice;
    private String productId;

    public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }
}
