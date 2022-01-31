/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 100411
 Source Host           : localhost:3306
 Source Schema         : examination

 Target Server Type    : MySQL
 Target Server Version : 100411
 File Encoding         : 65001

 Date: 30/01/2022 17:12:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for eye_info
-- ----------------------------
DROP TABLE IF EXISTS `eye_info`;
CREATE TABLE `eye_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `no` int(11) NOT NULL COMMENT '学号',
  `naked_vision_left` int(11) NOT NULL COMMENT '裸眼视力：左',
  `naked_vision_right` int(11) NOT NULL COMMENT '裸眼视力：右',
  `corrected_vision_left` int(11) NOT NULL COMMENT '矫正视力：左',
  `corrected_vision_right` int(11) NOT NULL COMMENT '矫正视力：右',
  `degree_left` int(11) NOT NULL COMMENT '左眼度数',
  `degree_right` int(11) NOT NULL COMMENT '右眼度数',
  `color_vision` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '色觉',
  `other` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '其他',
  `physician_opinion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '医师意见',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of eye_info
-- ----------------------------
INSERT INTO `eye_info` VALUES (1, 188206426, 22, 11, 51, 30, 300, 200, '单色不能辨', '无ddddddddddddddddddddddddddddddddddd', 'hhhhaaaaaaa');
INSERT INTO `eye_info` VALUES (2, 188206427, 49, 0, 50, 50, 1000, 0, '正常', '无', '无');
INSERT INTO `eye_info` VALUES (3, 188206428, 49, 0, 50, 50, 300, 200, '正常', '无', '无');
INSERT INTO `eye_info` VALUES (4, 188206429, 49, 50, 50, 50, 300, 100, '正常', '无', '无');
INSERT INTO `eye_info` VALUES (5, 188206430, 49, 50, 50, 50, 300, 200, '正常', '无', '无');

-- ----------------------------
-- Table structure for facial_features_info
-- ----------------------------
DROP TABLE IF EXISTS `facial_features_info`;
CREATE TABLE `facial_features_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `no` int(11) NOT NULL COMMENT '学号',
  `hearing_left` int(11) NOT NULL COMMENT '左耳听力，单位：米',
  `hearing_right` int(11) NOT NULL COMMENT '右耳听力，单位：米',
  `ear_infection` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '耳疾',
  `smell` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '嗅觉',
  `stutter` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '口吃',
  `other` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '其他',
  `physician_opinion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '医师意见',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of facial_features_info
-- ----------------------------
INSERT INTO `facial_features_info` VALUES (1, 188206426, 0, 61, '无', '正常', '其他', '无fasdfasdfasdfads', '无asdfasdfasdfdsf');
INSERT INTO `facial_features_info` VALUES (2, 188206427, 11, 61, '无', '正常', '无', '无', '无');
INSERT INTO `facial_features_info` VALUES (3, 188206428, 40, 61, '无', '正常', '其他', '无', '无');
INSERT INTO `facial_features_info` VALUES (4, 188206429, 49, 61, '无', '正常', '无', '无', '无');
INSERT INTO `facial_features_info` VALUES (5, 188206430, 49, 61, '无', '正常', '无', '无', '无');

