package l8;

import A3.e;
import M.J;
import com.apollographql.apollo.api.b;
import j6.x;
import java.io.Closeable;
import java.io.EOFException;
import java.io.StringReader;

public class a implements Closeable {
    public final StringReader X;
    public boolean Y;
    public final char[] Z;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public long g0;
    public int h0;
    public String i0;
    public int[] j0;
    public int k0;
    public String[] l0;
    public int[] m0;
    public static final char[] n0;

    static {
        a.n0 = ")]}\'\n".toCharArray();
        x.Y = new x(26);
    }

    public a(StringReader stringReader0) {
        this.Y = false;
        this.Z = new char[0x400];
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        int[] arr_v = new int[0x20];
        this.j0 = arr_v;
        this.k0 = 1;
        arr_v[0] = 6;
        this.l0 = new String[0x20];
        this.m0 = new int[0x20];
        this.X = stringReader0;
    }

    public final int F(boolean z) {
        int v = this.b0;
        int v1 = this.c0;
        while(true) {
            if(v == v1) {
                this.b0 = v;
                if(!this.r(1)) {
                    if(z) {
                        throw new EOFException("End of input" + this.z());
                    }
                    return -1;
                }
                v = this.b0;
                v1 = this.c0;
            }
            char[] arr_c = this.Z;
            int v2 = arr_c[v];
            switch(v2) {
                case 10: {
                    ++this.d0;
                    this.e0 = v + 1;
                    break;
                }
                case 9: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 35: {
                    this.b0 = v + 1;
                    this.f();
                    this.Y();
                    v = this.b0;
                    v1 = this.c0;
                    continue;
                }
                case 0x2F: {
                    this.b0 = v + 1;
                    if(v + 1 == v1) {
                        this.b0 = v;
                        boolean z1 = this.r(2);
                        ++this.b0;
                        if(!z1) {
                            return 0x2F;
                        }
                    }
                    this.f();
                    int v3 = this.b0;
                    switch(arr_c[v3]) {
                        case 42: {
                            this.b0 = v3 + 1;
                        alab1:
                            while(true) {
                                if(this.b0 + 2 > this.c0 && !this.r(2)) {
                                    this.Z("Unterminated comment");
                                    throw null;
                                }
                                int v4 = this.b0;
                                if(arr_c[v4] == 10) {
                                    ++this.d0;
                                    this.e0 = v4 + 1;
                                }
                                else {
                                    for(int v5 = 0; true; ++v5) {
                                        if(v5 >= 2) {
                                            break alab1;
                                        }
                                        if(arr_c[this.b0 + v5] != "*/".charAt(v5)) {
                                            break;
                                        }
                                    }
                                }
                                ++this.b0;
                            }
                            v = this.b0 + 2;
                            v1 = this.c0;
                            break;
                        }
                        case 0x2F: {
                            this.b0 = v3 + 1;
                            this.Y();
                            v = this.b0;
                            v1 = this.c0;
                            break;
                        }
                        default: {
                            return 0x2F;
                        }
                    }
                    continue;
                }
                default: {
                    this.b0 = v + 1;
                    return v2;
                }
            }
            ++v;
        }
    }

    public final void G() {
        if((this.f0 == 0 ? this.h() : this.f0) != 7) {
            throw new IllegalStateException("Expected null but was " + b.A(this.O()) + this.z());
        }
        this.f0 = 0;
        int v = this.k0 - 1;
        ++this.m0[v];
    }

