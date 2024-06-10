package com.example.screw.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.screw.entity.Order;
import com.example.screw.service.ifs.OrderService;
import com.example.screw.vo.BaseRes;
import com.example.screw.vo.OrderManagementRes;
import com.example.screw.vo.SearchOrderRes;

@Validated
@CrossOrigin
@RestController
public class OrderServiceController {

	@Autowired
	private OrderService orderService;
	
	// 

	// 詳細功能

	// 取得所有單號的相關資訊
	@GetMapping(value = "orderManagement/find_order_all")
	public OrderManagementRes findOrderAll() {
		return orderService.findOrderAll();
	}
	
	//
	
	// 後台
	// 操作功能

	// 新增單號製造資訊
	@PostMapping(value = "order/create")
	public BaseRes createOrder(@Valid @RequestBody Order orderReq) {
		return orderService.createOrder(orderReq.getOrderNumber(), orderReq.getAim(), orderReq.getWeight(), orderReq.getStartProcessIndex(), orderReq.getEndProcessIndex(), orderReq.getPullThreadString(), orderReq.getFormingString(), orderReq.getGrindTeethString(), orderReq.getHeatTreatmentString(), orderReq.getElectroplatingString());
	}

	// 編輯單號製造資訊
	@PostMapping(value = "order/edit")
	public BaseRes editOrder(@Valid @RequestBody Order orderReq) {
		return orderService.editOrder(orderReq.getOrderNumber(), orderReq.getAim(), orderReq.getWeight(), orderReq.getStartProcessIndex(), orderReq.getEndProcessIndex(), orderReq.getPullThreadString(), orderReq.getFormingString(), orderReq.getGrindTeethString(), orderReq.getHeatTreatmentString(), orderReq.getElectroplatingString());
	}

	// 刪除單號製造資訊
	@PostMapping(value = "order/delete")
	public BaseRes deleteOrder(@RequestParam @NotEmpty(message = "單號不可為空") String orderNumber) {
		return orderService.deleteOrder(orderNumber);
	}

	// 搜尋單號製造資訊
	@PostMapping(value = "order/get_order_manufacture")
	public SearchOrderRes getOrderManufacture(@RequestParam String orderNumber) {
		return orderService.getOrderManufactureByOrderNumber(orderNumber);
	}

}
