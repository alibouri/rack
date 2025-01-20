package R2;

import Ab.o;
import B.J0;
import Bb.z;
import Ea.e0;
import Nb.h;
import R9.l0;
import R9.m0;
import W4.f;
import Y2.d;
import Y8.R6;
import Y8.V;
import Y8.g1;
import Y8.i1;
import Y8.m2;
import Y8.y6;
import Zb.i;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.work.impl.WorkDatabase_Impl;
import c2.P;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.wave.customer.CustomerApp;
import i3.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import k2.J;
import k2.V1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import m3.e;
import m3.j;
import t5.b;
import x2.g;
import zb.a;

public final class m implements b {
    public Object X;
    public Object Y;
    public Object Z;
    public Object b0;

    public m(i i0, Function3 function30, Function3 function31, J0 j00) {
        this.X = i0;
        this.Y = (h)function30;
        this.Z = (h)function31;
        this.b0 = j00;
    }

    public m(Context context0) {
        this.X = context0.getApplicationContext();
        this.Y = e.a;
        this.Z = null;
        this.b0 = new j();
    }

    public m(Boolean boolean0, Double double0) {
        this(boolean0, double0, Boolean.FALSE, null);
    }

    public m(Boolean boolean0, Double double0, Boolean boolean1, Double double1) {
        this.X = boolean0;
        this.Y = double0;
        this.Z = Boolean.valueOf(boolean0.booleanValue() && boolean1.booleanValue());
        this.b0 = double1;
    }

    public m(Object object0, Object object1, Object object2, Object object3) {
        this.X = object0;
        this.Y = object1;
        this.Z = object2;
        this.b0 = object3;
        super();
    }

    public void a(Fragment fragment0) {
        if(((ArrayList)this.X).contains(fragment0)) {
            throw new IllegalStateException("Fragment already added: " + fragment0);
        }
        synchronized(((ArrayList)this.X)) {
            ((ArrayList)this.X).add(fragment0);
        }
        fragment0.i0 = true;
    }

    public Y2.m b() {
        o o0 = f.A(new d(this, 0));
        o o1 = f.A(new d(this, 1));
        o o2 = f.A(new e0(9));
        Y2.b b0 = (Y2.b)this.Z;
        if(b0 == null) {
            b0 = new Y2.b(z.X, z.X, z.X, z.X, z.X);
        }
        return new Y2.m(((Context)this.X), ((c)this.Y), o0, o1, o2, b0, ((j)this.b0));
    }

