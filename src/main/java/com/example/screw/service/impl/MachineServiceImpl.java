package com.example.screw.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.example.screw.constants.RtnCode;
import com.example.screw.entity.Equipment;
import com.example.screw.entity.EquipmentHour;
import com.example.screw.entity.Maintenance;
import com.example.screw.entity.Order;
import com.example.screw.entity.ReceiveData;
import com.example.screw.repository.EquipmentHourDao;
import com.example.screw.repository.MachineDataDao;
import com.example.screw.repository.MaintenanceDao;
import com.example.screw.repository.OrderDao;
import com.example.screw.repository.ReceiveDataDao;
import com.example.screw.service.ifs.MachineService;
import com.example.screw.vo.BaseRes;
import com.example.screw.vo.ElectricityPeriod;
import com.example.screw.vo.ElectricityRes;
import com.example.screw.vo.EquipmentHourRes;
import com.example.screw.vo.EquipmentHoursDayRes;
import com.example.screw.vo.EquipmentName;
import com.example.screw.vo.EquipmentRes;
import com.example.screw.vo.EquipmentWeekRes;
import com.example.screw.vo.MachineNameReq;
import com.example.screw.vo.MachineNameRes;
import com.example.screw.vo.MachineVoltage;
import com.example.screw.vo.MaintenanceRes;
import com.example.screw.vo.OrderAndMachine;
import com.example.screw.vo.OrderAndMachineRes;
import com.example.screw.vo.ReceiveDataCurrent;
import com.example.screw.vo.ReceiveDataLong;
import com.example.screw.vo.ReceiveDataMachine;
import com.example.screw.vo.ReceiveDataNew;
import com.example.screw.vo.ReceiveDataOrder;
import com.example.screw.vo.ReceiveDataStatus;
import com.example.screw.vo.ReceivePassNumber;
import com.example.screw.vo.RecordDelete;
import com.example.screw.vo.RecordDeleteReq;
import com.example.screw.vo.RecordReq;
import com.example.screw.vo.RecordStatisticsRes;
import com.example.screw.vo.StatusAndOrderRes;
import com.example.screw.vo.UpdateEquipment;
import com.example.screw.vo.UpdateEquipmentReq;
import com.example.screw.vo.VoltageRes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@EnableScheduling
@Transactional
@Service
public class MachineServiceImpl implements MachineService{
	
	@Autowired
	private MachineDataDao machineDataDao;
	
	@Autowired
	private ReceiveDataDao receiveDataDao;
	
	@Autowired
	private EquipmentHourDao equipmentHourDao;
	
	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private MaintenanceDao maintenanceDao;
	
//	@Override  
//	@Scheduled(cron = "0 55 23 * * ?")
//	public void machineDataDay(){
//		LocalDateTime currentDate = LocalDateTime.now();
//		LocalDateTime tomorrow = currentDate.plusDays(1);
//		// 
//		List<ReceiveDataLong> machineDay = machineDataDao.machineDataDay(tomorrow);
//		List<ReceiveDataStatus> machineStatusRun = machineDataDao.machineDataStatusRun(tomorrow);
//		List<ReceiveDataStatus> machineStatusIdle = machineDataDao.machineDataStatusIdle(tomorrow);
//		List<ReceiveDataStatus> machineStatusError = machineDataDao.machineDataStatusError(tomorrow);
//		List<ReceiveDataCurrent> runCurrentAvg = machineDataDao.machineRunCurrentAvg();
//		List<ReceiveDataCurrent> idleCurrentAvg = machineDataDao.machineIdleCurrentAvg();
//		List<ReceiveDataCurrent> errorCurrentAvg = machineDataDao.machineErrorCurrentAvg();
//		List<MachineVoltage> voltage = machineDataDao.machineVoltage();
//		
//		
//		List<Equipment> equList = new ArrayList<>();
//		LocalDate today = LocalDate.now();
//		Equipment equ = new Equipment();
//		// 各狀態集比例
//		double passAvg = 0;
//		double currentAvg = 0;
//		double runAvg = 0;
//		double idleAvg = 0;
//		double errorAvg = 0;
//		double runIT = 0;
//		double idleIT = 0;
//		double errorIT = 0;
//		int index = 0;
//		double statusSum = 0;
//		
////		System.out.println(machineStatusRun.size());
//		
//		for(ReceiveDataLong item : machineDay) {
//			passAvg = (double)item.getPass()/(double)(item.getPass()+item.getNg());
//			equ.setDataPassAvg(passAvg);
//			currentAvg = item.getCurrent();
//			equ.setDataCurrentAvg(currentAvg);
//			equ.setName(item.getName());
//			equ.setDataDate(today);
//			equ.setPass((int)item.getPass());
//			equ.setVoltage((int)voltage.get(index).getVoltage());
//
//			equ.setDel(false);
//			runIT = runCurrentAvg.get(index).getCurrent()*24/1000;
//			equ.setRunIT(runIT);
//			idleIT = idleCurrentAvg.get(index).getCurrent()*24/1000;
//			equ.setIdleIT(idleIT);
//			errorIT = errorCurrentAvg.get(index).getCurrent()*24/1000;
//			equ.setErrorIT(errorIT);
//			
//			statusSum = (double)machineStatusIdle.get(index).getStatus()+(double)machineStatusRun.get(index).getStatus()+(double)machineStatusError.get(index).getStatus(); 
//			runAvg = (double)machineStatusRun.get(index).getStatus()/statusSum;
//			equ.setDataRunAvg(runAvg);
//			idleAvg = (double)machineStatusIdle.get(index).getStatus()/statusSum;
//			equ.setDataIdleAvg(idleAvg);
//			errorAvg = (double)machineStatusError.get(index).getStatus()/statusSum;
//			equ.setDataErrorAvg(errorAvg);
//			index++;
//			machineDataDao.save(equ);
////			equList.add(equ);
//				
//		}
////		System.out.println(equList.get(index).getName());
////		System.out.println(equList.size());
////		machineDataDao.saveAll(equList);
//		return;
//	}

