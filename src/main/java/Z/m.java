package Z;

import Bb.n;
import I2.J;
import J2.w;
import Nb.j;
import U.Z;
import U.d;
import b0.a;
import b0.b;
import java.util.Arrays;

public final class m {
    public int a;
    public int b;
    public final b c;
    public Object[] d;
    public static final m e;

    static {
        m.e = new m(0, 0, new Object[0], null);
    }

    public m(int v, int v1, Object[] arr_object, b b0) {
        this.a = v;
        this.b = v1;
        this.c = b0;
        this.d = arr_object;
    }

    public final Object[] a(int v, int v1, int v2, Object object0, Object object1, int v3, b b0) {
        Object object2 = this.d[v];
        int v4 = this.t(v1);
        Object[] arr_object = this.d;
        Object[] arr_object1 = new Object[arr_object.length - 1];
        n.l0(0, v, 6, arr_object, arr_object1);
        n.i0(v, v + 2, v4 + 1, arr_object, arr_object1);
        arr_object1[v4 - 1] = m.j((object2 == null ? 0 : object2.hashCode()), object2, this.x(v), v2, object0, object1, v3 + 5, b0);
        n.i0(v4, v4 + 1, arr_object.length, arr_object, arr_object1);
        return arr_object1;
    }

    public final int b() {
        if(this.b == 0) {
            return this.d.length / 2;
        }
        int v = Integer.bitCount(this.a);
        for(int v1 = v * 2; v1 < this.d.length; ++v1) {
            v += this.s(v1).b();
        }
        return v;
    }

