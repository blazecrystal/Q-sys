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
@DBTable(catalog = "${catalog}", name = "SYS_PROPERTY")
public class SysProperty extends Extendible {
    @DBColumn(name = "PROPKEY")
    private String propKey;

    @DBColumn(name = "PROPVALUE")
    private String propValue;

    @DBColumn(name = "PROPLABEL")
    private String propLabel;

    @DBColumn(name = "MODULE")
    private String module;

    /**
     * getter method for "module".
     * 
     * @return the module
     */
    public String getModule() {
        return module;
    }

    /**
     * setter method for "module".
     * 
     * @param module the module to set
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * getter method for "propKey".
     * 
     * @return the propKey
     */
    public String getPropKey() {
        return propKey;
    }

    /**
     * setter method for "propKey".
     * 
     * @param propKey the propKey to set
     */
    public void setPropKey(String propKey) {
        this.propKey = propKey;
    }

    /**
     * getter method for "propValue".
     * 
     * @return the propValue
     */
    public String getPropValue() {
        return propValue;
    }

    /**
     * setter method for "propValue".
     * 
     * @param propValue the propValue to set
     */
    public void setPropValue(String propValue) {
        this.propValue = propValue;
    }

    /**
     * getter method for "propLabel".
     * 
     * @return the propLabel
     */
    public String getPropLabel() {
        return propLabel;
    }

    /**
     * setter method for "propLabel".
     * 
     * @param propLabel the propLabel to set
     */
    public void setPropLabel(String propLabel) {
        this.propLabel = propLabel;
    }
}
