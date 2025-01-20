package i4;

import c4.e;
import java.util.HashMap;

public final class a implements e {
    public static final HashMap X;

    static {
        HashMap hashMap0 = new HashMap();
        a.X = hashMap0;
        hashMap0.put("moov", c4.a.p0);
        hashMap0.put("wide", c4.a.p0);
        hashMap0.put("mdat", c4.a.p0);
        hashMap0.put("free", c4.a.p0);
        hashMap0.put("qt  ", c4.a.p0);
        hashMap0.put("3g2a", c4.a.p0);
        hashMap0.put("3gp5", c4.a.q0);
        hashMap0.put("avc1", c4.a.q0);
        hashMap0.put("iso2", c4.a.q0);
        hashMap0.put("isom", c4.a.q0);
        hashMap0.put("M4A ", c4.a.q0);
        hashMap0.put("M4B ", c4.a.q0);
        hashMap0.put("M4P ", c4.a.q0);
        hashMap0.put("M4V ", c4.a.q0);
        hashMap0.put("M4VH", c4.a.q0);
        hashMap0.put("M4VP", c4.a.q0);
        hashMap0.put("mmp4", c4.a.q0);
        hashMap0.put("mp41", c4.a.q0);
        hashMap0.put("mp42", c4.a.q0);
        hashMap0.put("mp71", c4.a.q0);
        hashMap0.put("MSNV", c4.a.q0);
        hashMap0.put("NDAS", c4.a.q0);
        hashMap0.put("NDSC", c4.a.q0);
        hashMap0.put("NDSH", c4.a.q0);
        hashMap0.put("NDSM", c4.a.q0);
        hashMap0.put("NDSP", c4.a.q0);
        hashMap0.put("NDSS", c4.a.q0);
        hashMap0.put("NDXC", c4.a.q0);
        hashMap0.put("NDXH", c4.a.q0);
        hashMap0.put("NDXM", c4.a.q0);
        hashMap0.put("NDXP", c4.a.q0);
        hashMap0.put("NDXS", c4.a.q0);
        hashMap0.put("nvr1", c4.a.q0);
        hashMap0.put("mif1", c4.a.r0);
        hashMap0.put("msf1", c4.a.r0);
        hashMap0.put("heic", c4.a.r0);
        hashMap0.put("heix", c4.a.r0);
        hashMap0.put("hevc", c4.a.r0);
        hashMap0.put("hevx", c4.a.r0);
        hashMap0.put("crx ", c4.a.A0);
    }

    @Override  // c4.e
    public final int c() {
        return 12;
    }

    @Override  // c4.e
    public final c4.a e(byte[] arr_b) {
        if(arr_b[4] == 102 && arr_b[5] == 0x74 && arr_b[6] == 0x79 && arr_b[7] == 0x70) {
            String s = new String(arr_b, 8, 4);
            c4.a a0 = (c4.a)a.X.get(s);
            return a0 == null ? c4.a.p0 : a0;
        }
        return c4.a.c0;
    }
}

