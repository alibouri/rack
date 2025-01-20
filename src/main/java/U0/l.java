package U0;

import android.view.View;
import androidx.datastore.preferences.protobuf.A0;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.d;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.r;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.y;
import java.util.ArrayList;
import java.util.List;

public final class l {
    public final int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public l() {
        this.a = 0;
        super();
    }

    public l(int v, Object object0) {
        this.a = v;
        this.e = object0;
        super();
    }

    public l(h h0) {
        this.a = 2;
        super();
        this.d = 0;
        this.e = h0;
        h0.b = this;
    }

    public void A(List list0) {
        int v;
        h h0 = (h)this.e;
        if(list0 instanceof H) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 0: {
                        h0.m();
                        throw null;
                    }
                    case 2: {
                        h0.A();
                        h0.m();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(h0.m());
                    if(h0.c()) {
                        return;
                    }
                    v = h0.z();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = h0.b() + h0.A();
                do {
                    list0.add(h0.m());
                }
                while(h0.b() < v1);
                this.S(v1);
                return;
            }
            default: {
                throw A.b();
            }
        }
    }

    public Object B(b0 b00, m m0) {
        h h0 = (h)this.e;
        int v = h0.A();
        if(h0.a >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;)V
        }
        int v1 = h0.e(v);
        Object object0 = b00.c();
        ++h0.a;
        b00.i(object0, this, m0);
        b00.a(object0);
        h0.a(0);
        --h0.a;
        h0.d(v1);
        return object0;
    }

    public Object C(b0 b00, m m0) {
        this.T(2);
        return this.B(b00, m0);
    }

    public int D() {
        this.T(5);
        return ((h)this.e).v();
    }

    public void E(List list0) {
        int v2;
        h h0 = (h)this.e;
        if(list0 instanceof w) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 2: {
                        l.V(h0.A());
                        h0.v();
                        throw null;
                    }
                    case 5: {
                        h0.v();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 2: {
                int v = h0.A();
                l.V(v);
                int v1 = h0.b();
                do {
                    list0.add(h0.v());
                }
                while(h0.b() < v1 + v);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw A.b();
            }
        }
        do {
            list0.add(h0.v());
            if(h0.c()) {
                return;
            }
            v2 = h0.z();
        }
        while(v2 == this.b);
        this.d = v2;
    }

    public long F() {
        this.T(1);
        return ((h)this.e).w();
    }

    public void G(List list0) {
        int v;
        h h0 = (h)this.e;
        if(list0 instanceof H) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 1: {
                        h0.w();
                        throw null;
                    }
                    case 2: {
                        l.W(h0.A());
                        h0.w();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 1: {
                do {
                    list0.add(h0.w());
                    if(h0.c()) {
                        return;
                    }
                    v = h0.z();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = h0.A();
                l.W(v1);
                int v2 = h0.b();
                do {
                    list0.add(h0.w());
                }
                while(h0.b() < v2 + v1);
                return;
            }
            default: {
                throw A.b();
            }
        }
    }

    public int H() {
        this.T(0);
        return ((h)this.e).x();
    }

    public void I(List list0) {
        int v;
        h h0 = (h)this.e;
        if(list0 instanceof w) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 0: {
                        h0.x();
                        throw null;
                    }
                    case 2: {
                        h0.A();
                        h0.x();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(h0.x());
                    if(h0.c()) {
                        return;
                    }
                    v = h0.z();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = h0.b() + h0.A();
                do {
                    list0.add(h0.x());
                }
                while(h0.b() < v1);
                this.S(v1);
                return;
            }
            default: {
                throw A.b();
            }
        }
    }

    public long J() {
        this.T(0);
        return ((h)this.e).y();
    }

    public void K(List list0) {
        int v;
        h h0 = (h)this.e;
        if(list0 instanceof H) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 0: {
                        h0.y();
                        throw null;
                    }
                    case 2: {
                        h0.A();
                        h0.y();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(h0.y());
                    if(h0.c()) {
                        return;
                    }
                    v = h0.z();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = h0.b() + h0.A();
                do {
                    list0.add(h0.y());
                }
                while(h0.b() < v1);
                this.S(v1);
                return;
            }
            default: {
                throw A.b();
            }
        }
    }

    public String L() {
        String s;
        this.T(2);
        h h0 = (h)this.e;
        int v = h0.s();
        byte[] arr_b = h0.d;
        if(v > 0) {
            int v1 = h0.g;
            if(v <= h0.e - v1) {
                s = new String(arr_b, v1, v, y.a);
                h0.g += v;
                return s;
            }
        }
        if(v == 0) {
            return "";
        }
        if(v <= h0.e) {
            h0.D(v);
            s = new String(arr_b, h0.g, v, y.a);
            h0.g += v;
            return s;
        }
        return new String(h0.n(v), y.a);
    }

    public void M(List list0, boolean z) {
        int v1;
        int v;
        if((this.b & 7) != 2) {
            throw A.b();
        }
        h h0 = (h)this.e;
        if(list0 instanceof D && !z) {
            do {
                ((D)list0).p(this.i());
                if(h0.c()) {
                    return;
                }
                v = h0.z();
            }
            while(v == this.b);
            this.d = v;
            return;
        }
        do {
            list0.add((z ? this.N() : this.L()));
            if(h0.c()) {
                return;
            }
            v1 = h0.z();
        }
        while(v1 == this.b);
        this.d = v1;
    }

    public String N() {
        this.T(2);
        h h0 = (h)this.e;
        int v = h0.s();
        int v1 = h0.g;
        int v2 = h0.e;
        byte[] arr_b = h0.d;
        if(v <= v2 - v1 && v > 0) {
            h0.g = v1 + v;
            return v0.a.f(arr_b, v1, v);
        }
        if(v == 0) {
            return "";
        }
        if(v <= v2) {
            h0.D(v);
            h0.g = v;
            return v0.a.f(arr_b, v1, v);
        }
        arr_b = h0.n(v);
        return v0.a.f(arr_b, v1, v);
    }

    public int O() {
        this.T(0);
        return ((h)this.e).A();
    }

    public void P(List list0) {
        int v;
        h h0 = (h)this.e;
        if(list0 instanceof w) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 0: {
                        h0.A();
                        throw null;
                    }
                    case 2: {
                        h0.A();
                        h0.A();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(h0.A());
                    if(h0.c()) {
                        return;
                    }
                    v = h0.z();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = h0.b() + h0.A();
                do {
                    list0.add(h0.A());
                }
                while(h0.b() < v1);
                this.S(v1);
                return;
            }
            default: {
                throw A.b();
            }
        }
    }

    public long Q() {
        this.T(0);
        return ((h)this.e).B();
    }

    public void R(List list0) {
        int v;
        h h0 = (h)this.e;
        if(list0 instanceof H) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 0: {
                        h0.B();
                        throw null;
                    }
                    case 2: {
                        h0.A();
                        h0.B();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(h0.B());
                    if(h0.c()) {
                        return;
                    }
                    v = h0.z();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = h0.b() + h0.A();
                do {
                    list0.add(h0.B());
                }
                while(h0.b() < v1);
                this.S(v1);
                return;
            }
            default: {
                throw A.b();
            }
        }
    }

    public void S(int v) {
        if(((h)this.e).b() != v) {
            throw A.f();
        }
    }

    public void T(int v) {
        if((this.b & 7) != v) {
            throw A.b();
        }
    }

    public boolean U() {
        h h0 = (h)this.e;
        if(!h0.c()) {
            return this.b == this.c ? false : h0.E(this.b);
        }
        return false;
    }

    public static void V(int v) {
        if((v & 3) != 0) {
            throw A.e();
        }
    }

    public static void W(int v) {
        if((v & 7) != 0) {
            throw A.e();
        }
    }

    public void a() {
        int v = this.d;
        View view0 = (View)this.e;
        view0.offsetTopAndBottom(v - (view0.getTop() - this.b));
        view0.offsetLeftAndRight(-(view0.getLeft() - this.c));
    }

    public int b() {
        return this.d - this.c;
    }

    public int c() {
        int v = this.d;
        if(v != 0) {
            this.b = v;
            this.d = 0;
            return this.b == 0 || this.b == this.c ? 0x7FFFFFFF : this.b >>> 3;
        }
        this.b = ((h)this.e).z();
        return this.b == 0 || this.b == this.c ? 0x7FFFFFFF : this.b >>> 3;
    }

    public int d(int v) {
        return ((V.D)this.e).d[this.c + v];
    }

    public Object e(int v) {
        return ((V.D)this.e).f[this.d + v];
    }

    public int f() {
        return this.b;
    }

    public boolean g() {
        this.T(0);
        return ((h)this.e).f();
    }

    public void h(List list0) {
        int v;
        h h0 = (h)this.e;
        if(list0 instanceof d) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 0: {
                        h0.f();
                        throw null;
                    }
                    case 2: {
                        h0.A();
                        h0.f();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(Boolean.valueOf(h0.f()));
                    if(h0.c()) {
                        return;
                    }
                    v = h0.z();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = h0.b() + h0.A();
                do {
                    list0.add(Boolean.valueOf(h0.f()));
                }
                while(h0.b() < v1);
                this.S(v1);
                return;
            }
            default: {
                throw A.b();
            }
        }
    }

    public g i() {
        this.T(2);
        h h0 = (h)this.e;
        int v = h0.s();
        int v1 = h0.g;
        byte[] arr_b = h0.d;
        if(v <= h0.e - v1 && v > 0) {
            g g0 = g.a(arr_b, v1, v);
            h0.g += v;
            return g0;
        }
        if(v == 0) {
            return g.Z;
        }
        byte[] arr_b1 = h0.o(v);
        if(arr_b1 != null) {
            return g.a(arr_b1, 0, arr_b1.length);
        }
        int v2 = h0.g;
        int v3 = h0.e - v2;
        h0.i += h0.e;
        h0.g = 0;
        h0.e = 0;
        ArrayList arrayList0 = h0.p(v - v3);
        byte[] arr_b2 = new byte[v];
        System.arraycopy(arr_b, v2, arr_b2, 0, v3);
        for(Object object0: arrayList0) {
            System.arraycopy(((byte[])object0), 0, arr_b2, v3, ((byte[])object0).length);
            v3 += ((byte[])object0).length;
        }
        return new g(arr_b2);
    }

    public void j(List list0) {
        int v;
        if((this.b & 7) != 2) {
            throw A.b();
        }
        do {
            list0.add(this.i());
            h h0 = (h)this.e;
            if(h0.c()) {
                return;
            }
            v = h0.z();
        }
        while(v == this.b);
        this.d = v;
    }

    public double k() {
        this.T(1);
        return ((h)this.e).g();
    }

    public void l(List list0) {
        int v;
        h h0 = (h)this.e;
        if(list0 instanceof k) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 1: {
                        h0.g();
                        throw null;
                    }
                    case 2: {
                        l.W(h0.A());
                        h0.g();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 1: {
                do {
                    list0.add(h0.g());
                    if(h0.c()) {
                        return;
                    }
                    v = h0.z();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = h0.A();
                l.W(v1);
                int v2 = h0.b();
                do {
                    list0.add(h0.g());
                }
                while(h0.b() < v2 + v1);
                return;
            }
            default: {
                throw A.b();
            }
        }
    }

    public int m() {
        this.T(0);
        return ((h)this.e).h();
    }

    public void n(List list0) {
        int v;
        h h0 = (h)this.e;
        if(list0 instanceof w) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 0: {
                        h0.h();
                        throw null;
                    }
                    case 2: {
                        h0.A();
                        h0.h();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(h0.h());
                    if(h0.c()) {
                        return;
                    }
                    v = h0.z();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = h0.b() + h0.A();
                do {
                    list0.add(h0.h());
                }
                while(h0.b() < v1);
                this.S(v1);
                return;
            }
            default: {
                throw A.b();
            }
        }
    }

    public Object o(A0 a00, Class class0, m m0) {
        switch(a00.ordinal()) {
            case 0: {
                return this.k();
            }
            case 1: {
                return this.t();
            }
            case 2: {
                return this.z();
            }
            case 3: {
                return this.Q();
            }
            case 4: {
                return this.x();
            }
            case 5: {
                return this.r();
            }
            case 6: {
                return this.p();
            }
            case 7: {
                return Boolean.valueOf(this.g());
            }
            case 8: {
                return this.N();
            }
            case 10: {
                this.T(2);
                return this.B(Y.c.a(class0), m0);
            }
            case 11: {
                return this.i();
            }
            case 12: {
                return this.O();
            }
            case 13: {
                return this.m();
            }
            case 14: {
                return this.D();
            }
            case 15: {
                return this.F();
            }
            case 16: {
                return this.H();
            }
            case 17: {
                return this.J();
            }
            default: {
                throw new RuntimeException("unsupported field type.");
            }
        }
    }

    public int p() {
        this.T(5);
        return ((h)this.e).i();
    }

    public void q(List list0) {
        int v2;
        h h0 = (h)this.e;
        if(list0 instanceof w) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 2: {
                        l.V(h0.A());
                        h0.i();
                        throw null;
                    }
                    case 5: {
                        h0.i();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 2: {
                int v = h0.A();
                l.V(v);
                int v1 = h0.b();
                do {
                    list0.add(h0.i());
                }
                while(h0.b() < v1 + v);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw A.b();
            }
        }
        do {
            list0.add(h0.i());
            if(h0.c()) {
                return;
            }
            v2 = h0.z();
        }
        while(v2 == this.b);
        this.d = v2;
    }

    public long r() {
        this.T(1);
        return ((h)this.e).j();
    }

    public void s(List list0) {
        int v;
        h h0 = (h)this.e;
        if(list0 instanceof H) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 1: {
                        h0.j();
                        throw null;
                    }
                    case 2: {
                        l.W(h0.A());
                        h0.j();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 1: {
                do {
                    list0.add(h0.j());
                    if(h0.c()) {
                        return;
                    }
                    v = h0.z();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = h0.A();
                l.W(v1);
                int v2 = h0.b();
                do {
                    list0.add(h0.j());
                }
                while(h0.b() < v2 + v1);
                return;
            }
            default: {
                throw A.b();
            }
        }
    }

    public float t() {
        this.T(5);
        return ((h)this.e).k();
    }

    @Override
    public String toString() {
        return this.a == 0 ? "" : super.toString();
    }

    public void u(List list0) {
        int v2;
        h h0 = (h)this.e;
        if(list0 instanceof r) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 2: {
                        l.V(h0.A());
                        h0.k();
                        throw null;
                    }
                    case 5: {
                        h0.k();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 2: {
                int v = h0.A();
                l.V(v);
                int v1 = h0.b();
                do {
                    list0.add(h0.k());
                }
                while(h0.b() < v1 + v);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw A.b();
            }
        }
        do {
            list0.add(h0.k());
            if(h0.c()) {
                return;
            }
            v2 = h0.z();
        }
        while(v2 == this.b);
        this.d = v2;
    }

    public Object v(b0 b00, m m0) {
        int v1;
        try {
            v1 = this.c;
            this.c = this.b >>> 3 << 3 | 4;
            Object object0 = b00.c();
            b00.i(object0, this, m0);
            b00.a(object0);
            if(this.b == this.c) {
                return object0;
            }
        }
        finally {
            this.c = v1;
        }
        throw A.e();
    }

    public Object w(b0 b00, m m0) {
        this.T(3);
        return this.v(b00, m0);
    }

    public int x() {
        this.T(0);
        return ((h)this.e).l();
    }

    public void y(List list0) {
        int v;
        h h0 = (h)this.e;
        if(list0 instanceof w) {
            if(list0 == null) {
                switch(this.b & 7) {
                    case 0: {
                        h0.l();
                        throw null;
                    }
                    case 2: {
                        h0.A();
                        h0.l();
                        throw null;
                    }
                    default: {
                        throw A.b();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.b & 7) {
            case 0: {
                do {
                    list0.add(h0.l());
                    if(h0.c()) {
                        return;
                    }
                    v = h0.z();
                }
                while(v == this.b);
                this.d = v;
                return;
            }
            case 2: {
                int v1 = h0.b() + h0.A();
                do {
                    list0.add(h0.l());
                }
                while(h0.b() < v1);
                this.S(v1);
                return;
            }
            default: {
                throw A.b();
            }
        }
    }

    public long z() {
        this.T(0);
        return ((h)this.e).m();
    }
}

