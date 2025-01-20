package J1;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

public abstract class O {
    public static final Method a;

    static {
        if(Build.VERSION.SDK_INT == 25) {
            try {
                O.a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            }
            catch(Exception unused_ex) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static float a(ViewConfiguration viewConfiguration0, Context context0) {
        if(Build.VERSION.SDK_INT >= 25) {
            Method method0 = O.a;
            if(method0 != null) {
                try {
                    return (float)(((int)(((Integer)method0.invoke(viewConfiguration0, null)))));
                }
                catch(Exception unused_ex) {
                    Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
                }
            }
        }
        TypedValue typedValue0 = new TypedValue();
        return context0.getTheme().resolveAttribute(0x101004D, typedValue0, true) ? typedValue0.getDimension(context0.getResources().getDisplayMetrics()) : 0.0f;
    }
}

