package com.cos.mybatisex01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
	private int id;
	private String name; // 상품명
	private String code; // 상품코드
}
