package com.apollographql.apollo.api.http;

import Ab.h;
import Ab.k;
import Bb.F;
import Bb.q;
import Bb.r;
import Ec.E;
import Ec.b;
import Ec.g;
import Ec.m;
import Nb.j;
import R9.F2;
import W4.f;
import com.apollographql.apollo.api.Upload;
import com.apollographql.apollo.api.json.-JsonWriters;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;
import java.util.UUID;

public final class UploadsHttpBody implements HttpBody {
    private final String boundary;
    private final h contentLength$delegate;
    private final String contentType;
    private final m operationByteString;
    private final Map uploads;

    public UploadsHttpBody(Map map0, m m0) {
        j.f(map0, "uploads");
        j.f(m0, "operationByteString");
        super();
        this.uploads = map0;
        this.operationByteString = m0;
        UUID uUID0 = UUID.randomUUID();
        j.e(uUID0, "randomUUID(...)");
        String s = uUID0.toString();
        j.e(s, "toString(...)");
        this.boundary = s;
        this.contentType = "multipart/form-data; boundary=" + s;
        this.contentLength$delegate = f.A(new F2(14, this));
    }

    private final m buildUploadMap(Map map0) {
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        BufferedSinkJsonWriter bufferedSinkJsonWriter0 = new BufferedSinkJsonWriter(j0, null);
        Iterable iterable0 = map0.entrySet();
        ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
        int v = 0;
        for(Object object0: iterable0) {
            if(v >= 0) {
                arrayList0.add(new k(String.valueOf(v), q.K(((Map.Entry)object0).getKey())));
                ++v;
                continue;
            }
            q.Z();
            throw null;
        }
        -JsonWriters.writeAny(bufferedSinkJsonWriter0, F.W(arrayList0));
        return j0.N(j0.Y);
    }

    private static final long contentLength_delegate$lambda$1(UploadsHttpBody uploadsHttpBody0) {
        CountingSink countingSink0 = new CountingSink(new g());  // initializer: Ljava/lang/Object;-><init>()V
        E e0 = b.b(countingSink0);
        uploadsHttpBody0.writeBoundaries(e0, false);
        e0.flush();
        long v = countingSink0.getBytesWritten();
        long v1 = 0L;
        for(Object object0: uploadsHttpBody0.uploads.values()) {
            v1 += ((Upload)object0).getContentLength();
        }
        return v + v1;
    }

    @Override  // com.apollographql.apollo.api.http.HttpBody
    public long getContentLength() {
        return ((Number)this.contentLength$delegate.getValue()).longValue();
    }

    @Override  // com.apollographql.apollo.api.http.HttpBody
    public String getContentType() {
        return this.contentType;
    }

    private final void writeBoundaries(Ec.k k0, boolean z) {
        k0.R("--" + this.boundary + "\r\n");
        k0.R("Content-Disposition: form-data; name=\"operations\"\r\n");
        k0.R("Content-Type: application/json\r\n");
        k0.R("Content-Length: " + this.operationByteString.e() + "\r\n");
        k0.R("\r\n");
        k0.I(this.operationByteString);
        m m0 = this.buildUploadMap(this.uploads);
        k0.R("\r\n--" + this.boundary + "\r\n");
        k0.R("Content-Disposition: form-data; name=\"map\"\r\n");
        k0.R("Content-Type: application/json\r\n");
        k0.R("Content-Length: " + m0.e() + "\r\n");
        k0.R("\r\n");
        k0.I(m0);
        int v = 0;
        for(Object object0: this.uploads.values()) {
            if(v >= 0) {
                k0.R("\r\n--" + this.boundary + "\r\n");
                k0.R("Content-Disposition: form-data; name=\"" + v + '\"');
                if(((Upload)object0).getFileName() != null) {
                    k0.R("; filename=\"" + ((Upload)object0).getFileName() + '\"');
                }
                k0.R("\r\n");
                k0.R("Content-Type: " + ((Upload)object0).getContentType() + "\r\n");
                long v1 = ((Upload)object0).getContentLength();
                if(v1 != -1L) {
                    k0.R("Content-Length: " + v1 + "\r\n");
                }
                k0.R("\r\n");
                if(z) {
                    ((Upload)object0).writeTo(k0);
                }
                ++v;
                continue;
            }
            q.Z();
            throw null;
        }
        k0.R("\r\n--" + this.boundary + "--\r\n");
    }

    @Override  // com.apollographql.apollo.api.http.HttpBody
    public void writeTo(Ec.k k0) {
        j.f(k0, "bufferedSink");
        this.writeBoundaries(k0, true);
    }
}

