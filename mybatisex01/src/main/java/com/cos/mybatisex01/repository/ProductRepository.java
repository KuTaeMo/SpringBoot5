package com.cos.mybatisex01.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cos.mybatisex01.model.Product;

// 인터페이스라서 메모리에 안뜸
// @Repository 붙여도 안뜸
@Mapper // 인터페이스를 바로 구현
public interface ProductRepository {
	public void save(Product product);
	public void delete(int id);
	public void update(Product product);
	public List<Product> findAll();
	public Product findById(int id);
}
