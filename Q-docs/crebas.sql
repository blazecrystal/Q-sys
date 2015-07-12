/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2015/7/12 18:04:42                           */
/*==============================================================*/


drop table if exists ACCESS_POLICY;

drop table if exists BW_SHEET;

drop table if exists ERROR_CODE;

drop table if exists INSITE_MSG;

drop table if exists MSG;

drop table if exists MSG_TARGET;

drop table if exists PWD_VERIFY;

drop table if exists RECYCLE_BIN;

drop table if exists REL_USER_ACCESS_POLICY;

drop table if exists REL_USER_ROLE;

drop table if exists REL_USER_USERGP;

drop table if exists ROLE;

drop table if exists SYS_COMPONENT;

drop table if exists SYS_COMPONENT_ATTR;

drop table if exists SYS_COMPONENT_MONITOR;

drop table if exists SYS_COMPONENT_MONITOR_SETTINGS;

drop table if exists SYS_PRIVILEGE_ROLE;

drop table if exists SYS_PROPERTY;

drop table if exists SYS_RES;

drop table if exists USER;

drop table if exists USERGP;

drop table if exists USER_ATTR;

/*==============================================================*/
/* Table: ACCESS_POLICY                                         */
/*==============================================================*/
create table ACCESS_POLICY
(
   ID                   varchar(16) not null,
   NAME                 varchar(64) not null,
   CONDITIONS           varchar(1024) not null,
   CONTROL              int(1) not null comment '0：允许
            1：拒绝',
   TIMEEFF              datetime not null,
   TIMEEXP              datetime,
   TIMECREATE           datetime not null,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512),
   primary key (ID)
);

/*==============================================================*/
/* Table: BW_SHEET                                              */
/*==============================================================*/
create table BW_SHEET
(
   CONTENT              varchar(256) not null,
   MATCHFOR             int(1) not null comment '0：全匹配
            1：用户
            2：客户IP',
   TYPE                 int(1) not null comment '0：普通字符串
            1：正则',
   CONTROL              int(1) not null comment '0：允许
            1：拒绝'
);

alter table BW_SHEET comment '适用于对用户名、客户端IP等判断';

/*==============================================================*/
/* Table: ERROR_CODE                                            */
/*==============================================================*/
create table ERROR_CODE
(
   CODE                 varchar(9) not null comment '格式：BDS-XXXXX，X为数字
            00000-09999为系统级错误
            10000-19999为大数据系统错误
            ',
   MSG                  varchar(256) not null,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512)
);

/*==============================================================*/
/* Table: INSITE_MSG                                            */
/*==============================================================*/
create table INSITE_MSG
(
   ID                   varchar(16) not null,
   IDMSG                varchar(16) not null,
   RECIEVER             varchar(16) not null,
   TITLE                varchar(32) not null,
   CONTENT              varchar(512) not null,
   PUBLISHER            varchar(16) not null,
   TIMERECIEVE          datetime not null,
   ALREADYREAD          int(1) not null,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512),
   primary key (ID)
);

/*==============================================================*/
/* Table: MSG                                                   */
/*==============================================================*/
create table MSG
(
   ID                   varchar(16) not null,
   TITLE                varchar(32) not null,
   CONTENT              varchar(512) not null,
   PUBLISHER            varchar(16) not null,
   TIMEPUBLISH          datetime not null,
   TIMEEFF              datetime not null,
   TIMEEXP              datetime,
   SPREADWAY            int(1) not null,
   FREQUENCY            int(1) not null comment '1：站内信
            2：短信
            4：邮件',
   FREQUENCYUNIT        int(1) not null comment '0：次
            1：次/天
            2：次/周
            3：次/月
            4：次/年',
   LOGINNEEDED          int(1) not null comment '0：需要登录后才能查看
            1：不需要登录即可查看',
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512),
   primary key (ID)
);

/*==============================================================*/
/* Table: MSG_TARGET                                            */
/*==============================================================*/
create table MSG_TARGET
(
   IDMSG                varchar(16) not null,
   IDTARGET             varchar(16) not null,
   TARGETTYPE           int(1) not null comment '0:用户
            1:用户组',
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512)
);

/*==============================================================*/
/* Table: PWD_VERIFY                                            */
/*==============================================================*/
create table PWD_VERIFY
(
   ID                   varchar(16) not null,
   IDUSER               varchar(16) not null,
   TIMEVERIFY           datetime not null,
   RESULT               int(1) not null,
   CLIENTIP             varchar(64) not null,
   CASETYPE             int(1) not null comment '0：登录
            1：修改密码',
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512),
   primary key (ID)
);

/*==============================================================*/
/* Table: RECYCLE_BIN                                           */
/*==============================================================*/
create table RECYCLE_BIN
(
   CLASS                varchar(256) not null,
   SERIALIZEDOBJ        varchar(10240) not null comment '一般使用json序列化对象'
);

alter table RECYCLE_BIN comment '注意该表中存储的不是直接原表数据，而是对应的对象的序列化串';

/*==============================================================*/
/* Table: REL_USER_ACCESS_POLICY                                */
/*==============================================================*/
create table REL_USER_ACCESS_POLICY
(
   IDTARGET             varchar(16) not null,
   TARGETTYPE           int(1) not null comment '0:用户
            1:用户组',
   IDRES                varchar(16) not null,
   IDPOLICY             varchar(16) not null,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512)
);

/*==============================================================*/
/* Table: REL_USER_ROLE                                         */
/*==============================================================*/
create table REL_USER_ROLE
(
   IDUSER               varchar(16) not null,
   IDROLE               varchar(16) not null,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512)
);

