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
@DBTable(catalog = "${catalog}", name = "BW_SHEET")
public class BWSheet {
    @DBColumn(name = "CONTENT")
    private String content;

    @DBColumn(name = "MATCHFOR")
    private Integer matchFor;

    @DBColumn(name = "TYPE")
    private Integer type;

    @DBColumn(name = "CONTROL")
    private Integer control;

    /**
     * getter method for "content".
     * 
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * setter method for "content".
     * 
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * getter method for "matchFor".
     * 
     * @return the matchFor
     */
    public Integer getMatchFor() {
        return matchFor;
    }

    /**
     * setter method for "matchFor".
     * 
     * @param matchFor the matchFor to set
     */
    public void setMatchFor(Integer matchFor) {
        this.matchFor = matchFor;
    }

    /**
     * getter method for "type".
     * 
     * @return the type
     */
    public Integer getType() {
        return type;
    }

    /**
     * setter method for "type".
     * 
     * @param type the type to set
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * getter method for "control".
     * 
     * @return the control
     */
    public Integer getControl() {
        return control;
    }

    /**
     * setter method for "control".
     * 
     * @param control the control to set
     */
    public void setControl(Integer control) {
        this.control = control;
    }
}
