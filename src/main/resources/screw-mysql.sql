SET sql_safe_updates=0;

CREATE TABLE IF NOT EXISTS `screw`.`receive_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  `status` varchar(10) DEFAULT NULL,
  `order_number` varchar(20) NOT NULL,
  `current` double DEFAULT NULL,
  `pass` int DEFAULT '0',
  `ng` int DEFAULT '0',
  `type` VARCHAR(45) NOT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `order` (
  `order_number` varchar(20) NOT NULL DEFAULT '0',
  `aim` int NOT NULL DEFAULT '0',
  `weight` int NOT NULL DEFAULT '0',
  `startProcessIndex` int NOT NULL DEFAULT '0',
  `endProcessIndex` int NOT NULL DEFAULT '0',
  `pullThread` mediumtext,
  `forming` mediumtext,
  `grindTeeth` mediumtext,
  `heatTreatment` mediumtext,
  `electroplating` mediumtext,
  `del` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`order_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE IF NOT EXISTS `screw`.`equipment` (
  `name` VARCHAR(20) NOT NULL,
  `voltage` INT DEFAULT 0,
  `type` VARCHAR(45) NOT NULL,
  `del` TINYINT DEFAULT '0',
  `phone` VARCHAR(45) DEFAULT '',
  `location` VARCHAR(100) DEFAULT '',
  `warranty_date` DATE NULL,
  `purchase_date` DATE NULL,
  `record` VARCHAR(200) DEFAULT '',
  `email` VARCHAR(200) DEFAULT '',
  `status` TINYINT DEFAULT '1',
  `price` INT DEFAULT 0,
  `lifespan` DATE NULL,
  `maintenance_staff` VARCHAR(45) DEFAULT '',
  `address` VARCHAR(200) DEFAULT '',
  PRIMARY KEY (`name`)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `account` (
  `account` varchar(20) NOT NULL,
  `pwd` varchar(200) NOT NULL,
  PRIMARY KEY (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `equipment_hour` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) NOT NULL,
  `pass` INT DEFAULT 0,
  `power` DOUBLE DEFAULT 0,
  `time` datetime DEFAULT NULL,
  `type` VARCHAR(45) NOT NULL,
  `run_avg` DOUBLE DEFAULT 0,
  `pass_avg` DOUBLE DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `maintenance` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) DEFAULT '',
  `time` datetime DEFAULT NULL,
  `reason` VARCHAR(100) DEFAULT '',
  `result` VARCHAR(200) DEFAULT '',
  `note` VARCHAR(200) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `order_management` (
  `order_number` varchar(20) NOT NULL,
  `status` VARCHAR(45) DEFAULT '',
  `item` VARCHAR(45) DEFAULT '',
  `number` INT DEFAULT 0,
  `purchaser_name` VARCHAR(45) DEFAULT '',
  `purchaser_phone` VARCHAR(45) DEFAULT '',
  `purchaser_address` VARCHAR(100) DEFAULT '',
  `receiver_name` VARCHAR(45) DEFAULT '',
  `receiver_phone` VARCHAR(45) DEFAULT '',
  `receiver_address` VARCHAR(100) DEFAULT '',
  `note` VARCHAR(200) DEFAULT '',
  PRIMARY KEY (`order_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


