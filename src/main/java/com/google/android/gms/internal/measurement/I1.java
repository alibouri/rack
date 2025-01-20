package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Set;

public final class i1 extends c2 {
    private String zzaa;
    private long zzab;
    private int zzac;
    private String zzad;
    private String zzae;
    private boolean zzaf;
    private l2 zzag;
    private String zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private String zzal;
    private long zzam;
    private long zzan;
    private String zzao;
    private String zzap;
    private int zzaq;
    private String zzar;
    private j1 zzas;
    private j2 zzat;
    private long zzau;
    private long zzav;
    private String zzaw;
    private String zzax;
    private int zzay;
    private boolean zzaz;
    private String zzba;
    private boolean zzbb;
    private e1 zzbc;
    private String zzbd;
    private l2 zzbe;
    private String zzbf;
    private long zzbg;
    private boolean zzbh;
    private String zzbi;
    private boolean zzbj;
    private String zzbk;
    private int zzbl;
    private String zzbm;
    private U0 zzbn;
    private int zzbo;
    private R0 zzbp;
    private String zzbq;
    private static final i1 zzc;
    private static volatile x2 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private l2 zzh;
    private l2 zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private int zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private String zzy;
    private boolean zzz;

    static {
        i1 i10 = new i1();
        i1.zzc = i10;
        c2.h(i1.class, i10);
    }

    public i1() {
        this.zzh = z2.c0;
        this.zzi = z2.c0;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzt = "";
        this.zzu = "";
        this.zzv = "";
        this.zzy = "";
        this.zzaa = "";
        this.zzad = "";
        this.zzae = "";
        this.zzag = z2.c0;
        this.zzah = "";
        this.zzal = "";
        this.zzao = "";
        this.zzap = "";
        this.zzar = "";
        this.zzat = f2.c0;
        this.zzaw = "";
        this.zzax = "";
        this.zzba = "";
        this.zzbd = "";
        this.zzbe = z2.c0;
        this.zzbf = "";
        this.zzbi = "";
        this.zzbk = "";
        this.zzbm = "";
        this.zzbq = "";
    }

    public static void A(i1 i10, ArrayList arrayList0) {
        l2 l20 = i10.zzag;
        if(!((O1)l20).X) {
            i10.zzag = l20.b(l20.size() << 1);
        }
        N1.b(arrayList0, i10.zzag);
    }

    public final boolean A0() {
        return (this.zzf & 2) != 0;
    }

    public static void A1(i1 i10, String s) {
        s.getClass();
        i10.zze |= 0x80000000;
        i10.zzao = s;
    }

    public static void B(i1 i10, boolean z) {
        i10.zzf |= 0x10000;
        i10.zzbh = z;
    }

    public final boolean B0() {
        return (this.zze & 0x800000) != 0;
    }

    public final long B1() {
        return this.zzab;
    }

    public final String C() {
        return this.zzaa;
    }

    public final boolean C0() {
        return (this.zzf & 0x2000) != 0;
    }

    public static void C1(i1 i10) {
        i10.zze &= 0xFFFEFFFF;
        i10.zzy = i1.zzc.zzy;
    }

    public final String D() {
        return this.zzt;
    }

    public final boolean D0() {
        return (this.zze & 4) != 0;
    }

    public static void D1(i1 i10, long v) {
        i10.zze |= 2;
        i10.zzj = v;
    }

    public final String E() {
        return this.zzv;
    }

    public final boolean E0() {
        return (this.zzf & 0x8000) != 0;
    }

    public static void E1(i1 i10, String s) {
        s.getClass();
        i10.zzf |= 0x4000;
        i10.zzbf = s;
    }

    public final String F() {
        return this.zzbi;
    }

    public final boolean F0() {
        return (this.zze & 0x400) != 0;
    }

    public final long F1() {
        return this.zzau;
    }

    public final String G() {
        return this.zzax;
    }

    public final boolean G0() {
        return (this.zze & 2) != 0;
    }

    public static void G1(i1 i10) {
        i10.zzf &= 0xFFFFDFFF;
        i10.zzbd = i1.zzc.zzbd;
    }

    public final String H() {
        return this.zzbk;
    }

    public final boolean H0() {
        return (this.zze & 0x8000) != 0;
    }

    public static void H1(i1 i10, String s) {
        i10.zze |= 0x1000000;
        i10.zzah = s;
    }

    public final String I() {
        return this.zzq;
    }

    public final int I0() {
        return this.zzac;
    }

