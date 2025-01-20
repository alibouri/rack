package q9;

import Ab.k;
import Ab.t;
import Bb.F;
import Eb.a;
import W5.f;
import a9.C4;
import ac.i;
import android.content.SharedPreferences;
import com.sendwave.backend.fragment.AnnouncementFragment;
import f9.j;
import hb.n;
import io.sentry.i1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.g;

public final class a0 implements i {
    public final int X;
    public final i Y;
    public final d0 Z;

    public a0(i i0, d0 d00, int v) {
        this.X = v;
        this.Y = i0;
        this.Z = d00;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        j j0;
        Z z0;
        Object object3;
        String s;
        b0 b00;
        Object object1 = t.a;
        i i0 = this.Y;
        d0 d00 = this.Z;
        if(this.X != 0) {
            if(g0 instanceof b0) {
                b00 = (b0)g0;
                int v = b00.c0;
                if((v & 0x80000000) == 0) {
                    b00 = new b0(this, g0);
                }
                else {
                    b00.c0 = v ^ 0x80000000;
                }
            }
            else {
                b00 = new b0(this, g0);
            }
            Object object2 = b00.b0;
            a a0 = a.X;
            switch(b00.c0) {
                case 0: {
                    f.b0(object2);
                    C4 c40 = (C4)object0;
                    if(c40 == null) {
                        object3 = null;
                    }
                    else {
                        r9.a a1 = d00.f0;
                        if(a1 == null) {
                            object3 = null;
                        }
                        else {
                            m m0 = a1.a;
                            Map map0 = m0.e();
                            Integer integer0 = c40.h;
                            if(integer0 == null) {
                                object3 = c40;
                                b00.c0 = 1;
                                return i0.c(object3, b00) == a0 ? a0 : object1;
                            label_45:
                                Map map1 = F.K(new k[]{new k("bottomSheetId", s), new k("storedLastSeenDateTime", String.valueOf(map0.get(s))), new k("allStoredBottomSheetAnnouncements", m0.e().toString())});
                                n.b(exception0, i1.ERROR, map1, 8);
                                object3 = null;
                            }
                            else {
                                s = c40.a;
                                if(map0.containsKey(s)) {
                                    try {
                                        long v1 = ((SharedPreferences)m0.c).getLong(s, -1L);
                                        if(v1 < 0L) {
                                            throw new IllegalStateException("Last seen time not found for announcement ID: " + s);
                                        }
                                        long v2 = System.currentTimeMillis();
                                        int v3 = (int)integer0;
                                        if(v3 < 0) {
                                            throw new IllegalStateException("Invalid frequencySeconds (" + v3 + ") ");
                                        }
                                        if(v2 <= ((long)v3) * 1000L + v1) {
                                            object3 = null;
                                            b00.c0 = 1;
                                            return i0.c(object3, b00) == a0 ? a0 : object1;
                                        }
                                        object3 = c40;
                                    }
                                    catch(Exception exception0) {
                                        goto label_45;
                                    }
                                }
                                else {
                                    object3 = c40;
                                    b00.c0 = 1;
                                    return i0.c(object3, b00) == a0 ? a0 : object1;
                                }
                            }
                        }
                    }
                    b00.c0 = 1;
                    return i0.c(object3, b00) == a0 ? a0 : object1;
                }
                case 1: {
                    f.b0(object2);
                    return object1;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }
        if(g0 instanceof Z) {
            z0 = (Z)g0;
            int v4 = z0.c0;
            if((v4 & 0x80000000) == 0) {
                z0 = new Z(this, g0);
            }
            else {
                z0.c0 = v4 ^ 0x80000000;
            }
        }
        else {
            z0 = new Z(this, g0);
        }
        Object object4 = z0.b0;
        a a2 = a.X;
        switch(z0.c0) {
            case 0: {
                f.b0(object4);
                ArrayList arrayList0 = new ArrayList();
                for(Object object5: ((List)object0)) {
                    AnnouncementFragment announcementFragment0 = (AnnouncementFragment)object5;
                    if(Nb.j.a(announcementFragment0.getId(), "rewards-redesigned-carousel-experiment")) {
                        j0 = null;
                    }
                    else {
                        Na.f f0 = d00.b0.g(0x7F0802C4, announcementFragment0.e);  // drawable:logo_blank
                        R2.m m1 = o0.p(announcementFragment0.j);
                        j0 = new j(new E(this.Z, announcementFragment0.getId(), announcementFragment0.b, announcementFragment0.c, f0, announcementFragment0.f, announcementFragment0.i, m1), announcementFragment0.getId(), 0x7F0D0024);  // layout:announcement
                    }
                    if(j0 != null) {
                        arrayList0.add(j0);
                    }
                }
                z0.c0 = 1;
                return i0.c(arrayList0, z0) == a2 ? a2 : object1;
            }
            case 1: {
                f.b0(object4);
                return object1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

