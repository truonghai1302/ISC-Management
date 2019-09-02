CREATE DATABASE  IF NOT EXISTS `isc` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `isc`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: isc
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (35);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schools`
--

DROP TABLE IF EXISTS `schools`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `schools` (
  `id` int(11) NOT NULL,
  `code` char(10) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `contact` tinytext,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schools`
--

LOCK TABLES `schools` WRITE;
/*!40000 ALTER TABLE `schools` DISABLE KEYS */;
INSERT INTO `schools` VALUES (1,'ANS','Dai hoc An nhinh Nhan Dan','47 XL Ha Noi','028 3896 3884'),(2,'CSS','Dai hoc Canh sat Nhan Dan','36 Nguyen Huu Tho','028 6686 0550'),(3,'DCG','Dai hoc Gia Dinh','291 CMT8','096 212 10 18'),(4,'DCT','Dai hoc Cong nghiep thuc pham TPHCM','140 Le Trong Tan','028 3816 1673'),(5,'HUI','Dai hoc Cong Nghiep TPHCM','12 Nguyen Van Bao','028 3894 0390'),(6,'DKC','Dai hoc Cong Nghe TPHCM','475 A Dien Bien Phu','028 5445 7777'),(7,'DMS','Dai hoc Tai chinh Marketing','306 Nguyen Trong Tuyen','028 3997 0941'),(8,'DNT','Dai hoc Ngoai ngu - tin hoc TPHCM','155 Su Van Hanh','028 3979 7515'),(9,'DSG','Dai hoc Cong Nghe Sai Gon','180 Cao Lo','028 3850 8265'),(10,'DTH','Dai hoc Hoa Sen','8 Nguyen Van Trang','028 7309 1991'),(11,'DTT','Dai hoc Ton Duc Thang','19 Nguyen Huu Tho','028 3775 5035'),(12,'DVH','Dai hoc Van Hien','624 Au Co','028 3832 0333'),(13,'DVL','Dai hoc Van Lang','45 Nguyen Khac Nhu','028 3836 7933'),(14,'VHS','Dai hoc GTVT TPHCM','2 Vo Oanh','028 3899 1373'),(15,'HIU','Dai hoc QT Hong Bang','215 Dien Bien Phu','028 7308 3456'),(16,'SPK','Dai hoc SP Ky Thuat TPHCM','1 Vo Van Ngan','028 3896 8641');
/*!40000 ALTER TABLE `schools` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `code` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `email` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `id_card` int(11) DEFAULT NULL,
  `address` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `gender` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'B','S02','A@gmail.com',180802740,'A','Male'),(2,'A','A02','A@gmail.com',775220976,'A','Male'),(3,'A','A03','A@gmail.com',536305214,'A','Male'),(4,'A','A04','A@gmail.com',498997722,'A','Male'),(5,'A','A05','A@gmail.com',637178764,'A','Male'),(6,'A','A06','A@gmail.com',211514739,'A','Male'),(7,'A','A07','A@gmail.com',814203969,'A','Male'),(8,'A','A08','A@gmail.com',952360245,'A','Male'),(9,'A','A09','A@gmail.com',123561769,'A','Male'),(10,'A','A10','A@gmail.com',540826044,'A','Male'),(14,'Minh Phuong','P01','phuong@gmail.com',9999,'ISC','Female'),(15,'Hua Duc Luong','S13','Luong@gmail.com',9999,'ISC','Male'),(16,'Phu Thinh','S15','thinh@gmail.com',9999,'ISC','Male'),(17,'Thinh Pham','P99','thinh@Gmail.com',9999,'ISC','Male');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subjects`
--

DROP TABLE IF EXISTS `subjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subjects` (
  `id` int(11) NOT NULL,
  `code` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `score_pass` int(11) DEFAULT NULL,
  `time` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subjects`
--

LOCK TABLES `subjects` WRITE;
/*!40000 ALTER TABLE `subjects` DISABLE KEYS */;
INSERT INTO `subjects` VALUES (1,'A01','Introduction to Android Development',7,36),(2,'A02','Advanced Android Application Development',7,48),(3,'G01','Working Process',7,12),(4,'G02','Critical Thinking',7,24),(5,'G03','Professional Speaking',7,24),(6,'G04','Technical Writing',7,24),(7,'G05','Software Testing Process',7,12),(8,'G06','Database Management Systems',7,24),(9,'G07','Web Front-End',7,24),(10,'I01','Swift Fundamental',7,36),(11,'I02','Developing iOS Application with Swift',7,48),(12,'J01','Java Back-End',7,36),(13,'S01','Node.js Back-End',7,36),(14,'N01','.NET Back-End',7,36),(15,'P01','PHP Back-End',7,36),(16,'R01','Ruby on Rails Back-End',7,36),(17,'T01','Security in Information Systems',7,12),(18,'T02','Selenium',7,48),(29,'A01','Introduction to Android Development',7,36);
/*!40000 ALTER TABLE `subjects` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-02 14:57:27
