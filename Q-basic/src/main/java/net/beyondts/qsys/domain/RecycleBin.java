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
 * Created at: 2015年7月1日<br/>
 * Owned by beyondts.
 * 
 * @author blazecrystal
 *
 * @version 1.0.0
 */
@DBTable(catalog = "${catalog}", name = "RECYCLE_BIN")
public class RecycleBin {
    @DBColumn(name = "CLASS")
    private String clazz;

    @DBColumn(name = "SERIALIZEDOBJ")
    private String serializedObj;

    /**
     * getter method for "clazz".
     * 
     * @return the clazz
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * setter method for "clazz".
     * 
     * @param clazz the clazz to set
     */
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    /**
     * getter method for "serializedObj".
     * 
     * @return the serializedObj
     */
    public String getSerializedObj() {
        return serializedObj;
    }

    /**
     * setter method for "serializedObj".
     * 
     * @param serializedObj the serializedObj to set
     */
    public void setSerializedObj(String serializedObj) {
        this.serializedObj = serializedObj;
    }
}
