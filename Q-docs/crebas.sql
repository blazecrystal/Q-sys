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
   CONTROL              int(1) not null comment '0������
            1���ܾ�',
   TIMEEFF              datetime not null,
   TIMEEXP              datetime,
   TIMECREATE           datetime not null,
   BUILDIN              int(1) not null comment '0������
            1����',
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
   MATCHFOR             int(1) not null comment '0��ȫƥ��
            1���û�
            2���ͻ�IP',
   TYPE                 int(1) not null comment '0����ͨ�ַ���
            1������',
   CONTROL              int(1) not null comment '0������
            1���ܾ�'
);

alter table BW_SHEET comment '�����ڶ��û������ͻ���IP���ж�';

/*==============================================================*/
/* Table: ERROR_CODE                                            */
/*==============================================================*/
create table ERROR_CODE
(
   CODE                 varchar(9) not null comment '��ʽ��BDS-XXXXX��XΪ����
            00000-09999Ϊϵͳ������
            10000-19999Ϊ������ϵͳ����
            ',
   MSG                  varchar(256) not null,
   BUILDIN              int(1) not null comment '0������
            1����',
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
   BUILDIN              int(1) not null comment '0������
            1����',
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
   FREQUENCY            int(1) not null comment '1��վ����
            2������
            4���ʼ�',
   FREQUENCYUNIT        int(1) not null comment '0����
            1����/��
            2����/��
            3����/��
            4����/��',
   LOGINNEEDED          int(1) not null comment '0����Ҫ��¼����ܲ鿴
            1������Ҫ��¼���ɲ鿴',
   BUILDIN              int(1) not null comment '0������
            1����',
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
   TARGETTYPE           int(1) not null comment '0:�û�
            1:�û���',
   BUILDIN              int(1) not null comment '0������
            1����',
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
   CASETYPE             int(1) not null comment '0����¼
            1���޸�����',
   BUILDIN              int(1) not null comment '0������
            1����',
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
   SERIALIZEDOBJ        varchar(10240) not null comment 'һ��ʹ��json���л�����'
);

alter table RECYCLE_BIN comment 'ע��ñ��д洢�Ĳ���ֱ��ԭ�����ݣ����Ƕ�Ӧ�Ķ�������л���';

/*==============================================================*/
/* Table: REL_USER_ACCESS_POLICY                                */
/*==============================================================*/
create table REL_USER_ACCESS_POLICY
(
   IDTARGET             varchar(16) not null,
   TARGETTYPE           int(1) not null comment '0:�û�
            1:�û���',
   IDRES                varchar(16) not null,
   IDPOLICY             varchar(16) not null,
   BUILDIN              int(1) not null comment '0������
            1����',
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
   BUILDIN              int(1) not null comment '0������
            1����',
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
   BUILDIN              int(1) not null comment '0������
            1����',
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
   BUILDIN              int(1) not null comment '0������
            1����',
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
   TYPE                 int(1) not null comment '1������
            2���Ż�
            3����֤
            4����ҵ
            5�����
            6���ļ�����',
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
   BUILDIN              int(1) not null comment '0������
            1����',
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
   BUILDIN              int(1) not null comment '0������
            1����',
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
   BUILDIN              int(1) not null comment '0������
            1����',
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
   TYPECOMPONENT        int(1) not null comment '1������
            2���Ż�
            3����֤
            4����ҵ
            5�����
            6���ļ�����',
   PERIOD               int(3) not null comment '��λ������
            Ĭ��5����',
   FAILTRYINTERVAL      int(3) not null comment '��λ����
            Ĭ��30��',
   FAILTRYMAX           int(3) not null comment '��λ����
            Ĭ��3��',
   OPT                  int(1) not null comment '0:alert
            1:restart',
   RATIOCPU             numeric(5,2),
   RATIOMEM             numeric(5,2),
   RATIOSTORAGE         numeric(5,2),
   RATIOJVM             numeric(5,2),
   AMOUNTTHREAD         int(5),
   BUILDIN              int(1) not null comment '0������
            1����',
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
   BUILDIN              int(1) not null comment '0������
            1����',
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
   BUILDIN              int(1) not null comment '0������
            1����',
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
   TYPE                 int(6) not null comment '100:�ӿ�
            101:�˵�
            102:ҳ��
            103:��ť
            104-199:ϵͳ��������Դ',
   PARENT               varchar(16) not null,
   TIMECREATE           datetime not null,
   STATE                int(1) not null comment '0������
            1������
            2��Ԥ��',
   BUILDIN              int(1) not null comment '0������
            1����',
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
   TYPE                 int(1) not null comment '0����Ȼ��
            1������',
   STATE                int(1) not null comment '0������
            1������',
   TIMECREATE           datetime not null,
   TIMELOCK             datetime,
   BUILDIN              int(1) not null comment '0������
            1����',
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
   BUILDIN              int(1) not null comment '0������
            1����',
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
   BUILDIN              int(1) not null comment '0������
            1����',
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

