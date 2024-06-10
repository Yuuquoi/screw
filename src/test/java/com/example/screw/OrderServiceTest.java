package com.example.screw;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.util.Assert;

import com.example.screw.constants.MaterialCarbonCoefficient;
import com.example.screw.entity.ReceiveData;
import com.example.screw.entity.Order;
import com.example.screw.repository.OrderDao;
import com.example.screw.service.ifs.MemberService;
import com.example.screw.service.ifs.OrderService;
import com.example.screw.vo.BaseRes;
import com.example.screw.vo.CalculateInformationRes;
import com.example.screw.vo.PowerUpdateRes;
import com.example.screw.vo.ProduceObj;
import com.example.screw.vo.SearchOrderRes;
import com.example.screw.vo.SettleOrderVo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
public class OrderServiceTest {

	@Autowired
	private MemberService memberService;
	
	@Autowired
	private OrderService screwMaterialService;

	@Autowired
	private OrderDao screwMaterialDao;
	
	private ObjectMapper mapper = new ObjectMapper();
	
	@Test
	void createTest() throws JsonProcessingException {
		BaseRes res = memberService.signUp("test001", "a123321a");
		System.out.println(mapper.writeValueAsString(res));
	}
	
	@Test
	void daoTest() throws JsonProcessingException {
//		// 刪除螺絲訂單
//		int res1 = screwMaterialDao.deleteOrder("1");
//		System.out.println(res1);
//		// 加總昨日一整天的度和產量
//		List<SettleOrderVo> res2 = screwMaterialDao.sumOrderKWhAndPass(LocalDate.now().minusDays(1).atTime(0, 0, 0), LocalDate.now().minusDays(1).atTime(23, 59, 59, 999999999), "%%");	
//		System.out.println(mapper.writeValueAsString(res2));
//		// 抓取今天有生產的 material 的資料
//		List<ScrewMaterial> res3 = screwMaterialDao.selectScrewMaterialToday(LocalDate.now().atTime(0, 0, 0), LocalDateTime.now());
//		System.out.println(mapper.writeValueAsString(res3));
//		// 選取所有訂單
//		 List<ScrewMaterial> res4 = screwMaterialDao.searchOrder("", "");
//		System.out.println(mapper.writeValueAsString(res4));
	}
	
	// 新增單號
	@Test
	void addOrderTest() throws JsonProcessingException {
		String orderNumber = "1";
		String name = "不鏽鋼304 大扁頭 機械牙螺絲 #8-32X1";
		int aim = 10000;
		int weight = 500;
		List<ProduceObj> raw = new ArrayList<>(List.of(new ProduceObj("球化線材", 1.01, 2.3883)));
		List<ProduceObj> process = new ArrayList<>(List.of(new ProduceObj("電力", 0, 0)));
		
		/*********** 測試成功 ***********/
//		BaseRes res = screwMaterialService.createOrder(orderNumber, name, aim, weight, raw, process);
//		System.out.println(mapper.writeValueAsString(res));
//		Assert.isTrue(res.getCode() == 400, "Add Test Fail");
		
		/*********** 測試重覆 ***********/
//		res = screwMaterialService.createOrder(orderNumber, name, aim, weight, raw, process);
//		System.out.println(mapper.writeValueAsString(res));
//		Assert.isTrue(res.getCode() == 400, "Add Test Fail");
	}
	
	// 編輯單號
	@Test
	void editOrderTest() throws JsonProcessingException {
		String orderNumber = "1";
		String name = "不鏽鋼304 大扁頭 機械牙螺絲 #8-32X1";
		int aim = 10000;
		int weight = 600;
		List<ProduceObj> raw = new ArrayList<>(List.of(new ProduceObj("球化線材", 1.01, 2.3883)));
		List<ProduceObj> process = new ArrayList<>(List.of(new ProduceObj("電力", 0, 0)));

		/*********** 測試資料不存在 ***********/
//		BaseRes res = screwMaterialService.editOrder("2", name, aim, weight, raw, process);
//		System.out.println(mapper.writeValueAsString(res));
//		Assert.isTrue(res.getCode() == 400, "Edit Not Exist Test Fail");

		/*********** 測試成功 ***********/
//		res = screwMaterialService.editOrder(orderNumber, name, aim, weight, raw, process);
//		System.out.println(mapper.writeValueAsString(res));
//		Assert.isTrue(res.getCode() == 200, "Edit Success Test Fail");
	}

	// 搜尋單號
	@Test
	void searchOrderTest() throws JsonProcessingException {
		/*********** 測試成功 ***********/
//		SearchOrderRes res = screwMaterialService.searchOrder("2", null);
//		System.out.println(mapper.writeValueAsString(res));
//		Assert.isTrue(res.getCode() == 200, "First Test Fail");
//		
//		res = screwMaterialService.searchOrder("1", null);
//		System.out.println(mapper.writeValueAsString(res));
//		Assert.isTrue(res.getCode() == 200, "Second Test Fail");
//		
//		res = screwMaterialService.searchOrder(null, null);
//		System.out.println(mapper.writeValueAsString(res));
//		Assert.isTrue(res.getCode() == 200, "Third Test Fail");
//
//		res = screwMaterialService.searchOrder(null, "不");
//		System.out.println(mapper.writeValueAsString(res));
//		Assert.isTrue(res.getCode() == 200, "Fourth Test Fail");

	}
	
	// 每日結算各單號累積耗電量和生產量(Schedule)
//	@Test
//	void settleOrderPowerTest() {
//		/*********** 測試成功 ***********/
//		screwMaterialService.settleOrderPower();
//	}
//	
	// 計算碳排(用於碳排呈現): 參數(null) 傳回(每筆單號的資料庫資料、碳排值)
//	@Test
//	void calculateCarbonEmission() throws JsonProcessingException {
//		/*********** 測試成功 ***********/
//		CalculateInformationRes res = screwMaterialService.calculateCarbonEmission();
//		System.out.println(mapper.writeValueAsString(res));
//	}
	
	// 更新電力使用量(用於碳排細節呈現): 參數(正在查看的單號, 目標量, 目前產量, 單顆重量, 過去累積用電度) 傳回(最新每顆螺絲的使用電度)
//	@Test
//	void powerUpdateTest() throws JsonProcessingException {
//		/*********** 測試成功 ***********/
//		PowerUpdateRes res = screwMaterialService.powerUpdate("1", 10000, 0, 600, 0.80);
//		System.out.println(mapper.writeValueAsString(res));
//	}
}
