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
 * Created at: 2015年6月26日<br/>
 * Owned by beyondts.
 * 
 * @author blazecrystal
 *
 * @version 1.0.0
 */
@DBTable(catalog = "${catalog}", name = "MSG_TARGET")
public class MsgTarget extends Extendible {
    @DBColumn(name = "IDMSG")
    private String idMsg;

    @DBColumn(name = "IDTARGET")
    private String idTarget;

    @DBColumn(name = "TARGETTYPE")
    private Integer targetType;

    /**
     * getter method for "idMsg".
     * 
     * @return the idMsg
     */
    public String getIdMsg() {
        return idMsg;
    }

    /**
     * setter method for "idMsg".
     * 
     * @param idMsg the idMsg to set
     */
    public void setIdMsg(String idMsg) {
        this.idMsg = idMsg;
    }

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
}
