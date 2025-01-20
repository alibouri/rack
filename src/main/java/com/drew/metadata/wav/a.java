package com.drew.metadata.wav;

import U7.c;
import com.drew.metadata.d;
import java.io.IOException;
import java.util.HashMap;
import l4.b;

public final class a implements j4.a {
    public final WavDirectory X;
    public String Y;

    public a(c c0) {
        this.Y = "";
        WavDirectory wavDirectory0 = new WavDirectory();
        this.X = wavDirectory0;
        c0.i(wavDirectory0);
    }

    @Override  // j4.a
    public final boolean A(String s) {
        if(s.equals("INFO")) {
            this.Y = "INFO";
            return true;
        }
        this.Y = "";
        return false;
    }

    @Override  // j4.a
    public final void i(String s) {
        this.X.addError(s);
    }

    @Override  // j4.a
    public final void m(String s, byte[] arr_b) {
        WavDirectory wavDirectory0;
        try {
            wavDirectory0 = this.X;
            if(s.equals("fmt ")) {
                b b0 = new b(0, arr_b);
                b0.a = false;
                int v = b0.g(0);
                int v1 = b0.g(2);
                int v2 = b0.j(4);
                int v3 = b0.j(8);
                int v4 = b0.g(12);
                if(v == 1) {
                    wavDirectory0.setInt(6, b0.g(14));
                    wavDirectory0.setString(1, ((String)WavDirectory._audioEncodingMap.get(1)));
                }
                else {
                    HashMap hashMap0 = WavDirectory._audioEncodingMap;
                    if(hashMap0.containsKey(v)) {
                        wavDirectory0.setString(1, ((String)hashMap0.get(v)));
                    }
                    else {
                        wavDirectory0.setString(1, "Unknown");
                    }
                }
                wavDirectory0.setInt(2, v1);
                wavDirectory0.setInt(3, v2);
                wavDirectory0.setInt(4, v3);
                wavDirectory0.setInt(5, v4);
                return;
            }
            if(s.equals("data")) {
                try {
                    if(wavDirectory0.containsTag(4)) {
                        double f = wavDirectory0.getDouble(4);
                        double f1 = ((double)arr_b.length) / f;
                        int v5 = ((int)f1) / ((int)Math.pow(60.0, 2.0));
                        int v6 = ((int)f1) / ((int)Math.pow(60.0, 1.0)) - v5 * 60;
                        wavDirectory0.setString(16, String.format("%1$02d:%2$02d:%3$02d", v5, v6, ((int)Math.round(f1 / Math.pow(60.0, 0.0) - ((double)(v6 * 60))))));
                        return;
                    }
                }
                catch(d unused_ex) {
                    wavDirectory0.addError("Error calculating duration: bytes per second not found");
                }
                return;
            }
            else {
                HashMap hashMap1 = WavDirectory._tagIntegerMap;
                if(hashMap1.containsKey(s)) {
                    wavDirectory0.setString(((int)(((Integer)hashMap1.get(s)))), new String(arr_b).substring(0, arr_b.length - 1));
                    return;
                }
            }
            return;
        }
        catch(IOException iOException0) {
        }
        wavDirectory0.addError(iOException0.getMessage());
    }

    // Deobfuscation rating: LOW(40)
    @Override  // j4.a
    public final boolean q(String s) {
        return s.equals("fmt ") || this.Y.equals("INFO") && WavDirectory._tagIntegerMap.containsKey(s) || s.equals("data");
    }

    @Override  // j4.a
    public final boolean r(String s) {
        return s.equals("WAVE");
    }
}

