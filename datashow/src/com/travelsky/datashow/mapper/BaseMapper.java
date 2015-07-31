package com.travelsky.datashow.mapper;

import java.io.Serializable;
import java.util.List;

import com.travelsky.datashow.domain.AirInfo;

/**
 * <p>Title: BaseMapper</p>
 * <p>Description: 定义基本的 增,删,改,查接口,其他mapper均继承此接口</p>
 * <p>Copyright: UWaySoft (c) 2015</p>
 * <p>Company: TravelSky</p>
 * @author 冯鹏斌
 * @version 1.0
 */
@SuppressWarnings("hiding")
public interface BaseMapper<AirInfo> {
	/**
	 * <p> 方法描述:根据Id返回航班信息</p>    
	 * @param id
	 * @return<br><br>
	 * @author 冯鹏斌<BR>
	 * @date 2015年7月11日<br>
	 * @remark <br>
	 */
	public AirInfo getById(Serializable id);

	public List getAll();
}
