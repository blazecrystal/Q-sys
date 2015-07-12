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
@DBTable(catalog = "${catalog}", name = "MSG", pkGenerator = "net.beyondts.bds.PKGenerator.generate")
public class Msg extends Extendible {
    @DBColumn(name = "ID", pk = true)
    private String id;

    @DBColumn(name = "TITLE")
    private String title;

    @DBColumn(name = "CONTENT")
    private String content;

    @DBColumn(name = "PUBLISHER")
    private String publisher;

    @DBColumn(name = "TIMEPUBLILSH")
    private Date timePublish;

    @DBColumn(name = "TIMEEFF")
    private Date timeEff;

    @DBColumn(name = "TIMEEXP")
    private Date timeExp;

    @DBColumn(name = "SPREADWAY")
    private Integer spreadWay;

    @DBColumn(name = "FREQUENCY")
    private Integer frequency;

    @DBColumn(name = "FREQUENCYUNIT")
    private Integer frequencyUnit;

    @DBColumn(name = "LOGINNEEDED")
    private Integer loginNeeded;

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
     * getter method for "title".
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * setter method for "title".
     * 
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

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
     * getter method for "publisher".
     * 
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * setter method for "publisher".
     * 
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * getter method for "timePublish".
     * 
     * @return the timePublish
     */
    public Date getTimePublish() {
        return timePublish;
    }

    /**
     * setter method for "timePublish".
     * 
     * @param timePublish the timePublish to set
     */
    public void setTimePublish(Date timePublish) {
        this.timePublish = timePublish;
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
     * getter method for "spreadWay".
     * 
     * @return the spreadWay
     */
    public Integer getSpreadWay() {
        return spreadWay;
    }

    /**
     * setter method for "spreadWay".
     * 
     * @param spreadWay the spreadWay to set
     */
    public void setSpreadWay(Integer spreadWay) {
        this.spreadWay = spreadWay;
    }

    /**
     * getter method for "frequency".
     * 
     * @return the frequency
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * setter method for "frequency".
     * 
     * @param frequency the frequency to set
     */
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * getter method for "frequencyUnit".
     * 
     * @return the frequencyUnit
     */
    public Integer getFrequencyUnit() {
        return frequencyUnit;
    }

    /**
     * setter method for "frequencyUnit".
     * 
     * @param frequencyUnit the frequencyUnit to set
     */
    public void setFrequencyUnit(Integer frequencyUnit) {
        this.frequencyUnit = frequencyUnit;
    }

    /**
     * getter method for "loginNeeded".
     * 
     * @return the loginNeeded
     */
    public Integer getLoginNeeded() {
        return loginNeeded;
    }

    /**
     * setter method for "loginNeeded".
     * 
     * @param loginNeeded the loginNeeded to set
     */
    public void setLoginNeeded(Integer loginNeeded) {
        this.loginNeeded = loginNeeded;
    }
}
