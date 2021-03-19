package com.cos.mybatisex01.repository;

import org.apache.ibatis.annotations.Mapper;

import com.cos.mybatisex01.model.beans.PanmaeBean;

// 인터페이스라서 메모리에 안뜸
// @Repository 붙여도 안뜸
@Mapper // 인터페이스를 바로 구현
public interface PanmaeRepository {
	public PanmaeBean findByIdAndJoin(int id);

}
