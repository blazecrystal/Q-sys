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
@DBTable(catalog = "${catalog}", name = "ERROR_CODE")
public class ErrorCode extends Extendible {
    @DBColumn(name = "CODE")
    private String code;

    @DBColumn(name = "MSG")
    private String msg;

    /**
     * getter method for "code".
     * 
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * setter method for "code".
     * 
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * getter method for "msg".
     * 
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * setter method for "msg".
     * 
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
