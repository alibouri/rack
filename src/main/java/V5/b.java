package V5;

import N5.r;
import N6.d;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

public final class b extends d implements a {
    public final Object e;

    public b(Object object0) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 5);
        this.e = object0;
    }

    public static a N(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterface0 instanceof a ? ((a)iInterface0) : new c(iBinder0, "com.google.android.gms.dynamic.IObjectWrapper", 2);  // initializer: LY5/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V
    }

    public static Object O(a a0) {
        if(a0 instanceof b) {
            return ((b)a0).e;
        }
        IBinder iBinder0 = a0.asBinder();
        Field[] arr_field = iBinder0.getClass().getDeclaredFields();
        Field field0 = null;
        int v1 = 0;
        for(int v = 0; v < arr_field.length; ++v) {
            Field field1 = arr_field[v];
            if(!field1.isSynthetic()) {
                ++v1;
                field0 = field1;
            }
        }
        if(v1 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + arr_field.length);
        }
        r.j(field0);
        if(!field0.isAccessible()) {
            field0.setAccessible(true);
            try {
                return field0.get(iBinder0);
            }
            catch(NullPointerException nullPointerException0) {
                throw new IllegalArgumentException("Binder object is null.", nullPointerException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", illegalAccessException0);
            }
        }
        throw new IllegalArgumentException("IObjectWrapper declared field not private!");
    }
}

