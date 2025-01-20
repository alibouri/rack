package c;

import Nb.k;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;

public final class z extends k implements Function0 {
    public static final z X;

    static {
        z.X = new z(0);  // initializer: LNb/k;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            Field field0 = InputMethodManager.class.getDeclaredField("mServedView");
            field0.setAccessible(true);
            Field field1 = InputMethodManager.class.getDeclaredField("mNextServedView");
            field1.setAccessible(true);
            Field field2 = InputMethodManager.class.getDeclaredField("mH");
            field2.setAccessible(true);
            return new B(field2, field0, field1);
        }
        catch(NoSuchFieldException unused_ex) {
            return A.a;
        }
    }
}

