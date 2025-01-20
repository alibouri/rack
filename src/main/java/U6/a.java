package u6;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import hb.h;

public final class a extends io.sentry.config.a {
    public final BottomSheetBehavior i;

    public a(BottomSheetBehavior bottomSheetBehavior0) {
        this.i = bottomSheetBehavior0;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // io.sentry.config.a
    public final int Q() {
        return this.i.C ? this.i.M : this.i.A;
    }

    @Override  // io.sentry.config.a
    public final void X(int v) {
        if(v == 1) {
            BottomSheetBehavior bottomSheetBehavior0 = this.i;
            if(bottomSheetBehavior0.E) {
                bottomSheetBehavior0.C(1);
            }
        }
    }

    @Override  // io.sentry.config.a
    public final void Y(View view0, int v, int v1) {
        this.i.v(v1);
    }

    @Override  // io.sentry.config.a
    public final void Z(View view0, float f, float f1) {
        int v1;
        int v = 6;
        BottomSheetBehavior bottomSheetBehavior0 = this.i;
        if(Float.compare(f1, 0.0f) >= 0) {
            if(!bottomSheetBehavior0.C || !bottomSheetBehavior0.E(view0, f1)) {
                if(Float.compare(f1, 0.0f) == 0 || Math.abs(f) > Math.abs(f1)) {
                    int v5 = view0.getTop();
                    if(!bottomSheetBehavior0.b) {
                        int v6 = bottomSheetBehavior0.y;
                        if(v5 >= v6) {
                            if(Math.abs(v5 - v6) < Math.abs(v5 - bottomSheetBehavior0.A)) {
                                v1 = bottomSheetBehavior0.y;
                            }
                            else {
                                v1 = bottomSheetBehavior0.A;
                                v = 4;
                            }
                        }
                        else if(v5 < Math.abs(v5 - bottomSheetBehavior0.A)) {
                            v1 = bottomSheetBehavior0.y();
                            v = 3;
                        }
                        else {
                            v1 = bottomSheetBehavior0.y;
                        }
                    }
                    else if(Math.abs(v5 - bottomSheetBehavior0.x) < Math.abs(v5 - bottomSheetBehavior0.A)) {
                        v1 = bottomSheetBehavior0.x;
                        v = 3;
                    }
                    else {
                        v1 = bottomSheetBehavior0.A;
                        v = 4;
                    }
                }
                else if(bottomSheetBehavior0.b) {
                    v1 = bottomSheetBehavior0.A;
                    v = 4;
                }
                else {
                    int v4 = view0.getTop();
                    if(Math.abs(v4 - bottomSheetBehavior0.y) < Math.abs(v4 - bottomSheetBehavior0.A)) {
                        v1 = bottomSheetBehavior0.y;
                    }
                    else {
                        v1 = bottomSheetBehavior0.A;
                        v = 4;
                    }
                }
            }
            else if(Math.abs(f) >= Math.abs(f1) && f1 <= 500.0f || view0.getTop() > (bottomSheetBehavior0.y() + bottomSheetBehavior0.M) / 2) {
                v1 = bottomSheetBehavior0.M;
                v = 5;
            }
            else if(bottomSheetBehavior0.b) {
                v1 = bottomSheetBehavior0.x;
                v = 3;
            }
            else if(Math.abs(view0.getTop() - bottomSheetBehavior0.y()) < Math.abs(view0.getTop() - bottomSheetBehavior0.y)) {
                v1 = bottomSheetBehavior0.y();
                v = 3;
            }
            else {
                v1 = bottomSheetBehavior0.y;
            }
        }
        else if(bottomSheetBehavior0.b) {
            v1 = bottomSheetBehavior0.x;
            v = 3;
        }
        else {
            int v2 = view0.getTop();
            int v3 = bottomSheetBehavior0.y;
            if(v2 > v3) {
                v1 = v3;
            }
            else {
                v1 = bottomSheetBehavior0.y();
                v = 3;
            }
        }
        bottomSheetBehavior0.F(view0, v, v1, true);
    }

    @Override  // io.sentry.config.a
    public final boolean b0(View view0, int v) {
        BottomSheetBehavior bottomSheetBehavior0 = this.i;
        int v1 = bottomSheetBehavior0.F;
        if(v1 == 1) {
            return false;
        }
        if(bottomSheetBehavior0.T) {
            return false;
        }
        if(v1 == 3 && bottomSheetBehavior0.R == v) {
            View view1 = bottomSheetBehavior0.O == null ? null : ((View)bottomSheetBehavior0.O.get());
            return view1 == null || !view1.canScrollVertically(-1) ? bottomSheetBehavior0.N != null && bottomSheetBehavior0.N.get() == view0 : false;
        }
        return bottomSheetBehavior0.N != null && bottomSheetBehavior0.N.get() == view0;
    }

    @Override  // io.sentry.config.a
    public final int y(View view0, int v) {
        return view0.getLeft();
    }

    @Override  // io.sentry.config.a
    public final int z(View view0, int v) {
        int v1 = this.i.y();
        return this.i.C ? h.F(v, v1, this.i.M) : h.F(v, v1, this.i.A);
    }
}