    public final boolean c(Object object0) {
        Sb.b b0 = J.Q(2, J.R(0, this.d.length));
        int v = b0.X;
        int v1 = b0.Y;
        int v2 = b0.Z;
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(j.a(object0, this.d[v])) {
                    return true;
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return false;
    }

    public final boolean d(int v, int v1, Object object0) {
        int v2 = w.J(v, v1);
        if(this.h(1 << v2)) {
            return j.a(object0, this.d[this.f(1 << v2)]);
        }
        if(this.i(1 << v2)) {
            m m0 = this.s(this.t(1 << v2));
            return v1 == 30 ? m0.c(object0) : m0.d(v, v1 + 5, object0);
        }
        return false;
    }

    public final boolean e(m m0) {
        if(this == m0) {
            return true;
        }
        if(this.b != m0.b) {
            return false;
        }
        if(this.a != m0.a) {
            return false;
        }
        for(int v = 0; v < this.d.length; ++v) {
            if(this.d[v] != m0.d[v]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int v) {
        return Integer.bitCount(v - 1 & this.a) * 2;
    }

    public final Object g(int v, int v1, Object object0) {
        int v2 = w.J(v, v1);
        if(this.h(1 << v2)) {
            int v3 = this.f(1 << v2);
            return j.a(object0, this.d[v3]) ? this.x(v3) : null;
        }
        if(this.i(1 << v2)) {
            m m0 = this.s(this.t(1 << v2));
            if(v1 == 30) {
                Sb.b b0 = J.Q(2, J.R(0, m0.d.length));
                int v4 = b0.X;
                int v5 = b0.Y;
                int v6 = b0.Z;
                if(v6 > 0 && v4 <= v5 || v6 < 0 && v5 <= v4) {
                    while(true) {
                        if(j.a(object0, m0.d[v4])) {
                            return m0.x(v4);
                        }
                        if(v4 == v5) {
                            break;
                        }
                        v4 += v6;
                    }
                }
                return null;
            }
            return m0.g(v, v1 + 5, object0);
        }
        return null;
    }

    public final boolean h(int v) {
        return (v & this.a) != 0;
    }

    public final boolean i(int v) {
        return (v & this.b) != 0;
    }

    public static m j(int v, Object object0, Object object1, int v1, Object object2, Object object3, int v2, b b0) {
        if(v2 > 30) {
            return new m(0, 0, new Object[]{object0, object1, object2, object3}, b0);
        }
        int v3 = w.J(v, v2);
        int v4 = w.J(v1, v2);
        if(v3 != v4) {
            return v3 >= v4 ? new m(1 << v3 | 1 << v4, 0, new Object[]{object2, object3, object0, object1}, b0) : new m(1 << v3 | 1 << v4, 0, new Object[]{object0, object1, object2, object3}, b0);
        }
        return new m(0, 1 << v3, new Object[]{m.j(v, object0, object1, v1, object2, object3, v2 + 5, b0)}, b0);
    }

    public final m k(int v, e e0) {
        e0.getClass();
        e0.a(e0.c0 - 1);
        e0.Z = this.x(v);
        Object[] arr_object = this.d;
        if(arr_object.length == 2) {
            return null;
        }
        if(this.c == e0.X) {
            this.d = w.q(v, arr_object);
            return this;
        }
        return new m(0, 0, w.q(v, arr_object), e0.X);
    }

    public final m l(int v, Object object0, Object object1, int v1, e e0) {
        m m1;
        int v2 = w.J(v, v1);
        b b0 = this.c;
        if(this.h(1 << v2)) {
            int v3 = this.f(1 << v2);
            if(j.a(object0, this.d[v3])) {
                e0.Z = this.x(v3);
                if(this.x(v3) == object1) {
                    return this;
                }
                if(b0 == e0.X) {
                    this.d[v3 + 1] = object1;
                    return this;
                }
                ++e0.b0;
                Object[] arr_object = Arrays.copyOf(this.d, this.d.length);
                j.e(arr_object, "copyOf(this, size)");
                arr_object[v3 + 1] = object1;
                return new m(this.a, this.b, arr_object, e0.X);
            }
            e0.getClass();
            e0.a(e0.c0 + 1);
            b b1 = e0.X;
            if(b0 == b1) {
                this.d = this.a(v3, 1 << v2, v, object0, object1, v1, b1);
                this.a ^= 1 << v2;
                this.b |= 1 << v2;
                return this;
            }
            Object[] arr_object1 = this.a(v3, 1 << v2, v, object0, object1, v1, b1);
            return new m(this.a ^ 1 << v2, this.b | 1 << v2, arr_object1, b1);
        }
        if(this.i(1 << v2)) {
            int v4 = this.t(1 << v2);
            m m0 = this.s(v4);
            if(v1 == 30) {
                Sb.b b2 = J.Q(2, J.R(0, m0.d.length));
                int v5 = b2.X;
                int v6 = b2.Y;
                int v7 = b2.Z;
                if(v7 > 0 && v5 <= v6 || v7 < 0 && v6 <= v5) {
                    while(true) {
                        if(j.a(object0, m0.d[v5])) {
                            e0.Z = m0.x(v5);
                            if(m0.c == e0.X) {
                                m0.d[v5 + 1] = object1;
                                return m0 == m0 ? this : this.r(v4, m0, e0.X);
                            }
                            ++e0.b0;
                            Object[] arr_object2 = Arrays.copyOf(m0.d, m0.d.length);
                            j.e(arr_object2, "copyOf(this, size)");
                            arr_object2[v5 + 1] = object1;
                            m1 = new m(0, 0, arr_object2, e0.X);
                            return m0 == m1 ? this : this.r(v4, m1, e0.X);
                        }
                        if(v5 == v6) {
                            break;
                        }
                        v5 += v7;
                    }
                }
                e0.getClass();
                e0.a(e0.c0 + 1);
                m1 = new m(0, 0, w.o(m0.d, 0, object0, object1), e0.X);
                return m0 == m1 ? this : this.r(v4, m1, e0.X);
            }
            m1 = m0.l(v, object0, object1, v1 + 5, e0);
            return m0 == m1 ? this : this.r(v4, m1, e0.X);
        }
        e0.getClass();
        e0.a(e0.c0 + 1);
        b b3 = e0.X;
        int v8 = this.f(1 << v2);
        if(b0 == b3) {
            this.d = w.o(this.d, v8, object0, object1);
            this.a |= 1 << v2;
            return this;
        }
        Object[] arr_object3 = w.o(this.d, v8, object0, object1);
        return new m(this.a | 1 << v2, this.b, arr_object3, b3);
    }

    public final m m(m m0, int v, a a0, e e0) {
        int v16;
        Object[] arr_object4;
        m m2;
        if(this == m0) {
            int v1 = this.b();
            a0.a += v1;
            return this;
        }
        if(v > 30) {
            b b0 = e0.X;
            Object[] arr_object = Arrays.copyOf(this.d, this.d.length + m0.d.length);
            j.e(arr_object, "copyOf(this, newSize)");
            int v2 = this.d.length;
            Sb.b b1 = J.Q(2, J.R(0, m0.d.length));
            int v3 = b1.X;
            int v4 = b1.Y;
            int v5 = b1.Z;
            if(v5 > 0 && v3 <= v4 || v5 < 0 && v4 <= v3) {
                while(true) {
                    if(this.c(m0.d[v3])) {
                        ++a0.a;
                    }
                    else {
                        Object[] arr_object1 = m0.d;
                        arr_object[v2] = arr_object1[v3];
                        arr_object[v2 + 1] = arr_object1[v3 + 1];
                        v2 += 2;
                    }
                    if(v3 == v4) {
                        break;
                    }
                    v3 += v5;
                }
            }
            if(v2 == this.d.length) {
                return this;
            }
            if(v2 != m0.d.length) {
                if(v2 == arr_object.length) {
                    return new m(0, 0, arr_object, b0);
                }
                Object[] arr_object2 = Arrays.copyOf(arr_object, v2);
                j.e(arr_object2, "copyOf(this, newSize)");
                return new m(0, 0, arr_object2, b0);
            }
            return m0;
        }
        int v6 = this.b | m0.b;
        int v7 = this.a & m0.a;
        int v8 = (this.a ^ m0.a) & ~v6;
        while(v7 != 0) {
            int v9 = Integer.lowestOneBit(v7);
            if(j.a(this.d[this.f(v9)], m0.d[m0.f(v9)])) {
                v8 |= v9;
            }
            else {
                v6 |= v9;
            }
            v7 ^= v9;
        }
        if((v6 & v8) == 0) {
            m m1 = !j.a(this.c, e0.X) || this.a != v8 || this.b != v6 ? new m(v8, v6, new Object[Integer.bitCount(v6) + Integer.bitCount(v8) * 2], null) : this;
            int v10 = v6;
            int v11 = 0;
            while(v10 != 0) {
                int v12 = Integer.lowestOneBit(v10);
                Object[] arr_object3 = m1.d;
                int v13 = arr_object3.length - 1 - v11;
                if(this.i(v12)) {
                    m2 = this.s(this.t(v12));
                    if(m0.i(v12)) {
                        m2 = m2.m(m0.s(m0.t(v12)), v + 5, a0, e0);
                    }
                    else if(m0.h(v12)) {
                        int v14 = m0.f(v12);
                        Object object0 = m0.d[v14];
                        int v15 = e0.c0;
                        arr_object4 = arr_object3;
                        m2 = m2.l((object0 == null ? 0 : object0.hashCode()), object0, m0.x(v14), v + 5, e0);
                        if(e0.c0 == v15) {
                            ++a0.a;
                        }
                        v16 = v12;
                        goto label_88;
                    }
                    arr_object4 = arr_object3;
                    v16 = v12;
                }
                else {
                    arr_object4 = arr_object3;
                    v16 = v12;
                    if(m0.i(v16)) {
                        m2 = m0.s(m0.t(v16));
                        if(this.h(v16)) {
                            int v17 = this.f(v16);
                            Object object1 = this.d[v17];
                            if(m2.d((object1 == null ? 0 : object1.hashCode()), v + 5, object1)) {
                                ++a0.a;
                            }
                            else {
                                m2 = m2.l((object1 == null ? 0 : object1.hashCode()), object1, this.x(v17), v + 5, e0);
                            }
                        }
                    }
                    else {
                        int v18 = this.f(v16);
                        Object object2 = this.d[v18];
                        Object object3 = this.x(v18);
                        int v19 = m0.f(v16);
                        Object object4 = m0.d[v19];
                        m2 = m.j((object2 == null ? 0 : object2.hashCode()), object2, object3, (object4 == null ? 0 : object4.hashCode()), object4, m0.x(v19), v + 5, e0.X);
                    }
                }
            label_88:
                arr_object4[v13] = m2;
                ++v11;
                v10 ^= v16;
            }
            int v20 = 0;
            while(v8 != 0) {
                int v21 = Integer.lowestOneBit(v8);
                if(m0.h(v21)) {
                    int v23 = m0.f(v21);
                    Object[] arr_object6 = m1.d;
                    arr_object6[v20 * 2] = m0.d[v23];
                    arr_object6[v20 * 2 + 1] = m0.x(v23);
                    if(this.h(v21)) {
                        ++a0.a;
                    }
                }
                else {
                    int v22 = this.f(v21);
                    Object[] arr_object5 = m1.d;
                    arr_object5[v20 * 2] = this.d[v22];
                    arr_object5[v20 * 2 + 1] = this.x(v22);
                }
                ++v20;
                v8 ^= v21;
            }
            if(this.e(m1)) {
                return this;
            }
            return m0.e(m1) ? m0 : m1;
        }
        d.N("Check failed.");
        throw null;
    }

    public final m n(int v, Object object0, int v1, e e0) {
        int v2 = w.J(v, v1);
        if(this.h(1 << v2)) {
            int v3 = this.f(1 << v2);
            return j.a(object0, this.d[v3]) ? this.p(v3, 1 << v2, e0) : this;
        }
        if(this.i(1 << v2)) {
            int v4 = this.t(1 << v2);
            m m0 = this.s(v4);
            if(v1 == 30) {
                Sb.b b0 = J.Q(2, J.R(0, m0.d.length));
                int v5 = b0.X;
                int v6 = b0.Y;
                int v7 = b0.Z;
                if(v7 > 0 && v5 <= v6 || v7 < 0 && v6 <= v5) {
                    while(true) {
                        if(j.a(object0, m0.d[v5])) {
                            return this.q(m0, m0.k(v5, e0), v4, 1 << v2, e0.X);
                        }
                        if(v5 == v6) {
                            break;
                        }
                        v5 += v7;
                    }
                }
                return this.q(m0, m0, v4, 1 << v2, e0.X);
            }
            return this.q(m0, m0.n(v, object0, v1 + 5, e0), v4, 1 << v2, e0.X);
        }
        return this;
    }

    public final m o(int v, Object object0, Object object1, int v1, e e0) {
        int v2 = w.J(v, v1);
        if(this.h(1 << v2)) {
            int v3 = this.f(1 << v2);
            return !j.a(object0, this.d[v3]) || !j.a(object1, this.x(v3)) ? this : this.p(v3, 1 << v2, e0);
        }
        if(this.i(1 << v2)) {
            int v4 = this.t(1 << v2);
            m m0 = this.s(v4);
            if(v1 == 30) {
                Sb.b b0 = J.Q(2, J.R(0, m0.d.length));
                int v5 = b0.X;
                int v6 = b0.Y;
                int v7 = b0.Z;
                if(v7 > 0 && v5 <= v6 || v7 < 0 && v6 <= v5) {
                    while(true) {
                        if(j.a(object0, m0.d[v5]) && j.a(object1, m0.x(v5))) {
                            return this.q(m0, m0.k(v5, e0), v4, 1 << v2, e0.X);
                        }
                        if(v5 == v6) {
                            break;
                        }
                        v5 += v7;
                    }
                }
                return this.q(m0, m0, v4, 1 << v2, e0.X);
            }
            return this.q(m0, m0.o(v, object0, object1, v1 + 5, e0), v4, 1 << v2, e0.X);
        }
        return this;
    }

    public final m p(int v, int v1, e e0) {
        e0.getClass();
        e0.a(e0.c0 - 1);
        e0.Z = this.x(v);
        Object[] arr_object = this.d;
        if(arr_object.length == 2) {
            return null;
        }
        if(this.c == e0.X) {
            this.d = w.q(v, arr_object);
            this.a ^= v1;
            return this;
        }
        Object[] arr_object1 = w.q(v, arr_object);
        return new m(v1 ^ this.a, this.b, arr_object1, e0.X);
    }

    public final m q(m m0, m m1, int v, int v1, b b0) {
        b b1 = this.c;
        if(m1 == null) {
            Object[] arr_object = this.d;
            if(arr_object.length == 1) {
                return null;
            }
            if(b1 == b0) {
                this.d = w.r(v, arr_object);
                this.b ^= v1;
                return this;
            }
            Object[] arr_object1 = w.r(v, arr_object);
            return new m(this.a, v1 ^ this.b, arr_object1, b0);
        }
        return b1 == b0 || m0 != m1 ? this.r(v, m1, b0) : this;
    }

    public final m r(int v, m m0, b b0) {
        Object[] arr_object = this.d;
        if(arr_object.length == 1 && m0.d.length == 2 && m0.b == 0) {
            m0.a = this.b;
            return m0;
        }
        if(this.c == b0) {
            arr_object[v] = m0;
            return this;
        }
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        j.e(arr_object1, "copyOf(this, size)");
        arr_object1[v] = m0;
        return new m(this.a, this.b, arr_object1, b0);
    }

    public final m s(int v) {
        Object object0 = this.d[v];
        j.d(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (m)object0;
    }

    public final int t(int v) {
        return this.d.length - 1 - Integer.bitCount(v - 1 & this.b);
    }

    public final A0.b u(int v, int v1, Object object0, Object object1) {
        A0.b b1;
        int v2 = w.J(v, v1);
        if(this.h(1 << v2)) {
            int v3 = this.f(1 << v2);
            if(j.a(object0, this.d[v3])) {
                if(this.x(v3) == object1) {
                    return null;
                }
                Object[] arr_object = Arrays.copyOf(this.d, this.d.length);
                j.e(arr_object, "copyOf(this, size)");
                arr_object[v3 + 1] = object1;
                return new A0.b(0, new m(this.a, this.b, arr_object, null));
            }
            Object[] arr_object1 = this.a(v3, 1 << v2, v, object0, object1, v1, null);
            return new A0.b(1, new m(this.a ^ 1 << v2, this.b | 1 << v2, arr_object1, null));
        }
        if(this.i(1 << v2)) {
            int v4 = this.t(1 << v2);
            m m0 = this.s(v4);
            if(v1 == 30) {
                Sb.b b0 = J.Q(2, J.R(0, m0.d.length));
                int v5 = b0.X;
                int v6 = b0.Y;
                int v7 = b0.Z;
                if(v7 > 0 && v5 <= v6 || v7 < 0 && v6 <= v5) {
                    while(true) {
                        if(j.a(object0, m0.d[v5])) {
                            if(object1 == m0.x(v5)) {
                                b1 = null;
                                goto label_34;
                            }
                            Object[] arr_object2 = Arrays.copyOf(m0.d, m0.d.length);
                            j.e(arr_object2, "copyOf(this, size)");
                            arr_object2[v5 + 1] = object1;
                            b1 = new A0.b(0, new m(0, 0, arr_object2, null));
                            goto label_34;
                        }
                        if(v5 == v6) {
                            break;
                        }
                        v5 += v7;
                    }
                }
                b1 = new A0.b(1, new m(0, 0, w.o(m0.d, 0, object0, object1), null));
            label_34:
                if(b1 == null) {
                    return null;
                }
            }
            else {
                b1 = m0.u(v, v1 + 5, object0, object1);
                if(b1 == null) {
                    return null;
                }
            }
            b1.Y = this.w(v4, 1 << v2, ((m)b1.Y));
            return b1;
        }
        Object[] arr_object3 = w.o(this.d, this.f(1 << v2), object0, object1);
        return new A0.b(1, new m(this.a | 1 << v2, this.b, arr_object3, null));
    }

    public final m v(int v, Z z0, int v1) {
        m m1;
        int v2 = w.J(v, v1);
        if(this.h(1 << v2)) {
            int v3 = this.f(1 << v2);
            if(j.a(z0, this.d[v3])) {
                Object[] arr_object = this.d;
                if(arr_object.length != 2) {
                    Object[] arr_object1 = w.q(v3, arr_object);
                    return new m(this.a ^ 1 << v2, this.b, arr_object1, null);
                }
                return null;
            }
            return this;
        }
        if(this.i(1 << v2)) {
            int v4 = this.t(1 << v2);
            m m0 = this.s(v4);
            if(v1 == 30) {
                Sb.b b0 = J.Q(2, J.R(0, m0.d.length));
                int v5 = b0.X;
                int v6 = b0.Y;
                int v7 = b0.Z;
                if(v7 > 0 && v5 <= v6 || v7 < 0 && v6 <= v5) {
                    while(true) {
                        if(j.a(z0, m0.d[v5])) {
                            Object[] arr_object2 = m0.d;
                            if(arr_object2.length == 2) {
                                m1 = null;
                                goto label_32;
                            }
                            m1 = new m(0, 0, w.q(v5, arr_object2), null);
                            goto label_32;
                        }
                        if(v5 == v6) {
                            break;
                        }
                        v5 += v7;
                    }
                }
                m1 = m0;
            }
            else {
                m1 = m0.v(v, z0, v1 + 5);
            }
        label_32:
            if(m1 == null) {
                Object[] arr_object3 = this.d;
                if(arr_object3.length != 1) {
                    Object[] arr_object4 = w.r(v4, arr_object3);
                    return new m(this.a, 1 << v2 ^ this.b, arr_object4, null);
                }
                return null;
            }
            return m0 == m1 ? this : this.w(v4, 1 << v2, m1);
        }
        return this;
    }

    public final m w(int v, int v1, m m0) {
        Object[] arr_object = m0.d;
        if(arr_object.length == 2 && m0.b == 0) {
            if(this.d.length == 1) {
                m0.a = this.b;
                return m0;
            }
            int v2 = this.f(v1);
            Object[] arr_object1 = this.d;
            Object object0 = arr_object[0];
            Object object1 = arr_object[1];
            Object[] arr_object2 = Arrays.copyOf(arr_object1, arr_object1.length + 1);
            j.e(arr_object2, "copyOf(this, newSize)");
            n.i0(v + 2, v + 1, arr_object1.length, arr_object2, arr_object2);
            n.i0(v2 + 2, v2, v, arr_object2, arr_object2);
            arr_object2[v2] = object0;
            arr_object2[v2 + 1] = object1;
            return new m(this.a ^ v1, v1 ^ this.b, arr_object2, null);
        }
        Object[] arr_object3 = Arrays.copyOf(this.d, this.d.length);
        j.e(arr_object3, "copyOf(this, newSize)");
        arr_object3[v] = m0;
        return new m(this.a, this.b, arr_object3, null);
    }

    public final Object x(int v) {
        return this.d[v + 1];
    }
}

