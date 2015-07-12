/**
 * Copyright (c) 2014.
 * Private license for beyondts.
 * Contact beyondts for using, beyondts999@163.com
 */
package net.beyondts.qsys.http;

import java.util.ArrayList;
import java.util.List;

import net.beyondts.qsys.domain.ErrorCode;

/**
 * Project: Q-basic<br/>
 * Description: <br/>
 * Created at: 2014年8月3日<br/>
 * Owned by beyondts.
 * 
 * @author blazecrystal
 *
 * @version 1.0.0
 */
public class ActionResult {
    private boolean successful;

    private ErrorCode errorCode;

    private String message;

    private List<Object> objects;

    public static ActionResult successfulResult(String message) {
        ActionResult ar = new ActionResult();
        ar.setSuccessful(true);
        ar.setMessage(message);
        return ar;
    }

    public static ActionResult failedResult(String message, ErrorCode errorCode) {
        ActionResult ar = new ActionResult();
        ar.setSuccessful(false);
        if (errorCode != null) {
            ar.setErrorCode(errorCode);
            ar.setMessage(message + "<br/>原因：" + errorCode.getMsg());
        } else {
            ar.setMessage(message);
        }
        return ar;
    }

    public static ActionResult failedResult(String message) {
        return failedResult(message, null);
    }

    public static ActionResult exceptionResult(ErrorCode errorCode) {
        ActionResult ar = new ActionResult();
        ar.setSuccessful(false);
        ar.setErrorCode(errorCode);
        ar.setMessage(errorCode.getMsg());
        return ar;
    }

    public boolean isException() {
        return errorCode != null;
    }

    public void addObject(Object object) {
        if (this.objects == null) {
            this.objects = new ArrayList<Object>();
        }
        this.objects.add(object);
    }

    /**
     * getter method for "successful".
     * 
     * @return the successful
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * setter method for "successful".
     * 
     * @param successful the successful to set
     */
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    /**
     * getter method for "errorCode".
     * 
     * @return the errorCode
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * setter method for "errorCode".
     * 
     * @param errorCode the errorCode to set
     */
    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * getter method for "objects".
     * 
     * @return the objects
     */
    public List<Object> getObjects() {
        return objects;
    }

    /**
     * setter method for "objects".
     * 
     * @param objects the objects to set
     */
    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    /**
     * getter method for "message".
     * 
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * setter method for "message".
     * 
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
