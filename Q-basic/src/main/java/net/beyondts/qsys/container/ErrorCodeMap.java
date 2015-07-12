/**
 * Copyright (c) 2015.
 * Private license for beyondts.
 * Contact beyondts for using, beyondts999@163.com
 */
package net.beyondts.qsys.container;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.beyondts.qsys.domain.ErrorCode;

/**
 * Project: Q-basic<br/>
 * Description: <br/>
 * Created at: 2015年6月28日<br/>
 * Owned by beyondts.
 * 
 * @author blazecrystal
 *
 * @version 1.0.0
 */
public final class ErrorCodeMap {
    private static Map<String, ErrorCode> map;

    static {
        map = new HashMap<String, ErrorCode>();
    }

    public static void addErrorCode(ErrorCode errorCode) {
        map.put(errorCode.getCode(), errorCode);
    }

    public static void addErrorCodes(List<ErrorCode> errorCodes) {
        for (ErrorCode errorCode : errorCodes) {
            addErrorCode(errorCode);
        }
    }

    public static ErrorCode getErrorCode(String code) {
        return map.get(code);
    }
}
