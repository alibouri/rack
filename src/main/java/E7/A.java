package e7;

import Lc.c;
import X6.e;
import X6.g;
import X6.i;
import Z6.b;
import android.os.Bundle;
import j6.t0;

public abstract class a {
    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;

    static {
        Object[] arr_object = new Object[15];
        arr_object[0] = "_in";
        arr_object[1] = "_xa";
        arr_object[2] = "_xu";
        arr_object[3] = "_aq";
        arr_object[4] = "_aa";
        arr_object[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, arr_object, 6, 9);
        g.i(15, arr_object);
        Object[] arr_object1 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        b.l(7, arr_object1);
        a.a = e.g(7, arr_object1);
        Object[] arr_object2 = {"auto", "app", "am"};
        b.l(3, arr_object2);
        a.b = e.g(3, arr_object2);
        Object[] arr_object3 = {"_r", "_dbg"};
        b.l(2, arr_object3);
        a.c = e.g(2, arr_object3);
        c c0 = new c(1);
        c0.d(t0.e);
        c0.d(t0.f);
        c0.b = true;
        a.d = e.g(c0.a, ((Object[])c0.c));
        Object[] arr_object4 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        b.l(2, arr_object4);
        a.e = e.g(2, arr_object4);
    }

    public static boolean a(String s, Bundle bundle0) {
        if(a.a.contains(s)) {
            return false;
        }
        if(bundle0 != null) {
            i i0 = a.c;
            int v = i0.size();
            int v1 = 0;
            while(v1 < v) {
                Object object0 = i0.get(v1);
                ++v1;
                if(bundle0.containsKey(((String)object0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    public static boolean b(String s, String s1) {
        if(!"_ce1".equals(s1) && !"_ce2".equals(s1)) {
            if("_ln".equals(s1)) {
                return s.equals("fcm") || s.equals("fiam");
            }
            if(a.d.contains(s1)) {
                return false;
            }
            i i0 = a.e;
            int v = i0.size();
            int v1 = 0;
            while(v1 < v) {
                Object object0 = i0.get(v1);
                ++v1;
                if(s1.matches(((String)object0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        return s.equals("fcm") || s.equals("frc");
    }

    public static boolean c(String s, String s1, Bundle bundle0) {
        if(!"_cmp".equals(s1)) {
            return true;
        }
        if(a.b.contains(s)) {
            return false;
        }
        if(bundle0 == null) {
            return false;
        }
        i i0 = a.c;
        int v = i0.size();
        int v1 = 0;
        while(v1 < v) {
            Object object0 = i0.get(v1);
            ++v1;
            if(bundle0.containsKey(((String)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        s.getClass();
        switch(s) {
            case "fcm": {
                bundle0.putString("_cis", "fcm_integration");
                return true;
            }
            case "fdl": {
                bundle0.putString("_cis", "fdl_integration");
                return true;
            }
            case "fiam": {
                bundle0.putString("_cis", "fiam_integration");
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

