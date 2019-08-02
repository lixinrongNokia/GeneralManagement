-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: localhost    Database: bash_db
-- ------------------------------------------------------
-- Server version	5.7.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department` (
  `department_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `department_name` varchar(20) NOT NULL COMMENT '部门名称',
  PRIMARY KEY (`department_id`),
  UNIQUE KEY `department_name` (`department_name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='部门表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (3,'仓库一部'),(1,'生产一部'),(2,'生产二部'),(4,'销售一部');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dictionary`
--

DROP TABLE IF EXISTS `dictionary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dictionary` (
  `dictionary_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `dictionary_table` varchar(20) DEFAULT NULL COMMENT '表名',
  `dictionary_colum` varchar(50) DEFAULT NULL COMMENT '列名',
  `dictionary_value` varchar(20) DEFAULT NULL COMMENT '值',
  `dictionary_serial_number` int(11) DEFAULT NULL COMMENT '字典序号',
  `dictionary_status` int(11) DEFAULT '1' COMMENT '状态1启用0不启用',
  `dictionary_remarks` varchar(20) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`dictionary_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dictionary`
--

LOCK TABLES `dictionary` WRITE;
/*!40000 ALTER TABLE `dictionary` DISABLE KEYS */;
/*!40000 ALTER TABLE `dictionary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dictionary_type`
--

DROP TABLE IF EXISTS `dictionary_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dictionary_type` (
  `dictionary_type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `dictionary_type_name` varchar(20) DEFAULT NULL COMMENT '字典名',
  `dictionary_type_value` varchar(50) DEFAULT NULL COMMENT '字典值',
  `dictionary_type_type` varchar(20) DEFAULT NULL COMMENT '字典类型1表2字段',
  `parent_id` int(11) DEFAULT NULL COMMENT '父级id',
  PRIMARY KEY (`dictionary_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典类型表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dictionary_type`
--

LOCK TABLES `dictionary_type` WRITE;
/*!40000 ALTER TABLE `dictionary_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `dictionary_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `employee_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工id',
  `employee_login_name` varchar(20) NOT NULL COMMENT '员工登录名称',
  `employee_login_password` varchar(32) NOT NULL COMMENT '员工登录密码',
  `employee_nick_name` varchar(20) NOT NULL COMMENT '员工昵称',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `department_id` int(11) DEFAULT NULL COMMENT '部门id',
  `job_id` int(11) DEFAULT NULL COMMENT '职位id',
  `employee_status` tinyint(1) DEFAULT '0' COMMENT '状态(0未启用1启用)',
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='员工表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'admin','e10adc3949ba59abbe56e057f20f883e','超级管理员',1,NULL,NULL,1),(2,'lili','e10adc3949ba59abbe56e057f20f883e','丽丽',73,1,NULL,1),(6,'alise','e10adc3949ba59abbe56e057f20f883e','爱丽丝',73,1,NULL,1),(7,'余辉','e10adc3949ba59abbe56e057f20f883e','腹丫',74,4,NULL,1),(8,'王小新','e10adc3949ba59abbe56e057f20f883e','宽媚',75,3,NULL,1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_info`
--

DROP TABLE IF EXISTS `employee_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_info` (
  `employee_id` int(11) NOT NULL COMMENT '员工id',
  `employee_name` varchar(20) DEFAULT NULL COMMENT '员工名称',
  `employee_sex` enum('女','男','未知') DEFAULT '未知' COMMENT '员工性别',
  `employee_email` varchar(50) DEFAULT NULL COMMENT '员工邮箱',
  `employee_phone` varchar(15) DEFAULT NULL COMMENT '员工电话',
  `employee_addr` varchar(50) DEFAULT NULL COMMENT '员工通讯地址',
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_info`
--

LOCK TABLES `employee_info` WRITE;
/*!40000 ALTER TABLE `employee_info` DISABLE KEYS */;
INSERT INTO `employee_info` VALUES (1,'李新荣','男','603239210@qq.com','18566107198','东莞万江石美'),(2,NULL,'女',NULL,NULL,NULL),(6,NULL,'未知',NULL,NULL,NULL),(7,NULL,'未知',NULL,NULL,NULL),(8,NULL,'未知',NULL,NULL,NULL);
/*!40000 ALTER TABLE `employee_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job`
--

DROP TABLE IF EXISTS `job`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `job` (
  `job_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '职位id',
  `job_name` varchar(20) NOT NULL COMMENT '职位名称',
  PRIMARY KEY (`job_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职位表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job`
--

LOCK TABLES `job` WRITE;
/*!40000 ALTER TABLE `job` DISABLE KEYS */;
/*!40000 ALTER TABLE `job` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `title` varchar(20) NOT NULL COMMENT '菜单名',
  `icon` varchar(20) DEFAULT NULL COMMENT '图标',
  `href` varchar(100) DEFAULT NULL COMMENT '资源地址',
  `perms` varchar(500) DEFAULT NULL COMMENT '权限',
  `spread` varchar(10) NOT NULL COMMENT 'true：展开，false：不展开',
  `parent_id` bigint(20) NOT NULL COMMENT '父节点',
  `sorting` bigint(20) DEFAULT NULL COMMENT '加盐',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8 COMMENT='菜单权限表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,'系统管理','&#xe68e;',NULL,NULL,'false',0,1),(2,'角色管理','&#xe613;','sys/roleListView','','false',1,-1),(3,'角色列表','','','sys:role:list','false',2,NULL),(4,'角色新增','','','sys:role:save','false',2,NULL),(5,'角色修改','','','sys:role:update','false',2,NULL),(6,'角色删除','','','sys:role:delete','false',2,NULL),(7,'菜单管理','&#xe60f;','sys/menuListView','','false',1,-3),(8,'菜单列表','','','sys:menu:list','false',7,NULL),(9,'菜单新增','','','sys:menu:save','false',7,NULL),(10,'菜单修改','','','sys:menu:update','false',7,NULL),(11,'菜单删除','','','sys:menu:delete','false',7,NULL),(12,'员工信息','&#xe770;','sys/adminListView','','false',71,-2),(15,'员工新增',NULL,NULL,'sys:admin:save','false',12,NULL),(16,'员工列表',NULL,NULL,'sys:admin:list','false',12,-4),(17,'字典类型','&#xe656;','dictionaryType/list','','false',1,-5),(18,'员工修改',NULL,NULL,'sys:admin:update','false',12,NULL),(19,'员工删除',NULL,NULL,'sys:admin:delete','false',12,NULL),(25,'员工查询',NULL,NULL,'sys:admin:get','false',12,NULL),(26,'字典','&#xe66e;','dictionary/list','','false',1,-6),(71,'部门管理','&#xe653;','','','false',0,2),(72,'部门信息','&#xe60a;','departmentManage/departmentListView','departmentManage:departmentList:browse','false',71,-1);
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `role_name` varchar(50) DEFAULT NULL COMMENT '角色名',
  `role_remark` varchar(100) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8 COMMENT='角色表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'超级管理员','超级管理员'),(73,'老板',''),(74,'员工',''),(75,'仓管','');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_menu`
--

DROP TABLE IF EXISTS `role_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_menu` (
  `menu_id` int(11) NOT NULL COMMENT '菜单ID',
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`menu_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色-菜单中间表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_menu`
--

LOCK TABLES `role_menu` WRITE;
/*!40000 ALTER TABLE `role_menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_menu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-02  8:51:01
