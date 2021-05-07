package com.example.demo.rest;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rest.domain.Emp;
import com.example.demo.rest.domain.EmpDao;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@RestController
public class EmpRestController {
	
	private static final Logger LOG = Logger.getLogger(EmpRestController.class.getName());
	
	@Autowired
	private EmpDao empDao;
	
	@RequestMapping("/")
	public String index() {
		return "hello megatus!";
	}
	
	@RequestMapping(value = "/rest/empSearchRetrive.do", method = RequestMethod.POST, produces = "application/json")
	public String empSearchRetrive(@RequestBody String search) {
		LOG.info("input search=" + search);
		
		JsonElement element = JsonParser.parseString(search);
		
		String deptCode = element.getAsJsonObject().get("deptCode").getAsString();
		
		LOG.info("input deptCode=" + deptCode);
		
		List<Emp> empSearchList = empDao.listForBeanPropertyRowMapper(deptCode);
		
		JsonObject empSearchInfo = new JsonObject();
		JsonObject empList = new JsonObject();
		
		JsonArray jsonArray = new JsonArray();
		JsonObject object = null;
		for (Iterator<Emp> iterator = empSearchList.iterator(); iterator.hasNext();) {
			Emp emp = (Emp) iterator.next();
			object = new JsonObject();
			object.addProperty("empNo", emp.getEmpNo());
			object.addProperty("empNm", emp.getEmpNm());
			object.addProperty("age", emp.getAge());
			object.addProperty("postNumber", emp.getPostNumber());
			object.addProperty("roadAddress", emp.getRoadAddress());
			object.addProperty("dtlAddress", emp.getDtlAddress());
			object.addProperty("emailAddress", emp.getEmailAddress());
			object.addProperty("cellPhNumber", emp.getCellPhNumber());
			object.addProperty("deptCode", emp.getDeptCode());
			object.addProperty("regDtdm", emp.getRegDtdm());
			object.addProperty("modDtdm", emp.getModDtdm());
			jsonArray.add(object);
		}
		
		empList.add("empList", jsonArray);
		empSearchInfo.add("empSearchInfo", empList);
		LOG.info("output json =" + empSearchInfo.toString());
		return empSearchInfo.toString();
	}

}
