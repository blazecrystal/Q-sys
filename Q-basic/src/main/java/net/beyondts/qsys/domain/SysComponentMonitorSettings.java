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
 * Created at: 2015年6月25日<br/>
 * Owned by beyondts.
 * 
 * @author blazecrystal
 *
 * @version 1.0.0
 */
@DBTable(catalog = "${catalog}", name = "SYS_COMPONENT_MONITOR_SETTINGS")
public class SysComponentMonitorSettings extends Extendible {
    @DBColumn(name = "TYPECOMPONENT")
    private Integer typeComponent;

    @DBColumn(name = "PERIOD")
    private Integer period;

    @DBColumn(name = "FAILTRYINTERVAL")
    private Integer failTryInterval;

    @DBColumn(name = "FAILTRYMAX")
    private Integer failTryMax;

    @DBColumn(name = "OPT")
    private Integer opt;

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
     * getter method for "typeComponent".
     * 
     * @return the typeComponent
     */
    public Integer getTypeComponent() {
        return typeComponent;
    }

    /**
     * setter method for "typeComponent".
     * 
     * @param typeComponent the typeComponent to set
     */
    public void setTypeComponent(Integer typeComponent) {
        this.typeComponent = typeComponent;
    }

    /**
     * getter method for "period".
     * 
     * @return the period
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * setter method for "period".
     * 
     * @param period the period to set
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * getter method for "failTryInterval".
     * 
     * @return the failTryInterval
     */
    public Integer getFailTryInterval() {
        return failTryInterval;
    }

    /**
     * setter method for "failTryInterval".
     * 
     * @param failTryInterval the failTryInterval to set
     */
    public void setFailTryInterval(Integer failTryInterval) {
        this.failTryInterval = failTryInterval;
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

    /**
     * getter method for "failTryMax".
     * 
     * @return the failTryMax
     */
    public Integer getFailTryMax() {
        return failTryMax;
    }

    /**
     * setter method for "failTryMax".
     * 
     * @param failTryMax the failTryMax to set
     */
    public void setFailTryMax(Integer failTryMax) {
        this.failTryMax = failTryMax;
    }

    /**
     * getter method for "opt".
     * 
     * @return the opt
     */
    public Integer getOpt() {
        return opt;
    }

    /**
     * setter method for "opt".
     * 
     * @param opt the opt to set
     */
    public void setOpt(Integer opt) {
        this.opt = opt;
    }
}
