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
 * Created at: 2015年6月26日<br/>
 * Owned by beyondts.
 * 
 * @author blazecrystal
 *
 * @version 1.0.0
 */
@DBTable(catalog = "${catalog}", name = "SYS_COMPONENT", pkGenerator = "net.beyondts.bds.PKGenerator.generate")
public class SysComponent extends Extendible {
    @DBColumn(name = "ID", pk = true)
    private String id;

    @DBColumn(name = "NAME")
    private String name;

    @DBColumn(name = "TYPE")
    private Integer type;

    @DBColumn(name = "CONTEXT")
    private String context;

    @DBColumn(name = "DOMAIN")
    private String domain;

    @DBColumn(name = "IP")
    private String ip;

    @DBColumn(name = "PORT")
    private Integer port;

    @DBColumn(name = "MPORT")
    private Integer mport;

    @DBColumn(name = "ACCOUNT")
    private String account;

    @DBColumn(name = "PWD")
    private String pwd;

    @DBColumn(name = "CMDSTART")
    private String cmdStart;

    @DBColumn(name = "TIMEON")
    private Date timeOn;

    @DBColumn(name = "TIMEOFF")
    private Date timeOff;

    @DBColumn(name = "VERSION")
    private String version;

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
     * getter method for "context".
     * 
     * @return the context
     */
    public String getContext() {
        return context;
    }

    /**
     * setter method for "context".
     * 
     * @param context the context to set
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * getter method for "domain".
     * 
     * @return the domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * setter method for "domain".
     * 
     * @param domain the domain to set
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * getter method for "ip".
     * 
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * setter method for "ip".
     * 
     * @param ip the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * getter method for "port".
     * 
     * @return the port
     */
    public Integer getPort() {
        return port;
    }

    /**
     * setter method for "port".
     * 
     * @param port the port to set
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * getter method for "mport".
     * 
     * @return the mport
     */
    public Integer getMport() {
        return mport;
    }

    /**
     * setter method for "mport".
     * 
     * @param mport the mport to set
     */
    public void setMport(Integer mport) {
        this.mport = mport;
    }

    /**
     * getter method for "account".
     * 
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * setter method for "account".
     * 
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
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
     * getter method for "cmdStart".
     * 
     * @return the cmdStart
     */
    public String getCmdStart() {
        return cmdStart;
    }

    /**
     * setter method for "cmdStart".
     * 
     * @param cmdStart the cmdStart to set
     */
    public void setCmdStart(String cmdStart) {
        this.cmdStart = cmdStart;
    }

    /**
     * getter method for "timeOn".
     * 
     * @return the timeOn
     */
    public Date getTimeOn() {
        return timeOn;
    }

    /**
     * setter method for "timeOn".
     * 
     * @param timeOn the timeOn to set
     */
    public void setTimeOn(Date timeOn) {
        this.timeOn = timeOn;
    }

    /**
     * getter method for "timeOff".
     * 
     * @return the timeOff
     */
    public Date getTimeOff() {
        return timeOff;
    }

    /**
     * setter method for "timeOff".
     * 
     * @param timeOff the timeOff to set
     */
    public void setTimeOff(Date timeOff) {
        this.timeOff = timeOff;
    }

    /**
     * getter method for "version".
     * 
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * setter method for "version".
     * 
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }
}
