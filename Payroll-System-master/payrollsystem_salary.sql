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
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salary` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `UID` varchar(30) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `Department` varchar(30) DEFAULT NULL,
  `hr` varchar(45) DEFAULT NULL,
  `da` varchar(45) DEFAULT NULL,
  `med` varchar(45) DEFAULT NULL,
  `Leave` varchar(30) DEFAULT NULL,
  `travell` varchar(45) DEFAULT NULL,
  `grosssalary` varchar(45) DEFAULT NULL,
  `netsalary` varchar(45) DEFAULT NULL,
  `Date` varchar(45) DEFAULT NULL,
  `basicsalary` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`,`UID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` VALUES (1,'alex33','alex fisher','mechanical','300.00','200.00','200.00','400.00','400.00','13200.0','12122.8','13/04/22, 10:55 am','12000.00'),(2,'ella22',' Ella todd','civil','400.00','600.00','700.00','200.00','700.00','18600.0','17709.4','20/04/22, 6:13 pm','18000.00'),(3,'mac11','mac Smith','computer','300.0','400.0','400.0','500.00','500.0','18600.0','17709.4','01/02/23, 10:22 pm','17000.00'),(4,'nora44','Nora yadhav','other','500.00','500.00','500.00','400.00','700.00','16200.0','14659.8','19/04/22, 8:32 pm','14000.00');
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
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
