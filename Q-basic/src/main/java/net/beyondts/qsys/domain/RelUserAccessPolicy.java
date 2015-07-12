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
@DBTable(catalog = "${catalog}", name = "REL_USER_ACCESS_POLICY")
public class RelUserAccessPolicy extends Extendible {
    @DBColumn(name = "IDTARGET")
    private String idTarget;

    @DBColumn(name = "TARGETTYPE")
    private Integer targetType;

    @DBColumn(name = "IDRES")
    private String idRes;

    @DBColumn(name = "IDPOLICY")
    private String idPolicy;

    /**
     * getter method for "idTarget".
     * 
     * @return the idTarget
     */
    public String getIdTarget() {
        return idTarget;
    }

    /**
     * setter method for "idTarget".
     * 
     * @param idTarget the idTarget to set
     */
    public void setIdTarget(String idTarget) {
        this.idTarget = idTarget;
    }

    /**
     * getter method for "targetType".
     * 
     * @return the targetType
     */
    public Integer getTargetType() {
        return targetType;
    }

    /**
     * setter method for "targetType".
     * 
     * @param targetType the targetType to set
     */
    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
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

    /**
     * getter method for "idPolicy".
     * 
     * @return the idPolicy
     */
    public String getIdPolicy() {
        return idPolicy;
    }

    /**
     * setter method for "idPolicy".
     * 
     * @param idPolicy the idPolicy to set
     */
    public void setIdPolicy(String idPolicy) {
        this.idPolicy = idPolicy;
    }
}
