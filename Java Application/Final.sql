-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.42-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema project
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ project;
USE project;

--
-- Table structure for table `project`.`administrator`
--

DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
  `AdminID` int(2) NOT NULL DEFAULT '0',
  `FName` varchar(45) NOT NULL DEFAULT '',
  `LName` varchar(45) DEFAULT NULL,
  `Email` varchar(45) NOT NULL DEFAULT '',
  `Password` varchar(45) NOT NULL DEFAULT '',
  `Mobile` varchar(14) NOT NULL DEFAULT '',
  `Designation` varchar(15) NOT NULL,
  `Institution` varchar(45) NOT NULL DEFAULT '',
  `CName` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`AdminID`,`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`.`administrator`
--

/*!40000 ALTER TABLE `administrator` DISABLE KEYS */;
INSERT INTO `administrator` (`AdminID`,`FName`,`LName`,`Email`,`Password`,`Mobile`,`Designation`,`Institution`,`CName`) VALUES 
 (1,'Akil','Sundhar','akilsundhar324@gmail.com','akil','+916282850416','Developer','BSc Computer Science Sem 4','UIT, Kuravankonam'),
 (2,'Deepak','V.','deepakvishal016@gmail.com','123456','+918921199061','Developer','BSc Computer Science Sem 4','UIT, Kuravankonam'),
 (3,'R.','Subramony','rsubramony029@gmail.com','123456','+918137862370','Developer','BSc Computer Science Sem 4','UIT, Kuravankonam'),
 (4,'Sreejith','S. Nair','sreejithsnair039@gmail.com','123456','+919061581725','Developer','BSc Computer Science Sem 4','UIT, Kuravankonam'),
 (10,'Arun','Sundhar','arun141@gmail.com','123456','+919656256655','Board Member','B.Tech Computer Science Sem 2','Lourdes Matha Engineering Collage'),
 (11,'Mildred','C. Keene','MildredCKeene@dayrep.com','123456','+919126659417','Board Member','Associative Manager','W. V. Associatives'),
 (12,'Shirlene','S. Shirley','ShirleneSShirley@rhyta.com','123456','+914147506351','Board Member','Design Manager','W. V. Associatives'),
 (13,'K. Manikandan','Nair','manikandan123@gmail.com','123456','+911234567890','Board Member','Principal','UIT, Kuravankonam');
INSERT INTO `administrator` (`AdminID`,`FName`,`LName`,`Email`,`Password`,`Mobile`,`Designation`,`Institution`,`CName`) VALUES 
 (14,'S. Christal','Telmin','christaltelmin@gmail.com','123456','+917481590263','Board Member','Department Head','UIT, Kuravankonam'),
 (15,'Jitha','Thankachi','jitha012@gmail.com','123456','+919683572410','Board Member','Teacher In-Charge','UIT, Kuravankonam');
/*!40000 ALTER TABLE `administrator` ENABLE KEYS */;


--
-- Table structure for table `project`.`blood`
--

