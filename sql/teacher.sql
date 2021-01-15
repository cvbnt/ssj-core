-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: database
-- ------------------------------------------------------
-- Server version	5.7.30-log

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
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `schoolId` int(11) NOT NULL,
  `teacherCode` varchar(50) NOT NULL,
  `avatar` varchar(500) DEFAULT NULL,
  `name` varchar(20) NOT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `title` varchar(50) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `startTeachDate` datetime NOT NULL COMMENT '入职时间',
  `createAt` datetime NOT NULL,
  `updateAt` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,1,'10001','一寸','刘一','男','三级教师','语文','13100000000','1999-12-31 16:00:00','1999-12-31 16:00:00','2009-12-31 16:00:00'),(2,2,'10002','一寸','陈二','女','二级教师','数学','13100000001','2000-01-01 16:00:00','2000-01-01 16:00:00','2010-01-01 16:00:00'),(3,3,'10003','一寸','张三','男','一级教师','英语','13100000002','2000-01-03 00:00:00','2000-01-03 00:00:00','2010-01-03 00:00:00'),(4,4,'10004','一寸','李四','男','三级教师','语文','13100000003','2000-01-04 00:00:00','2000-01-04 00:00:00','2000-01-04 00:00:00'),(5,5,'10005','一寸','王五','女','二级教师','数学','13100000004','2000-01-05 00:00:00','2000-01-05 00:00:00','2000-01-05 00:00:00'),(6,6,'10006','一寸','赵六','男','一级教师','英语','13100000005','2000-01-06 00:00:00','2000-01-06 00:00:00','2000-01-06 00:00:00'),(7,7,'10007','一寸','孙七','女','三级教师','语文','13100000006','2000-01-07 00:00:00','2000-01-07 00:00:00','2000-01-07 00:00:00'),(8,8,'10008','一寸','周八','男','二级教师','数学','13100000007','2000-01-08 00:00:00','2000-01-08 00:00:00','2000-01-08 00:00:00'),(9,9,'10009','一寸','吴九','女','一级教师','英语','13100000008','2000-01-09 00:00:00','2000-01-09 00:00:00','2000-01-09 00:00:00'),(10,10,'10010','一寸','郑十','男','三级教师','语文','13100000009','2000-01-10 00:00:00','2000-01-10 00:00:00','2000-01-10 00:00:00'),(11,11,'10011','一寸','甲戌','女','二级教师','数学','13100000010','2000-01-11 00:00:00','2000-01-11 00:00:00','2000-01-11 00:00:00'),(12,12,'10012','一寸','乙亥','男','一级教师','英语','13100000011','2000-01-12 00:00:00','2000-01-12 00:00:00','2000-01-12 00:00:00'),(13,13,'10013','一寸','丙子','女','三级教师','语文','13100000012','2000-01-13 00:00:00','2000-01-13 00:00:00','2000-01-13 00:00:00'),(14,14,'10014','一寸','丁丑','男','二级教师','数学','13100000013','2000-01-14 00:00:00','2000-01-14 00:00:00','2000-01-14 00:00:00'),(15,15,'10015','一寸','戊寅','女','一级教师','英语','13100000014','2000-01-15 00:00:00','2000-01-15 00:00:00','2000-01-15 00:00:00'),(16,16,'10016','一寸','己卯','男','三级教师','语文','13100000015','2000-01-16 00:00:00','2000-01-16 00:00:00','2000-01-16 00:00:00'),(17,17,'10017','一寸','庚辰','女','二级教师','数学','13100000016','2000-01-17 00:00:00','2000-01-17 00:00:00','2000-01-17 00:00:00');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-15 16:44:47
