-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2020 at 02:40 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `learnersacademy`
--

-- --------------------------------------------------------

--
-- Table structure for table `classes`
--

CREATE TABLE `classes` (
  `classID` int(10) NOT NULL,
  `className` varchar(30) NOT NULL,
  `subjectCode` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `classes`
--

INSERT INTO `classes` (`classID`, `className`, `subjectCode`) VALUES
(1, 'V', 'LA_FIVE'),
(2, 'VI', 'LA_SIX'),
(3, 'VII', 'LA_SEVEN'),
(4, 'VIII', 'LA_EIGHT'),
(5, 'IX', 'LA_NINE'),
(6, 'X', 'LA_TEN');

-- --------------------------------------------------------

--
-- Table structure for table `studentmaster`
--

CREATE TABLE `studentmaster` (
  `studentID` int(10) NOT NULL,
  `studentName` varchar(30) NOT NULL,
  `studentClass` varchar(5) NOT NULL,
  `subjectCode` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentmaster`
--

INSERT INTO `studentmaster` (`studentID`, `studentName`, `studentClass`, `subjectCode`) VALUES
(1, 'Vinay Madugula', 'IX', 'LA_NINE'),
(4, 'Mahesh Paliwal', 'VIII', 'LA_EIGHT'),
(5, 'Ajay Kumar', 'VIII', 'LA_EIGHT'),
(6, 'Roshan Giri', 'VIII', 'LA_EIGHT'),
(7, 'Rohit Ahuja', 'VIII', 'LA_EIGHT'),
(8, 'Keerthana Umesh', 'VIII', 'LA_EIGHT'),
(9, 'Gokula Annamalai', 'IX', 'LA_NINE'),
(14, 'Tom Olsen', 'V', 'LA_FIVE'),
(15, 'Samantha Doherthy', 'V', 'LA_FIVE'),
(16, 'Ganesh Mittal', 'V', 'LA_FIVE'),
(17, 'Arjun Srinivasan', 'IX', 'LA_NINE'),
(18, 'Paranthaman Shivaramakrishnan', 'VII', 'LA_SEVEN'),
(19, 'Zara Ali', 'VI', 'LA_SIX'),
(22, 'Megha Sethia', 'VI', 'LA_SIX'),
(23, 'Shubham Shetia', 'VI', 'LA_SIX'),
(24, 'Sourav Malik', 'VI', 'LA_SIX'),
(25, 'Dinesh Solanki', 'VII', 'LA_SEVEN'),
(26, 'Supreet Mishra', 'VII', 'LA_SEVEN');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `subjectID` int(10) NOT NULL,
  `subjectName` varchar(30) NOT NULL,
  `subjectClass` varchar(20) NOT NULL,
  `subjectCode` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`subjectID`, `subjectName`, `subjectClass`, `subjectCode`) VALUES
(1, 'English', 'V', 'LA_FIVE'),
(2, 'History', 'V', 'LA_FIVE'),
(3, 'Geography', 'V', 'LA_FIVE'),
(4, 'Social Science', 'V', 'LA_FIVE'),
(5, 'English', 'VI', 'LA_SIX'),
(6, 'Mathematics', 'VI', 'LA_SIX'),
(7, 'History', 'VI', 'LA_SIX'),
(8, 'Geography', 'VI', 'LA_SIX');

-- --------------------------------------------------------

--
-- Table structure for table `teachers`
--

CREATE TABLE `teachers` (
  `teacherID` int(10) NOT NULL,
  `teacherName` varchar(30) NOT NULL,
  `teacherQualification` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teachers`
--

INSERT INTO `teachers` (`teacherID`, `teacherName`, `teacherQualification`) VALUES
(1, 'Nilesh Mehra', 'M.SC in Mathematics');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `classes`
--
ALTER TABLE `classes`
  ADD PRIMARY KEY (`classID`);

--
-- Indexes for table `studentmaster`
--
ALTER TABLE `studentmaster`
  ADD PRIMARY KEY (`studentID`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`subjectID`);

--
-- Indexes for table `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`teacherID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `classes`
--
ALTER TABLE `classes`
  MODIFY `classID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `studentmaster`
--
ALTER TABLE `studentmaster`
  MODIFY `studentID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `subjects`
--
ALTER TABLE `subjects`
  MODIFY `subjectID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `teachers`
--
ALTER TABLE `teachers`
  MODIFY `teacherID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
