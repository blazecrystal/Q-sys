/**
 * Copyright (c) 2014.
 * Private license for beyondts.
 * Contact beyondts for using, beyondts999@163.com
 */
package net.beyondts.qsys.domain;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Project: SecurePlatform<br/>
 * Description: <br/>
 * Created at: 2014年7月27日<br/>
 * Owned by beyondts.
 * 
 * @author blazecrystal
 *
 * @version 1.0.0
 */
public final class PKGenerator {
    private static final int COUNT_RANDOM = 16;

    public static String generate() {
        return RandomStringUtils.randomNumeric(COUNT_RANDOM);
    }
}
