/**
 * Copyright (c) 2015.
 * Private license for beyondts.
 * Contact beyondts for using, beyondts999@163.com
 */
package net.beyondts.qsys.domain;

import java.util.Date;

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
@DBTable(catalog = "${catalog}", name = "SYS_RES", pkGenerator = "net.beyondts.bds.PKGenerator.generate")
public class SysRes extends Extendible {
    @DBColumn(name = "ID", pk = true)
    private String id;

    @DBColumn(name = "NAME")
    private String name;

    @DBColumn(name = "TYPE")
    private Integer type;

    @DBColumn(name = "PARENT")
    private String parent;

    @DBColumn(name = "TIMECREATE")
    private Date timeCreate;

    @DBColumn(name = "STATE")
    private Integer state;

    /**
     * getter method for "id".
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * setter method for "id".
     * 
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * getter method for "name".
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * setter method for "name".
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * getter method for "parent".
     * 
     * @return the parent
     */
    public String getParent() {
        return parent;
    }

    /**
     * setter method for "parent".
     * 
     * @param parent the parent to set
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * getter method for "timeCreate".
     * 
     * @return the timeCreate
     */
    public Date getTimeCreate() {
        return timeCreate;
    }

    /**
     * setter method for "timeCreate".
     * 
     * @param timeCreate the timeCreate to set
     */
    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    /**
     * getter method for "state".
     * 
     * @return the state
     */
    public Integer getState() {
        return state;
    }

    /**
     * setter method for "state".
     * 
     * @param state the state to set
     */
    public void setState(Integer state) {
        this.state = state;
    }
}
