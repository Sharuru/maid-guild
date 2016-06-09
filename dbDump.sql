/*
Navicat PGSQL Data Transfer

Source Server         : PostgreSQL@MIYUKI
Source Server Version : 90408
Source Host           : 
Source Database       : maid_pocket
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90408
File Encoding         : 65001

Date: 2016-06-10 00:52:38
*/


-- ----------------------------
-- Sequence structure for api_key_record_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."api_key_record_id_seq";
CREATE SEQUENCE "public"."api_key_record_id_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 11
 CACHE 1;
SELECT setval('"public"."api_key_record_id_seq"', 11, true);

-- ----------------------------
-- Sequence structure for city_id_record_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."city_id_record_id_seq";
CREATE SEQUENCE "public"."city_id_record_id_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 34
 CACHE 1;
SELECT setval('"public"."city_id_record_id_seq"', 34, true);

-- ----------------------------
-- Sequence structure for metro_info_record_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."metro_info_record_id_seq";
CREATE SEQUENCE "public"."metro_info_record_id_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 407
 CACHE 1;
SELECT setval('"public"."metro_info_record_id_seq"', 407, true);

-- ----------------------------
-- Sequence structure for moudle_list_record_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."moudle_list_record_id_seq";
CREATE SEQUENCE "public"."moudle_list_record_id_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 25
 CACHE 1;
SELECT setval('"public"."moudle_list_record_id_seq"', 25, true);

-- ----------------------------
-- Sequence structure for test_record_id_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."test_record_id_seq";
CREATE SEQUENCE "public"."test_record_id_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 26
 CACHE 1;
SELECT setval('"public"."test_record_id_seq"', 26, true);

