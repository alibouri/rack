package o9;

import Ab.t;
import Bb.q;
import J2.w;
import Nb.j;
import android.os.Build;
import android.view.View;
import c.D;
import com.google.android.material.textfield.TextInputLayout;
import com.sendwave.backend.type.AnnouncementEventType.SEEN;
import com.sendwave.components.CodeEntryEditText;
import com.sendwave.remit.util.CountryPhoneInputView;
import com.sendwave.shared.paybill.SelectFavoriteActivity;
import com.sendwave.util.AnnouncementEventData;
import com.wave.customer.risk.magiclinksecuritychallenge.MagicLinkSecurityChallengeActivity;
import hb.n;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import m0.e;
import m5.b;
import n0.v;
import p0.d;
import q9.C3;
import q9.d0;
import q9.r1;
import wa.f;

public final class m0 implements Function1 {
    public final int X;
    public final Object Y;

    public m0(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        int v = 0;
        Object object1 = t.a;
        Object object2 = this.Y;
        switch(this.X) {
            case 0: {
                j.f(((i1)object0), "it");
                b0 b00 = (b0)((Y0)object2).l0.a();
                if(b00 != null) {
                    b00.I(((i1)object0));
                }
                return object1;
            }
            case 1: {
                j.f(((D)object0), "$this$addCallback");
                ((SelectFavoriteActivity)object2).I().p();
                return object1;
            }
            case 2: {
                j.f(((String)object0), "announcementId");
                ((d0)object2).getClass();
                LinkedHashSet linkedHashSet0 = ((d0)object2).j0;
                if(!((d0)object2).g0 || !linkedHashSet0.contains(((String)object0))) {
                    linkedHashSet0.add(((String)object0));
                    AnnouncementEventData announcementEventData0 = new AnnouncementEventData(SEEN.X, ((String)object0));
                    ((d0)object2).Y.b(announcementEventData0);
                    ((d0)object2).l();
                }
                return object1;
            }
            case 3: {
                ((View)object2).setEnabled(((Boolean)object0).booleanValue());
                return object1;
            }
            case 4: {
                ((CodeEntryEditText)object2).setCodeLength(((int)(((Integer)object0))));
                return object1;
            }
            case 5: {
                ((TextInputLayout)object2).setError(((CharSequence)object0));
                return object1;
            }
            case 6: {
                j.f(((CountryPhoneInputView)object2), "<this>");
                ((CountryPhoneInputView)object2).getEditText().setError(((String)object0));
                return object1;
            }
            case 7: {
                C3 c30 = (C3)object2;
                Void void1 = (Void)object0;
                try {
                    c30.c0 = c30.m();
                }
                catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
                    c30.c0 = null;
                    n.b(unsatisfiedLinkError0, null, null, 14);
                }
                catch(NullPointerException nullPointerException0) {
                    if(!j.a(Build.BRAND, "Amazon")) {
                        throw nullPointerException0;
                    }
                }
                return object1;
            }
            case 8: {
                j.f(((d)object0), "$this$drawBehind");
                List list0 = q.L(new v[]{new v(((f)object2).b), new v(v.e), new v(v.e)});
                float f = e.b(((d)object0).d()) / ((float)list0.size());
                for(Object object3: list0) {
                    if(v >= 0) {
                        long v1 = w.m(e.d(((d)object0).d()), f);
                        b.l(((d)object0), ((v)object3).a, yc.d.d(0.0f, ((float)v) * f), v1, 0.0f, 120);
                        ++v;
                        continue;
                    }
                    q.Z();
                    throw null;
                }
                return object1;
            }
            default: {
                Void void0 = (Void)object0;
                ((MagicLinkSecurityChallengeActivity)object2).getClass();
                r1.b(((MagicLinkSecurityChallengeActivity)object2)).e().d("magic link security challenge: successfully start sms retriever", null);
                return object1;
            }
        }
    }
}

