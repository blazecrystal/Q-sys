/**
 * Copyright (c) 2015.
 * Private license for beyondts.
 * Contact beyondts for using, beyondts999@163.com
 */
package net.beyondts.qsys.exception;

/**
 * Project: Q-basic<br/>
 * Description: <br/>
 * Created at: 2015年7月9日<br/>
 * Owned by beyondts.
 * 
 * @author blazecrystal
 *
 * @version 1.0.0
 */
public class HTTPException extends Exception {

    /**
     * UID.
     */
    private static final long serialVersionUID = -6956462182905736644L;

    private int statusCode;

    /**
     * constructor.
     * 
     */
    public HTTPException(int statusCode) {
        super();
        this.statusCode = statusCode;
    }

    /**
     * constructor.
     * 
     * @param message
     */
    public HTTPException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    /**
     * constructor.
     * 
     * @param cause
     */
    public HTTPException(int statusCode, Throwable cause) {
        super(cause);
        this.statusCode = statusCode;
    }

    /**
     * constructor.
     * 
     * @param message
     * @param cause
     */
    public HTTPException(int statusCode, String message, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
    }

    /**
     * getter method for "statusCode".
     * 
     * @return the statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }

}