    public static void I1(i1 i10) {
        i10.zze |= 0x8000;
        i10.zzx = 106000L;
    }

    public final String J() {
        return this.zzao;
    }

    public static void J0(i1 i10) {
        i10.zzag = z2.c0;
    }

    public final long J1() {
        return this.zzl;
    }

    public final String K() {
        return this.zzah;
    }

    public static void K0(i1 i10, int v) {
        i10.zzf |= 0x100000;
        i10.zzbl = v;
    }

    public static void K1(i1 i10) {
        i10.zze &= 0xEFFFFFFF;
        i10.zzal = i1.zzc.zzal;
    }

    public final String L() {
        return this.zzae;
    }

    public static void L0(i1 i10, long v) {
        i10.zze |= 0x80000;
        i10.zzab = v;
    }

    public static void L1(i1 i10, String s) {
        s.getClass();
        i10.zze |= 0x400000;
        i10.zzae = s;
    }

    public final String M() {
        return this.zzad;
    }

    public static void M0(i1 i10, String s) {
        i10.zze |= 0x40000;
        i10.zzaa = s;
    }

    public final long M1() {
        return this.zzw;
    }

    public final String N() {
        return this.zzp;
    }

    public static void N0(i1 i10, ArrayList arrayList0) {
        j2 j20 = i10.zzat;
        if(!((O1)j20).X) {
            i10.zzat = ((f2)j20).d(j20.size() << 1);
        }
        N1.b(arrayList0, i10.zzat);
    }

    public static void N1(i1 i10, String s) {
        i10.zze |= 0x200000;
        i10.zzad = s;
    }

    public final String O() {
        return this.zzo;
    }

    public static void O0(i1 i10, boolean z) {
        i10.zze |= 0x20000;
        i10.zzz = z;
    }

    public final long O1() {
        return this.zzn;
    }

    public final String P() {
        return this.zzy;
    }

    public final void P0() {
        l2 l20 = this.zzh;
        if(!((O1)l20).X) {
            this.zzh = l20.b(l20.size() << 1);
        }
    }

    public static void P1(i1 i10, String s) {
        s.getClass();
        i10.zze |= 0x80;
        i10.zzp = s;
    }

    public final String Q() {
        return this.zzbd;
    }

    public final void Q0() {
        l2 l20 = this.zzi;
        if(!((O1)l20).X) {
            this.zzi = l20.b(l20.size() << 1);
        }
    }

    public final long Q1() {
        return this.zzm;
    }

    public final String R() {
        return this.zzr;
    }

    public final int R0() {
        return this.zzbo;
    }

    public static void R1(i1 i10) {
        i10.zze |= 0x40;
        i10.zzo = "android";
    }

    public final l2 S() {
        return this.zzag;
    }

    public static void S0(i1 i10) {
        i10.zze &= 0xFFFFFEFF;
        i10.zzq = i1.zzc.zzq;
    }

    public final long S1() {
        return this.zzk;
    }

    public final l2 T() {
        return this.zzh;
    }

    public static void T0(i1 i10, int v) {
        i10.zze |= 0x2000000;
        i10.zzai = v;
    }

    public static void T1(i1 i10, String s) {
        s.getClass();
        i10.zze |= 0x10000;
        i10.zzy = s;
    }

    public final l2 U() {
        return this.zzi;
    }

    public static void U0(i1 i10, long v) {
        i10.zzf |= 16;
        i10.zzau = v;
    }

    public final long U1() {
        return this.zzbg;
    }

    public final boolean V() {
        return this.zzbh;
    }

    public static void V0(i1 i10, String s) {
        s.getClass();
        i10.zze |= 0x800;
        i10.zzt = s;
    }

    public static void V1(i1 i10, String s) {
        s.getClass();
        i10.zzf |= 0x2000;
        i10.zzbd = s;
    }

    public final boolean W() {
        return this.zzbj;
    }

    public static void W0(i1 i10, Set set0) {
        l2 l20 = i10.zzbe;
        if(!((O1)l20).X) {
            i10.zzbe = l20.b(l20.size() << 1);
        }
        N1.b(set0, i10.zzbe);
    }

    public final long W1() {
        return this.zzj;
    }

    public final boolean X() {
        return this.zzz;
    }

    public static void X0(i1 i10) {
        i10.zze |= 0x800000;
        i10.zzaf = false;
    }

    public static void X1(i1 i10, String s) {
        s.getClass();
        i10.zze |= 0x200;
        i10.zzr = s;
    }