-- ----------------------------
-- Table structure for general_info
-- ----------------------------
DROP TABLE IF EXISTS `general_info`;
CREATE TABLE `general_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `no` int(11) NOT NULL COMMENT '学号',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '姓名',
  `gender` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '性别',
  `birth_day` date NOT NULL COMMENT '出生日期',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '通信地址',
  `phone_no` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '联系电话',
  `school_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学校名称',
  `entry_time` date NOT NULL COMMENT '登记时间',
  `profile_photo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '头像',
  `medical_history` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '病史',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of general_info
-- ----------------------------
INSERT INTO `general_info` VALUES (1, 188206426, '张三', '女', '1969-12-30', '有一个地方asdf', '15879858281', '第五精神病院asdf', '2023-01-28', '188206426', '生而为人，我很抱歉');
INSERT INTO `general_info` VALUES (2, 188206427, '李四', '女', '1970-01-01', '有一个地方', '15879858281', '第五精神病院', '2021-11-28', '188206427', '生而为人，我很抱歉');
INSERT INTO `general_info` VALUES (3, 188206428, '王五', '男', '1970-01-01', '有一个地方', '15879858281', '第五精神病院', '2021-11-28', '', '生而为人，我很抱歉');
INSERT INTO `general_info` VALUES (4, 188206429, '赵六', '女', '1970-01-01', '有一个地方', '15879858281', '第五精神病院', '2021-11-28', '', '生而为人，我很抱');
INSERT INTO `general_info` VALUES (5, 188206430, '田七', '男', '1970-01-01', '有一个地方', '15879858281', '第五精神病院', '2021-11-28', '188206430', '生而为人，我很抱歉');

-- ----------------------------
-- Table structure for internal_info
-- ----------------------------
DROP TABLE IF EXISTS `internal_info`;
CREATE TABLE `internal_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `no` int(11) NOT NULL COMMENT '学号',
  `heart_rate` int(11) NOT NULL COMMENT '心率，单位：次/分',
  `blood_pressure_contract` int(11) NOT NULL COMMENT '收缩血压，单位：mmHg',
  `blood_pressure_diastole` int(11) NOT NULL COMMENT '舒张血压，单位：mmHg',
  `liver_function` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '肝功能',
  `nutritional_status` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '营养状况',
  `cardiovascular` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '心血管',
  `nerve` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '神经',
  `liver` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '肝',
  `lung` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '肺',
  `spleen` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '脾',
  `other` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '其他',
  `physician_opinion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '医师意见',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of internal_info
-- ----------------------------
INSERT INTO `internal_info` VALUES (1, 188206426, 80, 100, 80, '正常', '良好', '正常', '正常', '正常', '正常', '正常', '无', '无');
INSERT INTO `internal_info` VALUES (2, 188206427, 80, 100, 80, '其他', '一般', '其他', '其他', '其他', '其他', '其他', '无', '无');
INSERT INTO `internal_info` VALUES (3, 188206428, 800, 101, 50, '正常', '良好', '其他', '正常', '正常', '正常', '正常', '无asdfa', '无asdfsdfasd');
INSERT INTO `internal_info` VALUES (4, 188206429, 80, 100, 80, '正常', '良好', '正常', '正常', '正常', '正常', '正常', '无', '无');
INSERT INTO `internal_info` VALUES (5, 188206430, 80, 100, 80, '正常', '一般', '正常', '正常', '正常', '正常', '正常', '无', '无');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `news_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内容',
  `create_time` date NULL DEFAULT NULL COMMENT '新闻发布时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (1, '决战在“新冠重症高地”', '新冠肺炎阻击战中，在湖北武汉集中收治重症患者最多的定点医院——华中科技大学附属同济医院，由专业小分队组成的“尖刀连”，与来自全国的40支援鄂医疗队、5000余名精兵强将，并肩决战在“新冠重症高地”，拼命守护3000多名新冠肺炎重症、危重症患者的生命。', '2020-09-22');
