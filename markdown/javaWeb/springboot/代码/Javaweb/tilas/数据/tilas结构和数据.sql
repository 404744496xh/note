/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 80036
 Source Host           : localhost:3306
 Source Schema         : tilas

 Target Server Type    : MySQL
 Target Server Version : 80036
 File Encoding         : 65001

 Date: 05/04/2024 21:52:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '部门名称',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `name`(`name` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '部门表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '学工部', '2024-03-05 14:30:02', '2024-03-05 14:30:02');
INSERT INTO `dept` VALUES (3, '咨询部', '2024-03-05 14:30:02', '2024-03-05 14:30:02');
INSERT INTO `dept` VALUES (4, '就业部', '2024-03-05 14:30:02', '2024-03-05 14:30:02');
INSERT INTO `dept` VALUES (5, '人事部', '2024-03-05 14:30:02', '2024-03-05 14:30:02');

-- ----------------------------
-- Table structure for dept_log
-- ----------------------------
DROP TABLE IF EXISTS `dept_log`;
CREATE TABLE `dept_log`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `create_time` datetime NULL DEFAULT NULL COMMENT '操作时间',
  `description` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '操作描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '部门操作日志表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept_log
-- ----------------------------
INSERT INTO `dept_log` VALUES (1, '2024-03-21 17:33:55', '执行了解散部门的操作，此次解散的部门是2号部门');

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '123456' COMMENT '密码',
  `name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '姓名',
  `gender` tinyint UNSIGNED NOT NULL COMMENT '性别, 说明: 1 男, 2 女',
  `image` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '图像',
  `job` tinyint UNSIGNED NULL DEFAULT NULL COMMENT '职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师',
  `entrydate` date NULL DEFAULT NULL COMMENT '入职时间',
  `dept_id` int UNSIGNED NULL DEFAULT NULL COMMENT '部门ID',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '员工表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (1, 'jinyong', '123456', '金庸', 1, '1.jpg', 4, '2000-01-01', 2, '2024-03-26 18:02:21', '2024-03-26 18:02:21');
INSERT INTO `emp` VALUES (2, 'zhangwuji', '123456', '张无忌', 2, 'https://my-web-tilas99.oss-cn-beijing.aliyuncs.com/c3e2d424-b7e8-4533-a6bc-08234db0713d.jpg', 0, '2015-01-01', 0, '2024-03-05 14:30:02', '2024-03-06 21:41:18');
INSERT INTO `emp` VALUES (6, 'xiaozhao', '123456', '小昭', 2, '6.jpg', 3, '2013-09-05', 1, '2024-03-05 14:30:02', '2024-03-05 14:30:02');
INSERT INTO `emp` VALUES (7, 'jixiaofu', '123456', '纪晓芙', 2, '7.jpg', 1, '2005-08-01', 1, '2024-03-05 14:30:02', '2024-03-05 14:30:02');
INSERT INTO `emp` VALUES (8, 'zhouzhiruo', '123456', '周芷若', 2, '8.jpg', 1, '2014-11-09', 1, '2024-03-05 14:30:02', '2024-03-05 14:30:02');
INSERT INTO `emp` VALUES (9, 'dingminjun', '123456', '丁敏君', 2, '9.jpg', 1, '2011-03-11', 1, '2024-03-05 14:30:02', '2024-03-05 14:30:02');
INSERT INTO `emp` VALUES (10, 'zhaomin', '123456', '赵敏', 2, '10.jpg', 1, '2013-09-05', 1, '2024-03-05 14:30:02', '2024-03-05 14:30:02');
INSERT INTO `emp` VALUES (11, 'luzhangke', '123456', '鹿杖客', 1, '11.jpg', 5, '2007-02-01', 3, '2024-03-05 14:30:02', '2024-03-05 14:30:02');
INSERT INTO `emp` VALUES (12, 'hebiweng', '123456', '鹤笔翁', 1, '12.jpg', 5, '2008-08-18', 3, '2024-03-05 14:30:02', '2024-03-05 14:30:02');
INSERT INTO `emp` VALUES (13, 'fangdongbai', '123456', '方东白', 1, '13.jpg', 5, '2012-11-01', 3, '2024-03-05 14:30:02', '2024-03-05 14:30:02');
INSERT INTO `emp` VALUES (18, 'x\'x', '123456', 'xh', 1, 'https://my-web-tilas99.oss-cn-beijing.aliyuncs.com/ef4e3268-fd5b-4baf-bc6b-5384c497deb7.jpg', 1, '2024-04-01', 3, '2024-03-06 18:09:45', '2024-03-06 18:10:27');
INSERT INTO `emp` VALUES (19, 'linpingzhi', '123456', '林平之', 1, 'https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-03-07-37-38222.jpg', 1, '2022-09-18', 1, '2024-03-06 20:57:20', '2024-03-06 20:57:20');
INSERT INTO `emp` VALUES (21, 'gaf', '123456', 'fa', 1, '', 1, '2024-03-25', 4, '2024-03-06 21:16:23', '2024-03-06 21:16:23');
INSERT INTO `emp` VALUES (22, 'test1', '123456', 'test1', 1, '', 1, '2024-04-30', 4, '2024-04-05 21:44:27', '2024-04-05 21:44:27');

-- ----------------------------
-- Table structure for operate_log
-- ----------------------------
DROP TABLE IF EXISTS `operate_log`;
CREATE TABLE `operate_log`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `operate_user` int UNSIGNED NULL DEFAULT NULL COMMENT '操作人ID',
  `operate_time` datetime NULL DEFAULT NULL COMMENT '操作时间',
  `class_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '操作的类名',
  `method_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '操作的方法名',
  `method_params` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '方法参数',
  `return_value` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '返回值',
  `cost_time` bigint NULL DEFAULT NULL COMMENT '方法执行耗时, 单位:ms',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '操作日志表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of operate_log
-- ----------------------------
INSERT INTO `operate_log` VALUES (1, 1, '2024-04-05 21:44:27', 'com.example.tliaswebmanagement.controller.EmpController', 'save', '[Emp(id=0, username=test1, password=null, name=test1, gender=1, image=, job=1, entrydate=2024-04-30, deptId=4, createTime=null, updateTime=null)]', '{\"code\":1,\"msg\":\"success\"}', 10);

SET FOREIGN_KEY_CHECKS = 1;