	@Override
	public StatusAndOrderRes findmachineDataNow() {
		// 取所有機台最新的資料
		List<ReceiveData> dataNow = receiveDataDao.machineDataNow();
		List<ReceiveDataMachine> machines = receiveDataDao.ReceiveDataMachine();
		List<ReceiveData> datas = new ArrayList<>();
		int number = 0;
		int index = 0;
		
		
		for(ReceiveData item:dataNow) {
			
			if(index == machines.size()) {
				return new StatusAndOrderRes(RtnCode.SUCCESS.getCode(),RtnCode.SUCCESS.getMessage(),datas);
			}
			
			if(datas.size() == 0) {
				datas.add(item);
				index++;
			}else {
				for(int i = 0; i<datas.size(); i++) {
					if(datas.get(i).getName().equals(item.getName())) {
						number = 0;
						number++;
					}
				}
				
				if(number == 0) {
					datas.add(item);
					index++;
				}
			}
			
		}
		
		
		return new StatusAndOrderRes(RtnCode.SUCCESS.getCode(),RtnCode.SUCCESS.getMessage(),datas);
	}
	
	@Override
	public EquipmentRes machineDataWeek(String machineName) {
		
		if(!StringUtils.hasText(machineName)) {
			return new EquipmentRes(RtnCode.MACHINE_NAME_NOT_FOUND.getCode(), RtnCode.MACHINE_NAME_NOT_FOUND.getMessage());
		}
		
		return new EquipmentRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage(), machineDataDao.machineDataStatusWeek(machineName));	
	}

	@Override
	public EquipmentRes machineDataMonth(String machineName) {
		
		if(!StringUtils.hasText(machineName)) {
			return new EquipmentRes(RtnCode.MACHINE_NAME_NOT_FOUND.getCode(), RtnCode.MACHINE_NAME_NOT_FOUND.getMessage());
		}
		
		return new EquipmentRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage(), machineDataDao.machineDataStatusMonth(machineName));
	}

	@Override
	public EquipmentRes machineDataYear(String machineName) {
		
		if(!StringUtils.hasText(machineName)) {
			return new EquipmentRes(RtnCode.MACHINE_NAME_NOT_FOUND.getCode(), RtnCode.MACHINE_NAME_NOT_FOUND.getMessage());
		}
		
		return new EquipmentRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage(), machineDataDao.machineDataStatusYear(machineName));
	}
	
