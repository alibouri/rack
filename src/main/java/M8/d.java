package m8;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

public final class d implements Externalizable {
    public boolean A0;
    public f B0;
    public boolean C0;
    public f D0;
    public boolean E0;
    public f F0;
    public String G0;
    public int H0;
    public String I0;
    public boolean J0;
    public String K0;
    public boolean L0;
    public String M0;
    public boolean N0;
    public String O0;
    public boolean P0;
    public String Q0;
    public boolean R0;
    public String S0;
    public boolean T0;
    public ArrayList U0;
    public ArrayList V0;
    public boolean W0;
    public boolean X;
    public boolean X0;
    public f Y;
    public String Y0;
    public boolean Z;
    public boolean Z0;
    public f b0;
    public boolean c0;
    public f d0;
    public boolean e0;
    public f f0;
    public boolean g0;
    public f h0;
    public boolean i0;
    public f j0;
    public boolean k0;
    public f l0;
    public boolean m0;
    public f n0;
    public boolean o0;
    public f p0;
    public boolean q0;
    public f r0;
    public boolean s0;
    public f t0;
    public boolean u0;
    public f v0;
    public boolean w0;
    public f x0;
    public boolean y0;
    public f z0;

    @Override
    public final void readExternal(ObjectInput objectInput0) {
        if(objectInput0.readBoolean()) {
            f f0 = new f();
            f0.readExternal(objectInput0);
            this.X = true;
            this.Y = f0;
        }
        if(objectInput0.readBoolean()) {
            f f1 = new f();
            f1.readExternal(objectInput0);
            this.Z = true;
            this.b0 = f1;
        }
        if(objectInput0.readBoolean()) {
            f f2 = new f();
            f2.readExternal(objectInput0);
            this.c0 = true;
            this.d0 = f2;
        }
        if(objectInput0.readBoolean()) {
            f f3 = new f();
            f3.readExternal(objectInput0);
            this.e0 = true;
            this.f0 = f3;
        }
        if(objectInput0.readBoolean()) {
            f f4 = new f();
            f4.readExternal(objectInput0);
            this.g0 = true;
            this.h0 = f4;
        }
        if(objectInput0.readBoolean()) {
            f f5 = new f();
            f5.readExternal(objectInput0);
            this.i0 = true;
            this.j0 = f5;
        }
        if(objectInput0.readBoolean()) {
            f f6 = new f();
            f6.readExternal(objectInput0);
            this.k0 = true;
            this.l0 = f6;
        }
        if(objectInput0.readBoolean()) {
            f f7 = new f();
            f7.readExternal(objectInput0);
            this.m0 = true;
            this.n0 = f7;
        }
        if(objectInput0.readBoolean()) {
            f f8 = new f();
            f8.readExternal(objectInput0);
            this.o0 = true;
            this.p0 = f8;
        }
        if(objectInput0.readBoolean()) {
            f f9 = new f();
            f9.readExternal(objectInput0);
            this.q0 = true;
            this.r0 = f9;
        }
        if(objectInput0.readBoolean()) {
            f f10 = new f();
            f10.readExternal(objectInput0);
            this.s0 = true;
            this.t0 = f10;
        }
        if(objectInput0.readBoolean()) {
            f f11 = new f();
            f11.readExternal(objectInput0);
            this.u0 = true;
            this.v0 = f11;
        }
        if(objectInput0.readBoolean()) {
            f f12 = new f();
            f12.readExternal(objectInput0);
            this.w0 = true;
            this.x0 = f12;
        }
        if(objectInput0.readBoolean()) {
            f f13 = new f();
            f13.readExternal(objectInput0);
            this.y0 = true;
            this.z0 = f13;
        }
        if(objectInput0.readBoolean()) {
            f f14 = new f();
            f14.readExternal(objectInput0);
            this.A0 = true;
            this.B0 = f14;
        }
        if(objectInput0.readBoolean()) {
            f f15 = new f();
            f15.readExternal(objectInput0);
            this.C0 = true;
            this.D0 = f15;
        }
        if(objectInput0.readBoolean()) {
            f f16 = new f();
            f16.readExternal(objectInput0);
            this.E0 = true;
            this.F0 = f16;
        }
        this.G0 = objectInput0.readUTF();
        this.H0 = objectInput0.readInt();
        this.I0 = objectInput0.readUTF();
        if(objectInput0.readBoolean()) {
            String s = objectInput0.readUTF();
            this.J0 = true;
            this.K0 = s;
        }
        if(objectInput0.readBoolean()) {
            String s1 = objectInput0.readUTF();
            this.L0 = true;
            this.M0 = s1;
        }
        if(objectInput0.readBoolean()) {
            String s2 = objectInput0.readUTF();
            this.N0 = true;
            this.O0 = s2;
        }
        if(objectInput0.readBoolean()) {
            String s3 = objectInput0.readUTF();
            this.P0 = true;
            this.Q0 = s3;
        }
        if(objectInput0.readBoolean()) {
            String s4 = objectInput0.readUTF();
            this.R0 = true;
            this.S0 = s4;
        }
        this.T0 = objectInput0.readBoolean();
        int v = objectInput0.readInt();
        for(int v2 = 0; v2 < v; ++v2) {
            c c0 = new c();
            c0.readExternal(objectInput0);
            this.U0.add(c0);
        }
        int v3 = objectInput0.readInt();
        for(int v1 = 0; v1 < v3; ++v1) {
            c c1 = new c();
            c1.readExternal(objectInput0);
            this.V0.add(c1);
        }
        this.W0 = objectInput0.readBoolean();
        if(objectInput0.readBoolean()) {
            String s5 = objectInput0.readUTF();
            this.X0 = true;
            this.Y0 = s5;
        }
        this.Z0 = objectInput0.readBoolean();
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput0) {
        objectOutput0.writeBoolean(this.X);
        if(this.X) {
            this.Y.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.Z);
        if(this.Z) {
            this.b0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.c0);
        if(this.c0) {
            this.d0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.e0);
        if(this.e0) {
            this.f0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.g0);
        if(this.g0) {
            this.h0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.i0);
        if(this.i0) {
            this.j0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.k0);
        if(this.k0) {
            this.l0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.m0);
        if(this.m0) {
            this.n0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.o0);
        if(this.o0) {
            this.p0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.q0);
        if(this.q0) {
            this.r0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.s0);
        if(this.s0) {
            this.t0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.u0);
        if(this.u0) {
            this.v0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.w0);
        if(this.w0) {
            this.x0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.y0);
        if(this.y0) {
            this.z0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.A0);
        if(this.A0) {
            this.B0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.C0);
        if(this.C0) {
            this.D0.writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.E0);
        if(this.E0) {
            this.F0.writeExternal(objectOutput0);
        }
        objectOutput0.writeUTF(this.G0);
        objectOutput0.writeInt(this.H0);
        objectOutput0.writeUTF(this.I0);
        objectOutput0.writeBoolean(this.J0);
        if(this.J0) {
            objectOutput0.writeUTF(this.K0);
        }
        objectOutput0.writeBoolean(this.L0);
        if(this.L0) {
            objectOutput0.writeUTF(this.M0);
        }
        objectOutput0.writeBoolean(this.N0);
        if(this.N0) {
            objectOutput0.writeUTF(this.O0);
        }
        objectOutput0.writeBoolean(this.P0);
        if(this.P0) {
            objectOutput0.writeUTF(this.Q0);
        }
        objectOutput0.writeBoolean(this.R0);
        if(this.R0) {
            objectOutput0.writeUTF(this.S0);
        }
        objectOutput0.writeBoolean(this.T0);
        ArrayList arrayList0 = this.U0;
        int v = arrayList0.size();
        objectOutput0.writeInt(v);
        for(int v2 = 0; v2 < v; ++v2) {
            ((c)arrayList0.get(v2)).writeExternal(objectOutput0);
        }
        ArrayList arrayList1 = this.V0;
        int v3 = arrayList1.size();
        objectOutput0.writeInt(v3);
        for(int v1 = 0; v1 < v3; ++v1) {
            ((c)arrayList1.get(v1)).writeExternal(objectOutput0);
        }
        objectOutput0.writeBoolean(this.W0);
        objectOutput0.writeBoolean(this.X0);
        if(this.X0) {
            objectOutput0.writeUTF(this.Y0);
        }
        objectOutput0.writeBoolean(this.Z0);
    }
}