    public final boolean Y() {
        return this.zzaf;
    }

    public final int Y0() {
        return this.zzh.size();
    }

    public final long Y1() {
        return this.zzx;
    }

    public final boolean Z() {
        return (this.zzf & 0x1000000) != 0;
    }

    public static void Z0(i1 i10) {
        i10.zze &= 0x7FFFFFFF;
        i10.zzao = i1.zzc.zzao;
    }

    public final R0 Z1() {
        return this.zzbp == null ? R0.B() : this.zzbp;
    }

    public final boolean a0() {
        return (this.zze & 0x2000000) != 0;
    }

    public static void a1(i1 i10, int v) {
        i10.zze |= 0x100000;
        i10.zzac = v;
    }

    public final U0 a2() {
        return this.zzbn == null ? U0.r() : this.zzbn;
    }

    public final boolean b0() {
        return (this.zzf & 0x400000) != 0;
    }

    public static void b1(i1 i10, long v) {
        i10.zze |= 8;
        i10.zzl = v;
    }

    public static h1 b2() {
        return (h1)i1.zzc.k();
    }

    public final int c0() {
        return this.zzai;
    }

    public static void c1(i1 i10, String s) {
        s.getClass();
        i10.zze |= 0x2000;
        i10.zzv = s;
    }

    public final String c2() {
        return this.zzar;
    }

    public final p1 d0(int v) {
        return (p1)this.zzi.get(v);
    }

    public final int d1() {
        return this.zzg;
    }