//	@Override
//	public VoltageRes getVoltage() {
//
//		return new VoltageRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage(), machineDataDao.machineVoltage());
//	}
	
	@Override
	public BaseRes updateMachine(UpdateEquipmentReq req) {
		
		int index = 0;
		
		for( UpdateEquipment item : req.getUpdateEquipmentList()) {
			if(!StringUtils.hasText(req.getUpdateEquipmentList().get(index).getName())) {
				return new BaseRes(RtnCode.NEED_MACHINE_NAME.getCode(), RtnCode.NEED_MACHINE_NAME.getMessage());
			}
			machineDataDao.updateMachine(item.getName(),item.getVoltage(),item.getType(),item.getPhone(),item.getLocation(),item.getWarrantyDate(),item.getPurchaseDate(),item.getRecord(), item.getEmail(), item.isStatus(), item.getPrice(), item.getLifespan(), item.getMaintenanceStaff(), item.getAddress());
		}
		
		return new BaseRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage());
	}
	
//	@Override
//	public ElectricityRes electricityPeriod() {
//		
//		LocalDate today = LocalDate.now();
//		
//		if(today.getMonthValue() % 2 == 0) {
//			LocalDate period = LocalDate.of(today.getYear(), today.getMonthValue()-1, 1);
//			ElectricityRes res = caculateElectricity(period);
//			return res;
//			
//		}else {
//			LocalDate period = LocalDate.of(today.getYear(), today.getMonthValue(), 1);
//			ElectricityRes res = caculateElectricity(period);
//			return res;
//		}
//		
//	}
//
//	private ElectricityRes caculateElectricity(LocalDate period) {
//		ElectricityRes electricity = new ElectricityRes();
//		List<ElectricityPeriod> machineIT = machineDataDao.machineITAll(period);
//		List<MachineVoltage> voltage = machineDataDao.machineVoltage();
//		double runElectricity = 0;
//		double idleElectricity = 0;
//		double errorElectricity = 0;
//		int index = 0;
//		for(ElectricityPeriod item : machineIT) {
//			runElectricity += voltage.get(index).getVoltage()*machineIT.get(index).getRunIT();
//			idleElectricity += voltage.get(index).getVoltage()*machineIT.get(index).getIdleIT();
//			errorElectricity += voltage.get(index).getVoltage()*machineIT.get(index).getErrorIT();
//			index++;
//		}
//		
//		electricity.setRunElectricity(runElectricity);
//		electricity.setIdleElectricity(idleElectricity);
//		electricity.setErrorElectricity(errorElectricity);
//		return new ElectricityRes (RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage(), electricity.getRunElectricity(), electricity.getIdleElectricity(), electricity.getErrorElectricity());
//	}

	@Override
	public MachineNameRes findMachines() {
		
		return new MachineNameRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage(), machineDataDao.machinesData());
	}

	@Override
	public BaseRes deleteMachine(MachineNameReq req) {
		
		if(CollectionUtils.isEmpty(req.getMachineNameList())) {
			return new BaseRes(RtnCode.MACHINE_NAME_CANNOT_BE_NULL.getCode(), RtnCode.MACHINE_NAME_CANNOT_BE_NULL.getMessage());
		}
		
		for(String item: req.getMachineNameList()) {
			machineDataDao.machineDelete(item);
		}
		
		return new BaseRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage());
	}

	@Override
	public BaseRes addMachine(UpdateEquipmentReq req) {
		
		int index = 0;
		for( UpdateEquipment item : req.getUpdateEquipmentList()) {
			if(!StringUtils.hasText(req.getUpdateEquipmentList().get(index).getName())) {
				return new BaseRes(RtnCode.NEED_MACHINE_NAME.getCode(), RtnCode.NEED_MACHINE_NAME.getMessage());
			}
			machineDataDao.insertEquipmentData(item.getName(),item.getVoltage(),item.getType(),item.getPhone(),item.getLocation(),item.getWarrantyDate(),item.getPurchaseDate(),item.getRecord(), item.getEmail(), item.isStatus(), item.getPrice(), item.getLifespan(), item.getMaintenanceStaff(), item.getAddress());
		}
		return new BaseRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage());
	}

	
	@Override
