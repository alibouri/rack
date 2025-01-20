package G0;

import D0.u;
import F0.i0;
import U.O0;
import U.Z;
import U.d;
import U.k0;
import U.l0;
import U.p;
import U.x;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c0.b;

public abstract class f0 {
    public static final O0 a;
    public static final O0 b;
    public static final O0 c;
    public static final O0 d;
    public static final O0 e;
    public static final O0 f;
    public static final O0 g;
    public static final O0 h;
    public static final O0 i;
    public static final O0 j;
    public static final O0 k;
    public static final O0 l;
    public static final O0 m;
    public static final O0 n;
    public static final O0 o;
    public static final O0 p;
    public static final O0 q;
    public static final O0 r;
    public static final O0 s;
    public static final x t;

    static {
        f0.a = new O0(H.g0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.b = new O0(H.h0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.c = new O0(H.i0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.d = new O0(H.j0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.e = new O0(H.o0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.f = new O0(H.k0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.g = new O0(H.l0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.h = new O0(H.n0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.i = new O0(H.m0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.j = new O0(H.p0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.k = new O0(H.q0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.l = new O0(H.r0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.m = new O0(H.v0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.n = new O0(H.u0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.o = new O0(H.w0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.p = new O0(H.x0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.q = new O0(H.y0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.r = new O0(H.z0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.s = new O0(H.s0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        f0.t = new x(Z.e, H.t0);
    }

    public static final void a(i0 i00, W w0, b b0, p p0, int v) {
        p0.S(0x34224BAD);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(i00) : p0.h(i00)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? p0.f(w0) : p0.h(w0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(b0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            AccessibilityManager accessibilityManager0 = i00.getAccessibilityManager();
            k0 k00 = f0.a.a(accessibilityManager0);
            Autofill autofill0 = i00.getAutofill();
            k0 k01 = f0.b.a(autofill0);
            AutofillTree autofillTree0 = i00.getAutofillTree();
            k0 k02 = f0.c.a(autofillTree0);
            ClipboardManager clipboardManager0 = i00.getClipboardManager();
            k0 k03 = f0.d.a(clipboardManager0);
            Density density0 = i00.getDensity();
            k0 k04 = f0.f.a(density0);
            FocusOwner focusOwner0 = i00.getFocusOwner();
            k0 k05 = f0.g.a(focusOwner0);
            Font.ResourceLoader font$ResourceLoader0 = i00.getFontLoader();
            k0 k06 = f0.h.a(font$ResourceLoader0);
            k06.f = false;
            FontFamily.Resolver fontFamily$Resolver0 = i00.getFontFamilyResolver();
            k0 k07 = f0.i.a(fontFamily$Resolver0);
            k07.f = false;
            HapticFeedback hapticFeedback0 = i00.getHapticFeedBack();
            k0 k08 = f0.j.a(hapticFeedback0);
            InputModeManager inputModeManager0 = i00.getInputModeManager();
            k0 k09 = f0.k.a(inputModeManager0);
            LayoutDirection layoutDirection0 = i00.getLayoutDirection();
            k0 k010 = f0.l.a(layoutDirection0);
            TextInputService textInputService0 = i00.getTextInputService();
            k0 k011 = f0.m.a(textInputService0);
            SoftwareKeyboardController softwareKeyboardController0 = i00.getSoftwareKeyboardController();
            k0 k012 = f0.n.a(softwareKeyboardController0);
            TextToolbar textToolbar0 = i00.getTextToolbar();
            k0 k013 = f0.o.a(textToolbar0);
            k0 k014 = f0.p.a(w0);
            ViewConfiguration viewConfiguration0 = i00.getViewConfiguration();
            k0 k015 = f0.q.a(viewConfiguration0);
            WindowInfo windowInfo0 = i00.getWindowInfo();
            k0 k016 = f0.r.a(windowInfo0);
            PointerIconService pointerIconService0 = i00.getPointerIconService();
            k0 k017 = f0.s.a(pointerIconService0);
            GraphicsContext graphicsContext0 = i00.getGraphicsContext();
            d.b(new k0[]{k00, k01, k02, k03, k04, k05, k06, k07, k08, k09, k010, k011, k012, k013, k014, k015, k016, k017, f0.e.a(graphicsContext0)}, b0, p0, v1 >> 3 & 0x70 | 8);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new u(i00, w0, b0, v, 3);
        }
    }

    public static final void b(String s) {
        throw new IllegalStateException(("CompositionLocal " + s + " not present").toString());
    }
}

