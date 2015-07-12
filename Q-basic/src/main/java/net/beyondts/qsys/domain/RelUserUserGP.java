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
@DBTable(catalog = "${catalog}", name = "REL_USER_USERGP")
public class RelUserUserGP extends Extendible {
    @DBColumn(name = "IDUSER")
    private String idUser;

    @DBColumn(name = "IDUSERGP")
    private String idUserGP;

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
     * getter method for "idUserGP".
     * 
     * @return the idUserGP
     */
    public String getIdUserGP() {
        return idUserGP;
    }

    /**
     * setter method for "idUserGP".
     * 
     * @param idUserGP the idUserGP to set
     */
    public void setIdUserGP(String idUserGP) {
        this.idUserGP = idUserGP;
    }
}
