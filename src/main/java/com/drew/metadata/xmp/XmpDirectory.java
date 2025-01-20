package com.drew.metadata.xmp;

import com.drew.metadata.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o3.e;
import o3.i;
import q3.a;

public class XmpDirectory extends b {
    public static final int TAG_XMP_VALUE_COUNT = 0xFFFF;
    private static final HashMap _tagNameMap;
    private n3.b _xmpMeta;

    static {
        HashMap hashMap0 = new HashMap();
        XmpDirectory._tagNameMap = hashMap0;
        hashMap0.put(0xFFFF, "XMP Value Count");
    }

    public XmpDirectory() {
        this.setDescriptor(new A4.b(12, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "XMP";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return XmpDirectory._tagNameMap;
    }

    public n3.b getXMPMeta() {
        if(this._xmpMeta == null) {
            this._xmpMeta = new i();
        }
        return this._xmpMeta;
    }

    public Map getXmpProperties() {
        HashMap hashMap0 = new HashMap();
        if(this._xmpMeta != null) {
            try {
                a a0 = new a(1, 0);
                a0.e(0x200, true);
                Iterator iterator0 = ((i)this._xmpMeta).b(null, a0).Y;
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = ((e)object0).a;
                    String s1 = ((e)object0).b;
                    if(s != null && s1 != null) {
                        hashMap0.put(s, s1);
                    }
                }
            }
            catch(n3.a unused_ex) {
            }
        }
        return Collections.unmodifiableMap(hashMap0);
    }

    public void setXMPMeta(n3.b b0) {
        try {
            this._xmpMeta = b0;
            a a0 = new a(1, 0);
            a0.e(0x200, true);
            int v = 0;
            Iterator iterator0 = ((i)this._xmpMeta).b(null, a0).Y;
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(((e)object0).a != null) {
                    ++v;
                }
            }
            this.setInt(0xFFFF, v);
        }
        catch(n3.a unused_ex) {
        }
    }
}

