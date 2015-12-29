/*
Navicat PGSQL Data Transfer

Source Server         : DB@121
Source Server Version : 90405
Source Host           : 172.16.66.121:5432
Source Database       : maid_pocket
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90405
File Encoding         : 65001

Date: 2015-11-19 18:11:42
*/


-- ----------------------------
-- Sequence structure for api_key_record_id_seq
-- ----------------------------
DROP SEQUENCE "public"."api_key_record_id_seq";
CREATE SEQUENCE "public"."api_key_record_id_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 3
 CACHE 1;
SELECT setval('"public"."api_key_record_id_seq"', 3, true);

-- ----------------------------
-- Sequence structure for city_id_record_id_seq
-- ----------------------------
DROP SEQUENCE "public"."city_id_record_id_seq";
CREATE SEQUENCE "public"."city_id_record_id_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 34
 CACHE 1;
SELECT setval('"public"."city_id_record_id_seq"', 34, true);

-- ----------------------------
-- Sequence structure for moudle_list_record_id_seq
-- ----------------------------
DROP SEQUENCE "public"."moudle_list_record_id_seq";
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
DROP SEQUENCE "public"."test_record_id_seq";
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
INSERT INTO "public"."api_key" VALUES ('1', 'Wikpdmp0xVzHMSDYjQ5arfAi', 'BAIDUWEB', '1000000', '2015-11-18 13:16:34', '0');
INSERT INTO "public"."api_key" VALUES ('2', '96d701108326a3e0447fb0008cf526a9', 'BAIDUAPISTORE', '1000000', '2015-11-19 11:57:55', '0');

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
INSERT INTO "public"."module_list" VALUES ('11', '289', 'CX006', '0');
INSERT INTO "public"."module_list" VALUES ('12', '289', 'CX007', '0');
INSERT INTO "public"."module_list" VALUES ('13', '289', 'GJ001', '0');
INSERT INTO "public"."module_list" VALUES ('14', '289', 'GJ002', '0');
INSERT INTO "public"."module_list" VALUES ('15', '289', 'GJ003', '0');
INSERT INTO "public"."module_list" VALUES ('16', '289', 'GJ004', '0');
INSERT INTO "public"."module_list" VALUES ('17', '289', 'GJ005', '0');
INSERT INTO "public"."module_list" VALUES ('18', '289', 'HJ001', '0');
INSERT INTO "public"."module_list" VALUES ('19', '289', 'HJ002', '0');
INSERT INTO "public"."module_list" VALUES ('20', '289', 'HJ003', '0');
INSERT INTO "public"."module_list" VALUES ('21', '289', 'SP001', '0');
INSERT INTO "public"."module_list" VALUES ('22', '289', 'SP002', '0');
INSERT INTO "public"."module_list" VALUES ('23', '289', 'JS001', '0');
INSERT INTO "public"."module_list" VALUES ('24', '289', 'JS002', '0');
INSERT INTO "public"."module_list" VALUES ('25', '289', 'JS003', '0');

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
-- Primary Key structure for table module_list
-- ----------------------------
ALTER TABLE "public"."module_list" ADD PRIMARY KEY ("record_id");

-- ----------------------------
-- Primary Key structure for table test
-- ----------------------------
ALTER TABLE "public"."test" ADD PRIMARY KEY ("record_id");
