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
@DBTable(catalog = "${catalog}", name = "PWDVERIFY", pkGenerator = "net.beyondts.bds.PKGenerator.generate")
public class PWDVerify extends Extendible {
    @DBColumn(name = "ID", pk = true)
    private String id;

    @DBColumn(name = "IDUSER")
    private String idUser;

    @DBColumn(name = "TIMEVERIFY")
    private Date timeVerify;

    @DBColumn(name = "RESULT")
    private Integer result;

    @DBColumn(name = "CLIENTIP")
    private String clientIp;

    @DBColumn(name = "CASETYPE")
    private Integer caseType;

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
     * getter method for "idUser".
     * 
     * @return the idUser
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     * setter method for "idUser".
     * 
     * @param idUser the idUser to set
     */
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    /**
     * getter method for "timeVerify".
     * 
     * @return the timeVerify
     */
    public Date getTimeVerify() {
        return timeVerify;
    }

    /**
     * setter method for "timeVerify".
     * 
     * @param timeVerify the timeVerify to set
     */
    public void setTimeVerify(Date timeVerify) {
        this.timeVerify = timeVerify;
    }

    /**
     * getter method for "result".
     * 
     * @return the result
     */
    public Integer getResult() {
        return result;
    }

    /**
     * setter method for "result".
     * 
     * @param result the result to set
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * getter method for "clientIp".
     * 
     * @return the clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * setter method for "clientIp".
     * 
     * @param clientIp the clientIp to set
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * getter method for "caseType".
     * 
     * @return the caseType
     */
    public Integer getCaseType() {
        return caseType;
    }

    /**
     * setter method for "caseType".
     * 
     * @param caseType the caseType to set
     */
    public void setCaseType(Integer caseType) {
        this.caseType = caseType;
    }
}
