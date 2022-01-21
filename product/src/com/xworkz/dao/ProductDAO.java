package com.xworkz.dao;

import java.util.List;

import com.xworkz.entity.ProductEntity;

public interface ProductDAO {
	public void save(ProductEntity entity);

	public void saveAll(List<ProductEntity> entities);

	List<ProductEntity> getAll(List<ProductEntity> entities);

	ProductEntity getMaxPrice();

	ProductEntity getTotalPrice();

	String getBrandByName(String name);

	ProductEntity getByBrand(String brand);

}
