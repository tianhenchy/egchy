package com.example.demo.dingding.constant;

public class DingdingEventConstant {

    /**
     * 通讯录事件
     */
    //通讯录用户增加
    public static final String USER_ADD_ORG = "user_add_org";

    //通讯录用户修改
    public static final String USER_MODIFY_ORG = "user_modify_org";

    //通讯录用户离职
    public static final String USER_LEAVE_ORG = "user_leave_org";

    //加入企业后用户激活
    public static final String USER_ACTIVE_ORG = "user_active_org";

    //通讯录用户被设置成管理员
    public static final String ORG_ADMIN_ADD = "org_admin_add";

    //通讯录用户被取消设置成管理员
    public static final String ORG_ADMIN_REMOVE = "org_admin_remove";

    //通讯录企业部门创建
    public static final String ORG_DEPT_CREATE = "org_dept_create";

    //通讯录企业部门修改
    public static final String ORG_DEPT_MODIFY = "org_dept_modify";

    //通讯录企业部门删除
    public static final String ORG_DEPT_REMOVE = "org_dept_remove";

    //企业被解散
    public static final String ORG_REMOVE = "org_remove";

    //企业信息发生变更
    public static final String ORG_CHANGE = "org_change";

    //员工角色信息发生变更
    public static final String LABEL_USER_CHANGE = "label_user_change";

    //增加角色或者角色组
    public static final String LABEL_CONF_ADD = "label_conf_add";

    //删除角色或者角色组
    public static final String LABEL_CONF_DEL = "label_conf_add";

    //修改角色或者角色组
    public static final String LABEL_CONF_MODIFY = "label_conf_modify";

    /**
     * 家校通讯录事件
     */
    //人员身份新增
    public static final String EDU_USER_INSERT = "edu_user_insert";

    //人员身份更新
    public static final String EDU_USER_UPDATE = "edu_user_update";

    //人员身份删除
    public static final String EDU_USER_DELETE = "edu_user_delete";

    //人员关系新增
    public static final String EDU_USER_RELATION_INSERT = "edu_user_relation_insert";

    //人员关系更新
    public static final String EDU_USER_RELATION_UPDATE = "edu_user_relation_update";

    //人员关系删除
    public static final String EDU_USER_RELATION_DELETE = "edu_user_relation_delete";

    //部门节点新增
    public static final String EDU_DEPT_INSERT = "edu_dept_insert";

    //部门节点更新
    public static final String EDU_DEPT_UPDATE = "edu_dept_update";

    //部分节点删除
    public static final String EDU_DEPT_DELETE = "edu_dept_delete";

}