DROP TABLE IF EXISTS `blood`;
CREATE TABLE `blood` (
  `MemberID` int(10) NOT NULL,
  `BloodGroup` varchar(4) NOT NULL,
  `Height` double DEFAULT NULL,
  `Weight` double DEFAULT NULL,
  `Priority` int(2) DEFAULT NULL,
  `TestID` varchar(50) DEFAULT NULL,
  `BMI` double DEFAULT NULL,
  `Verify` int(1) DEFAULT NULL,
  `LastBlood` date DEFAULT NULL,
  `TestAddress` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`MemberID`),
  KEY `Blood_FK` (`MemberID`,`BloodGroup`),
  CONSTRAINT `Blood_FK` FOREIGN KEY (`MemberID`) REFERENCES `member` (`MemberID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`.`blood`
--

/*!40000 ALTER TABLE `blood` DISABLE KEYS */;
/*!40000 ALTER TABLE `blood` ENABLE KEYS */;


--
-- Table structure for table `project`.`feeds`
--

DROP TABLE IF EXISTS `feeds`;
CREATE TABLE `feeds` (
  `FeedID` varchar(20) NOT NULL,
  `ID` varchar(50) NOT NULL,
  `Title` varchar(100) NOT NULL,
  `Content` varchar(2000) NOT NULL,
  `Raiting` int(1) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`FeedID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`.`feeds`
--

/*!40000 ALTER TABLE `feeds` DISABLE KEYS */;
/*!40000 ALTER TABLE `feeds` ENABLE KEYS */;


--
-- Table structure for table `project`.`links`
--

DROP TABLE IF EXISTS `links`;
CREATE TABLE `links` (
  `No` int(1) DEFAULT NULL,
  `Desktop` varchar(10000) DEFAULT NULL,
  `Android` varchar(10000) DEFAULT NULL,
  `Webpage` varchar(10000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`.`links`
--

/*!40000 ALTER TABLE `links` DISABLE KEYS */;
INSERT INTO `links` (`No`,`Desktop`,`Android`,`Webpage`) VALUES 
 (1,'sgfdskfvgdlgv\nsdfds\nfgdf\n\n--654\ndfg\n--\n\ndfgdf',NULL,NULL);
/*!40000 ALTER TABLE `links` ENABLE KEYS */;


--
-- Table structure for table `project`.`member`
--

DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `MemberID` int(10) NOT NULL DEFAULT '0',
  `FName` varchar(45) NOT NULL,
  `LName` varchar(45) DEFAULT NULL,
  `Email` varchar(45) NOT NULL DEFAULT '',
  `Password` varchar(45) NOT NULL,
  `Mobile` varchar(45) NOT NULL,
  `Age` varchar(45) NOT NULL,
  `Gender` varchar(8) NOT NULL,
  `BloodGroup` varchar(4) NOT NULL DEFAULT '',
  `City` varchar(45) NOT NULL,
  `District` varchar(45) NOT NULL,
  `State` varchar(45) NOT NULL,
  `Login` int(10) unsigned NOT NULL,
  `Verify` int(1) DEFAULT NULL,
  PRIMARY KEY (`MemberID`,`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`.`member`
--

/*!40000 ALTER TABLE `member` DISABLE KEYS */;
/*!40000 ALTER TABLE `member` ENABLE KEYS */;


--
-- Table structure for table `project`.`notify`
--

DROP TABLE IF EXISTS `notify`;
CREATE TABLE `notify` (
  `NID` int(20) NOT NULL DEFAULT '0',
  `RequestID` int(15) NOT NULL DEFAULT '0',
  `MedicalID` varchar(100) NOT NULL,
  `BloodGroup` varchar(5) NOT NULL DEFAULT '',
  `Type` varchar(100) NOT NULL DEFAULT '',
  `Details` varchar(10000) NOT NULL DEFAULT '',
  `District` varchar(101) NOT NULL DEFAULT '',
  `City` varchar(100) NOT NULL DEFAULT '',
  `Accept` int(1) NOT NULL DEFAULT '0',
  `ID` int(20) NOT NULL DEFAULT '0',
  `VAddress` varchar(10000) NOT NULL DEFAULT '',
  `VContact` varchar(14) NOT NULL DEFAULT '',
  `Date` date NOT NULL DEFAULT '0000-00-00',
  PRIMARY KEY (`NID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`.`notify`
--

/*!40000 ALTER TABLE `notify` DISABLE KEYS */;
/*!40000 ALTER TABLE `notify` ENABLE KEYS */;


--
-- Table structure for table `project`.`organization`
--

DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
  `AdminRef` int(2) NOT NULL DEFAULT '0',
  `OrgID` int(3) NOT NULL DEFAULT '0',
  `FName` varchar(45) NOT NULL DEFAULT '',
  `LName` varchar(45) DEFAULT NULL,
  `Email` varchar(45) NOT NULL DEFAULT '',
  `Mobile` varchar(14) NOT NULL DEFAULT '',
  `Password` varchar(45) NOT NULL DEFAULT '',
  `State` varchar(45) NOT NULL,
  `District` varchar(45) NOT NULL,
  `City` varchar(45) NOT NULL,
  `Login` int(30) NOT NULL,
  PRIMARY KEY (`OrgID`,`Email`),
  KEY `Organization_FK` (`AdminRef`),
  CONSTRAINT `Organization_FK` FOREIGN KEY (`AdminRef`) REFERENCES `administrator` (`AdminID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`.`organization`
--

/*!40000 ALTER TABLE `organization` DISABLE KEYS */;
/*!40000 ALTER TABLE `organization` ENABLE KEYS */;


--
-- Table structure for table `project`.`organs`
--

DROP TABLE IF EXISTS `organs`;
CREATE TABLE `organs` (
  `MemberID` int(10) NOT NULL DEFAULT '0',
  `BloodGroup` varchar(4) NOT NULL,
  `TestID` varchar(50) DEFAULT NULL,
  `Liver` int(1) DEFAULT NULL,
  `Kidney` int(1) DEFAULT NULL,
  `Heart` int(1) DEFAULT NULL,
  `Lungs` int(1) DEFAULT NULL,
  `Intestine` int(1) DEFAULT NULL,
  `Cornea` int(1) DEFAULT NULL,
  `Pancreas` int(1) DEFAULT NULL,
  `Type` varchar(50) DEFAULT NULL,
  `Verify` int(1) DEFAULT NULL,
  `TestAddress` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`MemberID`),
  KEY `Organs_FK1` (`MemberID`) USING BTREE,
  KEY `Organs_FK` (`MemberID`,`BloodGroup`),
  CONSTRAINT `Organs_FK` FOREIGN KEY (`MemberID`) REFERENCES `member` (`MemberID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`.`organs`
--

/*!40000 ALTER TABLE `organs` DISABLE KEYS */;
/*!40000 ALTER TABLE `organs` ENABLE KEYS */;


--
-- Table structure for table `project`.`request`
--

DROP TABLE IF EXISTS `request`;
CREATE TABLE `request` (
  `RequestID` int(15) NOT NULL DEFAULT '0',
  `MemberID` int(10) NOT NULL DEFAULT '0',
  `VolunteerID` int(10) NOT NULL DEFAULT '0',
  `MedicalID` varchar(50) NOT NULL DEFAULT '',
  `BloodGroup` varchar(5) NOT NULL DEFAULT '',
  `Type` varchar(500) NOT NULL DEFAULT '',
  `Detail` varchar(10000) NOT NULL DEFAULT '',
  `District` varchar(45) NOT NULL DEFAULT '',
  `City` varchar(45) NOT NULL DEFAULT '',
  `Date` date NOT NULL DEFAULT '0000-00-00',
  `ReqCon` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`RequestID`),
  KEY `Request_FK` (`MemberID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`.`request`
--

/*!40000 ALTER TABLE `request` DISABLE KEYS */;
/*!40000 ALTER TABLE `request` ENABLE KEYS */;


--
-- Table structure for table `project`.`volunteer`
--

DROP TABLE IF EXISTS `volunteer`;
CREATE TABLE `volunteer` (
  `VID` int(6) NOT NULL DEFAULT '0',
  `OrgRef` int(4) NOT NULL DEFAULT '0',
  `FName` varchar(50) NOT NULL,
  `LName` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL DEFAULT '',
  `Password` varchar(45) NOT NULL,
  `Contact` varchar(1000) NOT NULL,
  `VAddress` varchar(1000) DEFAULT NULL,
  `City` varchar(45) NOT NULL DEFAULT '',
  `District` varchar(45) NOT NULL DEFAULT '',
  `Login` int(30) DEFAULT NULL,
  PRIMARY KEY (`VID`,`Email`),
  KEY `Volunteer_FK` (`OrgRef`),
  CONSTRAINT `Volunteer_FK` FOREIGN KEY (`OrgRef`) REFERENCES `organization` (`OrgID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project`.`volunteer`
--

/*!40000 ALTER TABLE `volunteer` DISABLE KEYS */;
/*!40000 ALTER TABLE `volunteer` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
