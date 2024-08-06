package com.strong.designmode.create.prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zhangzhiqiang
 * @date 2022/11/8 16:27
 * @description
 */
public class TopicRandomUtil {

    private TopicRandomUtil() {
    }

    public static Topic random(Map<String, String> option, String key) {
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);
        Collections.shuffle(keyList);
        Map<String, String> optionNew = new HashMap<>(16);
        String keyNew = null;
        int idx = 0;
        for (String next : keySet) {
            String randomKey = keyList.get(idx++);
            if (next.equals(key)) {
                keyNew = randomKey;
            }
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, keyNew);
    }
}
