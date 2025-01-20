package v1;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import w1.c;

public abstract class b extends c {
    public static void f(Activity activity0, String[] arr_s, int v) {
        HashSet hashSet0 = new HashSet();
        for(int v2 = 0; v2 < arr_s.length; ++v2) {
            if(TextUtils.isEmpty(arr_s[v2])) {
                throw new IllegalArgumentException(m5.b.y(new StringBuilder("Permission request for permissions "), Arrays.toString(arr_s), " must not contain null or empty values"));
            }
            if(Build.VERSION.SDK_INT < 33 && TextUtils.equals(arr_s[v2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet0.add(v2);
            }
        }
        int v3 = hashSet0.size();
        String[] arr_s1 = v3 <= 0 ? arr_s : new String[arr_s.length - v3];
        if(v3 > 0) {
            if(v3 == arr_s.length) {
                return;
            }
            int v4 = 0;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(!hashSet0.contains(v1)) {
                    arr_s1[v4] = arr_s[v1];
                    ++v4;
                }
            }
        }
        if(activity0 instanceof a) {
            ((a)activity0).getClass();
        }
        activity0.requestPermissions(arr_s, v);
    }

    public static boolean g(Activity activity0, String s) {
        int v = Build.VERSION.SDK_INT;
        if(v < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", s)) {
            return false;
        }
        if(v >= 0x20) {
            return activity0.shouldShowRequestPermissionRationale(s);
        }
        if(v == 0x1F) {
            try {
                PackageManager packageManager0 = activity0.getApplication().getPackageManager();
                return ((Boolean)PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(packageManager0, s)).booleanValue();
            }
            catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException unused_ex) {
                return activity0.shouldShowRequestPermissionRationale(s);
            }
        }
        return activity0.shouldShowRequestPermissionRationale(s);
    }
}

