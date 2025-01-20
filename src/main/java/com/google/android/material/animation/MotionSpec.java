package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import q6.a;
import q6.b;
import s.J;

public final class MotionSpec {
    public final J a;
    public final J b;

    public MotionSpec() {
        this.a = new J(0);
        this.b = new J(0);
    }

    public static MotionSpec a(Context context0, int v) {
        try {
            Animator animator0 = AnimatorInflater.loadAnimator(context0, v);
            if(animator0 instanceof AnimatorSet) {
                return MotionSpec.b(((AnimatorSet)animator0).getChildAnimations());
            }
            if(animator0 != null) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(animator0);
                return MotionSpec.b(arrayList0);
            }
            return null;
        }
        catch(Exception exception0) {
        }
        Log.w("MotionSpec", "Can\'t load animation resource ID #0x" + Integer.toHexString(v), exception0);
        return null;
    }

    public static MotionSpec b(ArrayList arrayList0) {
        MotionSpec motionSpec0 = new MotionSpec();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Animator animator0 = (Animator)arrayList0.get(v1);
            if(!(animator0 instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator0);
            }
            String s = ((ObjectAnimator)animator0).getPropertyName();
            PropertyValuesHolder[] arr_propertyValuesHolder = ((ObjectAnimator)animator0).getValues();
            motionSpec0.b.put(s, arr_propertyValuesHolder);
            String s1 = ((ObjectAnimator)animator0).getPropertyName();
            long v2 = ((ObjectAnimator)animator0).getStartDelay();
            long v3 = ((ObjectAnimator)animator0).getDuration();
            TimeInterpolator timeInterpolator0 = ((ObjectAnimator)animator0).getInterpolator();
            if(timeInterpolator0 instanceof AccelerateDecelerateInterpolator || timeInterpolator0 == null) {
                timeInterpolator0 = a.b;
            }
            else if(timeInterpolator0 instanceof AccelerateInterpolator) {
                timeInterpolator0 = a.c;
            }
            else if(timeInterpolator0 instanceof DecelerateInterpolator) {
                timeInterpolator0 = a.d;
            }
            b b0 = new b();  // initializer: Ljava/lang/Object;-><init>()V
            b0.d = 0;
            b0.e = 1;
            b0.a = v2;
            b0.b = v3;
            b0.c = timeInterpolator0;
            b0.d = ((ObjectAnimator)animator0).getRepeatCount();
            b0.e = ((ObjectAnimator)animator0).getRepeatMode();
            motionSpec0.a.put(s1, b0);
        }
        return motionSpec0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof MotionSpec ? this.a.equals(((MotionSpec)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "\n" + MotionSpec.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}