    public final String d2() {
        return this.zzu;
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(P0.a[v - 1]) {
            case 1: {
                return new i1();
            }
            case 2: {
                return new h1(i1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(i1.zzc, "\u0004?\u0000\u0002\u0001P?\u0000\u0005\u0000\u0001င\u0000\u0002\u001B\u0003\u001B\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000Bဈ\t\fင\n\rဈ\u000B\u000Eဈ\f\u0010ဈ\r\u0011ဂ\u000E\u0012ဂ\u000F\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001Aဂ\u0004\u001Cဇ\u0017\u001D\u001B\u001Eဈ\u0018\u001Fင\u0019 င\u001A!င\u001B\"ဈ\u001C#ဂ\u001D$ဂ\u001E%ဈ\u001F&ဈ \'င!)ဈ\",ဉ#-\u001D.ဂ$/ဂ%2ဈ&4ဈ\'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001AAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9", new Object[]{"zze", "zzf", "zzg", "zzh", a1.class, "zzi", p1.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", W0.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", z0.f, "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo", "zzbp", "zzbq"});
            }
            case 4: {
                return i1.zzc;
            }
            case 5: {
                x2 x20 = i1.zzd;
                if(x20 == null) {
                    Class class0 = i1.class;
                    synchronized(class0) {
                        x20 = i1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            i1.zzd = x20;
                        }
                    }
                }
                return x20;
            }
            case 6: {
                return (byte)1;
            }
            case 7: {
                return null;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }

    public static void e0(i1 i10) {
        i10.zze &= 0xFFFBFFFF;
        i10.zzaa = i1.zzc.zzaa;
    }

    public static void e1(i1 i10) {
        i10.zzh = z2.c0;
    }

    public static void f0(i1 i10, int v) {
        i10.Q0();
        i10.zzi.remove(v);
    }

    public static void f1(i1 i10, int v) {
        i10.zzf |= 0x800000;
        i10.zzbo = v;
    }

    public static void g0(i1 i10, long v) {
        i10.zze |= 0x20000000;
        i10.zzam = v;
    }

    public static void g1(i1 i10, long v) {
        i10.zze |= 0x4000;
        i10.zzw = v;
    }

    public static void h0(i1 i10, String s) {
        s.getClass();
        i10.zze |= 0x1000;
        i10.zzu = s;
    }

    public static void h1(i1 i10, String s) {
        s.getClass();
        i10.zzf |= 0x20000;
        i10.zzbi = s;
    }

    public static void i0(i1 i10, ArrayList arrayList0) {
        i10.P0();
        N1.b(arrayList0, i10.zzh);
    }

    public final int i1() {
        return this.zzaq;
    }

    public static void j0(i1 i10, boolean z) {
        i10.zzf |= 0x40000;
        i10.zzbj = z;
    }

    public static void j1(i1 i10) {
        i10.zze &= 0xFFDFFFFF;
        i10.zzad = i1.zzc.zzad;
    }

    public final boolean k0() {
        return (this.zze & 0x100000) != 0;
    }

    public static void k1(i1 i10, long v) {
        i10.zze |= 0x20;
        i10.zzn = v;
    }

    public final boolean l0() {
        return (this.zze & 0x20000000) != 0;
    }

    public static void l1(i1 i10, String s) {
        s.getClass();
        i10.zzf |= 0x80;
        i10.zzax = s;
    }

    public final boolean m0() {
        return (this.zzf & 0x20000) != 0;
    }

    public static void m1(i1 i10) {
        i10.zze |= 1;
        i10.zzg = 1;
    }

    public final boolean n0() {
        return (this.zzf & 0x80) != 0;
    }

    public final int n1() {
        return this.zzs;
    }

    public final int o() {
        return this.zzbl;
    }

    public final boolean o0() {
        return (this.zzf & 0x80000) != 0;
    }

    public static void o1(i1 i10) {
        i10.zze &= 0xFFFDFFFF;
        i10.zzz = false;
    }

    public final a1 p(int v) {
        return (a1)this.zzh.get(v);
    }

    public final boolean p0() {
        return (this.zzf & 0x800000) != 0;
    }

    public static void p1(i1 i10, int v) {
        i10.zzf |= 2;
        i10.zzaq = v;
    }

    public static h1 q(i1 i10) {
        b2 b20 = i1.zzc.k();
        b20.b(i10);
        return (h1)b20;
    }

    public final boolean q0() {
        return (this.zze & 0x80000) != 0;
    }

    public static void q1(i1 i10, long v) {
        i10.zze |= 16;
        i10.zzm = v;
    }

    public static void r(i1 i10, int v) {
        i10.P0();
        i10.zzh.remove(v);
    }

    public final boolean r0() {
        return (this.zze & 0x80000000) != 0;
    }

    public static void r1(i1 i10, String s) {
        s.getClass();
        i10.zzf |= 0x80000;
        i10.zzbk = s;
    }

    public static void s(i1 i10, int v, a1 a10) {
        i10.P0();
        i10.zzh.set(v, a10);
    }

    public final boolean s0() {
        return (this.zzf & 16) != 0;
    }

    public final int s1() {
        return this.zzi.size();
    }

    public static void t(i1 i10, int v, p1 p10) {
        i10.Q0();
        i10.zzi.set(v, p10);
    }

    public final boolean t0() {
        return (this.zze & 8) != 0;
    }

    public static void t1(i1 i10) {
        i10.zze &= -33;
        i10.zzn = 0L;
    }

    public static void u(i1 i10, long v) {
        i10.zzf |= 0x20;
        i10.zzav = v;
    }

    public final boolean u0() {
        return (this.zze & 0x4000) != 0;
    }

    public static void u1(i1 i10, int v) {
        i10.zze |= 0x400;
        i10.zzs = v;
    }

    public static void v(i1 i10, R0 r00) {
        i10.zzbp = r00;
        i10.zzf |= 0x1000000;
    }

    public final boolean v0() {
        return (this.zzf & 0x40000) != 0;
    }

    public static void v1(i1 i10, long v) {
        i10.zze |= 4;
        i10.zzk = v;
    }

    public static void w(i1 i10, U0 u00) {
        i10.zzbn = u00;
        i10.zzf |= 0x400000;
    }

    public final boolean w0() {
        return (this.zze & 0x20000) != 0;
    }

    public static void w1(i1 i10, String s) {
        s.getClass();
        i10.zze |= 0x100;
        i10.zzq = s;
    }

    public static void x(i1 i10, a1 a10) {
        i10.P0();
        i10.zzh.add(a10);
    }

    public final boolean x0() {
        return (this.zze & 0x20) != 0;
    }

    public final long x1() {
        return this.zzam;
    }

    public static void y(i1 i10, p1 p10) {
        i10.Q0();
        i10.zzi.add(p10);
    }

    public final boolean y0() {
        return (this.zze & 16) != 0;
    }

    public static void y1(i1 i10) {
        i10.zze &= -17;
        i10.zzm = 0L;
    }

    public static void z(i1 i10, String s) {
        s.getClass();
        i10.zzf |= 4;
        i10.zzar = s;
    }

    public final boolean z0() {
        return (this.zze & 1) != 0;
    }

    public static void z1(i1 i10, long v) {
        i10.zzf |= 0x8000;
        i10.zzbg = v;
    }
}

