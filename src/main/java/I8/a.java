package i8;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public abstract class a {
    public static final TimeZone a;

    static {
        a.a = TimeZone.getTimeZone("UTC");
    }

    public static boolean a(String s, int v, char c) {
        return v < s.length() && s.charAt(v) == c;
    }

    public static Date b(String s, ParsePosition parsePosition0) {
        int v19;
        int v17;
        int v16;
        int v15;
        int v11;
        try {
            int v = parsePosition0.getIndex();
            int v1 = v + 4;
            int v2 = a.c(v, v1, s);
            if(a.a(s, v1, '-')) {
                v1 = v + 5;
            }
            int v3 = v1 + 2;
            int v4 = a.c(v1, v3, s);
            if(a.a(s, v3, '-')) {
                v3 = v1 + 3;
            }
            int v5 = v3 + 2;
            int v6 = a.c(v3, v5, s);
            boolean z = a.a(s, v5, 'T');
            if(!z && s.length() <= v5) {
                GregorianCalendar gregorianCalendar0 = new GregorianCalendar(v2, v4 - 1, v6);
                parsePosition0.setIndex(v5);
                return gregorianCalendar0.getTime();
            }
            if(z) {
                int v7 = v3 + 5;
                int v8 = a.c(v3 + 3, v7, s);
                if(a.a(s, v7, ':')) {
                    v7 = v3 + 6;
                }
                int v9 = v7 + 2;
                int v10 = a.c(v7, v9, s);
                if(a.a(s, v9, ':')) {
                    v9 = v7 + 3;
                }
                if(s.length() <= v9 || (s.charAt(v9) == 43 || s.charAt(v9) == 45 || s.charAt(v9) == 90)) {
                    v17 = v10;
                    v15 = 0;
                    v11 = 0;
                    v5 = v9;
                    v16 = v8;
                }
                else {
                    v11 = a.c(v9, v9 + 2, s);
                    if(v11 > 59 && v11 < 0x3F) {
                        v11 = 59;
                    }
                    if(a.a(s, v9 + 2, '.')) {
                        int v12;
                        for(v12 = v9 + 4; true; ++v12) {
                            if(v12 >= s.length()) {
                                v12 = s.length();
                                break;
                            }
                            int v13 = s.charAt(v12);
                            if(v13 < 0x30 || v13 > 57) {
                                break;
                            }
                        }
                        int v14 = Math.min(v12, v9 + 6);
                        v15 = a.c(v9 + 3, v14, s);
                        switch(v14 - (v9 + 3)) {
                            case 1: {
                                v15 *= 100;
                                break;
                            }
                            case 2: {
                                v15 *= 10;
                            }
                        }
                        v16 = v8;
                        v5 = v12;
                        v17 = v10;
                    }
                    else {
                        v16 = v8;
                        v5 = v9 + 2;
                        v17 = v10;
                        v15 = 0;
                    }
                }
            }
            else {
                v16 = 0;
                v15 = 0;
                v17 = 0;
                v11 = 0;
            }
            if(s.length() <= v5) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            int v18 = s.charAt(v5);
            TimeZone timeZone0 = a.a;
            if(v18 == 90) {
                v19 = v5 + 1;
            }
            else {
                if(v18 != 43 && v18 != 45) {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator \'" + ((char)v18) + "\'");
                }
                String s1 = s.substring(v5);
                s1 = s1.length() >= 5 ? s.substring(v5) : s1 + "00";
                v19 = v5 + s1.length();
                if(!"+0000".equals(s1) && !"+00:00".equals(s1)) {
                    timeZone0 = TimeZone.getTimeZone(("GMT" + s1));
                    String s2 = timeZone0.getID();
                    if(!s2.equals("GMT" + s1) && !s2.replace(":", "").equals("GMT" + s1)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + ("GMT" + s1) + " given, resolves to " + timeZone0.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar1 = new GregorianCalendar(timeZone0);
            gregorianCalendar1.setLenient(false);
            gregorianCalendar1.set(1, v2);
            gregorianCalendar1.set(2, v4 - 1);
            gregorianCalendar1.set(5, v6);
            gregorianCalendar1.set(11, v16);
            gregorianCalendar1.set(12, v17);
            gregorianCalendar1.set(13, v11);
            gregorianCalendar1.set(14, v15);
            parsePosition0.setIndex(v19);
            return gregorianCalendar1.getTime();
        }
        catch(IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException indexOutOfBoundsException0) {
        }
        String s3 = indexOutOfBoundsException0.getMessage();
        ParseException parseException0 = new ParseException("Failed to parse date [" + (s == null ? null : "\"" + s + '\"') + "]: " + (s3 != null && !s3.isEmpty() ? indexOutOfBoundsException0.getMessage() : "(" + indexOutOfBoundsException0.getClass().getName() + ")"), parsePosition0.getIndex());
        parseException0.initCause(indexOutOfBoundsException0);
        throw parseException0;
    }

    public static int c(int v, int v1, String s) {
        int v4;
        int v2;
        if(v < 0 || v1 > s.length() || v > v1) {
            throw new NumberFormatException(s);
        }
        if(v < v1) {
            v2 = v + 1;
            int v3 = Character.digit(s.charAt(v), 10);
            if(v3 < 0) {
                throw new NumberFormatException("Invalid number: " + s.substring(v, v1));
            }
            v4 = -v3;
        }
        else {
            v4 = 0;
            v2 = v;
        }
        while(v2 < v1) {
            int v5 = Character.digit(s.charAt(v2), 10);
            if(v5 < 0) {
                throw new NumberFormatException("Invalid number: " + s.substring(v, v1));
            }
            v4 = v4 * 10 - v5;
            ++v2;
        }
        return -v4;
    }
}

