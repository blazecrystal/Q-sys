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
@DBTable(catalog = "${catalog}", name = "USERGP", pkGenerator = "net.beyondts.bds.PKGenerator.generate")
public class UserGP extends Extendible {
    @DBColumn(name = "ID", pk = true)
    private String id;

    @DBColumn(name = "NAME")
    private String name;

    @DBColumn(name = "REMARKS")
    private String remarks;

    @DBColumn(name = "TIMECREATE")
    private Date timeCreate;

    @DBColumn(name = "CREATOR")
    private String creator;

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
     * getter method for "remarks".
     * 
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * setter method for "remarks".
     * 
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
     * getter method for "creator".
     * 
     * @return the creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * setter method for "creator".
     * 
     * @param creator the creator to set
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }
}