//	@Scheduled(cron = "0 0 * * * ?")
	public void machineDataHour() {
		EquipmentHour equh = new EquipmentHour();
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime start = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth(), localDateTime.getHour()-1, 0, 0);
		LocalDateTime end = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth(), localDateTime.getHour(), 0, 0);
		List<ReceiveDataLong> hourData = receiveDataDao.machineDataHour(start,end);
		List<ReceiveDataLong> runCount = receiveDataDao.machineDataHourRun(start, end);
		List<MachineVoltage> voltage = machineDataDao.machineVoltage();
		List<EquipmentName> machineName = machineDataDao. machinesData();
		Map<String,Double> nameVoltage = new HashMap<String,Double>();
		int index = 0;
		double power = 0;
		double runAvg = 0;
		double passAvg = 0;
		
		if(hourData.size() == 0) {
			for(EquipmentName item:machineName) {
				equipmentHourDao.insertEquipmentHourData(item.getName(), 0, 0, start,"",0,0);
			}
		}
		
		for(MachineVoltage item:voltage) {
			nameVoltage.put(item.getName(),item.getVoltage());
		}
		
		for(ReceiveDataLong item:hourData) {
			
			power = nameVoltage.get(item.getName())*item.getCurrent();
			passAvg = (double)item.getPass()/(double)(item.getNg()+item.getPass());
			runAvg = (double)item.getStatus()/(double)runCount.get(index).getStatus();
			index++;
			Equipment type = machineDataDao.findTypeByName(item.getName());
			equipmentHourDao.insertEquipmentHourData(item.getName(), (int)item.getPass(), power, start, type.getType(), runAvg, passAvg);
		}
		
	}

	@Override
	public EquipmentHourRes machineNewHourData() {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime start = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth(), localDateTime.getHour(), 0, 0);
		LocalDateTime end = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth(), localDateTime.getHour()+1, 0, 0);
		List<ReceiveDataLong> hourData = receiveDataDao.machineDataHour(start, end);
		List<ReceiveDataLong> runCount = receiveDataDao.machineDataHourRun(start, end);
		List<MachineVoltage> voltage = machineDataDao.machineVoltage();
		Map<String,Double> nameVoltage = new HashMap<String,Double>();
		List<EquipmentHour>equhList = new ArrayList<>();
		double runAvg = 0;
		double passAvg = 0;
		int index = 0;
		double power = 0;
		
		for(MachineVoltage item:voltage) {
			nameVoltage.put(item.getName(),item.getVoltage());
		}
		
		for(ReceiveDataLong item:hourData) {
			EquipmentHour equh = new EquipmentHour();
			equh.setId(index);
			equh.setName(item.getName());
			equh.setPass((int)item.getPass());
			Equipment type = machineDataDao.findTypeByName(item.getName());
			if(type == null) {
				return new EquipmentHourRes(RtnCode.TYPE_NOT_FOUND.getCode(), RtnCode.TYPE_NOT_FOUND.getMessage());
			}
			equh.setType(type.getType());
			power = nameVoltage.get(item.getName())*item.getCurrent();
			passAvg = (double)item.getPass()/(double)(item.getNg()+item.getPass());
			runAvg = (double)item.getStatus()/(double)runCount.get(index).getStatus();
			equh.setPassAvg(passAvg);
			equh.setRunAvg(runAvg);
			equh.setPower(power);
			equh.setTime(localDateTime);
			equhList.add(index,equh);
			index++;
			
		}
		return new EquipmentHourRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage(), equhList);
	}
	
	@Override
	public EquipmentHoursDayRes machineHoursData() {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime start = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth(), 0, 0, 0);
		LocalDateTime end = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth()+1, localDateTime.getHour(), 0, 0);
		
		return new EquipmentHoursDayRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage(), equipmentHourDao.getEquipmentHourData(start,end));
	}

	@Override
	public OrderAndMachineRes orderDataDay() {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime start = LocalDateTime.of(localDateTime.getYear()-1, localDateTime.getMonth(), localDateTime.getDayOfMonth()-1, localDateTime.getHour(), 0, 0);
		LocalDateTime end = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth()+1, localDateTime.getHour(), 0, 0);
		List<ReceiveDataOrder> orderData = receiveDataDao.OrderDataDay(end);
		List<Order> orderToday = orderDao.selectOrderToday(start, end);
		List<OrderAndMachine> orderMachineList = new ArrayList<>();
		
		int index = 0;
		long addTime = 0;
		double passAvg = 0;
		int subNumber = 0;
		
		
		for(ReceiveDataOrder item:orderData) {
			OrderAndMachine orderMachine = new OrderAndMachine();
			orderMachine.setType(item.getType());
			orderMachine.setOrderNumber(item.getOrderNumber());
			orderMachine.setPass((int)item.getPass());
			passAvg = (double)item.getPass()/(double)(item.getPass()+item.getNg());
			orderMachine.setPassAvg(passAvg);
			
			for(int i = 0; i<orderToday.size(); i++) {
				if(orderMachine.getOrderNumber().equals(orderToday.get(i).getOrderNumber())) {
					orderMachine.setAim(orderToday.get(i).getAim());
					subNumber = orderMachine.getAim()-orderMachine.getPass();
					addTime = (long)Math.ceil(subNumber/item.getNumber()*3.5);
					orderMachine.setTotalTime(timeFormate(addTime));
					orderMachine.setFinishTime(localDateTime.plusSeconds(addTime));
					
				}
			}
			
			
			orderMachine.setUpdateTime(localDateTime);
			orderMachineList.add(orderMachine);
		}
		
		return new OrderAndMachineRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage(), orderMachineList);
	}
	
	private String timeFormate(long time) {
		int days =  (int)Math.floor(time / 86400);
		int hours = (int)Math.floor(time / 3600);
		int minutes = (int)Math.floor(time / 60);
		int seconds = (int)time % 60;
		
		return days + " 天 " + hours + " 時 " + minutes + " 分 " + seconds + " 秒 ";
		
	}

	
	@Override
	public EquipmentHourRes machineDayData(String name) {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime start = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth(), 0, 0, 0);
		LocalDateTime end = localDateTime.plusDays(1);
		if(!StringUtils.hasText(name)) {
			return new EquipmentHourRes(RtnCode.NEED_MACHINE_NAME.getCode(), RtnCode.NEED_MACHINE_NAME.getMessage());
		}
		return new EquipmentHourRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage(), equipmentHourDao.getEquipmentDayData(start, end, name));
		
	}


	@Override
	public EquipmentWeekRes machineWeekAvg(String name) {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime start = localDateTime.plusDays(-6);
		LocalDateTime end = localDateTime.plusDays(1);
		if(!StringUtils.hasText(name)) {
			return new EquipmentWeekRes(RtnCode.NEED_MACHINE_NAME.getCode(), RtnCode.NEED_MACHINE_NAME.getMessage());
		}
		return new EquipmentWeekRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage(), start, end, equipmentHourDao.getEquipmentWeekData(start, end, name));
	}

	
	@Override
	public MaintenanceRes equipmentRecord(String name) {
		if(!StringUtils.hasText(name)) {
			return new MaintenanceRes(RtnCode.NEED_MACHINE_NAME.getCode(), RtnCode.NEED_MACHINE_NAME.getMessage());
		}
		return new MaintenanceRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage(), maintenanceDao.getEquipmentRecord(name));
	}

	@Override
	public BaseRes addRecord(RecordReq req) {
		
		int index = 0;
		for( Maintenance item : req.getRecord()) {
			if(!StringUtils.hasText(req.getRecord().get(index).getName())) {
				return new BaseRes(RtnCode.NEED_MACHINE_NAME.getCode(), RtnCode.NEED_MACHINE_NAME.getMessage());
			}
			maintenanceDao.insertEquipmentRecord(item.getName(), item.getTime(), item.getReason(), item.getResult(), item.getNote());
		}
		return new BaseRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage());
	}

	@Override
	public BaseRes updateRecord(RecordReq req) {
		int index = 0;
		for( Maintenance item : req.getRecord()) {
			if(!StringUtils.hasText(req.getRecord().get(index).getName())) {
				return new BaseRes(RtnCode.NEED_MACHINE_NAME.getCode(), RtnCode.NEED_MACHINE_NAME.getMessage());
			}
			maintenanceDao.updateMachine(item.getName(), item.getTime(), item.getReason(), item.getResult(), item.getNote());
		}
		return new BaseRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage());
	}

	@Override
	public BaseRes deleteRecord(RecordDeleteReq req) {
		if(CollectionUtils.isEmpty(req.getRecordDeleteList())) {
			return new BaseRes(RtnCode.MACHINE_NAME_CANNOT_BE_NULL.getCode(), RtnCode.MACHINE_NAME_CANNOT_BE_NULL.getMessage());
		}
		
		for(RecordDelete item: req.getRecordDeleteList()) {
			maintenanceDao.deleteMachine(item.getName(), item.getTime());
		}
		
		return new BaseRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage());
	}

	@Override
	public RecordStatisticsRes recordStatistics(String name) {
		if(!StringUtils.hasText(name)) {
			return new RecordStatisticsRes(RtnCode.NEED_MACHINE_NAME.getCode(), RtnCode.NEED_MACHINE_NAME.getMessage());
		}
		return new RecordStatisticsRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage(),maintenanceDao.getRecordStatistics(name));
	}
	
	

	
	
	
}
