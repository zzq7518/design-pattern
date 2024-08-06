package com.strong.designmode.behavior.responsibilitychain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangzhiqiang
 * @date 2022/12/8 09:41
 * @description
 */
@Getter
@Setter
public class AuthInfo {

    private String code;

    private String info = "";

    public AuthInfo(String code, String ...infos) {
        this.code = code;
        for (String str:infos){
            this.info = this.info.concat(str);
        }
    }
}