    public final String L(char c) {
        char[] arr_c;
        int v2;
        StringBuilder stringBuilder0 = null;
        do {
            int v = this.b0;
            int v1 = this.c0;
        alab1:
            while(true) {
                v2 = v;
                while(true) {
                    arr_c = this.Z;
                    if(v >= v1) {
                        break alab1;
                    }
                    int v3 = arr_c[v];
                    if(v3 == c) {
                        this.b0 = v + 1;
                        int v4 = v + 1 - v2 - 1;
                        if(stringBuilder0 == null) {
                            return new String(arr_c, v2, v4);
                        }
                        stringBuilder0.append(arr_c, v2, v4);
                        return stringBuilder0.toString();
                    }
                    switch(v3) {
                        case 10: {
                            ++this.d0;
                            this.e0 = v + 1;
                            ++v;
                            continue;
                        }
                        case 92: {
                            break;
                        }
                        default: {
                            ++v;
                            continue;
                        }
                    }
                    this.b0 = v + 1;
                    int v5 = v + 1 - v2;
                    if(stringBuilder0 == null) {
                        stringBuilder0 = new StringBuilder(Math.max(v5 * 2, 16));
                    }
                    stringBuilder0.append(arr_c, v2, v5 - 1);
                    stringBuilder0.append(this.U());
                    v = this.b0;
                    v1 = this.c0;
                    break;
                }
            }
            if(stringBuilder0 == null) {
                stringBuilder0 = new StringBuilder(Math.max((v - v2) * 2, 16));
            }
            stringBuilder0.append(arr_c, v2, v - v2);
            this.b0 = v;
        }
        while(this.r(1));
        this.Z("Unterminated string");
        throw null;
    }

    public final String N() {
        String s;
        char[] arr_c;
        StringBuilder stringBuilder0 = null;
        int v = 0;
        do {
            int v1 = 0;
        alab1:
            while(true) {
                int v2 = this.b0;
                arr_c = this.Z;
                if(v2 + v1 < this.c0) {
                    switch(arr_c[v2 + v1]) {
                        case 35: 
                        case 0x2F: 
                        case 59: 
                        case 61: 
                        case 92: {
                            this.f();
                            break alab1;
                        }
                        case 9: 
                        case 10: 
                        case 12: 
                        case 13: 
                        case 0x20: 
                        case 44: 
                        case 58: 
                        case 91: 
                        case 93: 
                        case 0x7B: 
                        case 0x7D: {
                            break alab1;
                        }
                        default: {
                            ++v1;
                            continue;
                        }
                    }
                }
                if(v1 >= arr_c.length) {
                    goto label_15;
                }
                if(!this.r(v1 + 1)) {
                    break;
                }
            }
            v = v1;
            break;
        label_15:
            if(stringBuilder0 == null) {
                stringBuilder0 = new StringBuilder(Math.max(v1, 16));
            }
            stringBuilder0.append(arr_c, this.b0, v1);
            this.b0 += v1;
        }
        while(this.r(1));
        if(stringBuilder0 == null) {
            s = new String(arr_c, this.b0, v);
        }
        else {
            stringBuilder0.append(arr_c, this.b0, v);
            s = stringBuilder0.toString();
        }
        this.b0 += v;
        return s;
    }

