package com.pluralsight;

public class nameFormatter {
    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        String result = lastName + ", ";
        if (prefix != null && !prefix.isEmpty()) {
            result += prefix + " ";
        }
        if (suffix != null && !suffix.isEmpty()) {
            result += ", " + suffix;
        }
        result += firstName;

        if (middleName != null && !middleName.isEmpty()) {
            result += " " + middleName;
        }

        if (suffix != null && !suffix.isEmpty()) {
            result += ", " + suffix;
        }

        return result;
    }

    public static String format(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            return "";
        }

        String prefix = "";
        String first = "";
        String middle = "";
        String last = "";
        String suffix = "";

        String[] parts = fullName.split(",", 2);
        String mainPart = parts[0].trim();
        if (parts.length > 1) {
            suffix = parts[1].trim();
        }

        String[] words = mainPart.split(" ");
        if (words.length == 4) {
            prefix = words[0];
            first = words[1];
            middle = words[2];
            last = words[3];
        } else if (words.length == 3) {
            if (words[0].endsWith(".")) {
                prefix = words[0];
                first = words[1];
                last = words[2];
            } else {
                first = words[0];
                middle = words[1];
                last = words[2];
            }
        } else if (words.length == 2) {
            first = words[0];
            last = words[1];
        }
        return format(prefix, first, middle, last, suffix);
    }
}
