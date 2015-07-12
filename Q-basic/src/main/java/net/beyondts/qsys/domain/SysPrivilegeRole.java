/**
 * Copyright (c) 2015.
 * Private license for beyondts.
 * Contact beyondts for using, beyondts999@163.com
 */
package net.beyondts.qsys.domain;

import net.beyondts.annotation.db.DBColumn;
import net.beyondts.annotation.db.DBTable;

/**
 * Project: Q-basic<br/>
 * Description: <br/>
 * Created at: 2015年6月25日<br/>
 * Owned by beyondts.
 * 
 * @author blazecrystal
 *
 * @version 1.0.0
 */
@DBTable(catalog = "${catalog}", name = "SYS_PRIVILEGE_ROLE")
public class SysPrivilegeRole extends Extendible {
    @DBColumn(name = "IDROLE")
    private String idRole;

    @DBColumn(name = "IDRES")
    private String idRes;

    /**
     * getter method for "idRole".
     * 
     * @return the idRole
     */
    public String getIdRole() {
        return idRole;
    }

    /**
     * setter method for "idRole".
     * 
     * @param idRole the idRole to set
     */
    public void setIdRole(String idRole) {
        this.idRole = idRole;
    }

    /**
     * getter method for "idRes".
     * 
     * @return the idRes
     */
    public String getIdRes() {
        return idRes;
    }

    /**
     * setter method for "idRes".
     * 
     * @param idRes the idRes to set
     */
    public void setIdRes(String idRes) {
        this.idRes = idRes;
    }
}
