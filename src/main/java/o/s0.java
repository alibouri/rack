package o;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.MenuItemHoverListener;
import i.s;
import java.lang.reflect.Method;
import n.j;

public final class s0 extends o0 implements MenuItemHoverListener {
    public s A0;
    public static final Method B0;

    static {
        if(Build.VERSION.SDK_INT <= 28) {
            try {
                s0.B0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override  // o.o0
    public final f0 b(Context context0, boolean z) {
        f0 f00 = new r0(context0, z);
        ((r0)f00).setHoverListener(this);
        return f00;
    }

    @Override  // androidx.appcompat.widget.MenuItemHoverListener
    public final void o(j j0, MenuItemImpl menuItemImpl0) {
        s s0 = this.A0;
        if(s0 != null) {
            s0.o(j0, menuItemImpl0);
        }
    }

    @Override  // androidx.appcompat.widget.MenuItemHoverListener
    public final void v(j j0, MenuItemImpl menuItemImpl0) {
        s s0 = this.A0;
        if(s0 != null) {
            s0.v(j0, menuItemImpl0);
        }
    }
}

