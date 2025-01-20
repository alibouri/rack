package M;

import I.X;

public abstract class b0 {
    static {
        int[] arr_v = new int[X.values().length];
        try {
            arr_v[1] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[2] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[0] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        b0.a = arr_v;
    }
}

