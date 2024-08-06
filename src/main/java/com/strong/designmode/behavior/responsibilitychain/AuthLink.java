package com.strong.designmode.behavior.responsibilitychain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhangzhiqiang
 * @date 2022/12/8 09:43
 * @description
 */
public abstract class AuthLink {

    protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    protected String levelUserId;

    protected String levelUserName;

    private AuthLink next;

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink next() {
        return next;
    }

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    public abstract AuthInfo doAuth(String uId, String orderId, Date data);
}
