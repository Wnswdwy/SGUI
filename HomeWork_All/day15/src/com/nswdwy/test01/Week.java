package com.nswdwy.test01;

/**
 * @author yycstart
 * @create 2020-08-11 17:48
 *  enum Week {
 *     MON, TUE, WED, THU, FRI, SAT, SUN
 * }
 *
 * 给Week枚举加上属性,
 * String feel;
 */
enum Week {
    MON("开心"), TUE, WED, THU, FRI, SAT, SUN;
    String feel = "伤心";

    Week(String feel) {
        this.feel = feel;
    }

    Week() {
    }
}
