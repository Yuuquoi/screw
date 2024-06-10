package com.example.screw.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.screw.entity.ReceiveData;
import com.example.screw.vo.ReceiveDataLong;
import com.example.screw.vo.ReceiveDataOrder;
import com.example.screw.vo.ReceiveDataMachine;

@Transactional
@Repository
public interface ReceiveDataDao extends JpaRepository<ReceiveData, Integer>{

	// 插入收到的資料
	@Modifying
	@Query(value = "INSERT INTO screw.receive_data (name, status, order_number, current, pass, ng, time) VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7)", nativeQuery = true)
	public void insertReceiveData(String name, String status ,String orderNumber, double current, int pass, int ng, LocalDateTime time);
	
	// 取所有機台最新的資料
	@Query(value = "select * from screw.receive_data ORDER BY time DESC ", nativeQuery = true)
	public List<ReceiveData> machineDataNow();
	
	// 取得每個機台最新的一個小時接收的資料
	@Query(value = "select new com.example.screw.vo.ReceiveDataLong(name, sum(pass) as pass, sum(ng) as ng, avg(current) as current, COUNT(CASE WHEN status = 'run' THEN 1 ELSE NULL END)as status ) from ReceiveData where time >= ?1 and time <= ?2 group by name order by name")
	public List<ReceiveDataLong> machineDataHour(LocalDateTime start, LocalDateTime end);
	
	// 取得每個機台最新的一個小時總狀態次數
	@Query(value = "select new com.example.screw.vo.ReceiveDataLong(name, COUNT(status)as status ) from ReceiveData where time >= ?1 and time <= ?2 group by name order by name")
	public List<ReceiveDataLong> machineDataHourRun(LocalDateTime start, LocalDateTime end);
	
	// 取所有機台最新的資料
	@Query(value = "select new com.example.screw.vo.ReceiveDataOrder(type, orderNumber, sum(pass) as pass, sum(ng) as ng, avg(pass) as number) from ReceiveData where  time <= ?1 group by type, orderNumber")
	public List<ReceiveDataOrder> OrderDataDay(LocalDateTime end);
	
	@Query(value = "select new com.example.screw.vo.ReceiveDataMachine(name) from ReceiveData group by name")
	public List<ReceiveDataMachine> ReceiveDataMachine();
}