/*==============================================================*/
/* Table: REL_USER_USERGP                                       */
/*==============================================================*/
create table REL_USER_USERGP
(
   IDUSER               varchar(16) not null,
   IDUSERGP             varchar(16) not null,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512)
);

/*==============================================================*/
/* Table: ROLE                                                  */
/*==============================================================*/
create table ROLE
(
   ID                   varchar(16) not null,
   NAME                 varchar(64) not null,
   REMARKS              varchar(256),
   TIMECREATE           datetime,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512),
   primary key (ID)
);

/*==============================================================*/
/* Table: SYS_COMPONENT                                         */
/*==============================================================*/
create table SYS_COMPONENT
(
   ID                   varchar(16) not null,
   NAME                 varchar(64) not null,
   TYPE                 int(1) not null comment '1：代理
            2：门户
            3：认证
            4：作业
            5：监控
            6：文件处理',
   CONTEXT              varchar(64) not null,
   DOMAIN               varchar(256),
   IP                   varchar(64) not null,
   PORT                 int(5) not null,
   MPORT                int(5) not null,
   ACCOUNT              varchar(64),
   PWD                  varchar(256),
   CMDSTART             varchar(512),
   TIMEON               datetime not null,
   TIMEOFF              datetime,
   VERSION              varchar(16) not null,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512),
   primary key (ID)
);

/*==============================================================*/
/* Table: SYS_COMPONENT_ATTR                                    */
/*==============================================================*/
create table SYS_COMPONENT_ATTR
(
   IDCOMPONENT          varchar(16) not null,
   ATTRKEY              varchar(64) not null,
   ATTRVALUE            varchar(256) not null,
   ATTRLABEL            varchar(64) not null,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512)
);

/*==============================================================*/
/* Table: SYS_COMPONENT_MONITOR                                 */
/*==============================================================*/
create table SYS_COMPONENT_MONITOR
(
   ID                   varchar(16) not null,
   IDCOMPONENT          varchar(16) not null,
   TIMERECORD           datetime not null,
   RATIOCPU             numeric(5,2) not null,
   RATIOMEM             numeric(5,2) not null,
   RATIOSTORAGE         numeric(5,2) not null,
   RATIOJVM             numeric(5,2) not null,
   AMOUNTTHREAD         int(5) not null,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512),
   primary key (ID)
);

/*==============================================================*/
/* Table: SYS_COMPONENT_MONITOR_SETTINGS                        */
/*==============================================================*/
create table SYS_COMPONENT_MONITOR_SETTINGS
(
   TYPECOMPONENT        int(1) not null comment '1：代理
            2：门户
            3：认证
            4：作业
            5：监控
            6：文件处理',
   PERIOD               int(3) not null comment '单位：分钟
            默认5分钟',
   FAILTRYINTERVAL      int(3) not null comment '单位：秒
            默认30秒',
   FAILTRYMAX           int(3) not null comment '单位：次
            默认3次',
   OPT                  int(1) not null comment '0:alert
            1:restart',
   RATIOCPU             numeric(5,2),
   RATIOMEM             numeric(5,2),
   RATIOSTORAGE         numeric(5,2),
   RATIOJVM             numeric(5,2),
   AMOUNTTHREAD         int(5),
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512),
   primary key (TYPECOMPONENT)
);

/*==============================================================*/
/* Table: SYS_PRIVILEGE_ROLE                                    */
/*==============================================================*/
create table SYS_PRIVILEGE_ROLE
(
   IDROLE               varchar(16) not null,
   IDRES                varchar(16) not null,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512)
);

/*==============================================================*/
/* Table: SYS_PROPERTY                                          */
/*==============================================================*/
create table SYS_PROPERTY
(
   PROPKEY              varchar(64) not null,
   PROPVALUE            varchar(256) not null,
   PROPLABEL            varchar(64) not null,
   MODULE               varchar(64),
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512)
);

/*==============================================================*/
/* Table: SYS_RES                                               */
/*==============================================================*/
create table SYS_RES
(
   ID                   varchar(16) not null,
   NAME                 varchar(64) not null,
   TYPE                 int(6) not null comment '100:接口
            101:菜单
            102:页面
            103:按钮
            104-199:系统内其它资源',
   PARENT               varchar(16) not null,
   TIMECREATE           datetime not null,
   STATE                int(1) not null comment '0：正常
            1：禁用
            2：预览',
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512),
   primary key (ID)
);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   ID                   varchar(16) not null,
   NAME                 varchar(64) not null,
   PWD                  char(32) not null,
   TYPE                 int(1) not null comment '0：自然人
            1：程序',
   STATE                int(1) not null comment '0：正常
            1：锁定',
   TIMECREATE           datetime not null,
   TIMELOCK             datetime,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512),
   primary key (ID)
);

/*==============================================================*/
/* Table: USERGP                                                */
/*==============================================================*/
create table USERGP
(
   ID                   varchar(16) not null,
   NAME                 varchar(64) not null,
   REMARKS              varchar(256),
   TIMECREATE           datetime not null,
   CREATOR              varchar(16) not null,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512),
   primary key (ID)
);

/*==============================================================*/
/* Table: USER_ATTR                                             */
/*==============================================================*/
create table USER_ATTR
(
   IDUSER               varchar(16) not null,
   ATTRKEY              varchar(64) not null,
   ATTRVALUE            varchar(256) not null,
   ATTRLABEL            varchar(64) not null,
   BUILDIN              int(1) not null comment '0：不是
            1：是',
   EXT1                 varchar(512),
   EXT2                 varchar(512),
   EXT3                 varchar(512),
   EXT4                 varchar(512),
   EXT5                 varchar(512),
   EXT6                 varchar(512),
   EXT7                 varchar(512),
   EXT8                 varchar(512),
   EXT9                 varchar(512),
   EXT10                varchar(512)
);

