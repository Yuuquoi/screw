package com.example.screw.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.screw.entity.Order;
import com.example.screw.vo.SettleOrderVo;

@Repository
@Transactional
public interface OrderDao extends JpaRepository<Order, Integer> {
	
	// 建立螺絲訂單
	@Modifying
	@Query(value = "INSERT IGNORE INTO screw.order (order_number, aim, weight, start_process_index, end_process_index, pull_thread, forming, grind_teeth, heat_treatment, electroplating) VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10)", nativeQuery = true)
	public int insertOrder(String orderNumber, int aim, int weight, int startProcessIndex, int endProcessIndex, String pullThread, String forming, String grindTeeth, String heatTreatment, String electroplating);

	// 更新螺絲訂單
	@Modifying
	@Query(value = "UPDATE screw.order SET aim = ?2, weight = ?3, start_process_index = ?4, end_process_index = ?5, pull_thread = ?6, forming = ?7, grind_teeth = ?8, heat_treatment = ?9, electroplating = ?10 WHERE order_number = ?1", nativeQuery = true)
	public int updateOrder(String orderNumber, int aim, int weight, int startProcessIndex, int endProcessIndex, String pullThread, String forming, String grindTeeth, String heatTreatment, String electroplating);

	// 刪除螺絲訂單
	@Modifying
	@Query(value = "UPDATE screw.order SET `del` = true WHERE order_number = ?1", nativeQuery = true)
	public int deleteOrder(String orderNumber);

	// 搜尋螺絲訂單
	@Query(value = "SELECT * FROM screw.order WHERE order_number = ?1 AND `del`=false", nativeQuery = true)
	public Order searchOrder(String orderNumber);

	// 根據單號分類，將日期 >= settleStart 且 日期 <= settleEnd 的 電度算出來 和 pass加總，回傳[{單號,電流總和,產量總和}]
	// 總電度 = 伏特*電流面積總和/運作秒數/1000*運作小時
//	@Query(value = "SELECT new com.example.screw.vo.SettleOrderVo(orderNumber, (SELECT dataRunAvg FROM Equipment where name = 'voltage')*sum(current)/3.5/count(current)/1000*count(current)*3.5/60/60 AS kWhSum, sum(pass) AS produceTodaySum)"
//			+ " FROM ReceiveData WHERE time >= ?1 AND time <= ?2 AND orderNumber LIKE ?3 GROUP BY orderNumber ORDER BY orderNumber")
//	public List<SettleOrderVo> sumOrderKWhAndPass(LocalDateTime settleStart, LocalDateTime settleEnd, String orderNumber);

	// 抓取今天有生產的 order 的資料
	@Query(value = "SELECT * FROM screw.order WHERE order_number IN (SELECT DISTINCT order_number FROM screw.receive_data WHERE time >= ?1 AND time <= ?2) ORDER BY order_number", nativeQuery = true)
	public List<Order> selectOrderToday(LocalDateTime settleStart, LocalDateTime settleEnd);
	
}
