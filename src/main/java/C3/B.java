package c3;

import B2.e;
import B2.q;
import Bb.p;
import Ec.F;
import J1.g0;
import Nb.j;
import P4.c;
import a3.a;
import a3.f;
import a3.r;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.webkit.MimeTypeMap;
import i3.m;
import j3.h;
import java.io.InputStream;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

public final class b implements g {
    public final int a;
    public final Uri b;
    public final m c;

    public b(Uri uri0, m m0, int v) {
        this.a = v;
        this.b = uri0;
        this.c = m0;
        super();
    }

    @Override  // c3.g
    public final Object a(kotlin.coroutines.g g0) {
        q q0;
        Drawable drawable0;
        Bundle bundle0;
        String s = null;
        boolean z = true;
        m m0 = this.c;
        Uri uri0 = this.b;
        switch(this.a) {
            case 0: {
                String s6 = p.v0(p.l0(uri0.getPathSegments(), 1), "/", null, null, null, 62);
                F f1 = Ec.b.c(Ec.b.k(m0.a.getAssets().open(s6)));
                a a0 = new a();  // initializer: Ljava/lang/Object;-><init>()V
                return new c3.m(new r(f1, new B9.g(m0.a, 2), a0), m3.g.b(MimeTypeMap.getSingleton(), s6), f.Z);
            }
            case 1: {
                ContentResolver contentResolver0 = m0.a.getContentResolver();
                if(j.a(uri0.getAuthority(), "com.android.contacts") && j.a(uri0.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor assetFileDescriptor0 = contentResolver0.openAssetFileDescriptor(uri0, "r");
                    if(assetFileDescriptor0 != null) {
                        s = assetFileDescriptor0.createInputStream();
                    }
                    if(s == null) {
                        throw new IllegalStateException(("Unable to find a contact photo associated with \'" + uri0 + "\'.").toString());
                    }
                }
                else {
                    if(Build.VERSION.SDK_INT >= 29 && j.a(uri0.getAuthority(), "media")) {
                        List list0 = uri0.getPathSegments();
                        int v2 = list0.size();
                        if(v2 >= 3 && j.a(list0.get(v2 - 3), "audio") && j.a(list0.get(v2 - 2), "albums")) {
                            h h0 = m0.d;
                            j3.a a1 = h0.a instanceof j3.a ? ((j3.a)h0.a) : null;
                            if(a1 == null) {
                                bundle0 = null;
                            }
                            else {
                                j3.a a2 = h0.b instanceof j3.a ? ((j3.a)h0.b) : null;
                                if(a2 == null) {
                                    bundle0 = null;
                                }
                                else {
                                    bundle0 = new Bundle(1);
                                    bundle0.putParcelable("android.content.extra.SIZE", new Point(a1.b, a2.b));
                                }
                            }
                            AssetFileDescriptor assetFileDescriptor1 = g0.c(contentResolver0, uri0, bundle0);
                            if(assetFileDescriptor1 != null) {
                                s = assetFileDescriptor1.createInputStream();
                            }
                            if(s == null) {
                                throw new IllegalStateException(("Unable to find a music thumbnail associated with \'" + uri0 + "\'.").toString());
                            }
                            goto label_97;
                        }
                    }
                    s = contentResolver0.openInputStream(uri0);
                    if(s == null) {
                        throw new IllegalStateException(("Unable to open \'" + uri0 + "\'.").toString());
                    }
                }
            label_97:
                F f2 = Ec.b.c(Ec.b.k(((InputStream)s)));
                a a3 = new a();  // initializer: Ljava/lang/Object;-><init>()V
                return new c3.m(new r(f2, new B9.g(m0.a, 2), a3), contentResolver0.getType(uri0), f.Z);
            }
            default: {
                String s1 = uri0.getAuthority();
                if(s1 != null) {
                    if(!Vb.j.c0(s1)) {
                        s = s1;
                    }
                    if(s != null) {
                        String s2 = (String)p.x0(uri0.getPathSegments());
                        if(s2 != null) {
                            Integer integer0 = Vb.q.P(s2);
                            if(integer0 != null) {
                                int v = (int)integer0;
                                Context context0 = m0.a;
                                Resources resources0 = s.equals("com.wave.personal") ? context0.getResources() : context0.getPackageManager().getResourcesForApplication(s);
                                TypedValue typedValue0 = new TypedValue();
                                resources0.getValue(v, typedValue0, true);
                                CharSequence charSequence0 = typedValue0.string;
                                String s3 = charSequence0.subSequence(Vb.j.e0(charSequence0, '/', 0, 6), charSequence0.length()).toString();
                                String s4 = m3.g.b(MimeTypeMap.getSingleton(), s3);
                                if(j.a(s4, "text/xml")) {
                                    if(s.equals("com.wave.personal")) {
                                        drawable0 = Bb.q.v(context0, v);
                                        if(drawable0 == null) {
                                            throw new IllegalStateException(("Invalid resource ID: " + v).toString());
                                        }
                                    }
                                    else {
                                        XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
                                        int v1;
                                        for(v1 = xmlResourceParser0.next(); v1 != 1 && v1 != 2; v1 = xmlResourceParser0.next()) {
                                        }
                                        if(v1 != 2) {
                                            throw new XmlPullParserException("No start tag found.");
                                        }
                                        if(Build.VERSION.SDK_INT < 24) {
                                            String s5 = xmlResourceParser0.getName();
                                            boolean z1 = false;
                                            if(j.a(s5, "vector")) {
                                                z1 = true;
                                                AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
                                                Resources.Theme resources$Theme0 = context0.getTheme();
                                                q0 = new q();
                                                q0.inflate(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
                                            }
                                            else if(j.a(s5, "animated-vector")) {
                                                z1 = true;
                                                AttributeSet attributeSet1 = Xml.asAttributeSet(xmlResourceParser0);
                                                Resources.Theme resources$Theme1 = context0.getTheme();
                                                q0 = new e(context0);
                                                ((e)q0).inflate(resources0, xmlResourceParser0, attributeSet1, resources$Theme1);
                                            }
                                            if(z1) {
                                                drawable0 = q0;
                                                goto label_50;
                                            }
                                        }
                                        drawable0 = resources0.getDrawable(v, context0.getTheme());
                                        if(drawable0 == null) {
                                            throw new IllegalStateException(("Invalid resource ID: " + v).toString());
                                        }
                                    }
                                label_50:
                                    if(!(drawable0 instanceof VectorDrawable) && !(drawable0 instanceof q)) {
                                        z = false;
                                    }
                                    if(z) {
                                        Bitmap bitmap0 = c.r(drawable0, m0.b, m0.d, m0.e, m0.f);
                                        drawable0 = new BitmapDrawable(context0.getResources(), bitmap0);
                                    }
                                    return new d(drawable0, z, f.Z);
                                }
                                TypedValue typedValue1 = new TypedValue();
                                F f0 = Ec.b.c(Ec.b.k(resources0.openRawResource(v, typedValue1)));
                                a3.q q1 = new a3.q(typedValue1.density);
                                return new c3.m(new r(f0, new B9.g(context0, 2), q1), s4, f.Z);
                            }
                        }
                        throw new IllegalStateException("Invalid android.resource URI: " + uri0);
                    }
                }
                throw new IllegalStateException("Invalid android.resource URI: " + uri0);
            }
        }
    }
}

