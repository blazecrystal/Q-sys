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
@DBTable(catalog = "${catalog}", name = "SYS_COMPONENT_MONITOR", pkGenerator = "net.beyondts.bds.PKGenerator.generate")
public class SysComponentMonitor extends Extendible {
    @DBColumn(name = "ID", pk = true)
    private String id;

    @DBColumn(name = "IDCOMPONENT")
    private String idComponent;

    @DBColumn(name = "TIMERECORD")
    private Date timeRecord;

    @DBColumn(name = "RATIOCPU")
    private Float ratioCPU;

    @DBColumn(name = "RATIOMEM")
    private Float ratioMEM;

    @DBColumn(name = "RATIOSTORAGE")
    private Float ratioStorage;

    @DBColumn(name = "RATIOJVM")
    private Float ratioJVM;

    @DBColumn(name = "AMOUNTTHREAD")
    private Integer amountThread;

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
     * getter method for "idComponent".
     * 
     * @return the idComponent
     */
    public String getIdComponent() {
        return idComponent;
    }

    /**
     * setter method for "idComponent".
     * 
     * @param idComponent the idComponent to set
     */
    public void setIdComponent(String idComponent) {
        this.idComponent = idComponent;
    }

    /**
     * getter method for "timeRecord".
     * 
     * @return the timeRecord
     */
    public Date getTimeRecord() {
        return timeRecord;
    }

    /**
     * setter method for "timeRecord".
     * 
     * @param timeRecord the timeRecord to set
     */
    public void setTimeRecord(Date timeRecord) {
        this.timeRecord = timeRecord;
    }

    /**
     * getter method for "ratioCPU".
     * 
     * @return the ratioCPU
     */
    public Float getRatioCPU() {
        return ratioCPU;
    }

    /**
     * setter method for "ratioCPU".
     * 
     * @param ratioCPU the ratioCPU to set
     */
    public void setRatioCPU(Float ratioCPU) {
        this.ratioCPU = ratioCPU;
    }

    /**
     * getter method for "ratioMEM".
     * 
     * @return the ratioMEM
     */
    public Float getRatioMEM() {
        return ratioMEM;
    }

    /**
     * setter method for "ratioMEM".
     * 
     * @param ratioMEM the ratioMEM to set
     */
    public void setRatioMEM(Float ratioMEM) {
        this.ratioMEM = ratioMEM;
    }

    /**
     * getter method for "ratioStorage".
     * 
     * @return the ratioStorage
     */
    public Float getRatioStorage() {
        return ratioStorage;
    }

    /**
     * setter method for "ratioStorage".
     * 
     * @param ratioStorage the ratioStorage to set
     */
    public void setRatioStorage(Float ratioStorage) {
        this.ratioStorage = ratioStorage;
    }

    /**
     * getter method for "ratioJVM".
     * 
     * @return the ratioJVM
     */
    public Float getRatioJVM() {
        return ratioJVM;
    }

    /**
     * setter method for "ratioJVM".
     * 
     * @param ratioJVM the ratioJVM to set
     */
    public void setRatioJVM(Float ratioJVM) {
        this.ratioJVM = ratioJVM;
    }

    /**
     * getter method for "amountThread".
     * 
     * @return the amountThread
     */
    public Integer getAmountThread() {
        return amountThread;
    }

    /**
     * setter method for "amountThread".
     * 
     * @param amountThread the amountThread to set
     */
    public void setAmountThread(Integer amountThread) {
        this.amountThread = amountThread;
    }
}
