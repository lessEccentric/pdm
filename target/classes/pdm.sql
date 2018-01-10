/*
Navicat MySQL Data Transfer

Source Server         : 本地连接
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : pdm

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2017-12-18 10:37:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bc_decidedzone
-- ----------------------------
DROP TABLE IF EXISTS `bc_decidedzone`;
CREATE TABLE `bc_decidedzone` (
  `id` varchar(32) NOT NULL,
  `staff_id` varchar(32) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK66A3C8AACE7FA31C` (`staff_id`),
  CONSTRAINT `FK66A3C8AACE7FA31C` FOREIGN KEY (`staff_id`) REFERENCES `bc_staff` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bc_decidedzone
-- ----------------------------

-- ----------------------------
-- Table structure for bc_region
-- ----------------------------
DROP TABLE IF EXISTS `bc_region`;
CREATE TABLE `bc_region` (
  `id` varchar(32) NOT NULL,
  `province` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `district` varchar(50) DEFAULT NULL,
  `postcode` varchar(50) DEFAULT NULL,
  `shortcode` varchar(30) DEFAULT NULL,
  `citycode` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bc_region
-- ----------------------------

-- ----------------------------
-- Table structure for bc_staff
-- ----------------------------
DROP TABLE IF EXISTS `bc_staff`;
CREATE TABLE `bc_staff` (
  `id` varchar(32) NOT NULL,
  `standard_id` varchar(32) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `haspda` varchar(1) DEFAULT NULL,
  `deltag` varchar(1) DEFAULT NULL,
  `station` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKE1E33D6250DE6BF8` (`standard_id`),
  CONSTRAINT `FKE1E33D6250DE6BF8` FOREIGN KEY (`standard_id`) REFERENCES `bc_standard` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bc_staff
-- ----------------------------

-- ----------------------------
-- Table structure for bc_standard
-- ----------------------------
DROP TABLE IF EXISTS `bc_standard`;
CREATE TABLE `bc_standard` (
  `id` varchar(32) NOT NULL,
  `user_id` varchar(32) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `minweight` double DEFAULT NULL,
  `maxweight` double DEFAULT NULL,
  `deltag` varchar(1) DEFAULT NULL,
  `updatetime` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKCB957CFB9A78E6AE` (`user_id`),
  CONSTRAINT `FKCB957CFB9A78E6AE` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bc_standard
-- ----------------------------
INSERT INTO `bc_standard` VALUES ('297eeceb60551c900160551f06bb0000', '0e2dj3i50k7e4g5pk901', '10-20公斤', '10', '20', '0', '2017-12-15 16:52:11');
INSERT INTO `bc_standard` VALUES ('297eeceb605906010160592926500000', '0e2dj3i50k7e4g5pk901', '5-10', '5', '10', '0', '2017-12-15 15:52:37');
INSERT INTO `bc_standard` VALUES ('297eeceb605906010160592957310001', '0e2dj3i50k7e4g5pk901', '50-100', '50', '100', '0', '2017-12-15 15:52:49');
INSERT INTO `bc_standard` VALUES ('297eeceb6059539201605954a8990000', '0e2dj3i50k7e4g5pk901', '100-500', '100', '500', '0', '2017-12-15 16:40:08');

-- ----------------------------
-- Table structure for bc_subarea
-- ----------------------------
DROP TABLE IF EXISTS `bc_subarea`;
CREATE TABLE `bc_subarea` (
  `id` varchar(32) NOT NULL,
  `decidedzone_id` varchar(32) DEFAULT NULL,
  `region_id` varchar(32) DEFAULT NULL,
  `addresskey` varchar(100) DEFAULT NULL,
  `startnum` varchar(30) DEFAULT NULL,
  `endnum` varchar(30) DEFAULT NULL,
  `single` varchar(1) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKF7CA50CF9782AC18` (`region_id`),
  KEY `FKF7CA50CF245070BC` (`decidedzone_id`),
  CONSTRAINT `FKF7CA50CF245070BC` FOREIGN KEY (`decidedzone_id`) REFERENCES `bc_decidedzone` (`id`),
  CONSTRAINT `FKF7CA50CF9782AC18` FOREIGN KEY (`region_id`) REFERENCES `bc_region` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bc_subarea
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `station` varchar(40) DEFAULT NULL,
  `telephone` varchar(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('0e2dj3i50k7e4g5pk901', 'admin', '21232f297a57a5a743894a0e4a801fc3', null, null, null, null, null, null);

