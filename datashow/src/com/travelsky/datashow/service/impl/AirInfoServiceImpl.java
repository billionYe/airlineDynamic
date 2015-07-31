package com.travelsky.datashow.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.travelsky.datashow.domain.AirInfo;
import com.travelsky.datashow.mapper.AirInfoMapper;
import com.travelsky.datashow.service.AirInfoService;

/**
 * <p>
 * Title: AirInfoServiceImpl
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: UWaySoft (c) 2015
 * </p>
 * <p>
 * Company: TravelSky
 * </p>
 * 
 * @author 冯鹏斌
 * @version 1.0
 */
@Component
public class AirInfoServiceImpl implements AirInfoService {

	@Resource
	AirInfoMapper airInfoMapper;

	public AirInfo getById(String id) {
		// TODO Auto-generated method stub
		return airInfoMapper.getById(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AirInfo> getAll() {
		return airInfoMapper.getAll();
	}

}
