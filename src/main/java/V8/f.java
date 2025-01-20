package v8;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.regex.Pattern;
import r8.c;

public abstract class f {
    static {
        Pattern.compile(",");
    }

    public static EnumMap a(Intent intent0) {
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 != null && !bundle0.isEmpty()) {
            EnumMap enumMap0 = new EnumMap(c.class);
            c[] arr_c = c.values();
            for(int v = 0; v < arr_c.length; ++v) {
                c c0 = arr_c[v];
                if(c0 != c.c0 && c0 != c.h0 && c0 != c.Z) {
                    String s = c0.name();
                    if(bundle0.containsKey(s)) {
                        Class class0 = c0.X;
                        if(class0.equals(Void.class)) {
                            enumMap0.put(c0, Boolean.TRUE);
                        }
                        else {
                            Object object0 = bundle0.get(s);
                            if(class0.isInstance(object0)) {
                                enumMap0.put(c0, object0);
                            }
                            else {
                                Log.w("f", "Ignoring hint " + c0 + " because it is not assignable from " + object0);
                            }
                        }
                    }
                }
            }
            Log.i("f", "Hints from the Intent: " + enumMap0);
            return enumMap0;
        }
        return null;
    }
}

