## 螺絲工廠之碳排放估算與產能分析(後端)

## 目的

節省碳排: 因應歐盟碳關稅，幫助廠商計算碳排放量，節省開銷

產能分析: 根據統計資料分析螺絲產能 

## 使用工具

[前端](https://github.com/Yuuquoi/screwWeb) : Vue、 JavaScript 、HTML 、CSS

後端 : Java 、Spring Boot 、MySQL 

## 接收資料
+ 建構基於 TCP 協定的 socket server 讀取機台即時傳入的資料 ( JSON 格式 )，再存入資料庫中
