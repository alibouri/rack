package com.drew.metadata.mov.metadata;

import A4.d;
import R2.w;
import com.drew.metadata.mov.QuickTimeDirectory;
import java.io.EOFException;
import java.util.ArrayList;
import l4.f;
import l4.l;

public final class a extends d {
    public int c;
    public ArrayList d;

    @Override  // A4.d
    public final G0.a p(B4.a a0, byte[] arr_b, w w0) {
        ArrayList arrayList0 = this.d;
        if(arr_b == null) {
            int v6 = f.b(a0.b.getBytes());
            if(v6 > 0 && v6 < arrayList0.size() + 1) {
                this.c = v6 - 1;
            }
        }
        else {
            int v = 0;
            l l0 = new l(0, arr_b);
            boolean z = a0.b.equals("keys");
            QuickTimeDirectory quickTimeDirectory0 = (QuickTimeDirectory)this.b;
            if(z) {
                l0.D(4L);
                int v1 = l0.i();
                while(v < v1) {
                    int v2 = l0.i();
                    if(v2 < 8) {
                        quickTimeDirectory0.addError("Key size too small: " + v2);
                        return this;
                    }
                    l0.D(4L);
                    arrayList0.add(l0.v(v2 - 8));
                    ++v;
                }
                return this;
            }
            if(a0.b.equals("data") && this.c < arrayList0.size()) {
                int v3 = l0.i();
                l0.D(4L);
                Object object0 = arrayList0.get(this.c);
                Integer integer0 = (Integer)QuickTimeMetadataDirectory._tagIntegerMap.get(object0);
                if(integer0 != null) {
                    int v4 = arr_b.length - 8;
                    switch(v3) {
                        case 1: {
                            quickTimeDirectory0.setString(((int)integer0), l0.v(v4));
                            return this;
                        }
                        case 22: {
                            byte[] arr_b1 = new byte[4];
                            int v5 = l0.c;
                            byte[] arr_b2 = l0.b;
                            if(((long)v5) + ((long)v4) > ((long)arr_b2.length)) {
                                throw new EOFException("End of data reached.");
                            }
                            System.arraycopy(arr_b2, v5, arr_b1, 4 - v4, v4);
                            l0.c += v4;
                            quickTimeDirectory0.setInt(((int)integer0), new l(0, arr_b1).i());
                            return this;
                        }
                        case 23: {
                            quickTimeDirectory0.setFloat(((int)integer0), Float.intBitsToFloat(l0.i()));
                            return this;
                        }
                        case 13: 
                        case 14: 
                        case 27: {
                            quickTimeDirectory0.setByteArray(((int)integer0), l0.c(v4));
                            return this;
                        }
                        case 30: {
                            int[] arr_v = new int[v4 / 4];
                            while(v < v4 / 4) {
                                arr_v[v] = l0.i();
                                ++v;
                            }
                            quickTimeDirectory0.setIntArray(((int)integer0), arr_v);
                            return this;
                        }
                        default: {
                            return this;
                        }
                    }
                }
            }
        }
        return this;
    }

    // Deobfuscation rating: LOW(30)
    @Override  // A4.d
    public final boolean u(B4.a a0) {
        return a0.b.equals("hdlr") || (a0.b.equals("keys") || a0.b.equals("data"));
    }

    @Override  // A4.d
    public final boolean x(B4.a a0) {
        return a0.b.equals("ilst") || f.b(a0.b.getBytes()) <= this.d.size();
    }
}

