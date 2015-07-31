package com.travelsky.datashow.service;

import java.util.List;

import com.travelsky.datashow.domain.AirInfo;
/**
 * <p>Title: AirInfoService</p>
 * <p>Description: </p>
 * <p>Copyright: UWaySoft (c) 2015</p>
 * <p>Company: TravelSky</p>
 * @author 冯鹏斌
 * @version 1.0
 */
public interface AirInfoService {
	public AirInfo getById(String id);

	public List<AirInfo> getAll();
}
