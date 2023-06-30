-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Sep 07, 2022 at 02:51 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `grocerymanagementsystemreplaced`
--
CREATE DATABASE IF NOT EXISTS `grocerymanagementsystemreplaced` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `grocerymanagementsystemreplaced`;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `Pro_id` varchar(20) NOT NULL,
  `Pro_name` varchar(50) NOT NULL,
  `Pro_category` varchar(20) NOT NULL,
  `Pro_costprice` double NOT NULL,
  `Pro_sellprice` double NOT NULL,
  `Pro_quantity` int(10) NOT NULL,
  `Pro_suplier` varchar(50) NOT NULL,
  `Pro_date` date NOT NULL,
  PRIMARY KEY (`Pro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`Pro_id`, `Pro_name`, `Pro_category`, `Pro_costprice`, `Pro_sellprice`, `Pro_quantity`, `Pro_suplier`, `Pro_date`) VALUES
('P001', 'coca coca', 'Drink', 75, 80, 40, 'Kasun', '2020-09-03'),
('P002', 'Fanta', 'Drink', 90, 100, 40, 'Kasun', '2022-09-03'),
('P003', 'pepci', 'Drink', 190, 190, 40, 'Kasun', '2022-09-03');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
