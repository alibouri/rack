package U0;

import B3.d;
import Bb.p;
import Nb.j;
import O0.N;
import Z6.b;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

public final class x implements InputConnection {
    public final d a;
    public final boolean b;
    public int c;
    public B d;
    public int e;
    public boolean f;
    public final ArrayList g;
    public boolean h;

    public x(B b0, d d0, boolean z) {
        this.a = d0;
        this.b = z;
        this.d = b0;
        this.g = new ArrayList();
        this.h = true;
    }

    public final void a(i i0) {
        try {
            ++this.c;
            this.g.add(i0);
        }
        finally {
            this.b();
        }
    }

    public final boolean b() {
        int v = this.c - 1;
        this.c = v;
        if(v == 0) {
            ArrayList arrayList0 = this.g;
            if(!arrayList0.isEmpty()) {
                ArrayList arrayList1 = p.R0(arrayList0);
                ((Function1)((E)this.a.Y).e).n(arrayList1);
                arrayList0.clear();
            }
        }
        return this.c > 0;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.h;
        if(z) {
            ++this.c;
            return true;
        }
        return z;
    }

    public final void c(int v) {
        this.sendKeyEvent(new KeyEvent(0, v));
        this.sendKeyEvent(new KeyEvent(1, v));
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int v) {
        return this.h ? false : this.h;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
        E e0 = (E)this.a.Y;
        int v1 = e0.i.size();
        for(int v = 0; v < v1; ++v) {
            ArrayList arrayList0 = e0.i;
            if(j.a(((WeakReference)arrayList0.get(v)).get(), this)) {
                arrayList0.remove(v);
                return;
            }
        }
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo0) {
        return this.h ? false : this.h;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo0, int v, Bundle bundle0) {
        return this.h ? false : this.h;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo0) {
        return this.h ? this.b : this.h;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence0, int v) {
        boolean z = this.h;
        if(z) {
            this.a(new a(String.valueOf(charSequence0), v));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int v, int v1) {
        boolean z = this.h;
        if(z) {
            this.a(new g(v, v1));
            return true;
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int v, int v1) {
        boolean z = this.h;
        if(z) {
            this.a(new h(v, v1));
            return true;
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return this.b();
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.h;
        if(z) {
            this.a(new k());  // initializer: Ljava/lang/Object;-><init>()V
            return true;
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int v) {
        return TextUtils.getCapsMode(this.d.a.X, N.e(this.d.b), v);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest0, int v) {
        boolean z = true;
        int v1 = 0;
        if((v & 1) == 0) {
            z = false;
        }
        this.f = z;
        if(z) {
            if(extractedTextRequest0 != null) {
                v1 = extractedTextRequest0.token;
            }
            this.e = v1;
        }
        return b.y(this.d);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int v) {
        return N.b(this.d.b) ? null : a.a.p(this.d).X;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int v, int v1) {
        return a.a.q(this.d, v).X;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int v, int v1) {
        return a.a.r(this.d, v).X;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int v) {
        boolean z = this.h;
        if(z) {
            z = false;
            switch(v) {
                case 0x102001F: {
                    this.a(new A(0, this.d.a.X.length()));
                    break;
                }
                case 0x1020020: {
                    this.c(277);
                    return false;
                }
                case 0x1020021: {
                    this.c(278);
                    return false;
                }
                case 0x1020022: {
                    this.c(279);
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int v) {
        int v1;
        boolean z = this.h;
        if(z) {
            if(v == 0) {
                v1 = 1;
            }
            else {
                switch(v) {
                    case 2: {
                        v1 = 2;
                        break;
                    }
                    case 3: {
                        v1 = 3;
                        break;
                    }
                    case 4: {
                        v1 = 4;
                        break;
                    }
                    case 5: {
                        v1 = 6;
                        break;
                    }
                    case 6: {
                        v1 = 7;
                        break;
                    }
                    case 7: {
                        v1 = 5;
                        break;
                    }
                    default: {
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + v);
                        v1 = 1;
                    }
                }
            }
            ((Function1)((E)this.a.Y).f).n(new m(v1));
        }
        return z;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String s, Bundle bundle0) {
        return this.h ? true : this.h;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int v) {
        boolean z5;
        boolean z3;
        boolean z2;
        boolean z = false;
        boolean z1 = this.h;
        if(z1) {
            int v1 = Build.VERSION.SDK_INT;
            if(v1 >= 33) {
                z2 = (v & 16) != 0;
                z3 = (v & 8) != 0;
                boolean z4 = (v & 4) != 0;
                if(v1 >= 34 && (v & 0x20) != 0) {
                    z = true;
                }
                if(z2 || z3 || z4 || z) {
                    z5 = z;
                    z = z4;
                }
                else if(v1 >= 34) {
                    z5 = true;
                    z = true;
                    z2 = true;
                    z3 = true;
                }
                else {
                    z2 = true;
                    z3 = true;
                    z5 = z;
                    z = true;
                }
            }
            else {
                z2 = true;
                z3 = true;
                z5 = false;
            }
            e e0 = ((E)this.a.Y).l;
            synchronized(e0.c) {
                e0.f = z2;
                e0.g = z3;
                e0.h = z;
                e0.i = z5;
                if((v & 1) != 0) {
                    e0.e = true;
                    if(e0.j != null) {
                        e0.a();
                    }
                }
                e0.d = (v & 2) != 0;
                return true;
            }
        }
        return z1;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent0) {
        boolean z = this.h;
        if(z) {
            ((BaseInputConnection)((Ab.h)((E)this.a.Y).j).getValue()).sendKeyEvent(keyEvent0);
            return true;
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int v, int v1) {
        boolean z = this.h;
        if(z) {
            this.a(new y(v, v1));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence0, int v) {
        boolean z = this.h;
        if(z) {
            this.a(new z(String.valueOf(charSequence0), v));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean setSelection(int v, int v1) {
        boolean z = this.h;
        if(z) {
            this.a(new A(v, v1));
            return true;
        }
        return z;
    }
}

