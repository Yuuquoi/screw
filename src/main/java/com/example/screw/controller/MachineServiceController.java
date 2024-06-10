package com.example.screw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.screw.service.ifs.MachineService;
import com.example.screw.vo.BaseRes;
import com.example.screw.vo.EquipmentHourRes;
import com.example.screw.vo.EquipmentHoursDayRes;
import com.example.screw.vo.EquipmentWeekRes;
import com.example.screw.vo.MachineNameReq;
import com.example.screw.vo.MachineNameRes;
import com.example.screw.vo.MaintenanceRes;
import com.example.screw.vo.OrderAndMachineRes;
import com.example.screw.vo.RecordDeleteReq;
import com.example.screw.vo.RecordReq;
import com.example.screw.vo.RecordStatisticsRes;
import com.example.screw.vo.StatusAndOrderRes;
import com.example.screw.vo.UpdateEquipmentReq;

@CrossOrigin
@RestController
public class MachineServiceController {
	
	@Autowired
	private MachineService machineService;	
		
	// 首頁

	// 取得今日有生產之單號的產量與機台等各項資料
	@GetMapping(value = "screw/orderDataDay")
	public  OrderAndMachineRes orderDataDay() {
		return machineService.orderDataDay();
	}
	
	// 取所有機台的最新資料
	@GetMapping(value = "screw/findmachineDataNow")
	public StatusAndOrderRes findmachineDataNow() {
		return machineService.findmachineDataNow();
	}

	// 首頁之前的幾個小時累積的資料
	@GetMapping(value = "screw/machineHoursData")
	public  EquipmentHoursDayRes machineHoursData() {
		return machineService.machineHoursData();
	}

	// 首頁當前這個小時累積資料
	@GetMapping(value = "screw/machineNewHourData")
	public EquipmentHourRes machineNewHourData() {
		return machineService.machineNewHourData();
	}
	
	// 

	// 詳細功能
	
	// 取得所有設備的基本資料
	@PostMapping(value = "screw/findMachines")
	public MachineNameRes findMachines() {
		return machineService.findMachines();
	}
	
	//特定機台維修資料
	@PostMapping(value = "screw/equipmentRecord")
	public MaintenanceRes equipmentRecord(@RequestParam(value = "name") String machineName) {
			return machineService.equipmentRecord(machineName);
	}

	///特定機台每小時資料
	@PostMapping(value = "screw/machineDayData")
	public EquipmentHourRes machineDayData(@RequestParam(value = "name") String machineName) {
			return machineService.machineDayData(machineName);
	}
	
	//特定機台週平均資料
	@PostMapping(value = "screw/machineWeekAvg")
	public EquipmentWeekRes machineWeekAvg(@RequestParam(value = "name") String machineName) {
			return machineService.machineWeekAvg(machineName);
	}
	
	// 取得特定設備的維修統計資料
	@PostMapping(value = "screw/recordStatistics")
	public RecordStatisticsRes recordStatistics(@RequestParam(value = "name") String machineName) {
			return machineService.recordStatistics(machineName);
	}

	//
	
	// 後台
	// 操作功能
	
	//新增機台
	@PostMapping(value = "screw/addMachine")
	public BaseRes addMachine(@RequestBody UpdateEquipmentReq req) {
		return machineService.addMachine(req);
	}

	//編輯機台
	@PostMapping(value = "screw/updateMachine")
	public BaseRes updateMachine(@RequestBody UpdateEquipmentReq req) {
		return machineService.updateMachine(req);
	}

	//刪除機台
	@PostMapping(value = "screw/deleteMachine")
	public BaseRes deleteMachine(@RequestBody MachineNameReq req) {
		return machineService.deleteMachine(req);
	}
		
	//新增維修資料
	@PostMapping(value = "screw/addRecord")
	public BaseRes addRecord(@RequestBody RecordReq req) {
			return machineService.addRecord(req);
	}
	
	//更新維修資料
	@PostMapping(value = "screw/updateRecord")
	public BaseRes updateRecord(@RequestBody RecordReq req) {
			return machineService.updateRecord(req);
	}
	
	//刪除維修資料
	@PostMapping(value = "screw/deleteRecord")
	public BaseRes deleteRecord(@RequestBody RecordDeleteReq req) {
			return machineService.deleteRecord(req);
	}
	
	// 棄用區
	
	// 前台特定機台資料
	// 取得特定機台一週的平均各項資料
//	@PostMapping(value = "screw/machineDataWeek")
//	public EquipmentRes machineDataWeek(@RequestParam(value = "name") String machineName) {
//		return machineService.machineDataWeek(machineName);
//	}
	
	// 前台特定機台資料
	// 取得機台一個月的平均各項資料
//	@PostMapping(value = "screw/machineDataMonth")
//	public EquipmentRes machineDataMonth(@RequestParam(value = "name") String machineName) {
//		return machineService.machineDataMonth(machineName);
//	}
	
	// 前台特定機台資料
	// 取得機台一年的平均各項資料
//	@PostMapping(value = "screw/machineDataYear")
//	public EquipmentRes machineDataYear(@RequestParam(value = "name") String machineName) {
//		return machineService.machineDataYear(machineName);
//	}
	
//	@PostMapping(value = "screw/getVoltage")
//	public VoltageRes getVoltage() {
//		return machineService.getVoltage();
//	}
		
//	@PostMapping(value = "screw/electricityPeriod")
//	public ElectricityRes electricityPeriod() {
//		return machineService.electricityPeriod();
//	}
	
}
