/*
 Navicat Premium Data Transfer

 Source Server         : local-mysql
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 17/04/2018 15:51:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `setdate` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `defaultdate` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'tuozixuan5', 18, '123456', '2018-04-17 14:10:34', '2018-04-17 14:10:34');
INSERT INTO `user` VALUES (2, 'tester2', 20, '123456', '2018-04-17 09:59:23', '2018-04-17 09:59:25');
INSERT INTO `user` VALUES (3, 'bing', 20, '123456', '2018-04-17 09:59:27', '2018-04-17 09:59:30');
INSERT INTO `user` VALUES (21, 'test-update', 100, '9999', '2019-02-13 03:33:20', '2019-02-13 03:33:20');
INSERT INTO `user` VALUES (22, 'tester', 11, '123456', '2017-07-14 10:40:00', '2018-04-17 14:43:57');