    public final int O() {
        switch((this.f0 == 0 ? this.h() : this.f0)) {
            case 1: {
                return 3;
            }
            case 2: {
                return 4;
            }
            case 3: {
                return 1;
            }
            case 4: {
                return 2;
            }
            case 5: 
            case 6: {
                return 8;
            }
            case 7: {
                return 9;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return 6;
            }
            case 12: 
            case 13: 
            case 14: {
                return 5;
            }
            case 15: 
            case 16: {
                return 7;
            }
            case 17: {
                return 10;
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    public final void S(int v) {
        int v1 = this.k0;
        int[] arr_v = this.j0;
        if(v1 == arr_v.length) {
            int[] arr_v1 = new int[v1 * 2];
            int[] arr_v2 = new int[v1 * 2];
            String[] arr_s = new String[v1 * 2];
            System.arraycopy(arr_v, 0, arr_v1, 0, v1);
            System.arraycopy(this.m0, 0, arr_v2, 0, this.k0);
            System.arraycopy(this.l0, 0, arr_s, 0, this.k0);
            this.j0 = arr_v1;
            this.m0 = arr_v2;
            this.l0 = arr_s;
        }
        int v2 = this.k0;
        this.k0 = v2 + 1;
        this.j0[v2] = v;
    }

    public final char U() {
        int v3;
        if(this.b0 == this.c0 && !this.r(1)) {
            this.Z("Unterminated escape sequence");
            throw null;
        }
        int v = this.b0;
        this.b0 = v + 1;
        char[] arr_c = this.Z;
        char c = arr_c[v];
        switch(c) {
            case 10: {
                ++this.d0;
                this.e0 = v + 1;
                break;
            }
            case 34: 
            case 39: 
            case 0x2F: 
            case 92: {
                break;
            }
            case 98: {
                return '\b';
            }
            case 102: {
                return '\f';
            }
            case 110: {
                return '\n';
            }
            case 0x72: {
                return '\r';
            }
            case 0x74: {
                return '\t';
            }
            case 0x75: {
                if(v + 5 > this.c0 && !this.r(4)) {
                    this.Z("Unterminated escape sequence");
                    throw null;
                }
                int v1 = this.b0;
                char c1 = '\u0000';
                while(v1 < v1 + 4) {
                    int v2 = arr_c[v1];
                    if(v2 >= 0x30 && v2 <= 57) {
                        v3 = v2 - 0x30;
                    }
                    else if(v2 < 97 || v2 > 102) {
                        if(v2 < 65 || v2 > 70) {
                            throw new NumberFormatException("\\u" + new String(arr_c, this.b0, 4));
                        }
                        v3 = v2 - 55;
                    }
                    else {
                        v3 = v2 - 87;
                    }
                    c1 = (char)(v3 + ((char)(c1 << 4)));
                    ++v1;
                }
                this.b0 += 4;
                return c1;
            }
            default: {
                this.Z("Invalid escape sequence");
                throw null;
            }
        }
        return c;
    }

    public final void V(char c) {
        do {
            int v = this.b0;
            int v1 = this.c0;
            while(v < v1) {
                int v2 = this.Z[v];
                if(v2 == c) {
                    this.b0 = v + 1;
                    return;
                }
                switch(v2) {
                    case 10: {
                        ++this.d0;
                        this.e0 = v + 1;
                        ++v;
                        continue;
                    }
                    case 92: {
                        break;
                    }
                    default: {
                        ++v;
                        continue;
                    }
                }
                this.b0 = v + 1;
                this.U();
                v = this.b0;
                v1 = this.c0;
            }
            this.b0 = v;
        }
        while(this.r(1));
        this.Z("Unterminated string");
        throw null;
    }

    public final void Y() {
        while(this.b0 < this.c0 || this.r(1)) {
            int v = this.b0;
            int v1 = v + 1;
            this.b0 = v1;
            int v2 = this.Z[v];
            if(v2 == 10) {
                ++this.d0;
                this.e0 = v1;
                return;
            }
            if(v2 == 13) {
                break;
            }
        }
    }

    public final void Z(String s) {
        StringBuilder stringBuilder0 = J.i(s);
        stringBuilder0.append(this.z());
        throw new c(stringBuilder0.toString());  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    }

    public final void a() {
        if((this.f0 == 0 ? this.h() : this.f0) != 3) {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + b.A(this.O()) + this.z());
        }
        this.S(1);
        this.m0[this.k0 - 1] = 0;
        this.f0 = 0;
    }

    public final void b() {
        if((this.f0 == 0 ? this.h() : this.f0) != 1) {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + b.A(this.O()) + this.z());
        }
        this.S(3);
        this.f0 = 0;
    }

    @Override
    public final void close() {
        this.f0 = 0;
        this.j0[0] = 8;
        this.k0 = 1;
        this.X.close();
    }

    public final void f() {
        if(this.Y) {
            return;
        }
        this.Z("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final int h() {
        int v22;
        int v9;
        String s1;
        String s;
        int[] arr_v = this.j0;
        int v = this.k0 - 1;
        int v1 = arr_v[v];
        char[] arr_c = this.Z;
    alab1:
        switch(v1) {
            case 1: {
                arr_v[v] = 2;
                break;
            }
            case 2: {
                switch(this.F(true)) {
                    case 44: {
                        break alab1;
                    }
                    case 59: {
                        this.f();
                        break alab1;
                    }
                    case 93: {
                        this.f0 = 4;
                        return 4;
                    }
                    default: {
                        this.Z("Unterminated array");
                        throw null;
                    }
                }
            }
            case 4: {
                arr_v[v] = 5;
                int v3 = this.F(true);
                if(v3 != 58) {
                    if(v3 != 61) {
                        this.Z("Expected \':\'");
                        throw null;
                    }
                    this.f();
                    if(this.b0 < this.c0 || this.r(1)) {
                        int v4 = this.b0;
                        if(arr_c[v4] == 62) {
                            this.b0 = v4 + 1;
                            break;
                        }
                    }
                }
                break;
            }
            case 3: 
            case 5: {
                arr_v[v] = 4;
                if(v1 == 5) {
                    switch(this.F(true)) {
                        case 44: {
                            break;
                        }
                        case 59: {
                            this.f();
                            break;
                        }
                        case 0x7D: {
                            this.f0 = 2;
                            return 2;
                        }
                        default: {
                            this.Z("Unterminated object");
                            throw null;
                        }
                    }
                }
                int v2 = this.F(true);
                switch(v2) {
                    case 34: {
                        this.f0 = 13;
                        return 13;
                    }
                    case 39: {
                        this.f();
                        this.f0 = 12;
                        return 12;
                    }
                    case 0x7D: {
                        if(v1 != 5) {
                            this.f0 = 2;
                            return 2;
                        }
                        this.Z("Expected name");
                        throw null;
                    }
                    default: {
                        this.f();
                        --this.b0;
                        if(this.v(((char)v2))) {
                            this.f0 = 14;
                            return 14;
                        }
                        this.Z("Expected name");
                        throw null;
                    }
                }
            label_33:
                if(v1 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                break;
            }
            case 6: {
                if(this.Y) {
                    this.F(true);
                    int v5 = this.b0 - 1;
                    this.b0 = v5;
                    char[] arr_c1 = a.n0;
                    if(v5 + arr_c1.length <= this.c0 || this.r(arr_c1.length)) {
                        for(int v6 = 0; true; ++v6) {
                            if(v6 >= arr_c1.length) {
                                this.b0 += arr_c1.length;
                                break;
                            }
                            if(arr_c[this.b0 + v6] != arr_c1[v6]) {
                                break;
                            }
                        }
                    }
                }
                this.j0[this.k0 - 1] = 7;
                break;
            }
            case 7: {
                if(this.F(false) == -1) {
                    this.f0 = 17;
                    return 17;
                }
                this.f();
                --this.b0;
                break;
            }
            default: {
                goto label_33;
            }
        }
        int v7 = this.F(true);
        if(v7 != 34) {
            switch(v7) {
                case 39: {
                    this.f();
                    this.f0 = 8;
                    return 8;
                }
                case 44: 
                case 59: {
                    break;
                }
                case 91: {
                    this.f0 = 3;
                    return 3;
                }
                case 93: {
                    if(v1 == 1) {
                        this.f0 = 4;
                        return 4;
                    }
                    break;
                }
                default: {
                    if(v7 != 0x7B) {
                        int v8 = this.b0 - 1;
                        this.b0 = v8;
                        switch(arr_c[v8]) {
                            case 70: 
                            case 102: {
                                s = "false";
                                s1 = "FALSE";
                                v9 = 6;
                                break;
                            }
                            case 78: 
                            case 110: {
                                s = "null";
                                s1 = "NULL";
                                v9 = 7;
                                break;
                            }
                            case 84: 
                            case 0x74: {
                                s = "true";
                                s1 = "TRUE";
                                v9 = 5;
                                break;
                            }
                            default: {
                                v9 = 0;
                                goto label_110;
                            }
                        }
                        int v10 = s.length();
                        int v11 = 1;
                        while(v11 < v10) {
                            if(this.b0 + v11 < this.c0 || this.r(v11 + 1)) {
                                int v12 = arr_c[this.b0 + v11];
                                if(v12 != s.charAt(v11) && v12 != s1.charAt(v11)) {
                                    v9 = 0;
                                    goto label_110;
                                }
                                ++v11;
                                continue;
                            }
                            v9 = 0;
                            goto label_110;
                        }
                        if((this.b0 + v10 < this.c0 || this.r(v10 + 1)) && this.v(arr_c[this.b0 + v10])) {
                            v9 = 0;
                        }
                        else {
                            this.b0 += v10;
                            this.f0 = v9;
                        }
                    label_110:
                        if(v9 != 0) {
                            return v9;
                        }
                        int v13 = this.b0;
                        int v14 = this.c0;
                        int v15 = 0;
                        int v16 = 0;
                        boolean z = false;
                        int v17 = 1;
                        long v18 = 0L;
                    alab3:
                        while(true) {
                            if(v13 + v16 != v14) {
                            label_124:
                                int v19 = arr_c[v13 + v16];
                            alab2:
                                switch(v19) {
                                    case 43: {
                                        if(v15 == 5) {
                                            v15 = 6;
                                            ++v16;
                                            v14 = v14;
                                            continue;
                                        }
                                        break;
                                    }
                                    case 45: {
                                        switch(v15) {
                                            case 0: {
                                                v15 = 1;
                                                z = true;
                                                ++v16;
                                                v14 = v14;
                                                continue;
                                            }
                                            case 5: {
                                                v15 = 6;
                                                ++v16;
                                                v14 = v14;
                                                continue;
                                            }
                                            default: {
                                                break alab2;
                                            }
                                        }
                                    }
                                    case 46: {
                                        if(v15 == 2) {
                                            v15 = 3;
                                            ++v16;
                                            v14 = v14;
                                            continue;
                                        }
                                        break;
                                    }
                                    case 69: 
                                    case 101: {
                                        if(v15 == 2 || v15 == 4) {
                                            v15 = 5;
                                            ++v16;
                                            v14 = v14;
                                            continue;
                                        }
                                        break;
                                    }
                                    default: {
                                        if(v19 >= 0x30 && v19 <= 57) {
                                            switch(v15) {
                                                case 0: 
                                                case 1: {
                                                    v18 = (long)(-(v19 - 0x30));
                                                    v15 = 2;
                                                    ++v16;
                                                    v14 = v14;
                                                    continue;
                                                }
                                                case 2: {
                                                    if(v18 != 0L) {
                                                        long v20 = 10L * v18 - ((long)(v19 - 0x30));
                                                        int v21 = Long.compare(v18, -922337203685477580L);
                                                        v17 &= (v21 > 0 || v21 == 0 && v20 < v18 ? 1 : 0);
                                                        v18 = v20;
                                                        ++v16;
                                                        v14 = v14;
                                                        continue;
                                                    }
                                                    break;
                                                }
                                                default: {
                                                    if(v15 == 3) {
                                                        v15 = 4;
                                                    }
                                                    else if(v15 == 5 || v15 == 6) {
                                                        v15 = 7;
                                                    }
                                                    ++v16;
                                                    v14 = v14;
                                                    continue;
                                                }
                                            }
                                        }
                                        else if(!this.v(((char)v19))) {
                                        label_150:
                                            if(v15 == 2 && v17 != 0 && (v18 != 0x8000000000000000L || z) && (v18 != 0L || !z)) {
                                                if(!z) {
                                                    v18 = -v18;
                                                }
                                                this.g0 = v18;
                                                this.b0 += v16;
                                                v22 = 15;
                                                this.f0 = 15;
                                                break alab3;
                                            }
                                            if(v15 == 2 || v15 == 4 || v15 == 7) {
                                                this.h0 = v16;
                                                v22 = 16;
                                                this.f0 = 16;
                                                break alab3;
                                            }
                                        }
                                    }
                                }
                            }
                            else if(v16 != arr_c.length) {
                                if(this.r(v16 + 1)) {
                                    v14 = this.c0;
                                    v13 = this.b0;
                                }
                                else {
                                    goto label_150;
                                }
                                goto label_124;
                            }
                            v22 = 0;
                            break;
                        }
                        if(v22 != 0) {
                            return v22;
                        }
                        if(this.v(arr_c[this.b0])) {
                            this.f();
                            this.f0 = 10;
                            return 10;
                        }
                        this.Z("Expected value");
                        throw null;
                    }
                    this.f0 = 1;
                    return 1;
                }
            }
            if(v1 != 1 && v1 != 2) {
                this.Z("Unexpected value");
                throw null;
            }
            this.f();
            --this.b0;
            this.f0 = 7;
            return 7;
        }
        this.f0 = 9;
        return 9;
    }

    public final boolean hasNext() {
        int v = this.f0 == 0 ? this.h() : this.f0;
        return v != 2 && v != 4;
    }

    public final void l() {
        if((this.f0 == 0 ? this.h() : this.f0) != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + b.A(this.O()) + this.z());
        }
        int v = this.k0;
        this.k0 = v - 1;
        ++this.m0[v - 2];
        this.f0 = 0;
    }

    public final boolean nextBoolean() {
        switch((this.f0 == 0 ? this.h() : this.f0)) {
            case 5: {
                this.f0 = 0;
                int v = this.k0 - 1;
                ++this.m0[v];
                return true;
            }
            case 6: {
                this.f0 = 0;
                int v1 = this.k0 - 1;
                ++this.m0[v1];
                return false;
            }
            default: {
                throw new IllegalStateException("Expected a boolean but was " + b.A(this.O()) + this.z());
            }
        }
    }

    public final double nextDouble() {
        int v = this.f0 == 0 ? this.h() : this.f0;
        switch(v) {
            case 8: 
            case 9: {
                this.i0 = this.L(((char)(v == 8 ? 39 : 34)));
                break;
            }
            case 10: {
                this.i0 = this.N();
                break;
            }
            case 11: {
                break;
            }
            case 15: {
                this.f0 = 0;
                int v1 = this.k0 - 1;
                ++this.m0[v1];
                return (double)this.g0;
            }
            case 16: {
                this.i0 = new String(this.Z, this.b0, this.h0);
                this.b0 += this.h0;
                break;
            }
            default: {
                throw new IllegalStateException("Expected a double but was " + b.A(this.O()) + this.z());
            }
        }
        this.f0 = 11;
        double f = Double.parseDouble(this.i0);
        if(!this.Y && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new c("JSON forbids NaN and infinities: " + f + this.z());  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;)V
        }
        this.i0 = null;
        this.f0 = 0;
        int v2 = this.k0 - 1;
        ++this.m0[v2];
        return f;
    }

    public final int nextInt() {
        int v = this.f0 == 0 ? this.h() : this.f0;
        switch(v) {
            case 8: {
            label_12:
                this.i0 = v == 10 ? this.N() : this.L(((char)(v == 8 ? 39 : 34)));
                try {
                    int v3 = Integer.parseInt(this.i0);
                    this.f0 = 0;
                    int v4 = this.k0 - 1;
                    ++this.m0[v4];
                    return v3;
                }
                catch(NumberFormatException unused_ex) {
                    goto label_23;
                }
            }
            case 15: {
                int v1 = (int)this.g0;
                if(this.g0 != ((long)v1)) {
                    throw new NumberFormatException("Expected an int but was " + this.g0 + this.z());
                }
                this.f0 = 0;
                int v2 = this.k0 - 1;
                ++this.m0[v2];
                return v1;
            label_10:
                if(v != 9 && v != 10) {
                    throw new IllegalStateException("Expected an int but was " + b.A(this.O()) + this.z());
                }
                goto label_12;
            }
            case 16: {
                break;
            }
            default: {
                goto label_10;
            }
        }
        this.i0 = new String(this.Z, this.b0, this.h0);
        this.b0 += this.h0;
    label_23:
        this.f0 = 11;
        double f = Double.parseDouble(this.i0);
        if(((double)(((int)f))) != f) {
            throw new NumberFormatException("Expected an int but was " + this.i0 + this.z());
        }
        this.i0 = null;
        this.f0 = 0;
        int v5 = this.k0 - 1;
        ++this.m0[v5];
        return (int)f;
    }

    public final long nextLong() {
        int v = this.f0 == 0 ? this.h() : this.f0;
        switch(v) {
            case 8: {
            label_9:
                this.i0 = v == 10 ? this.N() : this.L(((char)(v == 8 ? 39 : 34)));
                try {
                    long v2 = Long.parseLong(this.i0);
                    this.f0 = 0;
                    int v3 = this.k0 - 1;
                    ++this.m0[v3];
                    return v2;
                }
                catch(NumberFormatException unused_ex) {
                    goto label_20;
                }
            }
            case 15: {
                this.f0 = 0;
                int v1 = this.k0 - 1;
                ++this.m0[v1];
                return this.g0;
            label_7:
                if(v != 9 && v != 10) {
                    throw new IllegalStateException("Expected a long but was " + b.A(this.O()) + this.z());
                }
                goto label_9;
            }
            case 16: {
                break;
            }
            default: {
                goto label_7;
            }
        }
        this.i0 = new String(this.Z, this.b0, this.h0);
        this.b0 += this.h0;
    label_20:
        this.f0 = 11;
        double f = Double.parseDouble(this.i0);
        if(((double)(((long)f))) != f) {
            throw new NumberFormatException("Expected a long but was " + this.i0 + this.z());
        }
        this.i0 = null;
        this.f0 = 0;
        int v4 = this.k0 - 1;
        ++this.m0[v4];
        return (long)f;
    }

    public final String nextName() {
        String s;
        switch((this.f0 == 0 ? this.h() : this.f0)) {
            case 12: {
                s = this.L('\'');
                break;
            }
            case 13: {
                s = this.L('\"');
                break;
            }
            case 14: {
                s = this.N();
                break;
            }
            default: {
                throw new IllegalStateException("Expected a name but was " + b.A(this.O()) + this.z());
            }
        }
        this.f0 = 0;
        this.l0[this.k0 - 1] = s;
        return s;
    }

    public final String nextString() {
        String s;
    alab1:
        switch(this.f0) {
            case 0: {
                switch(this.h()) {
                    case 8: {
                        s = this.L('\'');
                        break alab1;
                    }
                    case 9: {
                        s = this.L('\"');
                        break alab1;
                    }
                    case 10: {
                        s = this.N();
                        break alab1;
                    }
                    case 11: {
                        s = this.i0;
                        this.i0 = null;
                        break alab1;
                    }
                    case 15: {
                        s = Long.toString(this.g0);
                        break alab1;
                    }
                    case 16: {
                        s = new String(this.Z, this.b0, this.h0);
                        this.b0 += this.h0;
                        break alab1;
                    }
                    default: {
                        throw new IllegalStateException("Expected a string but was " + b.A(this.O()) + this.z());
                    }
                }
            }
            case 8: {
                s = this.L('\'');
                break;
            }
            case 9: {
                s = this.L('\"');
                break;
            }
            case 10: {
                s = this.N();
                break;
            }
            case 11: {
                s = this.i0;
                this.i0 = null;
                break;
            }
            case 15: {
                s = Long.toString(this.g0);
                break;
            }
            case 16: {
                s = new String(this.Z, this.b0, this.h0);
                this.b0 += this.h0;
                break;
            }
            default: {
                throw new IllegalStateException("Expected a string but was " + b.A(this.O()) + this.z());
            }
        }
        this.f0 = 0;
        int v = this.k0 - 1;
        ++this.m0[v];
        return s;
    }

    public final void q() {
        if((this.f0 == 0 ? this.h() : this.f0) != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + b.A(this.O()) + this.z());
        }
        int v = this.k0;
        this.k0 = v - 1;
        this.l0[v - 1] = null;
        ++this.m0[v - 2];
        this.f0 = 0;
    }

