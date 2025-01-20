package r6;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import com.google.android.material.appbar.AppBarLayout;

public abstract class e {
    public static final int[] a;

    static {
        e.a = new int[]{0x1010448};
    }

    public static void a(AppBarLayout appBarLayout0, float f) {
        int v = appBarLayout0.getResources().getInteger(0x7F0B0002);  // integer:app_bar_elevation_anim_duration
        StateListAnimator stateListAnimator0 = new StateListAnimator();
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(appBarLayout0, "elevation", new float[]{0.0f}).setDuration(((long)v));
        stateListAnimator0.addState(new int[]{0x101000E, 0x7F0403BF, 0x80FBFC40}, objectAnimator0);  // attr:state_liftable
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(appBarLayout0, "elevation", new float[]{f}).setDuration(((long)v));
        stateListAnimator0.addState(new int[]{0x101000E}, objectAnimator1);
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(appBarLayout0, "elevation", new float[]{0.0f}).setDuration(0L);
        stateListAnimator0.addState(new int[0], objectAnimator2);
        appBarLayout0.setStateListAnimator(stateListAnimator0);
    }
}

