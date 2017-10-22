package by.tc.task01.service.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ObjectTypeValidator {
    static boolean isInt(Object object) {
        final String REGEX = "(^\\d+$)";
        String string = object.toString();
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    static boolean isDouble(Object object) {
        final String REGEX = "(^\\d+$|^\\d+.\\d+$)";
        String string = object.toString();
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
