package K9;

import Fb.j;
import L9.a;
import Nb.p;
import Nb.x;
import R9.I1;
import Tb.e;
import V8.c;
import Y8.R6;
import ac.B0;
import ac.e0;
import ac.j0;
import ac.o0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.WatchedProperty;
import com.sendwave.components.RequesterEditText;
import com.sendwave.remit.util.CountryPhoneInputView;
import com.sendwave.util.Country;
import f9.F;
import java.util.List;
import java.util.regex.Pattern;
import q9.M0;

public final class i extends ViewModel {
    public final Country Y;
    public final String Z;
    public final String b0;
    public final String c0;
    public final List d0;
    public final List e0;
    public final c f0;
    public final boolean g0;
    public final J9.c h0;
    public final B0 i0;
    public final B0 j0;
    public final WatchedProperty k0;
    public final WatchedProperty l0;
    public final B0 m0;
    public final WatchedProperty n0;
    public final j0 o0;
    public final e0 p0;
    public final e0 q0;
    public final e0 r0;
    public j s0;
    public static final e[] t0;

    static {
        p p0 = new p(i.class, "wName", "getWName()Ljava/lang/String;", 0);
        x.a.getClass();
        i.t0 = new e[]{p0, new p(i.class, "wMobile", "getWMobile()Ljava/lang/String;", 0), new p(i.class, "wInternationalMobile", "getWInternationalMobile()Ljava/lang/String;", 0)};
    }

    public i(R6 r60, Country country0, String s, String s1, String s2, List list0, List list1) {
        Nb.j.f(r60, "repo");
        Nb.j.f(s, "defaultName");
        Nb.j.f(s1, "defaultMobile");
        Nb.j.f(list0, "recipientCountries");
        Nb.j.f(list1, "disabledTelcosNameToNumberFormat");
        super();
        this.Y = country0;
        this.Z = s;
        this.b0 = s1;
        this.c0 = s2;
        this.d0 = list0;
        this.e0 = list1;
        this.f0 = new c(new V8.e());  // initializer: Ljava/lang/Object;-><init>()V
        this.g0 = list0.size() > 1;
        J9.c c0 = new J9.c(country0);
        this.h0 = c0;
        B0 b00 = o0.c(-1);
        this.i0 = b00;
        B0 b01 = o0.c(s);
        this.j0 = b01;
        this.k0 = FlowWatcherKt.b(b01).b(this, i.t0[0]);
        this.l0 = FlowWatcherKt.b(c0.i0).b(this, i.t0[1]);
        B0 b02 = o0.c(s1);
        this.m0 = b02;
        this.n0 = FlowWatcherKt.b(b02).b(this, i.t0[2]);
        e0 e00 = q9.o0.l(b00, b01, 0x7F0A00F2);  // id:contact_name_requester
        e0 e01 = q9.o0.l(b00, c0.g0, 0x7F0A00F0);  // id:contact_mobile_requester
        e0 e02 = q9.o0.l(b00, b02, 0x7F0A0243);  // id:phone_number
        this.o0 = q9.o0.d0(this, new e0(e00, b01, new F(3, null, 2), 0), null);
        g g0 = new g(this, null, 1);
        this.p0 = new e0(e01, c0.i0, g0, 0);
        this.q0 = new e0(e02, b02, new g(this, null, 0), 0);
        f f0 = new f(this, null, 0);
        this.r0 = new e0(new e0(b01, c0.i0, f0, 0), new e0(b01, b02, new f(this, null, 1), 0), new I1(3, null, 2), 0);
        this.s0 = new h(3, null, 0);
    }

    public static final boolean o(i i0, String s) {
        i0.getClass();
        if(s.length() != 0) {
            Country country0 = M0.c(s);
            if(country0 != null) {
                Pattern pattern0 = Pattern.compile(country0.h0);
                Nb.j.e(pattern0, "compile(...)");
                return pattern0.matcher(s).matches();
            }
        }
        return false;
    }

    public final void p(a a0) {
        a0.r.addTextChangedListener(this.h0);
        RequesterEditText requesterEditText0 = a0.t;
        requesterEditText0.setText(this.Z);
        a0.r.setText(this.b0);
        CountryPhoneInputView countryPhoneInputView0 = a0.u;
        countryPhoneInputView0.m0 = true;
        countryPhoneInputView0.h0.setText(this.b0);
        a0.x.setTitle(this.c0);
        if(!q9.o0.E(this.Z)) {
            requesterEditText0.requestFocus();
        }
        K9.c c0 = new K9.c(1);
        countryPhoneInputView0.b(Bb.p.K0(this.d0, c0));
    }
}

