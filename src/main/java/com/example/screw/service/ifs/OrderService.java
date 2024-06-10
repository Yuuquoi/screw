package com.example.screw.service.ifs;

import java.util.List;

import com.example.screw.vo.BaseRes;
import com.example.screw.vo.CalculateInformationRes;
import com.example.screw.vo.OrderManagementRes;
import com.example.screw.vo.PowerUpdateRes;
import com.example.screw.vo.ProduceObj;
import com.example.screw.vo.SearchOrderRes;

public interface OrderService {

	// 新增單號
	public BaseRes createOrder(String orderNumber, int aim, int weight, int startProcessIndex, int endProcessIndex, String pullThread, String forming, String grindTeeth, String heatTreatment, String electroplating);

	// 編輯單號
	public BaseRes editOrder(String orderNumber, int aim, int weight, int startProcessIndex, int endProcessIndex, String pullThread, String forming, String grindTeeth, String heatTreatment, String electroplating);

	// 刪除單號
	public BaseRes deleteOrder(String orderNumber);
	
	// 取得資料庫中所有單號的製造資訊
	public SearchOrderRes getOrderManufactureByOrderNumber(String orderNumber);

	// 每日結算各單號累積耗電量和生產量(Schedule)
//	public void settleOrderPower();

	// 計算碳排(用於碳排呈現): 參數(null) 傳回(每筆單號的資料庫資料、碳排值)
//	public CalculateInformationRes calculateCarbonEmission();
	
	// 更新電力使用量(用於碳排細節呈現): 參數(正在查看的單號, 目標量, 目前產量, 單顆重量, 過去累積用電度) 傳回(最新每顆螺絲的使用電度)
//	public PowerUpdateRes powerUpdate(String orderNumber, int aim, int produce, int weight, double powerUsage);
	
	//取得資料庫內所有單號
	public OrderManagementRes findOrderAll();
}
