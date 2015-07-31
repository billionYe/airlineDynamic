package com.travelsky.datashow.mapper.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.travelsky.datashow.domain.AirInfo;
import com.travelsky.datashow.mapper.BaseMapper;

public abstract class BaseMapperImpl<T> extends SqlSessionDaoSupport implements
		BaseMapper<T> {
	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	List<AirInfo> airinfoList = new ArrayList<AirInfo>();
	private String namespace;

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public T getById(Serializable id) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne(this.namespace + ".get", id);
	}

	public List<T> getAll() {
		return this.getSqlSession()
.selectList(this.namespace + ".get",
				airinfoList);

	}

}
