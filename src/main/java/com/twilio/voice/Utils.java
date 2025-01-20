package com.twilio.voice;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

class Utils {
    public static Map bundleToMap(Bundle bundle0) {
        Map map0 = new HashMap();
        for(Object object0: bundle0.keySet()) {
            ((HashMap)map0).put(((String)object0), String.valueOf(bundle0.get(((String)object0))));
        }
        return map0;
    }

    public static Handler createHandler() {
        Handler handler0;
        Looper looper0 = Looper.myLooper();
        if(looper0 == null) {
            Looper looper1 = Looper.getMainLooper();
            handler0 = looper1 == null ? null : new Handler(looper1);
        }
        else {
            handler0 = new Handler(looper0);
        }
        if(handler0 == null) {
            throw new IllegalThreadStateException("This thread must be able to obtain a Looper");
        }
        return handler0;
    }

    public static String getIPAddress(boolean z) {
        try {
            for(Object object0: Collections.list(NetworkInterface.getNetworkInterfaces())) {
                for(Object object1: Collections.list(((NetworkInterface)object0).getInetAddresses())) {
                    InetAddress inetAddress0 = (InetAddress)object1;
                    if(!inetAddress0.isLoopbackAddress()) {
                        String s = inetAddress0.getHostAddress();
                        boolean z1 = s.indexOf(58) < 0;
                        if(z) {
                            if(!z1) {
                                continue;
                            }
                            return s;
                        }
                        if(!z1) {
                            int v = s.indexOf(37);
                            return v >= 0 ? s.substring(0, v).toUpperCase() : s.toUpperCase();
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                if(false) {
                    break;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        return "";
    }

    public static boolean isAudioPermissionGranted(Context context0) {
        return context0.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0;
    }

    public static Pair mapToArrays(Map map0) {
        Pair pair0 = new Pair(new String[map0.size()], new String[map0.size()]);
        int v = 0;
        for(Object object0: map0.entrySet()) {
            String[] arr_s = (String[])pair0.first;
            arr_s[v] = (String)((Map.Entry)object0).getKey();
            String[] arr_s1 = (String[])pair0.second;
            arr_s1[v] = (String)((Map.Entry)object0).getValue();
            ++v;
        }
        return pair0;
    }

    public static String parseClientIdentity(String s) {
        return s == null ? null : s.replaceFirst("^client:", "");
    }

    public static void parseCustomParams(String s, Map map0) {
        String[] arr_s = s.split("&");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            int v1 = s1.indexOf("=");
            try {
                map0.put((v1 <= 0 ? s1 : s1.substring(0, v1)), (v1 <= 0 || s1.length() <= v1 + 1 ? null : URLDecoder.decode(s1.substring(v1 + 1).replaceAll("\\+", "%20"), "UTF-8")));
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                unsupportedEncodingException0.printStackTrace();
            }
        }
    }

    public static boolean permissionGranted(Context context0, String s) {
        return context0.checkCallingOrSelfPermission(s) == 0;
    }
}

