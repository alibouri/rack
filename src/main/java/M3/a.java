package m3;

import Bb.n;
import Vb.j;
import Vb.q;
import android.os.Build.VERSION;
import android.os.Build;

public abstract class a {
    public static final boolean a;

    static {
        boolean z = false;
        switch(Build.VERSION.SDK_INT) {
            case 26: {
                String s = Build.MODEL;
                if(s != null) {
                    if(q.O(j.j0("SAMSUNG-", s), "SM-", false)) {
                        z = true;
                    }
                    else {
                        String s1 = Build.DEVICE;
                        if(s1 != null) {
                            z = n.e0(new String[]{"nora", "nora_8917", "nora_8917_n", "james", "rjames_f", "rjames_go", "pettyl", "hannah", "ahannah", "rhannah", "ali", "ali_n", "aljeter", "aljeter_n", "jeter", "evert", "evert_n", "evert_nt", "G3112", "G3116", "G3121", "G3123", "G3125", "G3412", "G3416", "G3421", "G3423", "G3426", "G3212", "G3221", "G3223", "G3226", "BV6800Pro", "CatS41", "Hi9Pro", "manning", "N5702L"}, s1);
                        }
                    }
                }
                break;
            }
            case 27: {
                String s2 = Build.DEVICE;
                if(s2 != null) {
                    z = n.e0(new String[]{"mcv1s", "mcv3", "mcv5a", "mcv7a", "A30ATMO", "A70AXLTMO", "A3A_8_4G_TMO", "Edison_CKT", "EDISON_TF", "FERMI_TF", "U50A_ATT", "U50A_PLUS_ATT", "U50A_PLUS_TF", "U50APLUSTMO", "U5A_PLUS_4G", "RCT6513W87DK5e", "RCT6873W42BMF9A", "RCT6A03W13", "RCT6B03W12", "RCT6B03W13", "RCT6T06E13", "A3_Pro", "One", "One_Max", "One_Pro", "Z2", "Z2_PRO", "Armor_3", "Armor_6", "Blackview", "BV9500", "BV9500Pro", "A6L-C", "N5002LA", "N5501LA", "Power_2_Pro", "Power_5", "Z9", "V0310WW", "V0330WW", "A3", "ASUS_X018_4", "C210AE", "fireball", "ILA_X1", "Infinix-X605_sprout", "j7maxlte", "KING_KONG_3", "M10500", "S70", "S80Lite", "SGINO6", "st18c10bnn", "TECNO-CA8", "SHIFT6m"}, s2);
                }
            }
        }
        a.a = z;
    }
}