INSERT INTO `news` VALUES (2, '铭记英雄，是为了勇毅前行', '铭记英雄，我们不能忘记生命至上、举国同心的精神传承。面对疫情，亿万中华儿女在以习近平同志为核心的党中央坚强领导下，高扬人民至上、生命至上的重要理念，凝聚起举国同心、同甘共苦的团结伟力，坚决打响疫情防控的人民战争、总体战、阻击战。白衣天使和疾控人员展现出侠骨丹心、英雄本色；战士舍身守护国家和人民，人民把最硬的“鳞”送到前线。这份疫情之下凝聚的合力，是我们不断从胜利走向胜利的力量源泉！', '2020-09-23');
INSERT INTO `news` VALUES (3, '疫情“暴风眼”里，“渐冻”之躯与时间赛跑 ', '“搞快点！搞快点！”在医院楼道里、病房里，大家常常听到张定宇的大嗓门。可伴随嗓门越来越大，他的脚步却越来越迟缓，跛行越来越严重。曾经，张定宇因为担心影响医护人员的工作和情绪而说是“自己膝关节不好”。可面对一遍遍追问，他终于承认说：“我得了渐冻症。”\r\n\r\n　　张定宇的病情让不少同事感到惊讶。“他明明走得好快！”金银潭医院北7病区护士长贾春敏说。有一次，张定宇打电话让她5分钟内到达病区，“他从办公室到北7楼比我远，等我到的时候，他已经在那儿了。平时他老跟不上我们，但他拼的时候，我们跟不上他。”贾春敏说。', '2020-11-10');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `permission` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '权限名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 63 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES (1, 1, 'info');
INSERT INTO `permission` VALUES (2, 1, 'generalInfo');
INSERT INTO `permission` VALUES (3, 1, 'eyeInfo');
INSERT INTO `permission` VALUES (4, 1, 'facialFeaturesInfo');
INSERT INTO `permission` VALUES (5, 1, 'internalInfo');
INSERT INTO `permission` VALUES (6, 1, 'surgeryInfo');
INSERT INTO `permission` VALUES (7, 1, 'resultInfo');
INSERT INTO `permission` VALUES (8, 1, 'chart');
INSERT INTO `permission` VALUES (9, 1, 'gender');
INSERT INTO `permission` VALUES (10, 1, 'degree');
INSERT INTO `permission` VALUES (11, 1, 'operation');
INSERT INTO `permission` VALUES (12, 1, 'printWord');
INSERT INTO `permission` VALUES (13, 1, 'upload');
INSERT INTO `permission` VALUES (14, 1, 'user');
INSERT INTO `permission` VALUES (15, 1, 'userInfo');
INSERT INTO `permission` VALUES (16, 1, 'editUserPwd');
INSERT INTO `permission` VALUES (17, 1, 'editAdminPwd');
INSERT INTO `permission` VALUES (18, 1, 'permission');
INSERT INTO `permission` VALUES (50, 2, 'info');
INSERT INTO `permission` VALUES (51, 2, 'generalInfo');
INSERT INTO `permission` VALUES (52, 2, 'eyeInfo');
INSERT INTO `permission` VALUES (53, 2, 'facialFeaturesInfo');
INSERT INTO `permission` VALUES (54, 2, 'internalInfo');
INSERT INTO `permission` VALUES (55, 2, 'surgeryInfo');
INSERT INTO `permission` VALUES (56, 2, 'resultInfo');
INSERT INTO `permission` VALUES (57, 2, 'chart');
INSERT INTO `permission` VALUES (58, 2, 'gender');
INSERT INTO `permission` VALUES (59, 2, 'degree');
INSERT INTO `permission` VALUES (60, 2, 'operation');
INSERT INTO `permission` VALUES (61, 2, 'print');
INSERT INTO `permission` VALUES (62, 2, 'upload');

-- ----------------------------
-- Table structure for result_info
-- ----------------------------
DROP TABLE IF EXISTS `result_info`;
CREATE TABLE `result_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `no` int(11) NOT NULL COMMENT '学号',
  `conclusion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '结论',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of result_info
-- ----------------------------
INSERT INTO `result_info` VALUES (1, 188206426, '正常', '无');
INSERT INTO `result_info` VALUES (2, 188206427, '123', '无123');
INSERT INTO `result_info` VALUES (3, 188206428, '正常', '无');
INSERT INTO `result_info` VALUES (4, 188206429, '正常', '无');
INSERT INTO `result_info` VALUES (5, 188206430, '正常也可能不正常', '无也可能有');

-- ----------------------------
-- Table structure for surgery_info
-- ----------------------------
DROP TABLE IF EXISTS `surgery_info`;
CREATE TABLE `surgery_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `no` int(11) NOT NULL COMMENT '学号',
  `height` int(11) NOT NULL COMMENT '身高，单位：cm',
  `weight` int(11) NOT NULL COMMENT '体重，单位：kg',
  `skin` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '皮肤',
  `limb` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '四肢',
  `lymph` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '淋巴',
  `joint` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关节',
  `spine` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '脊柱',
  `thyroid` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '甲状腺',
  `other` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '其他',
  `physician_opinion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '医师意见',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of surgery_info