-- ----------------------------
-- Table structure for api_key
-- ----------------------------
DROP TABLE IF EXISTS "public"."api_key";
CREATE TABLE "public"."api_key" (
"record_id" int4 DEFAULT nextval('api_key_record_id_seq'::regclass) NOT NULL,
"api_record" varchar COLLATE "default" NOT NULL,
"provider" varchar COLLATE "default" NOT NULL,
"amount" int4 NOT NULL,
"last_call" timestamp(6) NOT NULL,
"delete_flag" int2 DEFAULT 0 NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of api_key
-- ----------------------------
INSERT INTO "public"."api_key" VALUES ('1', 'SECRET', 'BAIDUWEB', '1000000', '2015-11-18 13:16:34', '0');
INSERT INTO "public"."api_key" VALUES ('2', 'SECRET', 'BAIDUAPISTORE', '1000000', '2015-11-19 11:57:55', '0');
INSERT INTO "public"."api_key" VALUES ('3', 'SECRET', 'LONGDBUS', '1000000', '2015-11-23 15:00:26', '0');
INSERT INTO "public"."api_key" VALUES ('6', 'SECRET', 'TRAINTIME', '1000000', '2015-11-23 15:27:49', '0');
INSERT INTO "public"."api_key" VALUES ('8', 'SECRET', 'STOCK', '1000000', '2015-11-24 15:33:10', '0');
INSERT INTO "public"."api_key" VALUES ('9', 'SECRET', 'EXCHANGE', '1000000', '2015-12-18 10:43:38', '0');
INSERT INTO "public"."api_key" VALUES ('10', 'SECRET', 'BUS', '1000000', '2016-04-25 15:56:31', '0');
INSERT INTO "public"."api_key" VALUES ('11', 'SECRET', 'BAIDUTRANS', '1000000', '2016-05-10 10:40:19', '0');

-- ----------------------------
-- Table structure for city_id
-- ----------------------------
DROP TABLE IF EXISTS "public"."city_id";
CREATE TABLE "public"."city_id" (
"record_id" int4 DEFAULT nextval('city_id_record_id_seq'::regclass) NOT NULL,
"city_name" varchar COLLATE "default" NOT NULL,
"id_record" varchar COLLATE "default" NOT NULL,
"delete_flag" int2 DEFAULT 0 NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of city_id
-- ----------------------------
INSERT INTO "public"."city_id" VALUES ('1', '北京', '101010100', '0');
INSERT INTO "public"."city_id" VALUES ('2', '上海', '101020100', '0');
INSERT INTO "public"."city_id" VALUES ('3', '天津', '101030100', '0');
INSERT INTO "public"."city_id" VALUES ('4', '重庆', '101040100', '0');
INSERT INTO "public"."city_id" VALUES ('5', '黑龙江', '101050101', '0');
INSERT INTO "public"."city_id" VALUES ('6', '吉林', '101060101', '0');
INSERT INTO "public"."city_id" VALUES ('7', '辽宁', '101070101', '0');
INSERT INTO "public"."city_id" VALUES ('8', '内蒙古', '101080101', '0');
INSERT INTO "public"."city_id" VALUES ('9', '河北', '101090101', '0');
INSERT INTO "public"."city_id" VALUES ('10', '山西', '101100101', '0');
INSERT INTO "public"."city_id" VALUES ('11', '陕西', '101110101', '0');
INSERT INTO "public"."city_id" VALUES ('12', '山东', '101120101', '0');
INSERT INTO "public"."city_id" VALUES ('13', '新疆', '101130101', '0');
INSERT INTO "public"."city_id" VALUES ('14', '西藏', '101140101', '0');
INSERT INTO "public"."city_id" VALUES ('15', '青海', '101150101', '0');
INSERT INTO "public"."city_id" VALUES ('16', '甘肃', '101160101', '0');
INSERT INTO "public"."city_id" VALUES ('17', '宁夏', '101170101', '0');
INSERT INTO "public"."city_id" VALUES ('18', '河南', '101180101', '0');
INSERT INTO "public"."city_id" VALUES ('19', '江苏', '101190101', '0');
INSERT INTO "public"."city_id" VALUES ('20', '湖北', '101200101', '0');
INSERT INTO "public"."city_id" VALUES ('21', '浙江', '101210101', '0');
INSERT INTO "public"."city_id" VALUES ('22', '安徽', '101220101', '0');
INSERT INTO "public"."city_id" VALUES ('23', '福建', '101230101', '0');
INSERT INTO "public"."city_id" VALUES ('24', '江西', '101240101', '0');
INSERT INTO "public"."city_id" VALUES ('25', '湖南', '101250101', '0');
INSERT INTO "public"."city_id" VALUES ('26', '贵州', '101260101', '0');
INSERT INTO "public"."city_id" VALUES ('27', '四川', '101270101', '0');
INSERT INTO "public"."city_id" VALUES ('28', '广东', '101280101', '0');
INSERT INTO "public"."city_id" VALUES ('29', '云南', '101290101', '0');
INSERT INTO "public"."city_id" VALUES ('30', '广西', '101300101', '0');
INSERT INTO "public"."city_id" VALUES ('31', '海南', '101310101', '0');
INSERT INTO "public"."city_id" VALUES ('32', '香港', '101320101', '0');
INSERT INTO "public"."city_id" VALUES ('33', '澳门', '101330101', '0');
INSERT INTO "public"."city_id" VALUES ('34', '台湾', '101340101', '0');

-- ----------------------------
-- Table structure for metro_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."metro_info";
CREATE TABLE "public"."metro_info" (
"record_id" int4 DEFAULT nextval('metro_info_record_id_seq'::regclass) NOT NULL,
"city_id" varchar COLLATE "default" NOT NULL,
"line_id" varchar COLLATE "default" NOT NULL,
"station_id" varchar COLLATE "default" NOT NULL,
"station_name" varchar(255) COLLATE "default" NOT NULL,
"delete_flag" int2 DEFAULT 0 NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of metro_info
-- ----------------------------
INSERT INTO "public"."metro_info" VALUES ('1', '101020100', '1', '111', '莘庄', '0');
INSERT INTO "public"."metro_info" VALUES ('2', '101020100', '1', '112', '外环路', '0');
INSERT INTO "public"."metro_info" VALUES ('3', '101020100', '1', '113', '莲花路', '0');
INSERT INTO "public"."metro_info" VALUES ('4', '101020100', '1', '114', '锦江乐园', '0');
INSERT INTO "public"."metro_info" VALUES ('5', '101020100', '1', '115', '上海南站', '0');
INSERT INTO "public"."metro_info" VALUES ('6', '101020100', '1', '116', '漕宝路', '0');
INSERT INTO "public"."metro_info" VALUES ('7', '101020100', '1', '117', '上海体育馆', '0');
INSERT INTO "public"."metro_info" VALUES ('8', '101020100', '1', '118', '徐家汇', '0');
INSERT INTO "public"."metro_info" VALUES ('9', '101020100', '1', '119', '衡山路', '0');
INSERT INTO "public"."metro_info" VALUES ('10', '101020100', '1', '120', '常熟路', '0');
INSERT INTO "public"."metro_info" VALUES ('11', '101020100', '1', '121', '陕西南路', '0');
INSERT INTO "public"."metro_info" VALUES ('12', '101020100', '1', '122', '黄陂南路', '0');
INSERT INTO "public"."metro_info" VALUES ('13', '101020100', '1', '123', '人民广场', '0');
INSERT INTO "public"."metro_info" VALUES ('14', '101020100', '1', '124', '新闸路', '0');
INSERT INTO "public"."metro_info" VALUES ('15', '101020100', '1', '125', '汉中路', '0');
INSERT INTO "public"."metro_info" VALUES ('16', '101020100', '1', '126', '上海火车站', '0');
INSERT INTO "public"."metro_info" VALUES ('17', '101020100', '1', '127', '中山北路', '0');
INSERT INTO "public"."metro_info" VALUES ('18', '101020100', '1', '128', '延长路', '0');
INSERT INTO "public"."metro_info" VALUES ('19', '101020100', '1', '129', '上海马戏城', '0');
INSERT INTO "public"."metro_info" VALUES ('20', '101020100', '1', '130', '汶水路', '0');
INSERT INTO "public"."metro_info" VALUES ('21', '101020100', '1', '131', '彭浦新村', '0');
INSERT INTO "public"."metro_info" VALUES ('22', '101020100', '1', '132', '共康路', '0');
INSERT INTO "public"."metro_info" VALUES ('23', '101020100', '1', '133', '通河新村', '0');
INSERT INTO "public"."metro_info" VALUES ('24', '101020100', '1', '134', '呼兰路', '0');
INSERT INTO "public"."metro_info" VALUES ('25', '101020100', '1', '135', '共富新村', '0');
INSERT INTO "public"."metro_info" VALUES ('26', '101020100', '1', '136', '宝安公路', '0');
INSERT INTO "public"."metro_info" VALUES ('27', '101020100', '1', '137', '友谊西路', '0');
INSERT INTO "public"."metro_info" VALUES ('28', '101020100', '1', '138', '富锦路', '0');
INSERT INTO "public"."metro_info" VALUES ('29', '101020100', '2', '234', '徐泾东', '0');
INSERT INTO "public"."metro_info" VALUES ('30', '101020100', '2', '235', '虹桥火车站', '0');
INSERT INTO "public"."metro_info" VALUES ('31', '101020100', '2', '236', '虹桥2号航站楼', '0');
INSERT INTO "public"."metro_info" VALUES ('32', '101020100', '2', '237', '淞虹路', '0');
INSERT INTO "public"."metro_info" VALUES ('33', '101020100', '2', '238', '北新泾', '0');
INSERT INTO "public"."metro_info" VALUES ('34', '101020100', '2', '239', '威宁路', '0');
INSERT INTO "public"."metro_info" VALUES ('35', '101020100', '2', '240', '娄山关路', '0');
INSERT INTO "public"."metro_info" VALUES ('36', '101020100', '2', '241', '中山公园', '0');
INSERT INTO "public"."metro_info" VALUES ('37', '101020100', '2', '242', '江苏路', '0');
INSERT INTO "public"."metro_info" VALUES ('38', '101020100', '2', '243', '静安寺', '0');
INSERT INTO "public"."metro_info" VALUES ('39', '101020100', '2', '244', '南京西路', '0');
INSERT INTO "public"."metro_info" VALUES ('40', '101020100', '2', '245', '人民广场', '0');
INSERT INTO "public"."metro_info" VALUES ('41', '101020100', '2', '246', '南京东路', '0');
INSERT INTO "public"."metro_info" VALUES ('42', '101020100', '2', '247', '陆家嘴', '0');
INSERT INTO "public"."metro_info" VALUES ('43', '101020100', '2', '248', '东昌路', '0');
INSERT INTO "public"."metro_info" VALUES ('44', '101020100', '2', '249', '世纪大道', '0');
INSERT INTO "public"."metro_info" VALUES ('45', '101020100', '2', '250', '上海科技馆', '0');
INSERT INTO "public"."metro_info" VALUES ('46', '101020100', '2', '251', '世纪公园', '0');
INSERT INTO "public"."metro_info" VALUES ('47', '101020100', '2', '252', '龙阳路', '0');
INSERT INTO "public"."metro_info" VALUES ('48', '101020100', '2', '253', '张江高科', '0');
INSERT INTO "public"."metro_info" VALUES ('49', '101020100', '2', '254', '金科路', '0');
INSERT INTO "public"."metro_info" VALUES ('50', '101020100', '2', '255', '广兰路', '0');
INSERT INTO "public"."metro_info" VALUES ('51', '101020100', '2', '256', '唐镇', '0');
INSERT INTO "public"."metro_info" VALUES ('52', '101020100', '2', '257', '创新中路', '0');
INSERT INTO "public"."metro_info" VALUES ('53', '101020100', '2', '258', '华夏东路', '0');
INSERT INTO "public"."metro_info" VALUES ('54', '101020100', '2', '259', '川沙', '0');
INSERT INTO "public"."metro_info" VALUES ('55', '101020100', '2', '260', '凌空路', '0');
INSERT INTO "public"."metro_info" VALUES ('56', '101020100', '2', '261', '远东大道', '0');
INSERT INTO "public"."metro_info" VALUES ('57', '101020100', '2', '262', '海天三路', '0');
INSERT INTO "public"."metro_info" VALUES ('58', '101020100', '2', '263', '浦东国际机场', '0');
INSERT INTO "public"."metro_info" VALUES ('59', '101020100', '3', '311', '上海南站', '0');
INSERT INTO "public"."metro_info" VALUES ('60', '101020100', '3', '312', '石龙路', '0');
INSERT INTO "public"."metro_info" VALUES ('61', '101020100', '3', '313', '龙漕路', '0');
INSERT INTO "public"."metro_info" VALUES ('62', '101020100', '3', '314', '漕溪路', '0');
INSERT INTO "public"."metro_info" VALUES ('63', '101020100', '3', '315', '宜山路', '0');
INSERT INTO "public"."metro_info" VALUES ('64', '101020100', '3', '316', '虹桥路', '0');
INSERT INTO "public"."metro_info" VALUES ('65', '101020100', '3', '317', '延安西路', '0');
INSERT INTO "public"."metro_info" VALUES ('66', '101020100', '3', '318', '中山公园', '0');
INSERT INTO "public"."metro_info" VALUES ('67', '101020100', '3', '319', '金沙江路', '0');
INSERT INTO "public"."metro_info" VALUES ('68', '101020100', '3', '320', '曹杨路', '0');
INSERT INTO "public"."metro_info" VALUES ('69', '101020100', '3', '321', '镇坪路', '0');
INSERT INTO "public"."metro_info" VALUES ('70', '101020100', '3', '322', '中潭路', '0');
INSERT INTO "public"."metro_info" VALUES ('71', '101020100', '3', '323', '上海火车站', '0');
INSERT INTO "public"."metro_info" VALUES ('72', '101020100', '3', '324', '宝山路', '0');
INSERT INTO "public"."metro_info" VALUES ('73', '101020100', '3', '325', '东宝兴路', '0');
INSERT INTO "public"."metro_info" VALUES ('74', '101020100', '3', '326', '虹口足球场', '0');
INSERT INTO "public"."metro_info" VALUES ('75', '101020100', '3', '327', '赤峰路', '0');
INSERT INTO "public"."metro_info" VALUES ('76', '101020100', '3', '328', '大柏树', '0');
INSERT INTO "public"."metro_info" VALUES ('77', '101020100', '3', '329', '江湾镇', '0');
INSERT INTO "public"."metro_info" VALUES ('78', '101020100', '3', '330', '殷高西路', '0');
INSERT INTO "public"."metro_info" VALUES ('79', '101020100', '3', '331', '长江南路', '0');
INSERT INTO "public"."metro_info" VALUES ('80', '101020100', '3', '332', '淞发路', '0');
INSERT INTO "public"."metro_info" VALUES ('81', '101020100', '3', '333', '张华浜', '0');
INSERT INTO "public"."metro_info" VALUES ('82', '101020100', '3', '334', '淞滨路', '0');
INSERT INTO "public"."metro_info" VALUES ('83', '101020100', '3', '335', '水产路', '0');
INSERT INTO "public"."metro_info" VALUES ('84', '101020100', '3', '336', '宝杨路', '0');
INSERT INTO "public"."metro_info" VALUES ('85', '101020100', '3', '337', '友谊路', '0');
INSERT INTO "public"."metro_info" VALUES ('86', '101020100', '3', '338', '铁力路', '0');
INSERT INTO "public"."metro_info" VALUES ('87', '101020100', '3', '339', '江杨北路', '0');
INSERT INTO "public"."metro_info" VALUES ('88', '101020100', '4', '401', '上海体育馆', '0');
INSERT INTO "public"."metro_info" VALUES ('89', '101020100', '4', '402', '宜山路', '0');
INSERT INTO "public"."metro_info" VALUES ('90', '101020100', '4', '403', '虹桥路', '0');
INSERT INTO "public"."metro_info" VALUES ('91', '101020100', '4', '404', '延安西路', '0');
INSERT INTO "public"."metro_info" VALUES ('92', '101020100', '4', '405', '中山公园', '0');
INSERT INTO "public"."metro_info" VALUES ('93', '101020100', '4', '406', '金沙江路', '0');
INSERT INTO "public"."metro_info" VALUES ('94', '101020100', '4', '407', '曹杨路', '0');
INSERT INTO "public"."metro_info" VALUES ('95', '101020100', '4', '408', '镇坪路', '0');
INSERT INTO "public"."metro_info" VALUES ('96', '101020100', '4', '409', '中潭路', '0');
INSERT INTO "public"."metro_info" VALUES ('97', '101020100', '4', '410', '上海火车站', '0');
INSERT INTO "public"."metro_info" VALUES ('98', '101020100', '4', '411', '宝山路', '0');
INSERT INTO "public"."metro_info" VALUES ('99', '101020100', '4', '412', '海伦路', '0');
INSERT INTO "public"."metro_info" VALUES ('100', '101020100', '4', '413', '临平路', '0');
INSERT INTO "public"."metro_info" VALUES ('101', '101020100', '4', '414', '大连路', '0');
INSERT INTO "public"."metro_info" VALUES ('102', '101020100', '4', '415', '杨树浦路', '0');
INSERT INTO "public"."metro_info" VALUES ('103', '101020100', '4', '416', '浦东大道', '0');
INSERT INTO "public"."metro_info" VALUES ('104', '101020100', '4', '417', '世纪大道', '0');
INSERT INTO "public"."metro_info" VALUES ('105', '101020100', '4', '418', '浦电路', '0');
INSERT INTO "public"."metro_info" VALUES ('106', '101020100', '4', '419', '蓝村路', '0');
INSERT INTO "public"."metro_info" VALUES ('107', '101020100', '4', '420', '塘桥', '0');
INSERT INTO "public"."metro_info" VALUES ('108', '101020100', '4', '421', '南浦大桥', '0');
INSERT INTO "public"."metro_info" VALUES ('109', '101020100', '4', '422', '西藏南路', '0');
INSERT INTO "public"."metro_info" VALUES ('110', '101020100', '4', '423', '鲁班路', '0');
INSERT INTO "public"."metro_info" VALUES ('111', '101020100', '4', '424', '大木桥路', '0');
INSERT INTO "public"."metro_info" VALUES ('112', '101020100', '4', '425', '东安路', '0');
INSERT INTO "public"."metro_info" VALUES ('113', '101020100', '4', '426', '上海体育场', '0');
INSERT INTO "public"."metro_info" VALUES ('114', '101020100', '5', '501', '莘庄', '0');
INSERT INTO "public"."metro_info" VALUES ('115', '101020100', '5', '502', '春申路', '0');
INSERT INTO "public"."metro_info" VALUES ('116', '101020100', '5', '503', '银都路', '0');
INSERT INTO "public"."metro_info" VALUES ('117', '101020100', '5', '504', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('118', '101020100', '5', '505', '颛桥', '0');
INSERT INTO "public"."metro_info" VALUES ('119', '101020100', '5', '506', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('120', '101020100', '5', '507', '北桥', '0');
INSERT INTO "public"."metro_info" VALUES ('121', '101020100', '5', '508', '剑川路', '0');
INSERT INTO "public"."metro_info" VALUES ('122', '101020100', '5', '509', '东川路', '0');
INSERT INTO "public"."metro_info" VALUES ('123', '101020100', '5', '510', '金平路', '0');
INSERT INTO "public"."metro_info" VALUES ('124', '101020100', '5', '511', '华宁路', '0');
INSERT INTO "public"."metro_info" VALUES ('125', '101020100', '5', '512', '文井路', '0');
INSERT INTO "public"."metro_info" VALUES ('126', '101020100', '5', '513', '闵行开发区', '0');
INSERT INTO "public"."metro_info" VALUES ('127', '101020100', '6', '621', '东方体育中心', '0');
INSERT INTO "public"."metro_info" VALUES ('128', '101020100', '6', '622', '灵岩南路', '0');
INSERT INTO "public"."metro_info" VALUES ('129', '101020100', '6', '623', '上南路', '0');
INSERT INTO "public"."metro_info" VALUES ('130', '101020100', '6', '624', '华夏西路', '0');
INSERT INTO "public"."metro_info" VALUES ('131', '101020100', '6', '625', '高青路', '0');
INSERT INTO "public"."metro_info" VALUES ('132', '101020100', '6', '626', '东明路', '0');
INSERT INTO "public"."metro_info" VALUES ('133', '101020100', '6', '627', '高科西路', '0');
INSERT INTO "public"."metro_info" VALUES ('134', '101020100', '6', '628', '临沂新村', '0');
INSERT INTO "public"."metro_info" VALUES ('135', '101020100', '6', '629', '上海儿童医学中心', '0');
INSERT INTO "public"."metro_info" VALUES ('136', '101020100', '6', '630', '蓝村路', '0');
INSERT INTO "public"."metro_info" VALUES ('137', '101020100', '6', '631', '浦电路', '0');
INSERT INTO "public"."metro_info" VALUES ('138', '101020100', '6', '632', '世纪大道', '0');
INSERT INTO "public"."metro_info" VALUES ('139', '101020100', '6', '633', '源深体育中心', '0');
INSERT INTO "public"."metro_info" VALUES ('140', '101020100', '6', '634', '民生路', '0');
INSERT INTO "public"."metro_info" VALUES ('141', '101020100', '6', '635', '北洋泾路', '0');
INSERT INTO "public"."metro_info" VALUES ('142', '101020100', '6', '636', '德平路', '0');
INSERT INTO "public"."metro_info" VALUES ('143', '101020100', '6', '637', '云山路', '0');
INSERT INTO "public"."metro_info" VALUES ('144', '101020100', '6', '638', '金桥路', '0');
INSERT INTO "public"."metro_info" VALUES ('145', '101020100', '6', '639', '博兴路', '0');
INSERT INTO "public"."metro_info" VALUES ('146', '101020100', '6', '640', '五莲路', '0');
INSERT INTO "public"."metro_info" VALUES ('147', '101020100', '6', '641', '巨峰路', '0');
INSERT INTO "public"."metro_info" VALUES ('148', '101020100', '6', '642', '东靖路', '0');
INSERT INTO "public"."metro_info" VALUES ('149', '101020100', '6', '643', '五洲大道', '0');
INSERT INTO "public"."metro_info" VALUES ('150', '101020100', '6', '644', '洲海路', '0');
INSERT INTO "public"."metro_info" VALUES ('151', '101020100', '6', '645', '外高桥保税区南', '0');
INSERT INTO "public"."metro_info" VALUES ('152', '101020100', '6', '646', '航津路', '0');
INSERT INTO "public"."metro_info" VALUES ('153', '101020100', '6', '647', '外高桥保税区北', '0');
INSERT INTO "public"."metro_info" VALUES ('154', '101020100', '6', '648', '港城路', '0');
INSERT INTO "public"."metro_info" VALUES ('155', '101020100', '7', '753', '花木路', '0');
INSERT INTO "public"."metro_info" VALUES ('156', '101020100', '7', '752', '龙阳路', '0');
INSERT INTO "public"."metro_info" VALUES ('157', '101020100', '7', '751', '芳华路', '0');
INSERT INTO "public"."metro_info" VALUES ('158', '101020100', '7', '750', '锦绣路', '0');
INSERT INTO "public"."metro_info" VALUES ('159', '101020100', '7', '749', '杨高南路', '0');
INSERT INTO "public"."metro_info" VALUES ('160', '101020100', '7', '748', '高科西路', '0');
INSERT INTO "public"."metro_info" VALUES ('161', '101020100', '7', '747', '云台路', '0');
INSERT INTO "public"."metro_info" VALUES ('162', '101020100', '7', '746', '耀华路', '0');
INSERT INTO "public"."metro_info" VALUES ('163', '101020100', '7', '745', '长清路', '0');
INSERT INTO "public"."metro_info" VALUES ('164', '101020100', '7', '744', '后滩', '0');
INSERT INTO "public"."metro_info" VALUES ('165', '101020100', '7', '743', '龙华中路', '0');
INSERT INTO "public"."metro_info" VALUES ('166', '101020100', '7', '742', '东安路', '0');
INSERT INTO "public"."metro_info" VALUES ('167', '101020100', '7', '741', '肇嘉浜路', '0');
INSERT INTO "public"."metro_info" VALUES ('168', '101020100', '7', '740', '常熟路', '0');
INSERT INTO "public"."metro_info" VALUES ('169', '101020100', '7', '739', '静安寺', '0');
INSERT INTO "public"."metro_info" VALUES ('170', '101020100', '7', '738', '昌平路', '0');
INSERT INTO "public"."metro_info" VALUES ('171', '101020100', '7', '737', '长寿路', '0');
INSERT INTO "public"."metro_info" VALUES ('172', '101020100', '7', '736', '镇坪路', '0');
INSERT INTO "public"."metro_info" VALUES ('173', '101020100', '7', '735', '岚皋路', '0');
INSERT INTO "public"."metro_info" VALUES ('174', '101020100', '7', '734', '新村路', '0');
INSERT INTO "public"."metro_info" VALUES ('175', '101020100', '7', '733', '大华三路', '0');
INSERT INTO "public"."metro_info" VALUES ('176', '101020100', '7', '732', '行知路', '0');
INSERT INTO "public"."metro_info" VALUES ('177', '101020100', '7', '731', '大场镇', '0');
INSERT INTO "public"."metro_info" VALUES ('178', '101020100', '7', '730', '场中路', '0');
INSERT INTO "public"."metro_info" VALUES ('179', '101020100', '7', '729', '上大路', '0');
INSERT INTO "public"."metro_info" VALUES ('180', '101020100', '7', '728', '南陈路', '0');
INSERT INTO "public"."metro_info" VALUES ('181', '101020100', '7', '727', '上海大学', '0');
INSERT INTO "public"."metro_info" VALUES ('182', '101020100', '7', '726', '祁华路', '0');
INSERT INTO "public"."metro_info" VALUES ('183', '101020100', '7', '725', '顾村公园', '0');
INSERT INTO "public"."metro_info" VALUES ('184', '101020100', '7', '724', '刘行', '0');
INSERT INTO "public"."metro_info" VALUES ('185', '101020100', '7', '723', '潘广路', '0');
INSERT INTO "public"."metro_info" VALUES ('186', '101020100', '7', '722', '罗南新村', '0');
INSERT INTO "public"."metro_info" VALUES ('187', '101020100', '7', '721', '美兰湖', '0');
INSERT INTO "public"."metro_info" VALUES ('188', '101020100', '8', '820', '沈杜公路', '0');
INSERT INTO "public"."metro_info" VALUES ('189', '101020100', '8', '821', '联航路', '0');
INSERT INTO "public"."metro_info" VALUES ('190', '101020100', '8', '822', '江月路', '0');
INSERT INTO "public"."metro_info" VALUES ('191', '101020100', '8', '823', '浦江镇', '0');
INSERT INTO "public"."metro_info" VALUES ('192', '101020100', '8', '824', '芦恒路', '0');
INSERT INTO "public"."metro_info" VALUES ('193', '101020100', '8', '825', '凌兆新村', '0');
INSERT INTO "public"."metro_info" VALUES ('194', '101020100', '8', '826', '东方体育中心', '0');
INSERT INTO "public"."metro_info" VALUES ('195', '101020100', '8', '827', '杨思', '0');
INSERT INTO "public"."metro_info" VALUES ('196', '101020100', '8', '828', '成山路', '0');
INSERT INTO "public"."metro_info" VALUES ('197', '101020100', '8', '829', '耀华路', '0');
INSERT INTO "public"."metro_info" VALUES ('198', '101020100', '8', '830', '中华艺术宫', '0');
INSERT INTO "public"."metro_info" VALUES ('199', '101020100', '8', '831', '西藏南路', '0');
INSERT INTO "public"."metro_info" VALUES ('200', '101020100', '8', '832', '陆家浜路', '0');
INSERT INTO "public"."metro_info" VALUES ('201', '101020100', '8', '833', '老西门', '0');
INSERT INTO "public"."metro_info" VALUES ('202', '101020100', '8', '834', '大世界', '0');
INSERT INTO "public"."metro_info" VALUES ('203', '101020100', '8', '835', '人民广场', '0');
INSERT INTO "public"."metro_info" VALUES ('204', '101020100', '8', '836', '曲阜路', '0');
INSERT INTO "public"."metro_info" VALUES ('205', '101020100', '8', '837', '中兴路', '0');
INSERT INTO "public"."metro_info" VALUES ('206', '101020100', '8', '838', '西藏北路', '0');
INSERT INTO "public"."metro_info" VALUES ('207', '101020100', '8', '839', '虹口足球场', '0');
INSERT INTO "public"."metro_info" VALUES ('208', '101020100', '8', '840', '曲阳路', '0');
INSERT INTO "public"."metro_info" VALUES ('209', '101020100', '8', '841', '四平路', '0');
INSERT INTO "public"."metro_info" VALUES ('210', '101020100', '8', '842', '鞍山新村', '0');
INSERT INTO "public"."metro_info" VALUES ('211', '101020100', '8', '843', '江浦路', '0');
INSERT INTO "public"."metro_info" VALUES ('212', '101020100', '8', '844', '黄兴路', '0');
INSERT INTO "public"."metro_info" VALUES ('213', '101020100', '8', '845', '延吉中路', '0');
INSERT INTO "public"."metro_info" VALUES ('214', '101020100', '8', '846', '黄兴公园', '0');
INSERT INTO "public"."metro_info" VALUES ('215', '101020100', '8', '847', '翔殷路', '0');
INSERT INTO "public"."metro_info" VALUES ('216', '101020100', '8', '848', '嫩江路', '0');
INSERT INTO "public"."metro_info" VALUES ('217', '101020100', '8', '849', '市光路', '0');
INSERT INTO "public"."metro_info" VALUES ('218', '101020100', '9', '943', '杨高中路', '0');
INSERT INTO "public"."metro_info" VALUES ('219', '101020100', '9', '942', '世纪大道', '0');
INSERT INTO "public"."metro_info" VALUES ('220', '101020100', '9', '941', '商城路', '0');
INSERT INTO "public"."metro_info" VALUES ('221', '101020100', '9', '940', '小南门', '0');
INSERT INTO "public"."metro_info" VALUES ('222', '101020100', '9', '939', '陆家浜路', '0');
INSERT INTO "public"."metro_info" VALUES ('223', '101020100', '9', '938', '马当路', '0');
INSERT INTO "public"."metro_info" VALUES ('224', '101020100', '9', '937', '打浦桥', '0');
INSERT INTO "public"."metro_info" VALUES ('225', '101020100', '9', '936', '嘉善路', '0');
INSERT INTO "public"."metro_info" VALUES ('226', '101020100', '9', '935', '肇嘉浜路', '0');
INSERT INTO "public"."metro_info" VALUES ('227', '101020100', '9', '934', '徐家汇', '0');
INSERT INTO "public"."metro_info" VALUES ('228', '101020100', '9', '933', '宜山路', '0');
INSERT INTO "public"."metro_info" VALUES ('229', '101020100', '9', '932', '桂林路', '0');
INSERT INTO "public"."metro_info" VALUES ('230', '101020100', '9', '931', '漕河泾开发区', '0');
INSERT INTO "public"."metro_info" VALUES ('231', '101020100', '9', '930', '合川路', '0');
INSERT INTO "public"."metro_info" VALUES ('232', '101020100', '9', '929', '星中路', '0');
INSERT INTO "public"."metro_info" VALUES ('233', '101020100', '9', '928', '七宝', '0');
INSERT INTO "public"."metro_info" VALUES ('234', '101020100', '9', '927', '中春路', '0');
INSERT INTO "public"."metro_info" VALUES ('235', '101020100', '9', '926', '九亭', '0');
INSERT INTO "public"."metro_info" VALUES ('236', '101020100', '9', '925', '泗泾', '0');
INSERT INTO "public"."metro_info" VALUES ('237', '101020100', '9', '924', '佘山', '0');
INSERT INTO "public"."metro_info" VALUES ('238', '101020100', '9', '923', '洞泾', '0');
INSERT INTO "public"."metro_info" VALUES ('239', '101020100', '9', '922', '松江大学城', '0');
INSERT INTO "public"."metro_info" VALUES ('240', '101020100', '9', '921', '松江新城', '0');
INSERT INTO "public"."metro_info" VALUES ('241', '101020100', '9', '920', '松江体育中心', '0');
INSERT INTO "public"."metro_info" VALUES ('242', '101020100', '9', '919', '醉白池', '0');
INSERT INTO "public"."metro_info" VALUES ('243', '101020100', '9', '918', '松江南站', '0');
INSERT INTO "public"."metro_info" VALUES ('244', '101020100', '10', '1068', '新江湾城站', '0');
INSERT INTO "public"."metro_info" VALUES ('245', '101020100', '10', '1067', '殷高东路站', '0');
INSERT INTO "public"."metro_info" VALUES ('246', '101020100', '10', '1066', '三门路站', '0');
INSERT INTO "public"."metro_info" VALUES ('247', '101020100', '10', '1065', '江湾体育场站', '0');
INSERT INTO "public"."metro_info" VALUES ('248', '101020100', '10', '1064', '五角场站', '0');
INSERT INTO "public"."metro_info" VALUES ('249', '101020100', '10', '1063', '国权路站', '0');
INSERT INTO "public"."metro_info" VALUES ('250', '101020100', '10', '1062', '同济大学站', '0');
INSERT INTO "public"."metro_info" VALUES ('251', '101020100', '10', '1061', '四平路站', '0');
INSERT INTO "public"."metro_info" VALUES ('252', '101020100', '10', '1060', '邮电新村站', '0');
INSERT INTO "public"."metro_info" VALUES ('253', '101020100', '10', '1059', '海伦路站', '0');
INSERT INTO "public"."metro_info" VALUES ('254', '101020100', '10', '1058', '四川北路站', '0');
INSERT INTO "public"."metro_info" VALUES ('255', '101020100', '10', '1057', '天潼路站', '0');
INSERT INTO "public"."metro_info" VALUES ('256', '101020100', '10', '1056', '南京东路站', '0');
INSERT INTO "public"."metro_info" VALUES ('257', '101020100', '10', '1055', '豫园站', '0');
INSERT INTO "public"."metro_info" VALUES ('258', '101020100', '10', '1054', '老西门站', '0');
INSERT INTO "public"."metro_info" VALUES ('259', '101020100', '10', '1053', '新天地站', '0');
INSERT INTO "public"."metro_info" VALUES ('260', '101020100', '10', '1052', '陕西南路站', '0');
INSERT INTO "public"."metro_info" VALUES ('261', '101020100', '10', '1051', '上海图书馆站', '0');
INSERT INTO "public"."metro_info" VALUES ('262', '101020100', '10', '1050', '交通大学站', '0');
INSERT INTO "public"."metro_info" VALUES ('263', '101020100', '10', '1049', '虹桥路站', '0');
INSERT INTO "public"."metro_info" VALUES ('264', '101020100', '10', '1048', '宋园路站', '0');
INSERT INTO "public"."metro_info" VALUES ('265', '101020100', '10', '1047', '伊犁路站', '0');
INSERT INTO "public"."metro_info" VALUES ('266', '101020100', '10', '1046', '水城路站', '0');
INSERT INTO "public"."metro_info" VALUES ('267', '101020100', '10', '1045', '龙溪路', '0');
INSERT INTO "public"."metro_info" VALUES ('268', '101020100', '10', '1044', '上海动物园站', '0');
INSERT INTO "public"."metro_info" VALUES ('269', '101020100', '10', '1043', '虹桥1号航站楼站', '0');
INSERT INTO "public"."metro_info" VALUES ('270', '101020100', '10', '1042', '虹桥2号航站楼站', '0');
INSERT INTO "public"."metro_info" VALUES ('271', '101020100', '10', '1041', '虹桥火车站', '0');
INSERT INTO "public"."metro_info" VALUES ('272', '101020100', '10', '1040', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('273', '101020100', '10', '1039', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('274', '101020100', '10', '1038', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('275', '101020100', '10', '1037', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('276', '101020100', '10', '1036', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('277', '101020100', '10', '1035', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('278', '101020100', '10', '1034', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('279', '101020100', '10', '1033', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('280', '101020100', '10', '1032', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('281', '101020100', '10', '1031', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('282', '101020100', '10', '1030', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('283', '101020100', '10', '1029', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('284', '101020100', '10', '1028', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('285', '101020100', '10', '1027', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('286', '101020100', '10', '1026', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('287', '101020100', '10', '1025', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('288', '101020100', '10', '1024', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('289', '101020100', '10', '1023', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('290', '101020100', '10', '1022', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('291', '101020100', '10', '1021', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('292', '101020100', '10', '1020', '龙柏新村站', '0');
INSERT INTO "public"."metro_info" VALUES ('293', '101020100', '10', '1019', '紫藤路站', '0');
INSERT INTO "public"."metro_info" VALUES ('294', '101020100', '10', '1018', '航中路站', '0');
INSERT INTO "public"."metro_info" VALUES ('295', '101020100', '11', '1162', '康新公路', '0');
INSERT INTO "public"."metro_info" VALUES ('296', '101020100', '11', '1161', '秀沿路', '0');
INSERT INTO "public"."metro_info" VALUES ('297', '101020100', '11', '1160', '罗山路', '0');
INSERT INTO "public"."metro_info" VALUES ('298', '101020100', '11', '1159', '御桥', '0');
INSERT INTO "public"."metro_info" VALUES ('299', '101020100', '11', '1158', '浦三路', '0');
INSERT INTO "public"."metro_info" VALUES ('300', '101020100', '11', '1157', '三林东', '0');
INSERT INTO "public"."metro_info" VALUES ('301', '101020100', '11', '1156', '三林', '0');
INSERT INTO "public"."metro_info" VALUES ('302', '101020100', '11', '1155', '东方体育中心', '0');
INSERT INTO "public"."metro_info" VALUES ('303', '101020100', '11', '1154', '龙耀路', '0');
INSERT INTO "public"."metro_info" VALUES ('304', '101020100', '11', '1153', '云锦路', '0');
INSERT INTO "public"."metro_info" VALUES ('305', '101020100', '11', '1152', '龙华', '0');
INSERT INTO "public"."metro_info" VALUES ('306', '101020100', '11', '1151', '上海游泳馆', '0');
INSERT INTO "public"."metro_info" VALUES ('307', '101020100', '11', '1150', '徐家汇', '0');
INSERT INTO "public"."metro_info" VALUES ('308', '101020100', '11', '1149', '交通大学', '0');
INSERT INTO "public"."metro_info" VALUES ('309', '101020100', '11', '1148', '江苏路', '0');
INSERT INTO "public"."metro_info" VALUES ('310', '101020100', '11', '1147', '隆德路', '0');
INSERT INTO "public"."metro_info" VALUES ('311', '101020100', '11', '1146', '曹杨路', '0');
INSERT INTO "public"."metro_info" VALUES ('312', '101020100', '11', '1145', '枫桥路', '0');
INSERT INTO "public"."metro_info" VALUES ('313', '101020100', '11', '1144', '真如', '0');
INSERT INTO "public"."metro_info" VALUES ('314', '101020100', '11', '1143', '上海西站', '0');
INSERT INTO "public"."metro_info" VALUES ('315', '101020100', '11', '1142', '李子园', '0');
INSERT INTO "public"."metro_info" VALUES ('316', '101020100', '11', '1141', '祁连山路', '0');
INSERT INTO "public"."metro_info" VALUES ('317', '101020100', '11', '1140', '武威路', '0');
INSERT INTO "public"."metro_info" VALUES ('318', '101020100', '11', '1139', '桃浦新村', '0');
INSERT INTO "public"."metro_info" VALUES ('319', '101020100', '11', '1138', '南翔', '0');
INSERT INTO "public"."metro_info" VALUES ('320', '101020100', '11', '1137', '马陆', '0');
INSERT INTO "public"."metro_info" VALUES ('321', '101020100', '11', '1136', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('322', '101020100', '11', '1135', '嘉定新城', '0');
INSERT INTO "public"."metro_info" VALUES ('323', '101020100', '11', '1134', '白银路', '0');
INSERT INTO "public"."metro_info" VALUES ('324', '101020100', '11', '1133', '嘉定西', '0');
INSERT INTO "public"."metro_info" VALUES ('325', '101020100', '11', '1132', '嘉定北', '0');
INSERT INTO "public"."metro_info" VALUES ('326', '101020100', '11', '1131', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('327', '101020100', '11', '1130', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('328', '101020100', '11', '1129', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('329', '101020100', '11', '1128', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('330', '101020100', '11', '1127', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('331', '101020100', '11', '1126', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('332', '101020100', '11', '1125', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('333', '101020100', '11', '1124', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('334', '101020100', '11', '1123', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('335', '101020100', '11', '1122', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('336', '101020100', '11', '1121', 'N/A', '0');
INSERT INTO "public"."metro_info" VALUES ('337', '101020100', '11', '1120', '上海赛车场', '0');
INSERT INTO "public"."metro_info" VALUES ('338', '101020100', '11', '1119', '昌吉东路', '0');
INSERT INTO "public"."metro_info" VALUES ('339', '101020100', '11', '1118', '上海汽车城', '0');
INSERT INTO "public"."metro_info" VALUES ('340', '101020100', '11', '1117', '安亭', '0');
INSERT INTO "public"."metro_info" VALUES ('341', '101020100', '11', '1116', '兆丰路', '0');
INSERT INTO "public"."metro_info" VALUES ('342', '101020100', '11', '1115', '光明路', '0');
INSERT INTO "public"."metro_info" VALUES ('343', '101020100', '11', '1114', '花桥', '0');
INSERT INTO "public"."metro_info" VALUES ('344', '101020100', '12', '1251', '金海路', '0');
INSERT INTO "public"."metro_info" VALUES ('345', '101020100', '12', '1250', '申江路', '0');
INSERT INTO "public"."metro_info" VALUES ('346', '101020100', '12', '1249', '金京路', '0');
INSERT INTO "public"."metro_info" VALUES ('347', '101020100', '12', '1248', '杨高北路', '0');
INSERT INTO "public"."metro_info" VALUES ('348', '101020100', '12', '1247', '巨峰路', '0');
INSERT INTO "public"."metro_info" VALUES ('349', '101020100', '12', '1246', '东陆路', '0');
INSERT INTO "public"."metro_info" VALUES ('350', '101020100', '12', '1245', '复兴岛', '0');
INSERT INTO "public"."metro_info" VALUES ('351', '101020100', '12', '1244', '爱国路', '0');
INSERT INTO "public"."metro_info" VALUES ('352', '101020100', '12', '1243', '隆昌路', '0');
INSERT INTO "public"."metro_info" VALUES ('353', '101020100', '12', '1242', '宁国路', '0');
INSERT INTO "public"."metro_info" VALUES ('354', '101020100', '12', '1241', '江浦公园', '0');
INSERT INTO "public"."metro_info" VALUES ('355', '101020100', '12', '1240', '大连路', '0');
INSERT INTO "public"."metro_info" VALUES ('356', '101020100', '12', '1239', '提篮桥', '0');
INSERT INTO "public"."metro_info" VALUES ('357', '101020100', '12', '1238', '国际客运中心', '0');
INSERT INTO "public"."metro_info" VALUES ('358', '101020100', '12', '1237', '天潼路', '0');
INSERT INTO "public"."metro_info" VALUES ('359', '101020100', '12', '1236', '曲阜路', '0');
INSERT INTO "public"."metro_info" VALUES ('360', '101020100', '12', '1235', '汉中路', '0');
INSERT INTO "public"."metro_info" VALUES ('361', '101020100', '12', '1234', '南京西路', '0');
INSERT INTO "public"."metro_info" VALUES ('362', '101020100', '12', '1233', '陕西南路', '0');
INSERT INTO "public"."metro_info" VALUES ('363', '101020100', '12', '1232', '嘉善路', '0');
INSERT INTO "public"."metro_info" VALUES ('364', '101020100', '12', '1231', '大木桥路', '0');
INSERT INTO "public"."metro_info" VALUES ('365', '101020100', '12', '1230', '龙华中路', '0');
INSERT INTO "public"."metro_info" VALUES ('366', '101020100', '12', '1229', '龙华', '0');
INSERT INTO "public"."metro_info" VALUES ('367', '101020100', '12', '1228', '龙漕路', '0');
INSERT INTO "public"."metro_info" VALUES ('368', '101020100', '12', '1227', '漕宝路', '0');
INSERT INTO "public"."metro_info" VALUES ('369', '101020100', '12', '1226', '桂林公园', '0');
INSERT INTO "public"."metro_info" VALUES ('370', '101020100', '12', '1225', '虹漕路', '0');
INSERT INTO "public"."metro_info" VALUES ('371', '101020100', '12', '1224', '虹梅路', '0');
INSERT INTO "public"."metro_info" VALUES ('372', '101020100', '12', '1223', '东兰路', '0');
INSERT INTO "public"."metro_info" VALUES ('373', '101020100', '12', '1222', '顾戴路', '0');
INSERT INTO "public"."metro_info" VALUES ('374', '101020100', '12', '1221', '虹莘路', '0');
INSERT INTO "public"."metro_info" VALUES ('375', '101020100', '12', '1220', '七莘路', '0');
INSERT INTO "public"."metro_info" VALUES ('376', '101020100', '13', '1321', '金运路', '0');
INSERT INTO "public"."metro_info" VALUES ('377', '101020100', '13', '1322', '金沙江西路', '0');
INSERT INTO "public"."metro_info" VALUES ('378', '101020100', '13', '1323', '丰庄', '0');
INSERT INTO "public"."metro_info" VALUES ('379', '101020100', '13', '1324', '祁连山南路', '0');
INSERT INTO "public"."metro_info" VALUES ('380', '101020100', '13', '1325', '真北路', '0');
INSERT INTO "public"."metro_info" VALUES ('381', '101020100', '13', '1326', '大渡河路', '0');
INSERT INTO "public"."metro_info" VALUES ('382', '101020100', '13', '1327', '金沙江路', '0');
INSERT INTO "public"."metro_info" VALUES ('383', '101020100', '13', '1328', '隆德路', '0');
INSERT INTO "public"."metro_info" VALUES ('384', '101020100', '13', '1329', '武宁路', '0');
INSERT INTO "public"."metro_info" VALUES ('385', '101020100', '13', '1330', '长寿路', '0');
INSERT INTO "public"."metro_info" VALUES ('386', '101020100', '13', '1331', '江宁路', '0');
INSERT INTO "public"."metro_info" VALUES ('387', '101020100', '13', '1332', '汉中路', '0');
INSERT INTO "public"."metro_info" VALUES ('388', '101020100', '13', '1333', '自然博物馆', '0');
INSERT INTO "public"."metro_info" VALUES ('389', '101020100', '13', '1334', '南京西路', '0');
INSERT INTO "public"."metro_info" VALUES ('390', '101020100', '13', '1335', '淮海中路', '0');
INSERT INTO "public"."metro_info" VALUES ('391', '101020100', '13', '1336', '新天地', '0');
INSERT INTO "public"."metro_info" VALUES ('392', '101020100', '13', '1337', '马当路', '0');
INSERT INTO "public"."metro_info" VALUES ('393', '101020100', '13', '1338', '世博会博物馆', '0');
INSERT INTO "public"."metro_info" VALUES ('394', '101020100', '13', '1339', '世博大道', '0');
INSERT INTO "public"."metro_info" VALUES ('395', '101020100', '16', '1633', '滴水湖', '0');
INSERT INTO "public"."metro_info" VALUES ('396', '101020100', '16', '1632', '临港大道', '0');
INSERT INTO "public"."metro_info" VALUES ('397', '101020100', '16', '1631', '书院', '0');
INSERT INTO "public"."metro_info" VALUES ('398', '101020100', '16', '1630', '惠南东', '0');
INSERT INTO "public"."metro_info" VALUES ('399', '101020100', '16', '1629', '惠南', '0');
INSERT INTO "public"."metro_info" VALUES ('400', '101020100', '16', '1628', '野生动物园', '0');
INSERT INTO "public"."metro_info" VALUES ('401', '101020100', '16', '1627', '新场', '0');
INSERT INTO "public"."metro_info" VALUES ('402', '101020100', '16', '1626', '航头东', '0');
INSERT INTO "public"."metro_info" VALUES ('403', '101020100', '16', '1625', '鹤沙航城', '0');
INSERT INTO "public"."metro_info" VALUES ('404', '101020100', '16', '1624', '周浦东', '0');
INSERT INTO "public"."metro_info" VALUES ('405', '101020100', '16', '1623', '罗山路', '0');
INSERT INTO "public"."metro_info" VALUES ('406', '101020100', '16', '1622', '华夏中路站', '0');
INSERT INTO "public"."metro_info" VALUES ('407', '101020100', '16', '1621', '龙阳路站', '0');

-- ----------------------------
-- Table structure for module_list
-- ----------------------------
DROP TABLE IF EXISTS "public"."module_list";
CREATE TABLE "public"."module_list" (
"record_id" int4 DEFAULT nextval('moudle_list_record_id_seq'::regclass) NOT NULL,
"city_code" varchar COLLATE "default" NOT NULL,
"avbl_module_id" varchar COLLATE "default" NOT NULL,
"delete_flag" int2 DEFAULT 0 NOT NULL
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of module_list
-- ----------------------------
INSERT INTO "public"."module_list" VALUES ('1', '289', 'SH001', '0');
INSERT INTO "public"."module_list" VALUES ('2', '289', 'SH002', '0');
INSERT INTO "public"."module_list" VALUES ('3', '289', 'SH003', '0');
INSERT INTO "public"."module_list" VALUES ('4', '289', 'SH004', '0');
INSERT INTO "public"."module_list" VALUES ('5', '289', 'SH005', '0');
INSERT INTO "public"."module_list" VALUES ('6', '289', 'CX001', '0');
INSERT INTO "public"."module_list" VALUES ('7', '289', 'CX002', '0');
INSERT INTO "public"."module_list" VALUES ('8', '289', 'CX003', '0');
INSERT INTO "public"."module_list" VALUES ('9', '289', 'CX004', '0');
INSERT INTO "public"."module_list" VALUES ('10', '289', 'CX005', '0');
INSERT INTO "public"."module_list" VALUES ('13', '289', 'GJ001', '0');
INSERT INTO "public"."module_list" VALUES ('14', '289', 'GJ002', '0');
INSERT INTO "public"."module_list" VALUES ('15', '289', 'GJ003', '0');
INSERT INTO "public"."module_list" VALUES ('16', '289', 'GJ004', '0');
INSERT INTO "public"."module_list" VALUES ('18', '289', 'HJ001', '0');
INSERT INTO "public"."module_list" VALUES ('19', '289', 'HJ002', '0');

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS "public"."test";
CREATE TABLE "public"."test" (
"record_id" int4 DEFAULT nextval('test_record_id_seq'::regclass) NOT NULL,
"record" varchar COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO "public"."test" VALUES ('1', 'A');
INSERT INTO "public"."test" VALUES ('2', 'B');
INSERT INTO "public"."test" VALUES ('3', 'C');
INSERT INTO "public"."test" VALUES ('4', 'D');
INSERT INTO "public"."test" VALUES ('5', 'E');
INSERT INTO "public"."test" VALUES ('6', 'F');
INSERT INTO "public"."test" VALUES ('7', 'G');
INSERT INTO "public"."test" VALUES ('8', 'H');
INSERT INTO "public"."test" VALUES ('9', 'I');
INSERT INTO "public"."test" VALUES ('10', 'J');
INSERT INTO "public"."test" VALUES ('11', 'K');
INSERT INTO "public"."test" VALUES ('12', 'L');
INSERT INTO "public"."test" VALUES ('13', 'M');
INSERT INTO "public"."test" VALUES ('14', 'N');
INSERT INTO "public"."test" VALUES ('15', 'O');
INSERT INTO "public"."test" VALUES ('16', 'P');
INSERT INTO "public"."test" VALUES ('17', 'Q');
INSERT INTO "public"."test" VALUES ('18', 'R');
INSERT INTO "public"."test" VALUES ('19', 'S');
INSERT INTO "public"."test" VALUES ('20', 'T');
INSERT INTO "public"."test" VALUES ('21', 'U');
INSERT INTO "public"."test" VALUES ('22', 'V');
INSERT INTO "public"."test" VALUES ('23', 'W');
INSERT INTO "public"."test" VALUES ('24', 'X');
INSERT INTO "public"."test" VALUES ('25', 'Y');
INSERT INTO "public"."test" VALUES ('26', 'Z');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------
ALTER SEQUENCE "public"."api_key_record_id_seq" OWNED BY "api_key"."record_id";
ALTER SEQUENCE "public"."city_id_record_id_seq" OWNED BY "city_id"."record_id";
ALTER SEQUENCE "public"."metro_info_record_id_seq" OWNED BY "metro_info"."record_id";
ALTER SEQUENCE "public"."moudle_list_record_id_seq" OWNED BY "module_list"."record_id";
ALTER SEQUENCE "public"."test_record_id_seq" OWNED BY "test"."record_id";

-- ----------------------------
-- Primary Key structure for table api_key
-- ----------------------------
ALTER TABLE "public"."api_key" ADD PRIMARY KEY ("record_id");

-- ----------------------------
-- Primary Key structure for table city_id
-- ----------------------------
ALTER TABLE "public"."city_id" ADD PRIMARY KEY ("record_id");

-- ----------------------------
-- Primary Key structure for table metro_info
-- ----------------------------
ALTER TABLE "public"."metro_info" ADD PRIMARY KEY ("record_id");

-- ----------------------------
-- Primary Key structure for table module_list
-- ----------------------------
ALTER TABLE "public"."module_list" ADD PRIMARY KEY ("record_id");

-- ----------------------------
-- Primary Key structure for table test
-- ----------------------------
ALTER TABLE "public"."test" ADD PRIMARY KEY ("record_id");
