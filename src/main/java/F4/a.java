package F4;

import C3.i;
import E4.b;
import U7.c;
import com.drew.metadata.mp4.Mp4Directory;
import com.drew.metadata.mp4.media.Mp4HintDirectory;
import com.drew.metadata.mp4.media.Mp4MediaDirectory;
import com.drew.metadata.mp4.media.Mp4MetaDirectory;
import com.drew.metadata.mp4.media.Mp4SoundDirectory;
import com.drew.metadata.mp4.media.Mp4TextDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import l4.f;
import l4.l;

public final class a extends G0.a {
    public final int c;

    public a(c c0, i i0, int v) {
        this.c = v;
        super(c0, 4);
        Long long0 = (Long)i0.X;
        if(long0 != null) {
            ((Mp4MediaDirectory)(((Mp4Directory)this.b))).setDate(101, f.a(((long)long0)));
        }
        Long long1 = (Long)i0.Y;
        if(long1 != null) {
            ((Mp4MediaDirectory)(((Mp4Directory)this.b))).setDate(102, f.a(((long)long1)));
        }
        String s = (String)i0.c0;
        if(s != null) {
            ((Mp4MediaDirectory)(((Mp4Directory)this.b))).setString(104, s);
        }
    }

    public final String A() {
        switch(this.c) {
            case 0: {
                return "hmhd";
            }
            case 1: {
                return "nmhd";
            }
            case 2: {
                return "smhd";
            }
            case 3: {
                return "text";
            }
            default: {
                return "vmhd";
            }
        }
    }

    private final void B(l l0) {
    }

    private final void C(l l0) {
    }

    private final void D(l l0) {
    }

    private final void E(l l0) {
    }

    private final void F(l l0) {
    }

    private final void G(l l0, i i0) {
    }

    private final void H(l l0, i i0) {
    }

    private final void I(l l0, i i0) {
    }

    @Override  // G0.a
    public final Mp4Directory i() {
        switch(this.c) {
            case 0: {
                return new Mp4HintDirectory();
            }
            case 1: {
                return new Mp4MetaDirectory();
            }
            case 2: {
                return new Mp4SoundDirectory();
            }
            case 3: {
                return new Mp4TextDirectory();
            }
            default: {
                return new Mp4VideoDirectory();
            }
        }
    }