    public final boolean r(int v) {
        int v1 = this.b0;
        this.e0 -= v1;
        int v2 = this.c0;
        char[] arr_c = this.Z;
        if(v2 == v1) {
            this.c0 = 0;
        }
        else {
            int v3 = v2 - v1;
            this.c0 = v3;
            System.arraycopy(arr_c, v1, arr_c, 0, v3);
        }
        this.b0 = 0;
        int v4;
        while((v4 = this.X.read(arr_c, this.c0, arr_c.length - this.c0)) != -1) {
            int v5 = this.c0 + v4;
            this.c0 = v5;
            if(this.d0 == 0 && this.e0 == 0 && v5 > 0 && arr_c[0] == 0xFEFF) {
                ++this.b0;
                this.e0 = 1;
                ++v;
            }
            if(v5 >= v) {
                return true;
            }
        }
        return false;
    }

    public final void skipValue() {
        int v3;
        int v2;
        int v = 0;
        do {
            int v1 = this.f0;
        alab1:
            switch(v1) {
                case 0: {
                    v1 = this.h();
                    switch(v1) {
                        case 1: {
                            this.S(3);
                            ++v;
                            break alab1;
                        }
                        case 2: {
                            --this.k0;
                            --v;
                            break alab1;
                        }
                        case 3: {
                            this.S(1);
                            ++v;
                            break alab1;
                        }
                        case 4: {
                            --this.k0;
                            --v;
                            break alab1;
                        }
                        case 10: 
                        case 14: {
                            break;
                        }
                        default: {
                        label_6:
                            if(v1 == 8 || v1 == 12) {
                                this.V('\'');
                            }
                            else if(v1 == 9 || v1 == 13) {
                                this.V('\"');
                            }
                            else if(v1 == 16) {
                                this.b0 += this.h0;
                            }
                            break alab1;
                        }
                    }
                    v2 = 0;
                    goto label_40;
                }
                case 1: {
                    this.S(3);
                    ++v;
                    break;
                }
                case 2: {
                    --this.k0;
                    --v;
                    break;
                }
                case 3: {
                    this.S(1);
                    ++v;
                    break;
                }
                case 4: {
                    --this.k0;
                    --v;
                    break;
                }
                case 10: 
                case 14: {
                    while(true) {
                        v2 = 0;
                    alab2:
                        while(true) {
                        label_40:
                            v3 = this.b0 + v2;
                            if(v3 >= this.c0) {
                                goto label_50;
                            }
                            int v4 = this.Z[v3];
                            if(v4 == 9 || v4 == 10 || v4 == 12 || v4 == 13) {
                                this.b0 += v2;
                                break alab1;
                            }
                            switch(v4) {
                                case 35: 
                                case 0x2F: 
                                case 59: 
                                case 61: 
                                case 92: {
                                    break alab2;
                                }
                                case 0x20: 
                                case 44: 
                                case 58: 
                                case 91: 
                                case 93: 
                                case 0x7B: 
                                case 0x7D: {
                                    this.b0 += v2;
                                    break alab1;
                                }
                                default: {
                                    ++v2;
                                }
                            }
                        }
                        this.f();
                        this.b0 += v2;
                        break alab1;
                    label_50:
                        this.b0 = v3;
                        if(this.r(1)) {
                            continue;
                        }
                        break alab1;
                    }
                }
                default: {
                    goto label_6;
                }
            }
            this.f0 = 0;
        }
        while(v != 0);
        int v5 = this.k0;
        ++this.m0[v5 - 1];
        this.l0[v5 - 1] = "null";
    }

