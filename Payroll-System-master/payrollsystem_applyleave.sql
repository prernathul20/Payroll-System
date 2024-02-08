-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: payrollsystem
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `applyleave`
--

DROP TABLE IF EXISTS `applyleave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `applyleave` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `UID` varchar(30) NOT NULL DEFAULT 'Default',
  `name` varchar(30) DEFAULT NULL,
  `fromDate` varchar(30) DEFAULT NULL,
  `Noofdays` varchar(30) DEFAULT NULL,
  `reason` varchar(50) DEFAULT NULL,
  `status` varchar(30) DEFAULT ' NOT NULL DEFAULT',
  `leaveDays` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`,`UID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `applyleave`
--

LOCK TABLES `applyleave` WRITE;
/*!40000 ALTER TABLE `applyleave` DISABLE KEYS */;
INSERT INTO `applyleave` VALUES (1,'alex33','alex fisher','12/04/22, 1:12 am','10','go to hell','Approved','2'),(2,'ella22','Ella todd','3243343','1','5','declined','3'),(3,'mac11','mac Smith','12/04/22, 1:12 am','4','for health issue','Decline','1'),(4,'nora44','Nora yadhav','19/02/23, 2:09 pm','1','','approved','3');
/*!40000 ALTER TABLE `applyleave` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-21 22:12:19
