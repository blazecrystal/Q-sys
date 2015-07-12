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
@DBTable(catalog = "${catalog}", name = "USER", pkGenerator = "net.beyondts.bds.PKGenerator.generate")
public class User extends Extendible {
    @DBColumn(name = "ID", pk = true)
    private String id;

    @DBColumn(name = "NAME")
    private String name;

    @DBColumn(name = "PWD")
    private String pwd;

    @DBColumn(name = "MOBILE")
    private String mobile;

    @DBColumn(name = "EMAIL")
    private String email;

    @DBColumn(name = "TYPE")
    private Integer type;

    @DBColumn(name = "STATE")
    private Integer state;

    @DBColumn(name = "STATESYNC")
    private Integer stateSync;

    @DBColumn(name = "TIMECREATE")
    private Date timeCreate;

    @DBColumn(name = "TIMELOCK")
    private Date timeLock;

    @DBColumn(name = "TIMESYNC")
    private Date timeSync;

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
     * getter method for "pwd".
     * 
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * setter method for "pwd".
     * 
     * @param pwd the pwd to set
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * getter method for "mobile".
     * 
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * setter method for "mobile".
     * 
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * getter method for "email".
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * setter method for "email".
     * 
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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

    /**
     * getter method for "stateSync".
     * 
     * @return the stateSync
     */
    public Integer getStateSync() {
        return stateSync;
    }

    /**
     * setter method for "stateSync".
     * 
     * @param stateSync the stateSync to set
     */
    public void setStateSync(Integer stateSync) {
        this.stateSync = stateSync;
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
     * getter method for "timeLock".
     * 
     * @return the timeLock
     */
    public Date getTimeLock() {
        return timeLock;
    }

    /**
     * setter method for "timeLock".
     * 
     * @param timeLock the timeLock to set
     */
    public void setTimeLock(Date timeLock) {
        this.timeLock = timeLock;
    }

    /**
     * getter method for "timeSync".
     * 
     * @return the timeSync
     */
    public Date getTimeSync() {
        return timeSync;
    }

    /**
     * setter method for "timeSync".
     * 
     * @param timeSync the timeSync to set
     */
    public void setTimeSync(Date timeSync) {
        this.timeSync = timeSync;
    }
}
