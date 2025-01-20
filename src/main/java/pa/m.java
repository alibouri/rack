package pa;

import Ab.k;
import Ab.t;
import Bb.A;
import Bb.F;
import E9.b;
import F0.W;
import Ma.o;
import Nb.h;
import Nb.j;
import Y8.N;
import ac.B0;
import android.content.Intent;
import android.net.Uri;
import c.L;
import com.sendwave.models.CurrencyAmount;
import com.twilio.audioswitch.AudioDevice.Speakerphone;
import com.twilio.audioswitch.AudioDevice;
import com.twilio.audioswitch.AudioSwitch;
import com.twilio.voice.Call;
import com.wave.customer.nearbyagents.NearbyAgentsActivity;
import com.wave.voip.VoipCallActivity;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import pb.x;
import pb.z;
import q9.C3;
import q9.M0;
import q9.S1;
import q9.a2;
import ra.C0;
import ra.D0;
import ra.H0;
import ra.I0;
import ra.L0;
import ra.M;
import ra.d0;
import ra.w0;
import rb.l;
import rb.q;
import rb.u;
import rb.v;
import s9.f;

public final class m extends h implements Function0 {
    public final int g0;

    public m(int v, Object object0, Class class0, String s, String s1, int v1, int v2) {
        this.g0 = v2;
        super(v, v1, class0, object0, s, s1);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object object0 = null;
        Object object1 = t.a;
        Object object2 = this.Y;
        switch(this.g0) {
            case 0: {
                ((NearbyAgentsActivity)object2).onBackPressed();
                return object1;
            }
            case 1: {
                ((VoipCallActivity)object2).onBackPressed();
                return object1;
            }
            case 2: {
                ((z)object2).p();
                return object1;
            }
            case 3: {
                ((VoipCallActivity)object2).getClass();
                ((VoipCallActivity)object2).I0.a(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:com.wave.personal")));
                return object1;
            }
            case 4: {
                W w0 = ((z)object2).Y;
                q q0 = (q)w0.g;
                if(q0 != null) {
                    v v0 = q0.e.b0;
                    if(v0 == null) {
                        j.p("voipCaller");
                        throw null;
                    }
                    u u0 = u.Y;
                    Call call0 = ((l)v0).f;
                    if(call0 != null) {
                        ((l)v0).m = u0;
                        call0.disconnect();
                        w0.i = null;
                        return object1;
                    }
                }
                w0.i = null;
                return object1;
            }
            case 5: {
                q q1 = (q)((z)object2).Y.g;
                if(q1 != null) {
                    v v1 = q1.e.b0;
                    if(v1 == null) {
                        j.p("voipCaller");
                        throw null;
                    }
                    Call call1 = ((l)v1).f;
                    if(call1 != null) {
                        call1.mute(!call1.isMuted());
                        do {
                            Object object3 = ((l)v1).k.getValue();
                            ((Boolean)object3).getClass();
                        }
                        while(!((l)v1).k.j(object3, Boolean.valueOf(call1.isMuted())));
                        j.f(((l)v1).c, "<this>");
                        ((l)v1).c.d("VOIP call muted", F.J(new k("muted", Boolean.valueOf(call1.isMuted()))));
                        return object1;
                    }
                }
                return object1;
            }
            case 6: {
                q q2 = (q)((z)object2).Y.g;
                if(q2 != null) {
                    v v2 = q2.e.b0;
                    if(v2 != null) {
                        AudioSwitch audioSwitch0 = ((l)v2).h;
                        j.f(audioSwitch0, "<this>");
                        if(audioSwitch0.getSelectedAudioDevice() instanceof Speakerphone) {
                            audioSwitch0.selectDevice(null);
                        }
                        else {
                            for(Object object4: audioSwitch0.getAvailableAudioDevices()) {
                                if(((AudioDevice)object4) instanceof Speakerphone) {
                                    object0 = object4;
                                    break;
                                }
                                if(false) {
                                    break;
                                }
                            }
                            audioSwitch0.selectDevice(((AudioDevice)object0));
                        }
                        j.f(((l)v2).c, "<this>");
                        ((l)v2).c.d("VOIP call on speaker", F.J(new k("onSpeaker", Boolean.valueOf(audioSwitch0.getSelectedAudioDevice() instanceof Speakerphone))));
                        return object1;
                    }
                    j.p("voipCaller");
                    throw null;
                }
                return object1;
            }
            case 7: {
                ((z)object2).getClass();
                x x0 = new x(((z)object2), null);
                N.k(((z)object2), ((z)object2).c0, true, x0);
                return object1;
            }
            case 8: {
                ((a2)object2).getClass();
                S1 s10 = new S1(((a2)object2), null);
                N.k(((a2)object2), ((a2)object2).i0, true, s10);
                return object1;
            }
            case 9: {
                ((C3)object2).getClass();
                return null;
            }
            case 10: {
                ((L)object2).d();
                return object1;
            }
            case 11: {
                B0 b00 = ((L0)object2).h0;
                if(((ra.N)b00.getValue()).g.f() && !((ra.N)b00.getValue()).k) {
                    do {
                        Object object5 = b00.getValue();
                    }
                    while(!b00.j(object5, ra.N.a(((ra.N)object5), null, null, null, null, false, null, null, null, null, true, false, null, false, null, null, null, false, null, 0x3FDFF)));
                    return object1;
                }
                w0 w00 = new w0(((L0)object2), null, 0);
                ((L0)object2).q(ra.L.Z, w00);
                return object1;
            }
            case 12: {
                ((L)object2).d();
                return object1;
            }
            case 13: {
                ((L0)object2).getClass();
                C0 c00 = new C0(((L0)object2), null);
                N.k(((L0)object2), ((L0)object2).j0, true, c00);
                return object1;
            }
            case 14: {
                B0 b01 = ((L0)object2).h0;
                CurrencyAmount currencyAmount0 = ((ra.N)b01.getValue()).v;
                if(currencyAmount0 != null && currencyAmount0.f()) {
                    H0 h00 = new H0(((L0)object2), null);
                    N.k(((L0)object2), ((L0)object2).j0, true, h00);
                    return object1;
                }
                do {
                    Object object6 = b01.getValue();
                }
                while(!b01.j(object6, ra.N.a(((ra.N)object6), null, null, null, null, false, null, null, null, null, false, false, M.b0, false, null, null, null, false, null, 0x3F7FF)));
                return object1;
            }
            case 15: {
                ((L0)object2).getClass();
                w0 w01 = new w0(((L0)object2), null, 4);
                ((L0)object2).q(ra.L.b0, w01);
                return object1;
            }
            case 16: {
                ((L0)object2).getClass();
                D0 d00 = new D0(((L0)object2), null);
                N.k(((L0)object2), ((L0)object2).j0, true, d00);
                return object1;
            }
            case 17: {
                ((L0)object2).g0.b();
                return object1;
            }
            case 18: {
                ((L0)object2).g0.c();
                return object1;
            }
            case 19: {
                ((L0)object2).g0.d();
                return object1;
            }
            case 20: {
                B0 b02 = ((L0)object2).h0;
                do {
                    Object object7 = b02.getValue();
                }
                while(!b02.j(object7, ra.N.a(((ra.N)object7), null, null, null, null, false, null, null, null, null, false, false, null, false, null, null, null, false, null, 0x3F9FF)));
                w0 w02 = new w0(((L0)object2), null, 0);
                ((L0)object2).q(ra.L.Z, w02);
                return object1;
            }
            case 21: {
                B0 b03 = ((L0)object2).h0;
                do {
                    Object object8 = b03.getValue();
                }
                while(!b03.j(object8, ra.N.a(((ra.N)object8), null, null, null, null, false, null, null, null, null, false, false, null, false, null, null, null, false, null, 0x3FDFF)));
                CurrencyAmount currencyAmount1 = ((ra.N)b03.getValue()).g;
                b b0 = ((L0)object2).b0;
                j.f(b0, "<this>");
                j.f(currencyAmount1, "fee");
                Map map0 = currencyAmount1.f() ? com.apollographql.apollo.api.b.t("fee", M0.a(currencyAmount1)) : A.X;
                b0.d("reject card fee", map0);
                return object1;
            }
            case 22: {
                B0 b04 = ((L0)object2).h0;
                if(((ra.N)b04.getValue()).d == null) {
                    w0 w03 = new w0(((L0)object2), null, 2);
                    ((L0)object2).q(ra.L.c0, w03);
                    return object1;
                }
                boolean z = ((ra.N)b04.getValue()).e;
                do {
                    Object object9 = b04.getValue();
                }
                while(!b04.j(object9, ra.N.a(((ra.N)object9), null, null, null, null, ((boolean)(true ^ z)), null, null, null, null, false, false, null, false, null, null, null, false, null, 0x3FFEF)));
                d0 d01 = (d0)((L0)object2).j0.a();
                if(d01 != null) {
                    d01.b();
                }
                b b1 = ((L0)object2).b0;
                if(!z) {
                    j.f(b1, "<this>");
                    b1.d("show card", null);
                    return object1;
                }
                j.f(b1, "<this>");
                b1.d("hide card", null);
                return object1;
            }
            case 23: {
                ra.k k0 = ((ra.N)((L0)object2).h0.getValue()).d;
                if(k0 == null) {
                    w0 w04 = new w0(((L0)object2), null, 1);
                    ((L0)object2).q(ra.L.c0, w04);
                    return object1;
                }
                ((L0)object2).o(k0);
                return object1;
            }
            case 24: {
                ((L0)object2).getClass();
                I0 i00 = new I0(((L0)object2), null);
                N.k(((L0)object2), ((L0)object2).j0, true, i00);
                return object1;
            }
            case 25: {
                B0 b05 = ((L0)object2).h0;
                do {
                    Object object10 = b05.getValue();
                }
                while(!b05.j(object10, ra.N.a(((ra.N)object10), null, null, null, null, false, null, null, null, null, false, false, null, false, null, null, null, false, null, 0x3F7FF)));
                return object1;
            }
            case 26: {
                B0 b06 = ((L0)object2).h0;
                do {
                    Object object11 = b06.getValue();
                }
                while(!b06.j(object11, ra.N.a(((ra.N)object11), null, null, null, null, false, null, null, null, null, false, false, null, false, null, null, null, false, null, 0x3EFFF)));
                return object1;
            }
            case 27: {
                ((o)object2).c();
                return object1;
            }
            case 28: {
                ((f)object2).g();
                return object1;
            }
            default: {
                ((L)object2).d();
                return object1;
            }
        }
    }
}

