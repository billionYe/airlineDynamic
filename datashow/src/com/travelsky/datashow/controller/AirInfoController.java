package com.travelsky.datashow.controller;


import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;

import com.travelsky.datashow.domain.AirInfo;
import com.travelsky.datashow.service.AirInfoService;

/**
 * <p>
 * Title: AirInfoController
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
@Controller
public class AirInfoController {
	@Resource
	AirInfoService airInfoService;

	@RequestMapping("airinfo/list.action")
	@ResponseBody
	public String getById(String id, Model model) {
		AirInfo airlist = airInfoService.getById(id);
		model.addAttribute(airlist);
		JSONObject jo = JSONObject.fromObject(airlist);
		return jo.toString();
	}

	@RequestMapping("airinfo/getall.action")
	@ResponseBody
	public String getAll(Model model, View view) {
		List<AirInfo> airlist = airInfoService.getAll();
		model.addAttribute(airlist);
		JSONArray ja = JSONArray.fromObject(airlist);
		// JSONObject air = JSONObject.fromObject(airlist);
		return ja.toString();
	}
}
