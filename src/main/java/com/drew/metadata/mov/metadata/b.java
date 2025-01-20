package com.drew.metadata.mov.metadata;

import A4.d;
import G0.a;
import R2.w;
import com.drew.metadata.mov.QuickTimeDirectory;
import l4.l;

public final class b extends d {
    public String c;

    @Override  // A4.d
    public final a p(B4.a a0, byte[] arr_b, w w0) {
        if(arr_b == null) {
            if(QuickTimeMetadataDirectory._tagIntegerMap.containsKey(a0.b)) {
                this.c = a0.b;
                return this;
            }
            this.c = null;
        }
        else {
            l l0 = new l(0, arr_b);
            if(!a0.b.equals("data") || this.c == null) {
                this.c = new String(l0.c(4));
                return this;
            }
            l0.D(8L);
            String s = new String(l0.c(arr_b.length - 8));
            Integer integer0 = (Integer)QuickTimeMetadataDirectory._tagIntegerMap.get(this.c);
            if(integer0 != null) {
                ((QuickTimeDirectory)this.b).setString(((int)integer0), s);
                return this;
            }
        }
        return this;
    }

    @Override  // A4.d
    public final boolean u(B4.a a0) {
        return a0.b.equals("data");
    }

    // Deobfuscation rating: LOW(20)
    @Override  // A4.d
    public final boolean x(B4.a a0) {
        return QuickTimeMetadataDirectory._tagIntegerMap.containsKey(a0.b) || a0.b.equals("ilst");
    }
}