-- ----------------------------
INSERT INTO `surgery_info` VALUES (1, 188206426, 110, 460, '正常', '其他', '其他', '其他', '正常', '其他', '无阿斯蒂芬', '阿斯顿法国红酒看来');
INSERT INTO `surgery_info` VALUES (2, 188206427, 175, 645, '正常', '正常', '正常', '正常', '正常', '正常', '无asdf', '无adf');
INSERT INTO `surgery_info` VALUES (3, 188206428, 175, 50, '正常', '正常', '正常', '正常', '正常', '正常', '无', '无');
INSERT INTO `surgery_info` VALUES (4, 188206429, 175, 50, '正常', '正常', '正常', '正常', '正常', '正常', '无', '无');
INSERT INTO `surgery_info` VALUES (5, 188206430, 175, 50, '正常', '正常', '正常', '正常', '正常', '正常', '无', '无');

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `login_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '登录名称',
  `login_ip` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '登录ip',
  `login_time` datetime(0) NULL DEFAULT NULL COMMENT '登录时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 130 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES (1, 'admin', '0:0:0:0:0:0:0:1', '2021-11-30 15:36:36');
INSERT INTO `sys_log` VALUES (2, 'admin', '127.0.0.1', '2021-11-30 15:39:33');
INSERT INTO `sys_log` VALUES (3, 'admin', '0:0:0:0:0:0:0:1', '2021-11-30 16:54:10');
INSERT INTO `sys_log` VALUES (4, 'admin', '127.0.0.1', '2021-11-30 17:30:50');
INSERT INTO `sys_log` VALUES (5, 'admin', '127.0.0.1', '2021-11-30 17:47:03');
INSERT INTO `sys_log` VALUES (6, 'admin', '127.0.0.1', '2021-11-30 18:42:43');
INSERT INTO `sys_log` VALUES (7, 'admin', '127.0.0.1', '2021-11-30 18:48:51');
INSERT INTO `sys_log` VALUES (8, 'admin', '127.0.0.1', '2021-11-30 18:58:46');
INSERT INTO `sys_log` VALUES (9, 'admin', '127.0.0.1', '2021-11-30 19:02:27');
INSERT INTO `sys_log` VALUES (10, 'admin', '0:0:0:0:0:0:0:1', '2021-11-30 19:09:52');
INSERT INTO `sys_log` VALUES (11, 'admin', '0:0:0:0:0:0:0:1', '2021-11-30 19:54:05');
INSERT INTO `sys_log` VALUES (12, 'admin', '127.0.0.1', '2021-11-30 20:46:42');
INSERT INTO `sys_log` VALUES (13, 'admin', '127.0.0.1', '2021-11-30 20:53:04');
INSERT INTO `sys_log` VALUES (14, 'admin', '127.0.0.1', '2021-12-01 09:44:43');
INSERT INTO `sys_log` VALUES (15, 'admin', '127.0.0.1', '2021-12-01 10:20:52');
INSERT INTO `sys_log` VALUES (16, 'admin', '0:0:0:0:0:0:0:1', '2021-12-01 12:07:50');
INSERT INTO `sys_log` VALUES (17, 'admin', '0:0:0:0:0:0:0:1', '2021-12-01 12:15:18');
INSERT INTO `sys_log` VALUES (18, 'admin', '127.0.0.1', '2022-01-16 16:23:15');
INSERT INTO `sys_log` VALUES (19, 'admin', '127.0.0.1', '2022-01-17 13:45:26');
INSERT INTO `sys_log` VALUES (20, 'admin', '127.0.0.1', '2022-01-17 13:50:44');
INSERT INTO `sys_log` VALUES (21, 'admin', '127.0.0.1', '2022-01-17 13:52:09');
INSERT INTO `sys_log` VALUES (22, 'admin', '127.0.0.1', '2022-01-17 13:57:32');
INSERT INTO `sys_log` VALUES (23, 'admin', '0:0:0:0:0:0:0:1', '2022-01-17 15:21:01');
INSERT INTO `sys_log` VALUES (24, 'admin', '127.0.0.1', '2022-01-17 15:29:58');
INSERT INTO `sys_log` VALUES (25, 'admin', '127.0.0.1', '2022-01-17 15:31:49');
INSERT INTO `sys_log` VALUES (26, 'admin', '127.0.0.1', '2022-01-17 15:34:09');
INSERT INTO `sys_log` VALUES (27, 'admin', '127.0.0.1', '2022-01-17 15:39:13');
INSERT INTO `sys_log` VALUES (28, 'admin', '127.0.0.1', '2022-01-17 15:44:26');
INSERT INTO `sys_log` VALUES (29, 'admin', '127.0.0.1', '2022-01-17 15:46:31');
INSERT INTO `sys_log` VALUES (30, 'admin', '127.0.0.1', '2022-01-17 15:47:54');
INSERT INTO `sys_log` VALUES (31, 'admin', '127.0.0.1', '2022-01-17 16:00:34');
INSERT INTO `sys_log` VALUES (32, 'admin', '127.0.0.1', '2022-01-17 16:08:25');
INSERT INTO `sys_log` VALUES (33, 'admin', '127.0.0.1', '2022-01-17 17:07:39');
INSERT INTO `sys_log` VALUES (34, 'admin', '127.0.0.1', '2022-01-17 17:12:40');
INSERT INTO `sys_log` VALUES (35, 'admin', '127.0.0.1', '2022-01-17 17:15:14');
INSERT INTO `sys_log` VALUES (36, 'admin', '127.0.0.1', '2022-01-17 17:18:53');
INSERT INTO `sys_log` VALUES (37, 'admin', '0:0:0:0:0:0:0:1', '2022-01-17 17:23:50');
INSERT INTO `sys_log` VALUES (38, 'admin', '127.0.0.1', '2022-01-17 18:13:46');
INSERT INTO `sys_log` VALUES (39, 'admin', '127.0.0.1', '2022-01-18 12:05:56');
INSERT INTO `sys_log` VALUES (40, 'admin', '0:0:0:0:0:0:0:1', '2022-01-18 14:12:08');
INSERT INTO `sys_log` VALUES (41, 'admin', '127.0.0.1', '2022-01-18 15:51:56');
INSERT INTO `sys_log` VALUES (42, 'admin', '127.0.0.1', '2022-01-18 16:23:29');
INSERT INTO `sys_log` VALUES (43, 'admin', '127.0.0.1', '2022-01-18 16:24:59');
INSERT INTO `sys_log` VALUES (44, 'admin', '127.0.0.1', '2022-01-18 16:26:21');
INSERT INTO `sys_log` VALUES (45, 'zhangsan', '127.0.0.1', '2022-01-18 16:32:17');
INSERT INTO `sys_log` VALUES (46, 'admin', '127.0.0.1', '2022-01-18 16:46:25');
INSERT INTO `sys_log` VALUES (47, 'zhangsan', '127.0.0.1', '2022-01-18 16:48:17');
INSERT INTO `sys_log` VALUES (48, 'admin', '127.0.0.1', '2022-01-18 16:48:57');
INSERT INTO `sys_log` VALUES (49, 'admin', '0:0:0:0:0:0:0:1', '2022-01-18 20:57:33');
INSERT INTO `sys_log` VALUES (50, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 12:25:02');
INSERT INTO `sys_log` VALUES (51, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 14:51:39');
INSERT INTO `sys_log` VALUES (52, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 14:57:59');
INSERT INTO `sys_log` VALUES (53, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 15:00:43');
INSERT INTO `sys_log` VALUES (54, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 15:02:20');
INSERT INTO `sys_log` VALUES (55, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 15:12:15');
INSERT INTO `sys_log` VALUES (56, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 15:20:17');
INSERT INTO `sys_log` VALUES (57, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 15:21:48');
INSERT INTO `sys_log` VALUES (58, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 15:26:49');
INSERT INTO `sys_log` VALUES (59, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 15:30:00');
INSERT INTO `sys_log` VALUES (60, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 15:33:11');
INSERT INTO `sys_log` VALUES (61, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 15:38:18');
INSERT INTO `sys_log` VALUES (62, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 15:44:11');
INSERT INTO `sys_log` VALUES (63, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 15:48:23');
INSERT INTO `sys_log` VALUES (64, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 15:55:23');
INSERT INTO `sys_log` VALUES (65, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 16:20:41');
INSERT INTO `sys_log` VALUES (66, 'admin', '127.0.0.1', '2022-01-19 20:41:26');
INSERT INTO `sys_log` VALUES (67, 'admin', '0:0:0:0:0:0:0:1', '2022-01-19 21:45:14');
INSERT INTO `sys_log` VALUES (68, 'admin', '0:0:0:0:0:0:0:1', '2022-01-20 20:13:12');
INSERT INTO `sys_log` VALUES (69, 'admin', '0:0:0:0:0:0:0:1', '2022-01-21 19:29:12');
INSERT INTO `sys_log` VALUES (70, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 11:46:28');
INSERT INTO `sys_log` VALUES (71, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 18:47:23');
INSERT INTO `sys_log` VALUES (72, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 20:06:31');
INSERT INTO `sys_log` VALUES (73, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 20:09:30');
INSERT INTO `sys_log` VALUES (74, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 20:13:30');
INSERT INTO `sys_log` VALUES (75, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 20:15:53');
INSERT INTO `sys_log` VALUES (76, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 20:18:36');
INSERT INTO `sys_log` VALUES (77, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 20:23:07');
INSERT INTO `sys_log` VALUES (78, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 20:28:59');
INSERT INTO `sys_log` VALUES (79, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 20:35:17');
INSERT INTO `sys_log` VALUES (80, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 20:43:08');
INSERT INTO `sys_log` VALUES (81, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 20:45:51');
INSERT INTO `sys_log` VALUES (82, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 20:48:05');
INSERT INTO `sys_log` VALUES (83, 'admin', '0:0:0:0:0:0:0:1', '2022-01-22 21:30:50');
INSERT INTO `sys_log` VALUES (84, 'admin', '0:0:0:0:0:0:0:1', '2022-01-24 15:05:49');
INSERT INTO `sys_log` VALUES (85, 'admin', '0:0:0:0:0:0:0:1', '2022-01-24 15:32:08');
INSERT INTO `sys_log` VALUES (86, 'admin', '0:0:0:0:0:0:0:1', '2022-01-24 16:40:30');
INSERT INTO `sys_log` VALUES (87, 'admin', '127.0.0.1', '2022-01-24 17:30:55');
INSERT INTO `sys_log` VALUES (88, 'admin', '127.0.0.1', '2022-01-24 17:37:28');
INSERT INTO `sys_log` VALUES (89, 'admin', '127.0.0.1', '2022-01-24 17:39:13');
INSERT INTO `sys_log` VALUES (90, 'admin', '127.0.0.1', '2022-01-24 17:44:31');
INSERT INTO `sys_log` VALUES (91, 'admin', '127.0.0.1', '2022-01-24 17:55:46');
INSERT INTO `sys_log` VALUES (92, 'admin', '0:0:0:0:0:0:0:1', '2022-01-25 15:15:38');
INSERT INTO `sys_log` VALUES (93, 'admin', '0:0:0:0:0:0:0:1', '2022-01-25 15:19:13');
INSERT INTO `sys_log` VALUES (94, 'admin', '0:0:0:0:0:0:0:1', '2022-01-25 18:30:39');
INSERT INTO `sys_log` VALUES (95, 'admin', '0:0:0:0:0:0:0:1', '2022-01-25 18:53:55');
INSERT INTO `sys_log` VALUES (96, 'admin', '0:0:0:0:0:0:0:1', '2022-01-25 19:02:03');
INSERT INTO `sys_log` VALUES (97, 'admin', '0:0:0:0:0:0:0:1', '2022-01-25 19:13:43');
INSERT INTO `sys_log` VALUES (98, 'admin', '0:0:0:0:0:0:0:1', '2022-01-25 19:15:27');
INSERT INTO `sys_log` VALUES (99, 'admin', '0:0:0:0:0:0:0:1', '2022-01-25 19:59:12');
INSERT INTO `sys_log` VALUES (100, 'admin', '0:0:0:0:0:0:0:1', '2022-01-25 20:05:47');
INSERT INTO `sys_log` VALUES (101, 'zhangsan', '0:0:0:0:0:0:0:1', '2022-01-25 20:24:11');
INSERT INTO `sys_log` VALUES (102, 'admin', '0:0:0:0:0:0:0:1', '2022-01-25 20:24:50');
INSERT INTO `sys_log` VALUES (103, 'admin', '0:0:0:0:0:0:0:1', '2022-01-25 21:01:14');
INSERT INTO `sys_log` VALUES (104, 'admin', '0:0:0:0:0:0:0:1', '2022-01-25 21:09:10');
INSERT INTO `sys_log` VALUES (105, 'admin', '0:0:0:0:0:0:0:1', '2022-01-26 19:34:59');
INSERT INTO `sys_log` VALUES (106, 'admin', '0:0:0:0:0:0:0:1', '2022-01-26 20:44:09');
INSERT INTO `sys_log` VALUES (107, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 14:21:03');
INSERT INTO `sys_log` VALUES (108, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 14:21:49');
INSERT INTO `sys_log` VALUES (109, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 15:38:21');
INSERT INTO `sys_log` VALUES (110, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 15:49:31');
INSERT INTO `sys_log` VALUES (111, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 15:53:50');
INSERT INTO `sys_log` VALUES (112, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 15:54:50');
INSERT INTO `sys_log` VALUES (113, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 16:25:25');
INSERT INTO `sys_log` VALUES (114, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 16:41:43');
INSERT INTO `sys_log` VALUES (115, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 16:42:17');
INSERT INTO `sys_log` VALUES (116, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 17:23:43');
INSERT INTO `sys_log` VALUES (117, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 17:45:33');
INSERT INTO `sys_log` VALUES (118, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 17:48:32');
INSERT INTO `sys_log` VALUES (119, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 17:55:07');
INSERT INTO `sys_log` VALUES (120, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 17:59:39');
INSERT INTO `sys_log` VALUES (121, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 18:07:57');
INSERT INTO `sys_log` VALUES (122, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 18:23:52');
INSERT INTO `sys_log` VALUES (123, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 18:26:44');
INSERT INTO `sys_log` VALUES (124, 'admin', '0:0:0:0:0:0:0:1', '2022-01-28 18:55:39');
INSERT INTO `sys_log` VALUES (125, 'admin', '0:0:0:0:0:0:0:1', '2022-01-29 14:20:00');
INSERT INTO `sys_log` VALUES (126, 'admin', '0:0:0:0:0:0:0:1', '2022-01-29 22:06:10');
INSERT INTO `sys_log` VALUES (127, 'admin', '0:0:0:0:0:0:0:1', '2022-01-29 23:14:43');
INSERT INTO `sys_log` VALUES (128, 'admin', '0:0:0:0:0:0:0:1', '2022-01-29 23:19:04');
INSERT INTO `sys_log` VALUES (129, 'admin', '0:0:0:0:0:0:0:1', '2022-01-30 16:25:29');

-- ----------------------------
-- Table structure for theme
-- ----------------------------
DROP TABLE IF EXISTS `theme`;
CREATE TABLE `theme`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `site_theme` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '主题',
  `logo_bg` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'logo',
  `header_bg` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '头部',
  `sidebar_bg` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '侧边栏',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 35 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of theme
-- ----------------------------
INSERT INTO `theme` VALUES (1, 'admin', 'default', 'default', 'default', 'default');
INSERT INTO `theme` VALUES (2, 'zhangsan', 'default', 'default', 'default', 'default');
INSERT INTO `theme` VALUES (33, 'zhangsan', 'default', 'default', 'default', 'default');
INSERT INTO `theme` VALUES (34, 'lisi', 'default', 'default', 'default', 'default');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户密码',
  `role` int(11) NOT NULL COMMENT '用户角色：1代表管理员',
  `status` int(11) NOT NULL COMMENT '用户状态：1代表在线',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '83ab62dd6f6d8a2c858e8764cb128b9e', 1, 1);
INSERT INTO `user` VALUES (2, 'zhangsan', '83ab62dd6f6d8a2c858e8764cb128b9e', 2, 0);

-- ----------------------------
-- Triggers structure for table general_info
-- ----------------------------
DROP TRIGGER IF EXISTS `info_update`;
delimiter ;;
CREATE TRIGGER `info_update` AFTER UPDATE ON `general_info` FOR EACH ROW begin
	if(old.no != new.no) 
	then
	update eye_info set no = new.no where no = old.no;
	update facial_features_info set no = new.no where no = old.no;
	update internal_info set no = new.no where no = old.no;
	update result_info set no = new.no where no = old.no;
	update surgery_info set no = new.no where no = old.no;
	end if;
	end
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table general_info
-- ----------------------------
DROP TRIGGER IF EXISTS `info_delete`;
delimiter ;;
CREATE TRIGGER `info_delete` AFTER DELETE ON `general_info` FOR EACH ROW begin
	delete from eye_info where no = old.no;
	delete from facial_features_info where no = old.no;
	delete from internal_info where no = old.no;
	delete from result_info where no = old.no;
	delete from surgery_info where no = old.no;
	end
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
