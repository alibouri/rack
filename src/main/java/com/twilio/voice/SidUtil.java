package com.twilio.voice;

import A3.e;
import M.J;
import java.security.MessageDigest;
import java.security.SecureRandom;

class SidUtil {
    private static final SecureRandom srand;

    static {
        SecureRandom secureRandom0 = new SecureRandom();
        SidUtil.srand = secureRandom0;
        secureRandom0.nextBytes(new byte[0x40]);
    }

    public static String generateGUID(String s, String s1) {
        if(s.length() > 2) {
            s = s.substring(0, 2);
        }
        StringBuilder stringBuilder0 = J.i(s);
        stringBuilder0.append(SidUtil.generateGuidHash(s1));
        return stringBuilder0.toString();
    }

    private static String generateGuidHash(String s) {
        byte[] arr_b = new byte[0x40];
        SidUtil.srand.nextBytes(arr_b);
        StringBuilder stringBuilder0 = e.w(s, new String(arr_b));
        stringBuilder0.append(System.currentTimeMillis());
        return SidUtil.md5(stringBuilder0.toString());
    }

    private static final String md5(String s) {
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("md5");
            messageDigest0.update(s.getBytes());
            byte[] arr_b = messageDigest0.digest();
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v = 0; v < arr_b.length; ++v) {
                stringBuilder0.append(String.format("%02X", ((byte)arr_b[v])));
            }
            return stringBuilder0.toString().toLowerCase();
        }
        catch(Exception unused_ex) {
            return "";
        }
    }
}

