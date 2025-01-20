package o;

import android.widget.AbsListView;
import java.lang.reflect.Field;

public abstract class d0 {
    public static final Field a;

    static {
        Field field0 = null;
        try {
            field0 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field0.setAccessible(true);
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            noSuchFieldException0.printStackTrace();
        }
        d0.a = field0;
    }
}

