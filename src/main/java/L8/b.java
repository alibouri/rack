package l8;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class b implements Closeable, Flushable {
    public final Writer X;
    public int[] Y;
    public int Z;
    public final String b0;
    public boolean c0;
    public boolean d0;
    public String e0;
    public boolean f0;
    public static final String[] g0;
    public static final String[] h0;

    static {
        b.g0 = new String[0x80];
        for(int v = 0; v <= 0x1F; ++v) {
            b.g0[v] = String.format("\\u%04x", v);
        }
        b.g0[34] = "\\\"";
        b.g0[92] = "\\\\";
        b.g0[9] = "\\t";
        b.g0[8] = "\\b";
        b.g0[10] = "\\n";
        b.g0[13] = "\\r";
        b.g0[12] = "\\f";
        String[] arr_s = (String[])b.g0.clone();
        b.h0 = arr_s;
        arr_s[60] = "\\u003c";
        arr_s[62] = "\\u003e";
        arr_s[38] = "\\u0026";
        arr_s[61] = "\\u003d";
        arr_s[39] = "\\u0027";
    }

    public b(Writer writer0) {
        this.Y = new int[0x20];
        this.Z = 0;
        this.G(6);
        this.b0 = ":";
        this.f0 = true;
        if(writer0 == null) {
            throw new NullPointerException("out == null");
        }
        this.X = writer0;
    }

    public final int F() {
        int v = this.Z;
        if(v == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.Y[v - 1];
    }

    public final void G(int v) {
        int v1 = this.Z;
        int[] arr_v = this.Y;
        if(v1 == arr_v.length) {
            int[] arr_v1 = new int[v1 * 2];
            System.arraycopy(arr_v, 0, arr_v1, 0, v1);
            this.Y = arr_v1;
        }
        int v2 = this.Z;
        this.Z = v2 + 1;
        this.Y[v2] = v;
    }

    public final void L(String s) {
        String s2;
        String[] arr_s = this.d0 ? b.h0 : b.g0;
        Writer writer0 = this.X;
        writer0.write("\"");
        int v = s.length();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v) {
            int v3 = s.charAt(v1);
            if(v3 < 0x80) {
                String s1 = arr_s[v3];
                if(s1 != null) {
                    s2 = s1;
                    goto label_18;
                }
            }
            else {
                switch(v3) {
                    case 0x2028: {
                        s2 = "\\u2028";
                        break;
                    }
                    case 0x2029: {
                        s2 = "\\u2029";
                        break;
                    }
                    default: {
                        goto label_22;
                    }
                }
            label_18:
                if(v2 < v1) {
                    writer0.write(s, v2, v1 - v2);
                }
                writer0.write(s2);
                v2 = v1 + 1;
            }
        label_22:
            ++v1;
        }
        if(v2 < v) {
            writer0.write(s, v2, v - v2);
        }
        writer0.write("\"");
    }

    public void N(long v) {
        this.V();
        this.a();
        this.X.write(Long.toString(v));
    }

    public void O(Number number0) {
        if(number0 == null) {
            this.z();
            return;
        }
        this.V();
        String s = number0.toString();
        if(!this.c0 && (s.equals("-Infinity") || s.equals("Infinity") || s.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number0);
        }
        this.a();
        this.X.append(s);
    }

    public void S(String s) {
        if(s == null) {
            this.z();
            return;
        }
        this.V();
        this.a();
        this.L(s);
    }

    public void U(boolean z) {
        this.V();
        this.a();
        this.X.write((z ? "true" : "false"));
    }

    public final void V() {
        if(this.e0 != null) {
            int v = this.F();
            if(v == 5) {
                this.X.write(44);
            }
            else if(v == 3) {
            }
            else {
                throw new IllegalStateException("Nesting problem.");
            }
            this.Y[this.Z - 1] = 4;
            this.L(this.e0);
            this.e0 = null;
        }
    }

    public final void a() {
        int v = this.F();
        if(v != 1) {
            Writer writer0 = this.X;
            switch(v) {
                case 2: {
                    writer0.append(',');
                    return;
                }
                case 4: {
                    writer0.append(this.b0);
                    this.Y[this.Z - 1] = 5;
                    return;
                }
                case 6: {
                    break;
                }
                case 7: {
                    if(!this.c0) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                    break;
                }
                default: {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
            this.Y[this.Z - 1] = 7;
            return;
        }
        this.Y[this.Z - 1] = 2;
    }

    public void b() {
        this.V();
        this.a();
        this.G(1);
        this.X.write("[");
    }

    @Override
    public void close() {
        this.X.close();
        if(this.Z > 1 || this.Z == 1 && this.Y[0] != 7) {
            throw new IOException("Incomplete document");
        }
        this.Z = 0;
    }

    public void f() {
        this.V();
        this.a();
        this.G(3);
        this.X.write("{");
    }

    @Override
    public void flush() {
        if(this.Z == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.X.flush();
    }

    public final void h(int v, int v1, String s) {
        int v2 = this.F();
        if(v2 != v1 && v2 != v) {
            throw new IllegalStateException("Nesting problem.");
        }
        if(this.e0 != null) {
            throw new IllegalStateException("Dangling name: " + this.e0);
        }
        --this.Z;
        this.X.write(s);
    }

    public void l() {
        this.h(1, 2, "]");
    }

    public void q() {
        this.h(3, 5, "}");
    }

    public void r(String s) {
        if(s == null) {
            throw new NullPointerException("name == null");
        }
        if(this.e0 != null) {
            throw new IllegalStateException();
        }
        if(this.Z == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.e0 = s;
    }

    public final void v() {
    }

    public b z() {
        if(this.e0 != null) {
            if(this.f0) {
                this.V();
                this.a();
                this.X.write("null");
                return this;
            }
            this.e0 = null;
            return this;
        }
        this.a();
        this.X.write("null");
        return this;
    }
}

