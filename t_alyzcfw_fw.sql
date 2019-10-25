/*
Navicat MySQL Data Transfer

Source Server         : aly_wfw_kfzpt
Source Server Version : 50616
Source Host           : rm-uf6ak4u0270j42slto.mysql.rds.aliyuncs.com:3306
Source Database       : aly_wfw_kfzpt

Target Server Type    : MYSQL
Target Server Version : 50616
File Encoding         : 65001

Date: 2019-05-17 03:56:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_alyzcfw_fw
-- ----------------------------
DROP TABLE IF EXISTS `t_alyzcfw_fw`;
CREATE TABLE `t_alyzcfw_fw` (
  `ID` varchar(32) NOT NULL COMMENT '主键ID',
  `FWMC` varchar(100) DEFAULT NULL COMMENT '服务名称',
  `FWMS` varchar(200) DEFAULT NULL COMMENT '服务描述',
  `FWFL_ID` varchar(32) DEFAULT NULL COMMENT '服务分类ID',
  `LRRQ` datetime DEFAULT NULL COMMENT '录入日期',
  `XGRQ` datetime DEFAULT NULL COMMENT '修改日期',
  `YXBZ` char(1) DEFAULT NULL COMMENT '有效标志',
  `SCBZ` char(1) DEFAULT NULL COMMENT '删除标志',
  `ICON_ID` varchar(50) DEFAULT NULL COMMENT '图标ID',
  `URL` varchar(200) DEFAULT NULL COMMENT '导航地址',
  `XH` decimal(10,0) DEFAULT NULL,
  `API_URL` varchar(200) DEFAULT NULL COMMENT '后台api地址',
  `PCH` varchar(32) DEFAULT NULL COMMENT 'swagger接口同步批次号',
  `zssx` int(11) DEFAULT NULL COMMENT '展示顺序（前台用）',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_alyzcfw_fw
-- ----------------------------
INSERT INTO `t_alyzcfw_fw` VALUES ('02493ebaeb2d4e23b50d7fa64af0f2da', '对象存储', '对海量图片、视频、音频、文件的集中存储，实现上传、下载、压缩、分享', '3ebfa3b2f9b44eecaf0ed41e307449fc', '2019-03-02 12:56:14', '2019-03-18 15:31:38', 'Y', 'N', 'alyzcfw_icon_1552893355352', 'http://106.15.92.96:20050/lcyq/#/lcconfig/lcjm/index', '4', 'http://106.15.92.96:20052', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('0cd098e89316476eb4bdbd8e701e04da', '大数据管理门户项目', '更快，更稳定，更好用', 'ccfae42c79584662b7b32dfc115dc0f8', '2019-03-02 13:18:45', '2019-03-18 15:17:55', 'Y', 'Y', 'alyzcfw_icon_1551503927837', 'http://106.15.92.96:20050', '0', 'http://47.100.196.53:20051', '45cf2684424a48e3a4206f4a84c3eb8d', null);
INSERT INTO `t_alyzcfw_fw` VALUES ('1ae8992256794158ac1d548c92e00a66', '数据脱敏', '自动化识别数据库中敏感数据，基于算法高效对二级数据环境进行脱敏，确保信息安全', 'ccfae42c79584662b7b32dfc115dc0f8', '2019-03-18 15:20:22', '2019-03-18 15:20:23', 'Y', 'N', 'alyzcfw_icon_1552893623021', '1', '6', '1', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('22a100464b7f4543b8e9553cd66fc0ee', '工作流', '可视化流程建模与规则配置，系统运行工作流程实现工作协同，并监控流程运行', '3ebfa3b2f9b44eecaf0ed41e307449fc', '2019-03-02 12:55:12', '2019-03-18 15:31:25', 'Y', 'N', 'alyzcfw_icon_1552893335621', 'http://106.15.92.96:20100', '3', 'http://106.15.92.96:20100', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('34416eacc18a438a9217e334f3040844', '动态菜单', '根据后台结构化数据，动态产生绑定权限、可收藏检索、分布式运行的菜单', '3ebfa3b2f9b44eecaf0ed41e307449fc', '2019-03-18 15:16:36', '2019-03-18 15:31:50', 'Y', 'N', 'alyzcfw_icon_1552893396639', '1', '5', '1', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('3a3a1a9519f84ea59d1a0ee560fd242e', '大数据管理综合项目', '秒级处理 , 实时更新', 'ccfae42c79584662b7b32dfc115dc0f8', '2019-03-02 13:19:39', '2019-03-18 15:18:00', 'Y', 'Y', 'alyzcfw_icon_1551503982182', 'http://106.15.92.96:20050/general', '0', 'http://47.100.196.53:20061', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('4d3d6eb261df4915afb6fa5ef13c52a7', '数据服务', '缩短数据与业务的距离，提供标签、自定义分析、数据接口、订阅推送等服务手段', 'ccfae42c79584662b7b32dfc115dc0f8', '2019-03-02 13:07:32', '2019-03-18 15:19:50', 'Y', 'N', 'alyzcfw_icon_1552893590494', 'http://106.15.92.96:20050/sjzlgl', '11', 'http://47.100.196.53:20021', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('50e71ad956f34592adc28b3bdd2fa716', '大数据管理单点登录项目', '更快，更稳定，更好用', 'ccfae42c79584662b7b32dfc115dc0f8', '2019-03-02 13:16:54', '2019-03-18 15:17:51', 'Y', 'Y', 'alyzcfw_icon_1551503817557', 'http://106.15.92.96:20040', '14', null, null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('515879574a054a45b43b42aa77dec56c', 'q2', '1111111111111', 'cf1f5913d4d64d26ae04214a1de9829b', '2019-05-07 09:30:28', '2019-05-10 17:19:08', 'Y', 'N', null, 'q', '1', 'q', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('6922c34563cf4060abe06159bdd4f92c', '统计分析', '在线配置分析功能的各类属性，运行时动态渲染分析功能，高效支撑分析类需求', 'cf1f5913d4d64d26ae04214a1de9829b', '2019-03-01 17:15:01', '2019-03-18 15:12:59', 'Y', 'N', 'alyzcfw_icon_1552893179619', 'http://106.15.92.96:17010', '1', 'http://47.100.196.53:17012', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('8051a9a25ba64ac98b4dd0325f285f81', '任务调度', '配置任务的运行属性，系统多线程运行各类周期性任务', '3ebfa3b2f9b44eecaf0ed41e307449fc', '2019-03-02 12:53:43', '2019-03-18 15:31:12', 'Y', 'N', 'alyzcfw_icon_1552893310161', 'http://106.15.92.96', '2', 'http://47.100.196.53:18080', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('853d37740a5b41fb9b8d5f782ad094d2', '数据管理', '业务标准化、信息数据标准化', 'ccfae42c79584662b7b32dfc115dc0f8', '2019-03-02 13:06:39', '2019-03-18 15:19:16', 'Y', 'N', 'alyzcfw_icon_1552893556756', 'http://106.15.92.96:20050/sjbzgl', '10', 'http://47.100.196.53:20011', 'fc900c98f5de4026ac9db3e2dddf7050', null);
INSERT INTO `t_alyzcfw_fw` VALUES ('8927becd7b1f4cf0a6705a07d033d20e', '数据集成', '配置数据集成上云上云的映射规则与任务，自动化高效地完成数据集成', 'ccfae42c79584662b7b32dfc115dc0f8', '2019-03-02 13:16:10', '2019-05-10 15:52:37', 'Y', 'N', 'alyzcfw_icon_1552893508006', 'http://106.15.92.96:20050/ysjgl', '0', 'http://47.100.196.53:20031', '38a03dbf1de54d4597a5d89022c63a04', null);
INSERT INTO `t_alyzcfw_fw` VALUES ('99cf8e56aad44f7791bf91d62ec22cd4', '关系网络', '在线配置关系网络的各类属性，动态渲染关系网络并支持人机交互，高效支撑关系类需求', 'cf1f5913d4d64d26ae04214a1de9829b', '2019-03-01 17:49:50', '2019-03-18 16:02:55', 'Y', 'N', 'alyzcfw_icon_1551433793372', 'http://106.15.92.96:20050/rwglpt', '5', 'http://47.100.196.53:19162', '93caf01b57f241afa872550bd7eadd78', null);
INSERT INTO `t_alyzcfw_fw` VALUES ('b9f95defa5ad4a7d8312ef0bcb91f56e', '通用查询', '在线配置查询功能的各类属性，运行时动态渲染查询功能，高效支撑查询类需求', 'cf1f5913d4d64d26ae04214a1de9829b', '2019-03-01 17:48:20', '2019-03-18 15:13:29', 'Y', 'N', 'alyzcfw_icon_1552893208990', 'http://106.15.92.96:17020', '2', 'http://47.100.196.53:17022', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('be559537212e425dbfb5a384ca679797', '1', '3', null, '2019-05-10 17:20:53', '2019-05-10 17:22:08', 'N', 'Y', null, '3', '3', '2', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('c377e62897cc472e843d12bb80ea0805', '消息服务', '以统一的接口服务实现对消息的发送、检索、查阅、归档', '3ebfa3b2f9b44eecaf0ed41e307449fc', '2019-03-18 15:17:23', '2019-03-18 15:17:24', 'Y', 'N', 'alyzcfw_icon_1552893444170', '1', '6', '1', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('c3edf785ea664377a39377b902328bd5', '权限管理', '实现用户对象对应用系统的各类资源的访问控制，达到安全访问与管控要求', '3ebfa3b2f9b44eecaf0ed41e307449fc', '2019-03-07 10:57:34', '2019-03-18 16:01:44', 'Y', 'N', 'alyzcfw_icon_1552893281714', 'http://gzhyht.ihyht.com:21999', '1', 'http://gzhyht.ihyht.com:14000', 'eb5fc8f32cc44b44b617f1f1839f4522', null);
INSERT INTO `t_alyzcfw_fw` VALUES ('e5131b3f350940c2bd49239c4d5d01d7', '互联网采集', '配置采集需求、爬虫规则、爬取任务，自动化多线程采集各类互联网信息资源', 'ccfae42c79584662b7b32dfc115dc0f8', '2019-03-02 13:05:53', '2019-03-18 15:18:57', 'Y', 'N', 'alyzcfw_icon_1552893537694', 'http://106.15.92.96:19150', '9', 'http://106.14.126.206:19152', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('f588f62d281e4f5c88e0ce7cb76cfae9', '图表监控', '在线配置监控功能的各类属性，运行时动态展示总体监控，高效支撑监控类需求', 'cf1f5913d4d64d26ae04214a1de9829b', '2019-03-01 17:49:11', '2019-03-18 16:26:19', 'Y', 'N', 'alyzcfw_icon_1551433754140', 'http://106.15.92.96:17030', '3', 'http://47.100.196.53:17032', null, null);
INSERT INTO `t_alyzcfw_fw` VALUES ('fdacf9fba80e4100b56c9ba083447e84', '互联网采集平台', '精准抓取、标准归类', 'cf1f5913d4d64d26ae04214a1de9829b', '2019-03-02 10:18:03', '2019-03-18 15:04:08', 'Y', 'Y', 'alyzcfw_icon_1551493085920', 'http://ihyht.iok.la:19001/', '5', 'http://ihyht.iok.la:19001/hlwcjapi/', 'ac5316e6cbbe40a593314defad4431d7', null);
