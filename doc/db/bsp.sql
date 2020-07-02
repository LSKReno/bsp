/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : bsp

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 02/07/2020 15:08:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for brd_brand
-- ----------------------------
DROP TABLE IF EXISTS `brd_brand`;
CREATE TABLE `brd_brand`  (
  `BRD_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `MAN_ID` int(11) NULL DEFAULT NULL COMMENT '公司信息，外键关联man表主键\r\n',
  `NAME_EN` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司名称（英文）\r\n',
  `NAME_CN` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司名称（中文）\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`BRD_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for cdm_code_master
-- ----------------------------
DROP TABLE IF EXISTS `cdm_code_master`;
CREATE TABLE `cdm_code_master`  (
  `CDM_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `CODE_TYPE` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '字典类型\r\n',
  `DESCRIPTION` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用途描述\r\n',
  `TYPE_CD` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '编码\r\n',
  `CODE_VAL` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '编码值\r\n',
  `SEQ_NO` int(11) NULL DEFAULT NULL COMMENT '排序\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`CDM_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for drp_dropship_price
-- ----------------------------
DROP TABLE IF EXISTS `drp_dropship_price`;
CREATE TABLE `drp_dropship_price`  (
  `DRP_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `OFP_ID` int(11) NULL DEFAULT NULL COMMENT '商品价格ID\r\n',
  `DSR_ID` int(11) NULL DEFAULT NULL COMMENT '借卖方ID\r\n',
  `WAR_ID` int(11) NULL DEFAULT NULL COMMENT '仓库ID\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`DRP_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for dsr_dropshipper
-- ----------------------------
DROP TABLE IF EXISTS `dsr_dropshipper`;
CREATE TABLE `dsr_dropshipper`  (
  `DSR_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `NAME` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '借卖方名称\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `REGISTER_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '注册时间\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`DSR_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for eba_ebay_authorization
-- ----------------------------
DROP TABLE IF EXISTS `eba_ebay_authorization`;
CREATE TABLE `eba_ebay_authorization`  (
  `EBA_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `STR_ID` int(11) NULL DEFAULT NULL COMMENT '网店ID\r\n',
  `APP_ID` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'ebay账号ID\r\n',
  `SECRET_KEY` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'ebay密钥\r\n',
  `TOKEN` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT 'ebay TOKEN\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `EXP_DATE` datetime(0) NULL DEFAULT NULL COMMENT 'token失效时间\r\n',
  `CANCLE_DATE` datetime(0) NULL DEFAULT NULL COMMENT '取消授权时间\r\n',
  `ACCOUNT_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户id\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`EBA_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for goa_government_area
-- ----------------------------
DROP TABLE IF EXISTS `goa_government_area`;
CREATE TABLE `goa_government_area`  (
  `GOA_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id\r\n',
  `ZIP_CODE` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮编\r\n',
  `STATE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '洲\r\n',
  `STATE_SHORTHAND` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '洲简称\r\n',
  `CITY` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '城市\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '数据有效性\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`GOA_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for img_image
-- ----------------------------
DROP TABLE IF EXISTS `img_image`;
CREATE TABLE `img_image`  (
  `IMG_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `NAME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名字\r\n',
  `WIDTH` int(11) NULL DEFAULT NULL COMMENT '图片宽，pixel\r\n',
  `HEIGHT` int(11) NULL DEFAULT NULL COMMENT '图片高，pixel\r\n',
  `URI` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片地址\r\n',
  `TYPE_CD` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'O - 原图 M - 中图 （用于列表) L - 大图 (用于详情页) M2 - 中图(2x) L2 - 大图(2x)\r\n',
  `ENTITY_ID` int(11) NULL DEFAULT NULL COMMENT '关联表的主键id\r\n',
  `ENTITY_CD` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '关联自定义的code\r\n',
  `SEQ_NO` int(11) NULL DEFAULT NULL COMMENT '如果一个产品有多图时，要按小到大的顺序进行显示\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`IMG_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for man_manufacturer
-- ----------------------------
DROP TABLE IF EXISTS `man_manufacturer`;
CREATE TABLE `man_manufacturer`  (
  `MAN_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，制造商ID',
  `NAME_EN` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '制造商英文名',
  `NAME_CN` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '制造商中文名',
  `GMC_REPORT_TYPE` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '品牌商认证类型 1-TÜV,2-UL',
  `GMC_REPORT_URL` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '证书地址',
  `DESCRIPTION` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '品牌商公司介绍',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`MAN_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of man_manufacturer
-- ----------------------------
INSERT INTO `man_manufacturer` VALUES (1, '1', '环球制造商1', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for mor_monitor_result
-- ----------------------------
DROP TABLE IF EXISTS `mor_monitor_result`;
CREATE TABLE `mor_monitor_result`  (
  `MOR_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `CLASS_NAME` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '类名\r\n',
  `JSON_STRING` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'Json字符串\r\n',
  `CREATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `CREATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间\r\n',
  `UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '描述\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`MOR_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ofp_offer_price
-- ----------------------------
DROP TABLE IF EXISTS `ofp_offer_price`;
CREATE TABLE `ofp_offer_price`  (
  `OFP_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `MAN_ID` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '制造商ID\r\n',
  `EFFETIVE_START_DATE` datetime(0) NULL DEFAULT NULL COMMENT '价格有效期开始时间\r\n',
  `EFFECTIVE_END_DATE` datetime(0) NULL DEFAULT NULL COMMENT '价格有效期结束时间\r\n',
  `PRO_ID` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品ID 外键关联pro表\r\n',
  `PRICE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '单价\r\n',
  `TYPE_CD` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '对应master表的PRICE_TYPE PUB - 公开借卖价 PRO - 促销价 VIP - 专享价\r\n',
  `DSR_ID` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '借卖方id，关联专享价用，其他类型该字段为空\r\n',
  `CREATED_BY` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` datetime(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` datetime(0) NULL DEFAULT NULL COMMENT '更新人\r\n',
  `LAST_UPDATE_DATE` datetime(0) NULL DEFAULT NULL COMMENT '更新时间\r\n',
  `CALL_CNT` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '有效性\r\n',
  `PERIOD` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否自动设置价格（1为自动以相同价格进入下一个周期）\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`OFP_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for par_parameter
-- ----------------------------
DROP TABLE IF EXISTS `par_parameter`;
CREATE TABLE `par_parameter`  (
  `PAR_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `PARAM_CD` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '参数主键\r\n',
  `PARAM_VALUE` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '参数值\r\n',
  `DESCRIPTION` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '参数说明\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`PAR_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for pck_package_info
-- ----------------------------
DROP TABLE IF EXISTS `pck_package_info`;
CREATE TABLE `pck_package_info`  (
  `PCK_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `WAR_ID` int(11) NULL DEFAULT NULL COMMENT '仓库ID\r\n',
  `PRO_ID` int(11) NULL DEFAULT NULL COMMENT '绑定的 PRO_ID 与 VAR_ID 只可能有一个\r\n',
  `TYPE_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '对应master 表PAC_REGISTER M - 厂家设定 W - 仓库注册\r\n',
  `WIDTH` decimal(7, 2) NULL DEFAULT NULL COMMENT '宽 - cm\r\n',
  `HEIGHT` decimal(7, 2) NULL DEFAULT NULL COMMENT '高 - cm\r\n',
  `LENGTH` decimal(7, 2) NULL DEFAULT NULL COMMENT '长 - cm\r\n',
  `WEIGHT` decimal(7, 2) NULL DEFAULT NULL COMMENT '重 - kg\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `HEAVY_CARGO` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '卡车管道\r\n',
  `LOGISTICS_COMPANY` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管道公司\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`PCK_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for pdn_product_descrition
-- ----------------------------
DROP TABLE IF EXISTS `pdn_product_descrition`;
CREATE TABLE `pdn_product_descrition`  (
  `PDN_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `PRO_ID` int(11) NULL DEFAULT NULL COMMENT '外键，关联pro表主键\r\n',
  `TYPE_CD` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '对应master表TEXTTYPE RICH_TEXT - 图文信息 SIMPLE_TEXT - 简单信息，用于 amazon SELLING_POINTS - 卖点，用于 amazon\r\n',
  `DESCRITION` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '商品描述（富文本、纯文本、卖点）\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`PDN_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for prc_product_category
-- ----------------------------
DROP TABLE IF EXISTS `prc_product_category`;
CREATE TABLE `prc_product_category`  (
  `PRC_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id\r\n',
  `PRO_ID` int(11) NULL DEFAULT NULL COMMENT '商品ID\r\n',
  `CATEGORY_ID` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '分类id\r\n',
  `CATEGORY_NAME` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '类别名称\r\n',
  `CATEGORY_PATH` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '类别全路径如 ce>digital>mp3\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `PLATEFORM_TYPE` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '平台类型,ebay：2，Amazon：1\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`PRC_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for pro_product
-- ----------------------------
DROP TABLE IF EXISTS `pro_product`;
CREATE TABLE `pro_product`  (
  `PRO_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id\r\n',
  `SKU_CD` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品sku编码\r\n',
  `BRD_ID` int(11) NULL DEFAULT NULL COMMENT '外键，关联品牌id\r\n',
  `MAN_ID` int(11) NULL DEFAULT NULL COMMENT '外键关联man_id\r\n',
  `TITLE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题\r\n',
  `UPC` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'upc编码\r\n',
  `EAN` varchar(13) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'ena编码\r\n',
  `MODEL` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '型号\r\n',
  `WARRANTY_DAY` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '保修期（单位有年、月、日）\r\n',
  `RETAIL_PRICE` decimal(10, 2) NULL DEFAULT NULL COMMENT '建议零售价\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `MININUM_RETAIL_PRICE` decimal(10, 2) NULL DEFAULT NULL COMMENT '最低零售价\r\n',
  `REPLENISHMENT_PERIOD` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '补货期（天）\r\n',
  `KEY_WORDS` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '关键字，预留后续搜索使用\r\n',
  `WARRANTY` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '保修政策说明\r\n',
  `TIME_UNIT` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '保修期单位 1、年 2、月 3、日\r\n',
  `STOCKSETING` int(11) NULL DEFAULT NULL COMMENT '库存预警设置（当低于预警值时发出警告）\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`PRO_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sal_sales_order_line_item
-- ----------------------------
DROP TABLE IF EXISTS `sal_sales_order_line_item`;
CREATE TABLE `sal_sales_order_line_item`  (
  `SAL_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '数据有效性\r\n',
  `SAO_ID` int(11) NULL DEFAULT NULL COMMENT '销售订单主表ID\r\n',
  `PRO_ID` int(11) NULL DEFAULT NULL COMMENT '商品ID\r\n',
  `QTY` int(11) NULL DEFAULT NULL COMMENT '商品数量\r\n',
  `PRICE` decimal(8, 2) NULL DEFAULT NULL COMMENT '商品单价\r\n',
  `SOL_ID` int(11) NULL DEFAULT NULL COMMENT '同步数据ID\r\n',
  `TRACKING_NO` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '物流跟踪号\r\n',
  `WSP_NAME` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '快递公司\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`SAL_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sao_sales_order
-- ----------------------------
DROP TABLE IF EXISTS `sao_sales_order`;
CREATE TABLE `sao_sales_order`  (
  `SAO_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `CREATED_BY` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '数据有效性\r\n',
  `MAN_ID` int(11) NULL DEFAULT NULL COMMENT '制造商ID\r\n',
  `WAR_ID` int(11) NULL DEFAULT NULL COMMENT '仓库ID\r\n',
  `SYNC_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '第一次同步时间\r\n',
  `PAYMENT_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '支付时间\r\n',
  `PUSH_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '推送到仓库的时间\r\n',
  `TRACK_NO_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '取得物流跟踪号的时间\r\n',
  `FULFILLMENT_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '物流妥投时间\r\n',
  `SETTLEMENT_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '结款时间\r\n',
  `PRODUCT_AMOUNT` decimal(8, 2) NULL DEFAULT NULL COMMENT '订单价格\r\n',
  `FREIGHT_COST` decimal(8, 2) NULL DEFAULT NULL COMMENT '运费\r\n',
  `HANDLING_FEE` decimal(8, 2) NULL DEFAULT NULL COMMENT '订单处理费\r\n',
  `CUSTOMER_REMARK` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '消费者备注\r\n',
  `ORDER_NO` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单编号, SO + 8位数字: 例如: SO00000001 , 当订单号多于一千万时，第一位变为由A到Z\r\n',
  `ORDER_STS` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单状态: 1. AwaitingPayment 2. AwaitingShipment 3. SHIPPED 已发货 4. Complete 已完成5. Canceled已取消\r\n',
  `REFUND_STS` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '退款状态 1. OPEN - 开启 2. CLOSE - 已完结\r\n',
  `DELIVERY_STS` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '发货状态 1. SYNC - 已同步到仓库 2. STOCK_OUT - 已出库 3. SHIPPING - 发货中 4. FULFILLED - 已妥投\r\n',
  `STO_ID` int(11) NULL DEFAULT NULL COMMENT 'GM 平台订单, 已拆单 按 仓库 / 厂家 进行拆单\r\n',
  `LAST_FREIGHT_COST` decimal(8, 2) NULL DEFAULT NULL COMMENT '斑马返回物流费用\r\n',
  `CANCLE_TIME` timestamp(0) NULL DEFAULT NULL COMMENT '取消时间\r\n',
  `AUTO_PAY_STATUS` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '0自动，1非自动，2取消，3异常，4完成\r\n',
  `BUYER_CHECKOUT_MESSAGE` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '用户留言\r\n',
  `AUTO_PAY_TIME` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单自动支付时间\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`SAO_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sdi_store_dropship_item
-- ----------------------------
DROP TABLE IF EXISTS `sdi_store_dropship_item`;
CREATE TABLE `sdi_store_dropship_item`  (
  `DIL_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id\r\n',
  `PRO_ID` int(11) NULL DEFAULT NULL COMMENT '商品id\r\n',
  `STR_ID` int(11) NULL DEFAULT NULL COMMENT '网店id\r\n',
  `STORE_RETENTION` int(11) NULL DEFAULT NULL COMMENT '网点预留量\r\n',
  `DROPSHIP_PRICE` decimal(10, 2) NULL DEFAULT NULL COMMENT '借卖价格\r\n',
  `DROPSHIP_STATUS` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '0-提交 1-上架 2-下架\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '数据有效性\r\n',
  `SHELF_STOCK` int(11) NULL DEFAULT NULL COMMENT '网店上架商品数量\r\n',
  `PREFER_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '商品网店上架时间\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`DIL_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sequence
-- ----------------------------
DROP TABLE IF EXISTS `sequence`;
CREATE TABLE `sequence`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '序列名称\r\n',
  `current_value` int(11) NULL DEFAULT NULL COMMENT '当前值\r\n',
  `increment` int(11) NULL DEFAULT NULL COMMENT '增长值\r\n',
  `initial` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '首字母\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sha_shipping_address
-- ----------------------------
DROP TABLE IF EXISTS `sha_shipping_address`;
CREATE TABLE `sha_shipping_address`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `FAMILY_NAME` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓\r\n',
  `GIVEN_NAME` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名字\r\n',
  `COUNTRY_NAME` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '国家\r\n',
  `COUNTRY_ISO_CD` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '国家编码\r\n',
  `STATE_OR_PROVINCE_NAME` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省份或洲名称\r\n',
  `STATE_OR_PROVINCE_CD` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省份或洲编码\r\n',
  `CITY_NAME` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '城市名\r\n',
  `ADDRESS_LINE1` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '地址1\r\n',
  `ADDRESS_LINE2` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '地址2',
  `ADDRESS_LINE3` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '地址3\r\n',
  `POSTAL_CD` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮编\r\n',
  `CONTACT_PHONE_NO` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系电话\r\n',
  `EMAIL` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱\r\n',
  `STO_ID` int(11) NULL DEFAULT NULL COMMENT '外键关联sto_store_order表主键\r\n',
  `CARRIER_NAME` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '快递公司名称\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sol_store_order_line_item
-- ----------------------------
DROP TABLE IF EXISTS `sol_store_order_line_item`;
CREATE TABLE `sol_store_order_line_item`  (
  `SOL_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `ORDER_ITEM_ID` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第三方平台 LINE_ITEM_ID\r\n',
  `STO_ID` int(11) NULL DEFAULT NULL COMMENT '主表主键ID\r\n',
  `SALES_PRICE` decimal(8, 2) NULL DEFAULT NULL COMMENT '商品单价\r\n',
  `QTY` int(11) NULL DEFAULT NULL COMMENT '商品数量\r\n',
  `SKU_NO` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品SKU编号\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '有效性\r\n',
  `BUYER_CHECKOUT_MESSAGE` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '用户留言\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`SOL_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for spa_specific_attribute
-- ----------------------------
DROP TABLE IF EXISTS `spa_specific_attribute`;
CREATE TABLE `spa_specific_attribute`  (
  `SPA_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id\r\n',
  `PRO_ID` int(11) NULL DEFAULT NULL COMMENT '外键 关联pro表id\r\n',
  `NAME_EN` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '属性中文\r\n',
  `NAME_CN` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '属性英文\r\n',
  `SEQ_NO` int(11) NULL DEFAULT NULL COMMENT '排序\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`SPA_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for spv_specific_attribute_value
-- ----------------------------
DROP TABLE IF EXISTS `spv_specific_attribute_value`;
CREATE TABLE `spv_specific_attribute_value`  (
  `SPV_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id\r\n',
  `SPA_ID` int(11) NULL DEFAULT NULL COMMENT '外键关联spa表主键\r\n',
  `NAME_EN` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '英文属性描述\r\n',
  `NAME_CN` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '中文属性描述\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`SPV_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sto_store_order
-- ----------------------------
DROP TABLE IF EXISTS `sto_store_order`;
CREATE TABLE `sto_store_order`  (
  `STO_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `STR_ID` int(11) NULL DEFAULT NULL COMMENT '网店ID，外键关联str表主键',
  `ORDER_ID` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'AMAZON / EBAY 平台的订单 ID 例如: AMAZON : 058-1233752-8214740 EBAY : 865826',
  `ORDER_CREATED_TIME` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单创建时间',
  `PAID_TIME` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '支付时间',
  `LAST_MODIFIED_TIME` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单更新时间',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '有效性',
  `PLATEFORM_TYPE` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '平台类别 1、amazon 2、ebay',
  `CANCEL_COMPLETE_DATE` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单取消时间',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`STO_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for str_store
-- ----------------------------
DROP TABLE IF EXISTS `str_store`;
CREATE TABLE `str_store`  (
  `STR_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `DSR_ID` int(11) NULL DEFAULT NULL COMMENT '借卖ID\r\n',
  `PLATAEFORM_TYPE` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '平台类别,1:Amazon;2:ebay\r\n',
  `STORE_NAME` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '网店名 - 从api中取得\r\n',
  `STORE_STS_CD` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'API 对接状态 1. INI - 刚授权 2. WIP - 正常对接 3. EXP - token 过期 4. ERR - token 出错 5. CLS - 网店关闭\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`STR_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_andorra
-- ----------------------------
DROP TABLE IF EXISTS `sys_andorra`;
CREATE TABLE `sys_andorra`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题\r\n',
  `content` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容\r\n',
  `type` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '类型\r\n',
  `adurl` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片地址\r\n',
  `publisher` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '发布人\r\n',
  `addtime` datetime(0) NULL DEFAULT NULL COMMENT '添加时间\r\n',
  `uptime` datetime(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `starttime` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '开始时间\r\n',
  `endtime` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '结束时间\r\n',
  `status` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态 0为默认未启用，1为启用\r\n',
  `tourl` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '跳转url地址\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
  `MENU_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `MENU_NAME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单名称\r\n',
  `MENU_URL` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '路径\r\n',
  `PARENT_ID` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '父类ID\r\n',
  `MENU_ORDER` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '排序标识\r\n',
  `MENU_ICON` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单图标样式\r\n',
  `MENU_TYPE` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单类型\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`MENU_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `USERNAME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名，唯一\r\n',
  `PASSWORD` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码\r\n',
  `NAME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '昵称（可重复）\r\n',
  `RIGHTS` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '权限\r\n',
  `ROLE_ID` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '角色ID\r\n',
  `LAST_LOGIN` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '上次登录时间\r\n',
  `IP` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '登录IP\r\n',
  `STATUS` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `BZ` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `SKIN` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '皮肤样式\r\n',
  `EMAIL` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱\r\n',
  `NUMBER` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '固话号码\r\n',
  `PHONE` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手机\r\n',
  `MAN_BUYER_ID` int(11) NULL DEFAULT NULL COMMENT '产商,借卖方ID\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for ull_user_login_logout_log
-- ----------------------------
DROP TABLE IF EXISTS `ull_user_login_logout_log`;
CREATE TABLE `ull_user_login_logout_log`  (
  `ULL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USI_ID` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `TOKEN` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `TERMINAL_TYPE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `OPERATING_TYPE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `OPERATING_DATE` timestamp(0) NULL DEFAULT NULL,
  `CREATED_BY` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `CREATION_DATE` datetime(0) NULL DEFAULT NULL,
  `LAST_UPDATE_BY` datetime(0) NULL DEFAULT NULL,
  `LAST_UPDATE_DATE` datetime(0) NULL DEFAULT NULL,
  `CALL_CNT` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `REMARK` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `deleted` tinyint(1) NULL DEFAULT NULL,
  PRIMARY KEY (`ULL_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for waa_wallet_account
-- ----------------------------
DROP TABLE IF EXISTS `waa_wallet_account`;
CREATE TABLE `waa_wallet_account`  (
  `BUYER_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `ACCOUNT_NAME` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账户名\r\n',
  `EMAIL` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱\r\n',
  `PASSWORD` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '支付密码, 加密串\r\n',
  `ACTIVE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '激活时间\r\n',
  `IS_ACTIVE` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '是否激活 N - 未激活 , Y - 激活\r\n',
  `STATUS` tinyint(2) NULL DEFAULT NULL COMMENT '状态  7 -正常,  17 -冻结\r\n',
  `CREATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATE_TIME` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人\r\n',
  `LAST_UPDATE_TIME` timestamp(0) NULL DEFAULT NULL COMMENT '最后更新时间\r\n',
  `ACCOUNT_TYPE` int(11) NULL DEFAULT NULL COMMENT '账户类型:1-客户 2-厂家\r\n',
  `HOLD_ORDER_TIME` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单处理时间\r\n',
  `AUTO_PAY_STATUS` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '0-FALSE 1-TRUE\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`BUYER_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for waf_wallet_account_fund
-- ----------------------------
DROP TABLE IF EXISTS `waf_wallet_account_fund`;
CREATE TABLE `waf_wallet_account_fund`  (
  `BUYER_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '买家id\r\n',
  `AVAILABLE_MONEY` decimal(10, 4) NULL DEFAULT NULL COMMENT '可用金额\r\n',
  `DEPOSITING_MONEY` decimal(10, 4) NULL DEFAULT NULL COMMENT '充值中金额\r\n',
  `WITHDRAWING_MONEY` decimal(10, 4) NULL DEFAULT NULL COMMENT '提现中金额\r\n',
  `CREATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATE_TIME` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人\r\n',
  `LAST_UPDATE_TIME` timestamp(0) NULL DEFAULT NULL COMMENT '最后更新时间\r\n',
  `CURRENCY` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账户币种:USD,RMB\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`BUYER_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for wit_wishlist
-- ----------------------------
DROP TABLE IF EXISTS `wit_wishlist`;
CREATE TABLE `wit_wishlist`  (
  `WIT_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id\r\n',
  `DSR_ID` int(11) NULL DEFAULT NULL COMMENT '借卖方id，关联dsr表\r\n',
  `PRO_ID` int(11) NULL DEFAULT NULL COMMENT '外键 关联Pro表主键\r\n',
  `CREATED_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATION_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人\r\n',
  `LAST_UPDATE_DATE` timestamp(0) NULL DEFAULT NULL COMMENT '修改时间\r\n',
  `CALL_CNT` int(11) NULL DEFAULT NULL COMMENT '乐观锁\r\n',
  `REMARK` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `STS_CD` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '状态\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`WIT_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for wta_wallet_transaction_aduit
-- ----------------------------
DROP TABLE IF EXISTS `wta_wallet_transaction_aduit`;
CREATE TABLE `wta_wallet_transaction_aduit`  (
  `TRANSACTION_AUDIT_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `BUYER_ID` int(11) NULL DEFAULT NULL COMMENT '买家id\r\n',
  `TRANSACTION_ID` int(11) NULL DEFAULT NULL COMMENT '业务记录id\r\n',
  `AVAILABLE_MONEY_BEFORE` decimal(10, 4) NULL DEFAULT NULL COMMENT '前可用余额\r\n',
  `DEPOSITING_MONEY_BEFORE` decimal(10, 4) NULL DEFAULT NULL COMMENT '前充值中金额\r\n',
  `WITHDRAWING_MONEY_BEFORE` decimal(10, 4) NULL DEFAULT NULL COMMENT '前提现中金额\r\n',
  `OPERATE_MONEY` decimal(10, 4) NULL DEFAULT NULL COMMENT '操作金额\r\n',
  `OPERATE_TYPE` tinyint(2) NULL DEFAULT NULL COMMENT '操作类型 1-申请 2-提现 3-消费 4-退款\r\n',
  `AVAILABLE_MONEY_AFTER` decimal(10, 4) NULL DEFAULT NULL COMMENT '变更后可用余额\r\n',
  `DEPOSITING_MONEY_AFTER` decimal(10, 4) NULL DEFAULT NULL COMMENT '变更后充值中金额\r\n',
  `WITHDRAWING_MONEY_AFTER` decimal(10, 4) NULL DEFAULT NULL COMMENT '变更后提现中金额\r\n',
  `OPERATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '操作人\r\n',
  `STATUS` tinyint(2) NULL DEFAULT NULL COMMENT '操作状态 2-申请 , 4 -完成 , -1-失败\r\n',
  `CREATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATE_TIME` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人\r\n',
  `LAST_UPDATE_TIME` timestamp(0) NULL DEFAULT NULL COMMENT '最后更新时间\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`TRANSACTION_AUDIT_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for wtr_wallet_transaction_record
-- ----------------------------
DROP TABLE IF EXISTS `wtr_wallet_transaction_record`;
CREATE TABLE `wtr_wallet_transaction_record`  (
  `TRANSACTION_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\r\n',
  `BUYER_ID` int(11) NULL DEFAULT NULL COMMENT '买家Id\r\n',
  `BANK_CARD_ID` int(11) NULL DEFAULT NULL COMMENT '银行卡id for 充值、提现、退款,  卡账户消费情况下为空\r\n',
  `TRANSACTION_NUMBER` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '流水号，GM应用生成\r\n',
  `TRANSACTION_TYPE` tinyint(2) NULL DEFAULT NULL COMMENT '业务类型 1-充值 2-提现 3-消费 4-退款\r\n',
  `ACCOUNT_NAME` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'gmcp$account.account_name 账户名\r\n',
  `TRANSACTION_MONEY` decimal(10, 4) NULL DEFAULT NULL COMMENT '金额\r\n',
  `COMMISSION` decimal(10, 4) NULL DEFAULT NULL COMMENT '手续费\r\n',
  `DISCOUNT_COMMISSION` decimal(10, 4) NULL DEFAULT NULL COMMENT '折后手续费\r\n',
  `TRANSACTION_METHOD` tinyint(2) NULL DEFAULT NULL COMMENT '方式 0-T/T 1-Paypal 2-现金 3消费\r\n',
  `COMPLETE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '完成时间\r\n',
  `STATUS` tinyint(2) NULL DEFAULT NULL COMMENT '状态 2 -申请 , 4 -完成 , -1-失败\r\n',
  `ACTUAL_MONEY` decimal(10, 4) NULL DEFAULT NULL COMMENT '实际金额\r\n',
  `ACTUAL_COMMISSION` decimal(10, 4) NULL DEFAULT NULL COMMENT '实际手续费\r\n',
  `ACTUAL_DISCOUNT_COMMISSION` decimal(10, 4) NULL DEFAULT NULL COMMENT '折后实际手续费\r\n',
  `BALANCE` decimal(10, 4) NULL DEFAULT NULL COMMENT '余额\r\n',
  `BUSINESS_ID` int(10) NULL DEFAULT NULL COMMENT '订单id 针对消费,  gmsales.trade.id\r\n',
  `FINANCE_TYPE` tinyint(2) NULL DEFAULT NULL COMMENT '类型 1-入款 2-出款\r\n',
  `NOTE` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注\r\n',
  `OPERATOR_NAME` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '操作人\r\n',
  `OPERATOR_IP` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '操作人IP\r\n',
  `CREATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人\r\n',
  `CREATE_TIME` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间\r\n',
  `LAST_UPDATE_BY` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人\r\n',
  `LAST_UPDATE_TIME` timestamp(0) NULL DEFAULT NULL COMMENT '最后更新时间\r\n',
  `BANK_RECEIPT_URL` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '银行请求地址\r\n',
  `EXCHANGE_RATE` decimal(10, 4) NULL DEFAULT NULL COMMENT '转换汇率\r\n',
  `TRANSACTION_DESC` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '流水描述\r\n',
  `FOREIGN_EXCHANGE_FEE` decimal(10, 4) NULL DEFAULT NULL COMMENT '外汇\r\n',
  `WITHDRAW_FEE` decimal(10, 4) NULL DEFAULT NULL COMMENT '处理费\r\n',
  `deleted` tinyint(1) NULL DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`TRANSACTION_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