    @Override
    public final String toString() {
        return a.class.getSimpleName() + this.z();
    }

    public final boolean v(char c) {
        switch(c) {
            case 35: 
            case 0x2F: 
            case 59: 
            case 61: 
            case 92: {
                this.f();
                break;
            }
            case 9: 
            case 10: 
            case 12: 
            case 13: 
            case 0x20: 
            case 44: 
            case 58: 
            case 91: 
            case 93: 
            case 0x7B: 
            case 0x7D: {
                break;
            }
            default: {
                return true;
            }
        }
        return false;
    }

    public final String z() {
        StringBuilder stringBuilder0 = e.v(this.d0 + 1, this.b0 - this.e0 + 1, " at line ", " column ", " path ");
        StringBuilder stringBuilder1 = new StringBuilder("$");
        int v = this.k0;
        for(int v1 = 0; v1 < v; ++v1) {
            switch(this.j0[v1]) {
                case 1: 
                case 2: {
                    stringBuilder1.append('[');
                    stringBuilder1.append(this.m0[v1]);
                    stringBuilder1.append(']');
                    break;
                }
                case 3: 
                case 4: 
                case 5: {
                    stringBuilder1.append('.');
                    String s = this.l0[v1];
                    if(s != null) {
                        stringBuilder1.append(s);
                    }
                }
            }
        }
        stringBuilder0.append(stringBuilder1.toString());
        return stringBuilder0.toString();
    }
}

