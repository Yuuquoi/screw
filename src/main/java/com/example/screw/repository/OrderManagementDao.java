package com.example.screw.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.screw.entity.OrderManagement;



@Transactional
@Repository
public interface OrderManagementDao extends JpaRepository<OrderManagement, String>{

	// 取所有機台最新的資料
	@Query(value = "select * from screw.order_management ORDER BY order_number ", nativeQuery = true)
	public List<OrderManagement> getAllOrder();
}
