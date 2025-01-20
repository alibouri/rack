package m3;

import android.widget.ImageView.ScaleType;
import j3.g;

public abstract class f {
    public static final int[] a;

    static {
        new int[a3.f.values().length];
        int[] arr_v = new int[ImageView.ScaleType.values().length];
        try {
            arr_v[ImageView.ScaleType.FIT_START.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        f.a = arr_v;
        new int[g.values().length];
    }
}

