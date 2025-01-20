package d1;

import F0.i0;
import U.n;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.AbstractComposeView;
import d0.j;
import kotlin.jvm.functions.Function1;

public final class o extends h {
    public Function1 A0;
    public Function1 B0;
    public Function1 C0;
    public final View x0;
    public final NestedScrollDispatcher y0;
    public SaveableStateRegistry.Entry z0;

    public o(Context context0, Function1 function10, n n0, j j0, int v, i0 i00) {
        View view0 = (View)function10.n(context0);
        NestedScrollDispatcher nestedScrollDispatcher0 = new NestedScrollDispatcher();
        super(context0, n0, v, nestedScrollDispatcher0, view0, i00);
        this.x0 = view0;
        this.y0 = nestedScrollDispatcher0;
        this.setClipChildren(false);
        String s = String.valueOf(v);
        SparseArray sparseArray0 = null;
        Object object0 = j0 == null ? null : j0.b(s);
        if(object0 instanceof SparseArray) {
            sparseArray0 = (SparseArray)object0;
        }
        if(sparseArray0 != null) {
            view0.restoreHierarchyState(sparseArray0);
        }
        if(j0 != null) {
            this.setSavableRegistryEntry(j0.c(s, new g(this, 2)));
        }
        this.A0 = a.c0;
        this.B0 = a.c0;
        this.C0 = a.c0;
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.y0;
    }

    public final Function1 getReleaseBlock() {
        return this.C0;
    }

    public final Function1 getResetBlock() {
        return this.B0;
    }

    public AbstractComposeView getSubCompositionView() {
        return null;
    }

    public final Function1 getUpdateBlock() {
        return this.A0;
    }

    public View getViewRoot() {
        return this;
    }

    public static final void l(o o0) {
        o0.setSavableRegistryEntry(null);
    }

    public final void setReleaseBlock(Function1 function10) {
        this.C0 = function10;
        this.setRelease(new g(this, 3));
    }

    public final void setResetBlock(Function1 function10) {
        this.B0 = function10;
        this.setReset(new g(this, 4));
    }

    private final void setSavableRegistryEntry(SaveableStateRegistry.Entry saveableStateRegistry$Entry0) {
        SaveableStateRegistry.Entry saveableStateRegistry$Entry1 = this.z0;
        if(saveableStateRegistry$Entry1 != null) {
            saveableStateRegistry$Entry1.a();
        }
        this.z0 = saveableStateRegistry$Entry0;
    }

    public final void setUpdateBlock(Function1 function10) {
        this.A0 = function10;
        this.setUpdate(new g(this, 5));
    }
}

