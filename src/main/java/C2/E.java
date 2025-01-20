package c2;

import Bb.q;
import O3.j;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import io.sentry.internal.debugmeta.c;

public final class e extends j {
    public final boolean Z;
    public boolean b0;
    public c c0;

    public e(X x0, boolean z) {
        Nb.j.f(x0, "operation");
        super(x0);
        this.Z = z;
    }

    public final c r(Context context0) {
        c c1;
        c c0;
        int v2;
        int v1;
        if(this.b0) {
            return this.c0;
        }
        Fragment fragment0 = ((X)this.Y).c;
        boolean z = ((X)this.Y).a == 2;
        t t0 = fragment0.I0;
        int v = t0 == null ? 0 : t0.f;
        if(!this.Z) {
            if(!z) {
                v1 = t0 == null ? 0 : t0.c;
            }
            else if(t0 != null) {
                v1 = t0.b;
            }
            else {
                v1 = 0;
            }
        }
        else if(!z) {
            v1 = t0 == null ? 0 : t0.e;
        }
        else if(t0 != null) {
            v1 = t0.d;
        }
        else {
            v1 = 0;
        }
        fragment0.R(0, 0, 0, 0);
        if(fragment0.E0 != null && fragment0.E0.getTag(0x7F0A0328) != null) {  // id:visible_removing_fragment_view_tag
            fragment0.E0.setTag(0x7F0A0328, null);  // id:visible_removing_fragment_view_tag
        }
        if(fragment0.E0 == null || fragment0.E0.getLayoutTransition() == null) {
            if(v1 == 0) {
                switch(v) {
                    case 0: {
                        break;
                    }
                    case 0x1001: {
                        v2 = z ? 0x7F020007 : 0x7F020008;  // animator:fragment_open_enter
                        v1 = v2;
                        break;
                    }
                    case 0x1003: {
                        v2 = z ? 0x7F020005 : 0x7F020006;  // animator:fragment_fade_enter
                        v1 = v2;
                        break;
                    }
                    case 4100: {
                        v2 = z ? q.a0(context0, 0x10100B8) : q.a0(context0, 0x10100B9);
                        v1 = v2;
                        break;
                    }
                    case 0x2002: {
                        v2 = z ? 0x7F020003 : 0x7F020004;  // animator:fragment_close_enter
                        v1 = v2;
                        break;
                    }
                    case 0x2005: {
                        v2 = z ? q.a0(context0, 0x10100BA) : q.a0(context0, 0x10100BB);
                        v1 = v2;
                        break;
                    }
                    default: {
                        v1 = -1;
                    }
                }
            }
            if(v1 != 0) {
                boolean z1 = "anim".equals(context0.getResources().getResourceTypeName(v1));
                if(z1) {
                    try {
                        Animation animation0 = AnimationUtils.loadAnimation(context0, v1);
                        if(animation0 == null) {
                            c1 = null;
                        }
                        else {
                            c0 = new c(9, animation0);
                            c1 = c0;
                        }
                        this.c0 = c1;
                        this.b0 = true;
                        return c1;
                    }
                    catch(Resources.NotFoundException resources$NotFoundException0) {
                    }
                    catch(RuntimeException unused_ex) {
                        goto label_66;
                    }
                    throw resources$NotFoundException0;
                }
                else {
                    try {
                    label_66:
                        Animator animator0 = AnimatorInflater.loadAnimator(context0, v1);
                        if(animator0 == null) {
                            c1 = null;
                        }
                        else {
                            c0 = new c(animator0);
                            c1 = c0;
                        }
                        this.c0 = c1;
                        this.b0 = true;
                        return c1;
                    }
                    catch(RuntimeException runtimeException0) {
                        if(z1) {
                            throw runtimeException0;
                        }
                        Animation animation1 = AnimationUtils.loadAnimation(context0, v1);
                        c1 = animation1 == null ? null : new c(9, animation1);
                    }
                    this.c0 = c1;
                    this.b0 = true;
                    return c1;
                }
            }
        }
        else {
            c1 = null;
        }
        this.c0 = c1;
        this.b0 = true;
        return c1;
    }
}

