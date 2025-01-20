package s6;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import j6.z0;

public final class a extends io.sentry.config.a {
    public int i;
    public int j;
    public final SwipeDismissBehavior k;

    public a(SwipeDismissBehavior swipeDismissBehavior0) {
        this.k = swipeDismissBehavior0;
        this.j = -1;
    }

    @Override  // io.sentry.config.a
    public final int P(View view0) {
        return view0.getWidth();
    }

    @Override  // io.sentry.config.a
    public final void W(View view0, int v) {
        this.j = v;
        this.i = view0.getLeft();
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override  // io.sentry.config.a
    public final void X(int v) {
        this.k.getClass();
    }

    @Override  // io.sentry.config.a
    public final void Y(View view0, int v, int v1) {
        float f = (float)this.i;
        float f1 = ((float)view0.getWidth()) * this.k.d + f;
        float f2 = (float)this.i;
        float f3 = ((float)view0.getWidth()) * this.k.e + f2;
        if(Float.compare(v, f1) <= 0) {
            view0.setAlpha(1.0f);
            return;
        }
        if(Float.compare(v, f3) >= 0) {
            view0.setAlpha(0.0f);
            return;
        }
        view0.setAlpha(Math.min(Math.max(0.0f, 1.0f - (((float)v) - f1) / (f3 - f1)), 1.0f));
    }

    @Override  // io.sentry.config.a
    public final void Z(View view0, float f, float f1) {
        int v2;
        this.j = -1;
        int v = view0.getWidth();
        int v1 = Float.compare(f, 0.0f);
        boolean z = true;
        SwipeDismissBehavior swipeDismissBehavior0 = this.k;
        if(v1 == 0) {
            int v3 = view0.getLeft() - this.i;
            float f2 = (float)view0.getWidth();
            swipeDismissBehavior0.getClass();
            if(Math.abs(v3) >= Math.round(f2 * 0.5f)) {
            label_33:
                int v4 = view0.getLeft();
                int v5 = this.i;
                v2 = v4 < v5 ? v5 - v : v5 + v;
            }
            else {
                v2 = this.i;
                z = false;
            }
        }
        else {
            boolean z1 = view0.getLayoutDirection() == 1;
            switch(swipeDismissBehavior0.c) {
                case 0: {
                    if(!z1) {
                        if(v1 <= 0) {
                            v2 = this.i;
                            z = false;
                        }
                        else {
                            goto label_33;
                        }
                    }
                    else if(f >= 0.0f) {
                        v2 = this.i;
                        z = false;
                    }
                    else {
                        goto label_33;
                    }
                    break;
                }
                case 1: {
                    if(!z1) {
                        if(f >= 0.0f) {
                            v2 = this.i;
                            z = false;
                        }
                        else {
                            goto label_33;
                        }
                    }
                    else if(v1 <= 0) {
                        v2 = this.i;
                        z = false;
                    }
                    else {
                        goto label_33;
                    }
                    break;
                }
                case 2: {
                    goto label_33;
                }
                default: {
                    v2 = this.i;
                    z = false;
                }
            }
        }
        if(swipeDismissBehavior0.a.o(v2, view0.getTop())) {
            view0.postOnAnimation(new z0(swipeDismissBehavior0, view0, z));
        }
    }

    // Deobfuscation rating: LOW(20)
    @Override  // io.sentry.config.a
    public final boolean b0(View view0, int v) {
        return (this.j == -1 || this.j == v) && this.k.s(view0);
    }

    @Override  // io.sentry.config.a
    public final int y(View view0, int v) {
        int v2;
        boolean z = view0.getLayoutDirection() == 1;
        int v1 = this.k.c;
        if(v1 == 0) {
            if(z) {
                return Math.min(Math.max(this.i - view0.getWidth(), v), this.i);
            }
            v2 = this.i;
            return Math.min(Math.max(v2, v), view0.getWidth() + v2);
        }
        if(v1 == 1) {
            if(z) {
                v2 = this.i;
                return Math.min(Math.max(v2, v), view0.getWidth() + v2);
            }
            return Math.min(Math.max(this.i - view0.getWidth(), v), this.i);
        }
        v2 = this.i - view0.getWidth();
        int v3 = this.i;
        return Math.min(Math.max(v2, v), view0.getWidth() + v3);
    }

    @Override  // io.sentry.config.a
    public final int z(View view0, int v) {
        return view0.getTop();
    }
}