    public void c(String s) {
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)this.X;
        workDatabase_Impl0.b();
        Ma.m m0 = (Ma.m)this.Z;
        g g0 = m0.a();
        g0.c(1, s);
        try {
            workDatabase_Impl0.c();
            try {
                g0.b();
                workDatabase_Impl0.q();
            }
            finally {
                workDatabase_Impl0.k();
            }
        }
        finally {
            m0.c(g0);
        }
    }

    public Fragment d(String s) {
        androidx.fragment.app.e e0 = (androidx.fragment.app.e)((HashMap)this.Y).get(s);
        return e0 == null ? null : e0.c;
    }

    public o3.m e(String s) {
        synchronized(this) {
            return (o3.m)((HashMap)this.Z).get(s);
        }
    }

    public Fragment f(String s) {
        for(Object object0: ((HashMap)this.Y).values()) {
            androidx.fragment.app.e e0 = (androidx.fragment.app.e)object0;
            if(e0 != null) {
                Fragment fragment0 = s.equals(e0.c.c0) ? e0.c : e0.c.t0.c.f(s);
                if(fragment0 != null) {
                    return fragment0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public ArrayList g() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((HashMap)this.Y).values()) {
            androidx.fragment.app.e e0 = (androidx.fragment.app.e)object0;
            if(e0 != null) {
                arrayList0.add(e0);
            }
        }
        return arrayList0;
    }

    @Override  // zb.a
    public Object get() {
        return new x5.i(((Executor)((a)this.X).get()), ((y5.d)((a)this.Y).get()), ((x5.c)((w5.c)this.Z).get()), ((z5.c)((a)this.b0).get()));
    }

    public ArrayList h() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((HashMap)this.Y).values()) {
            androidx.fragment.app.e e0 = (androidx.fragment.app.e)object0;
            if(e0 == null) {
                arrayList0.add(null);
            }
            else {
                arrayList0.add(e0.c);
            }
        }
        return arrayList0;
    }

    public Object i(Fb.c c0) {
        l0 l00;
        if(c0 instanceof l0) {
            l00 = (l0)c0;
            int v = l00.d0;
            if((v & 0x80000000) == 0) {
                l00 = new l0(this, c0);
            }
            else {
                l00.d0 = v ^ 0x80000000;
            }
        }
        else {
            l00 = new l0(this, c0);
        }
        Object object0 = l00.b0;
        Object object1 = Eb.a.X;
        switch(l00.d0) {
            case 0: {
                W5.f.b0(object0);
                l00.d0 = 1;
                object0 = this.j(l00);
                return object0 == object1 ? object1 : ((m2)object0).a(((CustomerHomeFragment)((m2)object0).a).g);
            }
            case 1: {
                W5.f.b0(object0);
                return ((m2)object0).a(((CustomerHomeFragment)((m2)object0).a).g);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public Object j(kotlin.coroutines.g g0) {
        m m2;
        m m1;
        m m0;
        m0 m00;
        if(g0 instanceof m0) {
            m00 = (m0)g0;
            int v = m00.e0;
            if((v & 0x80000000) == 0) {
                m00 = new m0(this, g0);
            }
            else {
                m00.e0 = v ^ 0x80000000;
            }
        }
        else {
            m00 = new m0(this, g0);
        }
        Object object0 = m00.c0;
        Object object1 = Eb.a.X;
        Class class0 = CustomerHomeFragment.class;
        switch(m00.e0) {
            case 0: {
                W5.f.b0(object0);
                CustomerApp customerApp0 = (CustomerApp)this.X;
                B9.b b0 = customerApp0.d().c();
                FragmentHandle fragmentHandle0 = b0 == null ? null : b0.b();
                if(fragmentHandle0 == null) {
                    throw new Exception("Couldn\'t find logged in user info");
                }
                try {
                    R6 r60 = customerApp0.a();
                    m00.b0 = this;
                    m00.e0 = 1;
                    object0 = r60.e(fragmentHandle0, class0, m00);
                }
                catch(V unused_ex) {
                    m0 = this;
                    goto label_37;
                }
                if(object0 == object1) {
                    return object1;
                }
                m1 = this;
                return (m2)object0;
            }
            case 1: {
                try {
                    m1 = m00.b0;
                    W5.f.b0(object0);
                    return (m2)object0;
                }
                catch(V unused_ex) {
                    m0 = m1;
                }
            label_37:
                i1 i10 = new i1();  // initializer: Ljava/lang/Object;-><init>()V
                R6 r61 = ((CustomerApp)m0.X).a();
                m00.b0 = m0;
                m00.e0 = 2;
                Object object2 = R6.d(r61, i10, null, null, m00, 6);
                if(object2 == object1) {
                    return object1;
                }
                m2 = m0;
                object0 = object2;
                goto label_49;
            }
            case 2: {
                break;
            }
            case 3: {
                W5.f.b0(object0);
                return (m2)object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        m2 = m00.b0;
        W5.f.b0(object0);
    label_49:
        R6 r62 = ((CustomerApp)m2.X).a();
        FragmentHandle fragmentHandle1 = ((y6)object0).a(((g1)((y6)object0).b).a.c);
        m00.b0 = null;
        m00.e0 = 3;
        object0 = r62.e(fragmentHandle1, class0, m00);
        return object0 == object1 ? object1 : ((m2)object0);
    }

    public List k() {
        if(((ArrayList)this.X).isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList0 = (ArrayList)this.X;
        return new ArrayList(((ArrayList)this.X));
    }

    public String l(String s) {
        synchronized(this) {
            return (String)((HashMap)this.X).get(s);
        }
    }

    public void m(androidx.fragment.app.e e0) {
        Fragment fragment0 = e0.c;
        String s = fragment0.c0;
        HashMap hashMap0 = (HashMap)this.Y;
        if(hashMap0.get(s) != null) {
            return;
        }
        hashMap0.put(fragment0.c0, e0);
        if(fragment0.B0) {
            if(fragment0.A0) {
                ((P)this.b0).o(fragment0);
            }
            else {
                ((P)this.b0).s(fragment0);
            }
            fragment0.B0 = false;
        }
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment0);
        }
    }

    public void n(androidx.fragment.app.e e0) {
        Fragment fragment0 = e0.c;
        if(fragment0.A0) {
            ((P)this.b0).s(fragment0);
        }
        HashMap hashMap0 = (HashMap)this.Y;
        if(hashMap0.get(fragment0.c0) != e0) {
            return;
        }
        if(((androidx.fragment.app.e)hashMap0.put(fragment0.c0, null)) == null) {
            return;
        }
        if(Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment0);
        }
    }

    public void o(V1 v10, Function2 function20) {
        ReentrantLock reentrantLock0 = (ReentrantLock)this.b0;
        try {
            reentrantLock0.lock();
            if(v10 != null) {
                this.Z = v10;
            }
            function20.j(((J)this.X), ((J)this.Y));
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    public void p(String s, String s1, String s2, String s3, q3.a a0) {
        q3.a a1;
        synchronized(this) {
            io.sentry.config.a.r(s);
            if(s1.length() != 0) {
                io.sentry.config.a.r(s2);
                if(s3.length() == 0) {
                    throw new n3.a("Empty property name", 4);
                }
                if(a0 == null) {
                    a1 = new q3.a(0, 0);
                }
                else {
                    q3.d d0 = new q3.d(a0.a);
                    if(d0.c(0x1000)) {
                        d0.e(0x800, true);
                    }
                    if(d0.c(0x800)) {
                        d0.e(0x400, true);
                    }
                    if(d0.c(0x400)) {
                        d0.e(0x200, true);
                    }
                    d0.a(d0.a);
                    a1 = new q3.a(d0.a);
                }
                if(((Pattern)this.b0).matcher(s1).find() || ((Pattern)this.b0).matcher(s3).find()) {
                    throw new n3.a("Alias and actual property names must be simple", 102);
                }
                String s4 = this.l(s);
                String s5 = this.l(s2);
                if(s4 == null) {
                    throw new n3.a("Alias namespace is not registered", 101);
                }
                if(s5 == null) {
                    throw new n3.a("Actual namespace is not registered", 101);
                }
                String s6 = s4 + s1;
                if(((HashMap)this.Z).containsKey(s6)) {
                    throw new n3.a("Alias is already existing", 4);
                }
                if(((HashMap)this.Z).containsKey(s5 + s3)) {
                    throw new n3.a("Actual property is already an alias, use the base property", 4);
                }
                o3.m m0 = new o3.m(s2, s5, s3, a1);
                ((HashMap)this.Z).put(s6, m0);
                return;
            }
        }
        throw new n3.a("Empty property name", 4);
    }

    public String q(String s, String s1) {
        synchronized(this) {
            io.sentry.config.a.r(s);
            if(s1 != null && s1.length() != 0) {
                if(s1.charAt(s1.length() - 1) != 58) {
                    s1 = s1 + ":";
                }
                if(!o3.c.d(s1.substring(0, s1.length() - 1))) {
                    throw new n3.a("The prefix is a bad XML name", 201);
                }
                String s2 = (String)((HashMap)this.X).get(s);
                String s3 = (String)((HashMap)this.Y).get(s1);
                if(s2 != null) {
                    return s2;
                }
                if(s3 != null) {
                    String s4 = s1;
                    for(int v1 = 1; ((HashMap)this.Y).containsKey(s4); ++v1) {
                        s4 = s1.substring(0, s1.length() - 1) + "_" + v1 + "_:";
                    }
                    s1 = s4;
                }
                ((HashMap)this.Y).put(s1, s);
                ((HashMap)this.X).put(s, s1);
                return s1;
            }
        }
        throw new n3.a("Empty prefix", 4);
    }

    public void r() {
        q3.a a0 = new q3.a(0, 0);
        a0.e(0x600, true);
        q3.a a1 = new q3.a(0, 0);
        a1.e(0x1E00, true);
        this.p("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", a0);
        this.p("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", null);
        this.p("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", null);
        this.p("http://ns.adobe.com/xap/1.0/", "Format", "http://purl.org/dc/elements/1.1/", "format", null);
        this.p("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
        this.p("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", null);
        this.p("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", null);
        this.p("http://ns.adobe.com/xap/1.0/rights/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
        this.p("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", a0);
        this.p("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", null);
        this.p("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
        this.p("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        this.p("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        this.p("http://ns.adobe.com/pdf/1.3/", "Subject", "http://purl.org/dc/elements/1.1/", "description", a1);
        this.p("http://ns.adobe.com/pdf/1.3/", "Title", "http://purl.org/dc/elements/1.1/", "title", a1);
        this.p("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", a0);
        this.p("http://ns.adobe.com/photoshop/1.0/", "Caption", "http://purl.org/dc/elements/1.1/", "description", a1);
        this.p("http://ns.adobe.com/photoshop/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", a1);
        this.p("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
        this.p("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", null);
        this.p("http://ns.adobe.com/photoshop/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", a1);
        this.p("http://ns.adobe.com/photoshop/1.0/", "WebStatement", "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", null);
        this.p("http://ns.adobe.com/tiff/1.0/", "Artist", "http://purl.org/dc/elements/1.1/", "creator", a0);
        this.p("http://ns.adobe.com/tiff/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
        this.p("http://ns.adobe.com/tiff/1.0/", "DateTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        this.p("http://ns.adobe.com/exif/1.0/", "DateTimeDigitized", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
        this.p("http://ns.adobe.com/tiff/1.0/", "ImageDescription", "http://purl.org/dc/elements/1.1/", "description", null);
        this.p("http://ns.adobe.com/tiff/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        this.p("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", a0);
        this.p("http://ns.adobe.com/png/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", a1);
        this.p("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
        this.p("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", a1);
        this.p("http://ns.adobe.com/png/1.0/", "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        this.p("http://ns.adobe.com/png/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        this.p("http://ns.adobe.com/png/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", a1);
    }

    public void s() {
        this.q("http://www.w3.org/XML/1998/namespace", "xml");
        this.q("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
        this.q("http://purl.org/dc/elements/1.1/", "dc");
        this.q("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
        this.q("http://iptc.org/std/Iptc4xmpExt/2008-02-29/", "Iptc4xmpExt");
        this.q("http://ns.adobe.com/DICOM/", "DICOM");
        this.q("http://ns.useplus.org/ldf/xmp/1.0/", "plus");
        this.q("adobe:ns:meta/", "x");
        this.q("http://ns.adobe.com/iX/1.0/", "iX");
        this.q("http://ns.adobe.com/xap/1.0/", "xmp");
        this.q("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
        this.q("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
        this.q("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
        this.q("http://ns.adobe.com/xmp/note/", "xmpNote");
        this.q("http://ns.adobe.com/pdf/1.3/", "pdf");
        this.q("http://ns.adobe.com/pdfx/1.3/", "pdfx");
        this.q("http://www.npes.org/pdfx/ns/id/", "pdfxid");
        this.q("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
        this.q("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
        this.q("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
        this.q("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
        this.q("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
        this.q("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
        this.q("http://ns.adobe.com/photoshop/1.0/", "photoshop");
        this.q("http://ns.adobe.com/album/1.0/", "album");
        this.q("http://ns.adobe.com/exif/1.0/", "exif");
        this.q("http://cipa.jp/exif/1.0/", "exifEX");
        this.q("http://ns.adobe.com/exif/1.0/aux/", "aux");
        this.q("http://ns.adobe.com/tiff/1.0/", "tiff");
        this.q("http://ns.adobe.com/png/1.0/", "png");
        this.q("http://ns.adobe.com/jpeg/1.0/", "jpeg");
        this.q("http://ns.adobe.com/jp2k/1.0/", "jp2k");
        this.q("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
        this.q("http://ns.adobe.com/StockPhoto/1.0/", "bmsp");
        this.q("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
        this.q("http://ns.adobe.com/asf/1.0/", "asf");
        this.q("http://ns.adobe.com/xmp/wav/1.0/", "wav");
        this.q("http://ns.adobe.com/bwf/bext/1.0/", "bext");
        this.q("http://ns.adobe.com/riff/info/", "riffinfo");
        this.q("http://ns.adobe.com/xmp/1.0/Script/", "xmpScript");
        this.q("http://ns.adobe.com/TransformXMP/", "txmp");
        this.q("http://ns.adobe.com/swf/1.0/", "swf");
        this.q("http://ns.adobe.com/ccv/1.0/", "ccv");
        this.q("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
        this.q("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
        this.q("http://ns.adobe.com/xap/1.0/t/", "xmpT");
        this.q("http://ns.adobe.com/xap/1.0/t/pg/", "xmpTPg");
        this.q("http://ns.adobe.com/xap/1.0/g/", "xmpG");
        this.q("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
        this.q("http://ns.adobe.com/xap/1.0/sType/Font#", "stFnt");
        this.q("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
        this.q("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
        this.q("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
        this.q("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
        this.q("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
        this.q("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
        this.q("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
    }

    public Bundle t(String s, Bundle bundle0) {
        HashMap hashMap0 = (HashMap)this.Z;
        return bundle0 == null ? ((Bundle)hashMap0.remove(s)) : ((Bundle)hashMap0.put(s, bundle0));
    }
}

