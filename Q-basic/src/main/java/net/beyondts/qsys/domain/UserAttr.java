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
@DBTable(catalog = "${catalog}", name = "USER_ATTR")
public class UserAttr extends Extendible {
    @DBColumn(name = "IDUSER")
    private String idUser;

    @DBColumn(name = "ATTRKEY")
    private String attrKey;

    @DBColumn(name = "ATTRVALUE")
    private String attrValue;

    @DBColumn(name = "ATTRLABEL")
    private String attrLabel;

    /**
     * getter method for "idUser".
     * 
     * @return the idUser
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     * setter method for "idUser".
     * 
     * @param idUser the idUser to set
     */
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    /**
     * getter method for "attrKey".
     * 
     * @return the attrKey
     */
    public String getAttrKey() {
        return attrKey;
    }

    /**
     * setter method for "attrKey".
     * 
     * @param attrKey the attrKey to set
     */
    public void setAttrKey(String attrKey) {
        this.attrKey = attrKey;
    }

    /**
     * getter method for "attrValue".
     * 
     * @return the attrValue
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * setter method for "attrValue".
     * 
     * @param attrValue the attrValue to set
     */
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * getter method for "attrLabel".
     * 
     * @return the attrLabel
     */
    public String getAttrLabel() {
        return attrLabel;
    }

    /**
     * setter method for "attrLabel".
     * 
     * @param attrLabel the attrLabel to set
     */
    public void setAttrLabel(String attrLabel) {
        this.attrLabel = attrLabel;
    }
}
