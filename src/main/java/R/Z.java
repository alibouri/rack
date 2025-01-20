package r;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;

public abstract class z {
    public static void a(Drawable drawable0) {
        if(drawable0 instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable)drawable0).start();
        }
    }
}

