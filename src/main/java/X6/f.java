package X6;

import java.io.Serializable;

public final class f implements Serializable {
    public final Object[] X;

    public f(Object[] arr_object) {
        this.X = arr_object;
    }

    public Object readResolve() {
        Object[] arr_object = this.X;
        switch(arr_object.length) {
            case 0: {
                return j.h0;
            }
            case 1: {
                return new k(arr_object[0]);
            }
            default: {
                Object[] arr_object1 = (Object[])arr_object.clone();
                return g.i(arr_object.length, arr_object1);
            }
        }
    }
}

