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
@DBTable(catalog = "${catalog}", name = "ACCESS_POLICY", pkGenerator = "net.beyondts.bds.PKGenerator.generate")
public class AccessPolicy extends Extendible {
    @DBColumn(name = "ID", pk = true)
    private String id;

    @DBColumn(name = "NAME")
    private String name;

    @DBColumn(name = "CONDITIONS")
    private String conditions;

    @DBColumn(name = "CONTROL")
    private Integer control;

    @DBColumn(name = "TIMEEFF")
    private Date timeEff;

    @DBColumn(name = "TIMEEXP")
    private Date timeExp;

    @DBColumn(name = "TIMECREATE")
    private Date timeCreate;

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

    /**
     * getter method for "timeEff".
     * 
     * @return the timeEff
     */
    public Date getTimeEff() {
        return timeEff;
    }

    /**
     * setter method for "timeEff".
     * 
     * @param timeEff the timeEff to set
     */
    public void setTimeEff(Date timeEff) {
        this.timeEff = timeEff;
    }

    /**
     * getter method for "timeExp".
     * 
     * @return the timeExp
     */
    public Date getTimeExp() {
        return timeExp;
    }

    /**
     * setter method for "timeExp".
     * 
     * @param timeExp the timeExp to set
     */
    public void setTimeExp(Date timeExp) {
        this.timeExp = timeExp;
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
     * getter method for "conditions".
     * 
     * @return the conditions
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * setter method for "conditions".
     * 
     * @param conditions the conditions to set
     */
    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
}
