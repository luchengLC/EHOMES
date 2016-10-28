package com.example.lc.ehomes.activity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by LC on 2016/10/26.
 */

public class IsIDNumUtil {
    public static boolean isIDNumber(String IDNumber) {
        Pattern pattern = Pattern.compile("^(0|86|17951)?(13[0-9]|15[0-9]|17[0-9]|18[0-9]|14[0-9])[0-9]{8}$");
        Matcher matcher = pattern.matcher(IDNumber);
        return matcher.matches();
    }
}
