package com.travelsky.datashow.mapper.impl;


import org.springframework.stereotype.Repository;

import com.travelsky.datashow.domain.AirInfo;
import com.travelsky.datashow.mapper.AirInfoMapper;
@Repository
public class AirInfoMapperImpl extends BaseMapperImpl<AirInfo> implements AirInfoMapper{

	public AirInfoMapperImpl() {
		super.setNamespace("com.travelsky.datashow.mapper.AirInfoMapper");
	}
}
