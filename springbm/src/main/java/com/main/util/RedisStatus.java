package com.main.util;

import java.util.concurrent.TimeUnit;

/** 
* @Author zzy
* @Time 2020年5月18日 下午8:41:52 
* @Version 1.0
* <p>Description:</p>
*/
public abstract class RedisStatus {

    /**
     * 过期时间相关枚举
     */
    public static enum ExpireEnum{
        //未读消息的有效期为30天
        UNREAD_MSG(30L, TimeUnit.DAYS);

        /**
         * 过期时间
         */
        private Long time;
        /**
         * 时间单位
         */
        private TimeUnit timeUnit;

        ExpireEnum(Long time, TimeUnit timeUnit) {
            this.time = time;
            this.timeUnit = timeUnit;
        }

        public Long getTime() {
            return time;
        }

        public TimeUnit getTimeUnit() {
            return timeUnit;
        }
    }

}
