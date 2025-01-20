package j6;

public abstract class n1 {
    public static final int[] a;

    static {
        int[] arr_v = new int[s0.values().length];
        n1.a = arr_v;
        try {
            arr_v[1] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            n1.a[3] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            n1.a[2] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            n1.a[0] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

