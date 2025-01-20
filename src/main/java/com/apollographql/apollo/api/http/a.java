package com.apollographql.apollo.api.http;

import Ab.t;
import Nb.j;
import Y8.N;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.components.QRCodeView;
import kotlin.jvm.functions.Function1;
import q9.O1;
import q9.a2;

public final class a implements Function1 {
    public final int X;
    public final Object Y;
    public final boolean Z;

    public a(int v, Object object0, boolean z) {
        this.X = v;
        this.Y = object0;
        this.Z = z;
        super();
    }

    public a(boolean z, String s) {
        this.X = 0;
        super();
        this.Z = z;
        this.Y = s;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                return Companion.apqExtensionsWriter$lambda$4(this.Z, ((String)this.Y), ((JsonWriter)object0));
            }
            case 1: {
                j.f(((QRCodeView)object0), "view");
                ((QRCodeView)object0).setQrcontent(((String)this.Y));
                ((QRCodeView)object0).setAnimateOnUpdate(this.Z);
                return t.a;
            }
            default: {
                Throwable throwable0 = (Throwable)object0;
                ((a2)this.Y).b0.b(this.Z);
                O1 o10 = new O1(((a2)this.Y), null);
                N.k(((a2)this.Y), ((a2)this.Y).i0, true, o10);
                return t.a;
            }
        }
    }
}