    @Override  // G0.a
    public final G0.a r(String s, byte[] arr_b, long v, i i0) {
        if(arr_b != null) {
            l l0 = new l(0, arr_b);
            if(s.equals(this.A())) {
                switch(this.c) {
                    case 0: {
                        l0.D(4L);
                        int v2 = l0.x();
                        int v3 = l0.x();
                        long v4 = l0.z();
                        long v5 = l0.z();
                        Mp4HintDirectory mp4HintDirectory0 = (Mp4HintDirectory)(((Mp4Directory)this.b));
                        mp4HintDirectory0.setInt(101, v2);
                        mp4HintDirectory0.setInt(102, v3);
                        mp4HintDirectory0.setLong(103, v4);
                        mp4HintDirectory0.setLong(104, v5);
                        return this;
                    }
                    case 2: {
                        l0.D(4L);
                        int v6 = l0.f();
                        l0.D(2L);
                        ((Mp4SoundDirectory)(((Mp4Directory)this.b))).setDouble(305, ((double)(0xFFFF0000 & v6)) + ((double)(v6 & 0xFFFF)) / Math.pow(2.0, 4.0));
                        return this;
                    }
                    case 1: 
                    case 3: {
                        break;
                    }
                    default: {
                        l0.D(4L);
                        int v1 = l0.x();
                        int[] arr_v = {l0.x(), l0.x(), l0.x()};
                        Mp4VideoDirectory mp4VideoDirectory0 = (Mp4VideoDirectory)(((Mp4Directory)this.b));
                        mp4VideoDirectory0.setIntArray(0xD4, arr_v);
                        mp4VideoDirectory0.setInt(0xD3, v1);
                        return this;
                    }
                }
            }
            else if(s.equals("stsd")) {
                switch(this.c) {
                    case 2: {
                        l0.D(4L);
                        l0.z();
                        l0.z();
                        String s4 = l0.s(4);
                        l0.D(6L);
                        l0.x();
                        l0.D(8L);
                        int v12 = l0.x();
                        int v13 = l0.f();
                        l0.D(2L);
                        l0.D(2L);
                        l0.z();
                        Mp4Directory mp4Directory1 = (Mp4Directory)this.b;
                        mp4Directory1.setString(301, b.a(301, s4));
                        ((Mp4SoundDirectory)mp4Directory1).setInt(302, v12);
                        ((Mp4SoundDirectory)mp4Directory1).setInt(303, v13);
                        return this;
                    }
                    case 0: 
                    case 1: 
                    case 3: {
                        break;
                    }
                    default: {
                        l0.D(4L);
                        l0.z();
                        l0.z();
                        String s1 = l0.s(4);
                        l0.D(6L);
                        l0.x();
                        l0.f();
                        l0.f();
                        l0.s(4);
                        l0.i();
                        l0.i();
                        int v7 = l0.x();
                        int v8 = l0.x();
                        long v9 = l0.z();
                        long v10 = l0.z();
                        l0.D(4L);
                        l0.x();
                        String s2 = l0.s(0x20);
                        int v11 = l0.x();
                        l0.D(2L);
                        Mp4Directory mp4Directory0 = (Mp4Directory)this.b;
                        mp4Directory0.setString(210, b.a(210, s1));
                        ((Mp4VideoDirectory)mp4Directory0).setInt(204, v7);
                        ((Mp4VideoDirectory)mp4Directory0).setInt(205, v8);
                        String s3 = s2.trim();
                        if(!s3.isEmpty()) {
                            ((Mp4VideoDirectory)mp4Directory0).setString(0xD0, s3);
                        }
                        ((Mp4VideoDirectory)mp4Directory0).setInt(209, v11);
                        ((Mp4VideoDirectory)mp4Directory0).setDouble(206, ((double)(v9 & 0xFFFFL)) / Math.pow(2.0, 4.0) + ((double)((v9 & 0xFFFFFFFFFFFF0000L) >> 16)));
                        ((Mp4VideoDirectory)mp4Directory0).setDouble(0xCF, ((double)(0xFFFFL & v10)) / Math.pow(2.0, 4.0) + ((double)((0xFFFFFFFFFFFF0000L & v10) >> 16)));
                        return this;
                    }
                }
            }
            else if(s.equals("stts")) {
                switch(this.c) {
                    case 2: {
                        l0.D(4L);
                        l0.D(l0.z() * 8L);
                        Long long1 = (Long)i0.Z;
                        if(long1 != null) {
                            ((Mp4SoundDirectory)(((Mp4Directory)this.b))).setDouble(304, ((double)(((long)long1))));
                        }
                        break;
                    }
                    case 0: 
                    case 1: 
                    case 3: {
                        break;
                    }
                    default: {
                        l0.D(4L);
                        long v14 = l0.z();
                        float f = 0.0f;
                        for(int v15 = 0; ((long)v15) < v14; ++v15) {
                            f += (float)l0.z();
                            l0.D(4L);
                        }
                        Long long0 = (Long)i0.Z;
                        if(long0 != null && ((Long)i0.b0) != null) {
                            ((Mp4VideoDirectory)(((Mp4Directory)this.b))).setFloat(0xD6, ((float)(((long)long0))) / (((float)(((long)(((Long)i0.b0))))) / f));
                            return this;
                        }
                    }
                }
            }
        }
        return this;
    }

    // Deobfuscation rating: LOW(30)
    @Override  // G0.a
    public final boolean w(String s) {
        return s.equals(this.A()) || s.equals("stsd") || s.equals("stts");
    }

    // Deobfuscation rating: LOW(20)
    @Override  // G0.a
    public final boolean y(String s) {
        return s.equals("stbl") || s.equals("minf");
    }
}

