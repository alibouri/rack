package i;

import E5.d;
import F1.c;
import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import g.a;
import hb.h;
import java.util.ArrayList;
import o.G0;
import o.J0;

public final class K extends h {
    public final J0 a;
    public final x b;
    public final J c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final d h;

    public K(Toolbar toolbar0, CharSequence charSequence0, x x0) {
        this.g = new ArrayList();
        this.h = new d(19, this);
        I i0 = new I(this);
        toolbar0.getClass();
        J0 j00 = new J0(toolbar0, false);
        this.a = j00;
        x0.getClass();
        this.b = x0;
        j00.k = x0;
        toolbar0.setOnMenuItemClickListener(i0);
        j00.setWindowTitle(charSequence0);
        this.c = new J(0, this);
    }

    @Override  // hb.h
    public final boolean G() {
        return this.a.l();
    }

    @Override  // hb.h
    public final boolean H() {
        J0 j00 = this.a;
        G0 g00 = j00.a.N0;
        if(g00 != null && g00.Y != null) {
            j00.collapseActionView();
            return true;
        }
        return false;
    }

    @Override  // hb.h
    public final void L(boolean z) {
        if(z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList0 = this.g;
        if(arrayList0.size() <= 0) {
            return;
        }
        arrayList0.get(0).getClass();
        throw new ClassCastException();
    }

    @Override  // hb.h
    public final int R() {
        return this.a.b;
    }

    @Override  // hb.h
    public final Context T() {
        return this.a.a.getContext();
    }

    @Override  // hb.h
    public final boolean W() {
        this.a.a.removeCallbacks(this.h);
        this.a.a.postOnAnimation(this.h);
        return true;
    }

    @Override  // hb.h
    public final void a0() {
    }

    @Override  // hb.h
    public final void b0() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override  // hb.h
    public final boolean c0(int v, KeyEvent keyEvent0) {
        Menu menu0 = this.m0();
        if(menu0 != null) {
            menu0.setQwertyMode(KeyCharacterMap.load((keyEvent0 == null ? -1 : keyEvent0.getDeviceId())).getKeyboardType() != 1);
            return menu0.performShortcut(v, keyEvent0, 0);
        }
        return false;
    }

    @Override  // hb.h
    public final boolean d0(KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 1) {
            this.e0();
        }
        return true;
    }

    @Override  // hb.h
    public final boolean e0() {
        return this.a.a.v();
    }

    @Override  // hb.h
    public final void g0(boolean z) {
    }

    // Deobfuscation rating: LOW(25)
    @Override  // hb.h
    public final void h0(boolean z) {
        this.a.g(4 | this.a.b);
    }

    @Override  // hb.h
    public final void j0(boolean z) {
    }

    @Override  // hb.h
    public final void k0(CharSequence charSequence0) {
        this.a.setWindowTitle(charSequence0);
    }

    public final Menu m0() {
        J0 j00 = this.a;
        if(!this.e) {
            c c0 = new c(this);
            a a0 = new a(3, this);
            j00.a.O0 = c0;
            j00.a.P0 = a0;
            ActionMenuView actionMenuView0 = j00.a.b0;
            if(actionMenuView0 != null) {
                actionMenuView0.v0 = c0;
                actionMenuView0.w0 = a0;
            }
            this.e = true;
        }
        return j00.a.getMenu();
    }
}

