package com.gimbernat.speedy_web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gimbernat.speedy_web.model.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{

	List<Product> findAllByCategory_Id(int id);

}
