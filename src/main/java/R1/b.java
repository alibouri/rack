package r1;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import o1.a;

public abstract class b extends View {
    public int[] b0;
    public int c0;
    public Context d0;
    public a e0;
    public String f0;
    public String g0;
    public HashMap h0;

    public final void a(String s) {
        int v;
        if(s != null && s.length() != 0) {
            Context context0 = this.d0;
            if(context0 == null) {
                return;
            }
            String s1 = s.trim();
            ConstraintLayout constraintLayout0 = this.getParent() instanceof ConstraintLayout ? ((ConstraintLayout)this.getParent()) : null;
            if(!this.isInEditMode() || constraintLayout0 == null) {
                v = 0;
            }
            else {
                Object object0 = !(s1 instanceof String) || (constraintLayout0.n0 == null || !constraintLayout0.n0.containsKey(s1)) ? null : constraintLayout0.n0.get(s1);
                v = object0 instanceof Integer ? ((int)(((Integer)object0))) : 0;
            }
            if(v == 0 && constraintLayout0 != null) {
                v = this.d(constraintLayout0, s1);
            }
            if(v == 0) {
                try {
                    v = m.class.getField(s1).getInt(null);
                }
                catch(Exception unused_ex) {
                }
            }
            if(v == 0) {
                v = context0.getResources().getIdentifier(s1, "id", "com.wave.personal");
            }
            if(v != 0) {
                this.h0.put(v, s1);
                this.b(v);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + s1 + "\"");
        }
    }

    public final void b(int v) {
        if(v == this.getId()) {
            return;
        }
        int[] arr_v = this.b0;
        if(this.c0 + 1 > arr_v.length) {
            this.b0 = Arrays.copyOf(arr_v, arr_v.length * 2);
        }
        int v1 = this.c0;
        this.b0[v1] = v;
        this.c0 = v1 + 1;
    }

    public final void c(String s) {
        if(s == null || s.length() == 0 || this.d0 == null) {
            return;
        }
        String s1 = s.trim();
        ConstraintLayout constraintLayout0 = this.getParent() instanceof ConstraintLayout ? ((ConstraintLayout)this.getParent()) : null;
        if(constraintLayout0 == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int v = constraintLayout0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = constraintLayout0.getChildAt(v1);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if(viewGroup$LayoutParams0 instanceof d && s1.equals(((d)viewGroup$LayoutParams0).Y)) {
                if(view0.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + view0.getClass().getSimpleName() + " must have an ID");
                }
                else {
                    this.b(view0.getId());
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout0, String s) {
        if(s != null && constraintLayout0 != null) {
            Resources resources0 = this.d0.getResources();
            if(resources0 == null) {
                return 0;
            }
            int v = constraintLayout0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = constraintLayout0.getChildAt(v1);
                if(view0.getId() != -1) {
                    try {
                        String s1 = null;
                        s1 = resources0.getResourceEntryName(view0.getId());
                    }
                    catch(Resources.NotFoundException unused_ex) {
                    }
                    if(s.equals(s1)) {
                        return view0.getId();
                    }
                }
            }
        }
        return 0;
    }

    public final void e() {
        if(this.e0 == null) {
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof d) {
            ((d)viewGroup$LayoutParams0).p0 = this.e0;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.b0, this.c0);
    }

    @Override  // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String s = this.f0;
        if(s != null) {
            this.setIds(s);
        }
        String s1 = this.g0;
        if(s1 != null) {
            this.setReferenceTags(s1);
        }
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    public void setIds(String s) {
        this.f0 = s;
        if(s == null) {
            return;
        }
        int v = 0;
        this.c0 = 0;
        int v1;
        while((v1 = s.indexOf(44, v)) != -1) {
            this.a(s.substring(v, v1));
            v = v1 + 1;
        }
        this.a(s.substring(v));
    }

    public void setReferenceTags(String s) {
        this.g0 = s;
        if(s == null) {
            return;
        }
        int v = 0;
        this.c0 = 0;
        int v1;
        while((v1 = s.indexOf(44, v)) != -1) {
            this.c(s.substring(v, v1));
            v = v1 + 1;
        }
        this.c(s.substring(v));
    }

    public void setReferencedIds(int[] arr_v) {
        this.f0 = null;
        this.c0 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            this.b(arr_v[v]);
        }
    }

    @Override  // android.view.View
    public final void setTag(int v, Object object0) {
        super.setTag(v, object0);
        if(object0 == null && this.f0 == null) {
            this.b(v);
        }
    }
}

