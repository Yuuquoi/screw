package com.example.screw;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.screw.entity.Equipment;
import com.example.screw.entity.EquipmentHour;
import com.example.screw.entity.ReceiveData;
import com.example.screw.repository.EquipmentHourDao;
import com.example.screw.repository.MachineDataDao;
import com.example.screw.repository.ReceiveDataDao;
import com.example.screw.service.ifs.MachineService;
import com.example.screw.vo.ElectricityPeriod;
import com.example.screw.vo.ElectricityRes;
import com.example.screw.vo.EquipmentHoursDay;
import com.example.screw.vo.EquipmentName;
import com.example.screw.vo.MachineNameReq;
import com.example.screw.vo.MachineVoltage;
import com.example.screw.vo.ReceiveDataCurrent;
import com.example.screw.vo.ReceiveDataLong;
import com.example.screw.vo.ReceiveDataOrder;
import com.example.screw.vo.ReceiveDataStatus;
import com.example.screw.vo.StatusAndOrderRes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
public class MachineServiceTest {
	
	@Autowired
	private MachineService machineService;
	
	@Autowired
	private MachineDataDao machineDataDao;
	
	@Autowired
	private ReceiveDataDao receiveDataDao;
	
	@Autowired
	private EquipmentHourDao equipmentHourDao;
	
	private ObjectMapper objectMapper = new ObjectMapper();

	@Test
	public void machineDataDay() throws JsonProcessingException {
//		LocalDateTime currentDate = LocalDateTime.now();
//		LocalDateTime tomorrow = currentDate.plusDays(1);
//		List<ReceiveDataLong> data = machineDataDao.machineDataDay(tomorrow);
//		System.out.println(objectMapper.writeValueAsString(data));

//		 machineService.machineDataHour();
		

	}
	
	@Test
	public void findmachineDataNow() throws JsonProcessingException  {
//		 List<ReceiveData> data = receiveDataDao.machineDataNow();
//		 System.out.println(objectMapper.writeValueAsString(data));
		 machineService.findmachineDataNow();
		 
	}
	
	@Test
	public void machineDataStatus() {
		machineService.machineDataWeek("test_1");
		machineService.machineDataMonth("test_1");
		machineService.machineDataYear("test_1");
		
	}
	
	@Test
	public void electricityPeriod() throws JsonProcessingException {
//		machineService.electricityPeriod();
//		LocalDate currentDate = LocalDate.now();
//		LocalDate period = LocalDate.of(currentDate.getYear(), currentDate.getMonthValue()-1, 1);
//		ElectricityPeriod data = machineDataDao.machineITAll(period);
//		System.out.println(objectMapper.writeValueAsString(data));
		
	}
	
	@Test
	public void machineName() throws JsonProcessingException {
//		List<EquipmentName> data = machineDataDao.machineName();
//		System.out.println(objectMapper.writeValueAsString(data));
//		machineService.findMachineName();
		
	}
	
	@Test
	public void machineDelete() {
		List<String> nName = new ArrayList<>();
		nName.add("ww");
		nName.add("voltage");
		MachineNameReq req = new MachineNameReq();
		req.setMachineNameList(nName);
//		machineDataDao.machineDelete("voltage");
		machineService.deleteMachine(req);
		
	}
	
	@Test
	public void addmachine() {
//		machineService.addMachine("dd");
	}
	
	@Test
	public void machineVoltage() throws JsonProcessingException {
//		double data = machineDataDao.machineVoltage();
//		System.out.println(objectMapper.writeValueAsString(data));
//		machineService.getVoltage();
	}
	
	@Test
	public void updateVoltage() {
//		machineDataDao.updateVoltage(110);
//		machineService.updateVoltage(220, "test_1");
	}
	
	@Test
	public void testDao() throws JsonProcessingException {
//		LocalDateTime localDateTime = LocalDateTime.now();
//		LocalDateTime start = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth()-1, localDateTime.getHour(), 0, 0);
//		LocalDateTime end = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth()+1, localDateTime.getHour(), 0, 0);
//		List<ReceiveDataOrder> data = receiveDataDao.OrderDataDay(start,end);
//		System.out.println(objectMapper.writeValueAsString(data));
		Equipment data = machineDataDao.findTypeByName("test_1");
	}
	
	@Test
	public void orderDataDay() {
//		LocalDateTime localDateTime = LocalDateTime.now();
//		LocalDateTime start = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth()-1, localDateTime.getHour(), 0, 0);
//		LocalDateTime end = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth()+1, localDateTime.getHour(), 0, 0);
//		List<ReceiveDataOrder> orderData = receiveDataDao.OrderDataDay(start,end);
		machineService.machineNewHourData();
	}
}
