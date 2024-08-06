package com.strong.designmode.behavior.responsibilitychain;

import java.text.ParseException;
import java.util.Date;

/**
 * @author zhangzhiqiang
 * @date 2022/12/8 09:48
 * @description
 */
public class Level3AuthLink extends AuthLink {

    private Date beginDate = sdf.parse("2022-12-01 00:00:00");
    private Date endDate = sdf.parse("2022-12-25 23:59:59");

    public Level3AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待三级审批负责人 ", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：三级审批负责人完成", " 时间：", sdf.format(date), " 审批人：", levelUserName);
        }

        if (authDate.before(beginDate) || authDate.after(endDate)) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：三级审批负责人完成", " 时间：", sdf.format(date), " 审批人：", levelUserName);
        }

        return next.doAuth(uId, orderId, authDate);
    }
}
