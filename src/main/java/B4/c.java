package b4;

import Lc.b;
import Yc.e;
import java.util.ArrayList;
import java.util.Iterator;

public final class c extends b {
    public c(String s) {
        super(s.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int G(int v) {
        if(v >= 0x30 && v <= 57) {
            return v - 0x30;
        }
        if(v >= 65 && v <= 70) {
            return v - 55;
        }
        return v < 97 || v > 102 ? -1 : v - 87;
    }

    public final String H() {
        if(this.n()) {
            return null;
        }
        int v = ((String)this.d).charAt(this.b);
        if(v != 34 && v != 39) {
            return null;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        ++this.b;
        int v1 = (int)this.v();
        while(v1 != -1 && v1 != v) {
            if(v1 == 92) {
                v1 = (int)this.v();
                switch(v1) {
                    case -1: {
                        continue;
                    }
                    case 10: 
                    case 12: 
                    case 13: {
                        v1 = (int)this.v();
                        continue;
                    }
                    default: {
                        int v2 = c.G(v1);
                        if(v2 != -1) {
                            for(int v3 = 1; v3 <= 5; ++v3) {
                                v1 = (int)this.v();
                                int v4 = c.G(v1);
                                if(v4 == -1) {
                                    break;
                                }
                                v2 = v2 * 16 + v4;
                            }
                            stringBuilder0.append(((char)v2));
                            continue;
                        }
                    }
                }
            }
            stringBuilder0.append(((char)v1));
            v1 = (int)this.v();
        }
        return stringBuilder0.toString();
    }

    public final String I() {
        int v4;
        int v;
        String s = (String)this.d;
        if(this.n()) {
            v = this.b;
        }
        else {
            int v1 = this.b;
            int v2 = s.charAt(v1) == 45 ? this.g() : s.charAt(v1);
            if((v2 < 65 || v2 > 90) && (v2 < 97 || v2 > 0x7A) && v2 != 0x5F) {
                v4 = v1;
            }
            else {
                for(int v3 = this.g(); v3 >= 65 && v3 <= 90 || v3 >= 97 && v3 <= 0x7A || v3 >= 0x30 && v3 <= 57 || v3 == 45 || v3 == 0x5F; v3 = this.g()) {
                }
                v4 = this.b;
            }
            this.b = v1;
            v = v4;
        }
        int v5 = this.b;
        if(v == v5) {
            return null;
        }
        this.b = v;
        return s.substring(v5, v);
    }

    // This method was un-flattened
    public final ArrayList J() {
        ArrayList arrayList1;
        int v8;
        int v7;
        e e1;
        B8.c c0;
        g g0;
        String s4;
        int v2;
        o o0;
        int v1;
        if(this.n()) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList(1);
        n n0 = new n();
        while(!this.n()) {
            int v = this.b;
            if(n0.a == null || n0.a.isEmpty()) {
                v1 = 0;
            }
            else if(this.k('>')) {
                this.F();
                v1 = 2;
            }
            else if(this.k('+')) {
                this.F();
                v1 = 3;
            }
            if(this.k('*')) {
                o0 = new o(v1, null);
            }
            else {
                String s = this.I();
                if(s == null) {
                    o0 = null;
                }
                else {
                    o o1 = new o(v1, s);
                    ++n0.b;
                    o0 = o1;
                }
            }
            while(!this.n()) {
                if(this.k('.')) {
                    if(o0 == null) {
                        o0 = new o(v1, null);
                    }
                    String s1 = this.I();
                    if(s1 == null) {
                        throw new a("Invalid \".class\" simpleSelectors");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                    }
                    o0.a(2, "class", s1);
                    n0.a();
                }
                else if(this.k('#')) {
                    if(o0 == null) {
                        o0 = new o(v1, null);
                    }
                    String s2 = this.I();
                    if(s2 == null) {
                        throw new a("Invalid \"#id\" simpleSelectors");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                    }
                    o0.a(2, "id", s2);
                    n0.b += 1000000;
                }
                else if(this.k('[')) {
                    if(o0 == null) {
                        o0 = new o(v1, null);
                    }
                    this.F();
                    String s3 = this.I();
                    if(s3 == null) {
                        throw new a("Invalid attribute simpleSelectors");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                    }
                    this.F();
                    if(this.k('=')) {
                        v2 = 2;
                        goto label_60;
                    }
                    else if(this.l("~=")) {
                        v2 = 3;
                        goto label_60;
                    }
                    else if(this.l("|=")) {
                        v2 = 4;
                    label_60:
                        this.F();
                        if(this.n()) {
                            s4 = null;
                        }
                        else {
                            String s5 = this.y();
                            s4 = s5 == null ? this.I() : s5;
                        }
                        if(s4 == null) {
                            throw new a("Invalid attribute simpleSelectors");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                        }
                        this.F();
                    }
                    else {
                        s4 = null;
                    }
                    if(!this.k(']')) {
                        throw new a("Invalid attribute simpleSelectors");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                    }
                    if(v2 == 0) {
                        v2 = 1;
                    }
                    o0.a(v2, s3, s4);
                    n0.a();
                }
                else {
                    if(!this.k(':')) {
                        break;
                    }
                    if(o0 == null) {
                        o0 = new o(v1, null);
                    }
                    String s6 = this.I();
                    if(s6 == null) {
                        throw new a("Invalid pseudo class");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                    }
                    h h0 = (h)h.c0.get(s6);
                    if(h0 == null) {
                        h0 = h.b0;
                    }
                    switch(h0.ordinal()) {
                        case 0: {
                            g0 = new g(2);
                            n0.a();
                            break;
                        }
                        case 1: {
                            g0 = new g(1);
                            n0.a();
                            break;
                        }
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: {
                            boolean z = h0 == h.X || h0 == h.Y;
                            boolean z1 = h0 == h.Y || h0 == h.Z;
                            if(this.n()) {
                                c0 = null;
                            }
                            else {
                                int v3 = this.b;
                                if(this.k('(')) {
                                    this.F();
                                    if(this.l("odd")) {
                                        c0 = new B8.c(2, 1, 6);
                                    }
                                    else if(this.l("even")) {
                                        c0 = new B8.c(2, 0, 6);
                                    }
                                    else {
                                        int v4 = this.k('+') || !this.k('-') ? 1 : -1;
                                        int v5 = this.b;
                                        String s7 = (String)this.d;
                                        int v6 = this.c;
                                        e e0 = e.a(v5, v6, s7);
                                        if(e0 != null) {
                                            this.b = e0.a;
                                        }
                                        if(this.k('n') || this.k('N')) {
                                            if(e0 == null) {
                                                v8 = v4;
                                                e0 = new e(1L, this.b);
                                            }
                                            else {
                                                v8 = v4;
                                            }
                                            this.F();
                                            boolean z2 = this.k('+');
                                            if(z2) {
                                                v7 = 1;
                                            }
                                            else {
                                                z2 = this.k('-');
                                                if(z2) {
                                                    v7 = -1;
                                                }
                                            }
                                            if(z2) {
                                                this.F();
                                                e1 = e.a(this.b, v6, s7);
                                                if(e1 == null) {
                                                    this.b = v3;
                                                    c0 = null;
                                                    goto label_152;
                                                }
                                                else {
                                                    this.b = e1.a;
                                                    goto label_143;
                                                }
                                                goto label_142;
                                            }
                                            else {
                                            label_142:
                                                e1 = null;
                                            }
                                        }
                                        else {
                                            e1 = e0;
                                            v7 = v4;
                                            e0 = null;
                                            v8 = 1;
                                        }
                                    label_143:
                                        c0 = new B8.c((e0 == null ? 0 : v8 * ((int)e0.b)), (e1 == null ? 0 : v7 * ((int)e1.b)), 6);
                                    }
                                    this.F();
                                    if(!this.k(')')) {
                                        this.b = v3;
                                        c0 = null;
                                    }
                                }
                                else {
                                    c0 = null;
                                }
                            }
                        label_152:
                            if(c0 == null) {
                                throw new a("Invalid or missing parameter section for pseudo class: " + s6);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                            }
                            f f0 = new f(c0.b, c0.c, o0.b, z, z1);
                            n0.a();
                            g0 = f0;
                            break;
                        }
                        case 6: {
                            g0 = new f(0, 1, null, true, false);
                            n0.a();
                            break;
                        }
                        case 7: {
                            g0 = new f(0, 1, null, false, false);
                            n0.a();
                            break;
                        }
                        case 8: {
                            g0 = new f(0, 1, o0.b, true, true);
                            n0.a();
                            break;
                        }
                        case 9: {
                            g0 = new f(0, 1, o0.b, false, true);
                            n0.a();
                            break;
                        }
                        case 10: {
                            g0 = new k(false, null);
                            n0.a();
                            break;
                        }
                        case 11: {
                            g0 = new k(true, o0.b);
                            n0.a();
                            break;
                        }
                        case 12: {
                            g0 = new g(0);
                            n0.a();
                            break;
                        }
                        case 13: {
                            if(!this.n()) {
                                int v9 = this.b;
                                if(this.k('(')) {
                                    this.F();
                                    arrayList1 = this.J();
                                    if(arrayList1 == null) {
                                        this.b = v9;
                                    }
                                    else if(this.k(')')) {
                                        Iterator iterator0 = arrayList1.iterator();
                                    alab1:
                                        while(true) {
                                            if(!iterator0.hasNext()) {
                                                goto label_205;
                                            }
                                            Object object0 = iterator0.next();
                                            ArrayList arrayList2 = ((n)object0).a;
                                            if(arrayList2 == null) {
                                                goto label_205;
                                            }
                                            Iterator iterator1 = arrayList2.iterator();
                                        label_196:
                                            if(iterator1.hasNext()) {
                                                Object object1 = iterator1.next();
                                                ArrayList arrayList3 = ((o)object1).d;
                                                if(arrayList3 != null) {
                                                    Iterator iterator2 = arrayList3.iterator();
                                                    while(true) {
                                                        if(!iterator2.hasNext()) {
                                                            goto label_196;
                                                        }
                                                        Object object2 = iterator2.next();
                                                        if(!(((b4.e)object2) instanceof i)) {
                                                            continue;
                                                        }
                                                        break alab1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        this.b = v9;
                                    }
                                }
                            }
                            arrayList1 = null;
                        label_205:
                            if(arrayList1 == null) {
                                throw new a("Invalid or missing parameter section for pseudo class: " + s6);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                            }
                            i i0 = new i();  // initializer: Ljava/lang/Object;-><init>()V
                            i0.a = arrayList1;
                            int v10 = 0x80000000;
                            for(Object object3: arrayList1) {
                                int v11 = ((n)object3).b;
                                if(v11 > v10) {
                                    v10 = v11;
                                }
                            }
                            n0.b = v10;
                            g0 = i0;
                            break;
                        }
                        case 14: {
                            if(!this.n()) {
                                int v12 = this.b;
                                if(this.k('(')) {
                                    this.F();
                                    ArrayList arrayList4 = null;
                                    while(true) {
                                        String s8 = this.I();
                                        if(s8 == null) {
                                            this.b = v12;
                                            break;
                                        }
                                        if(arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(s8);
                                        this.F();
                                        if(!this.E()) {
                                            if(!this.k(')')) {
                                                this.b = v12;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                            g0 = new j(s6);
                            n0.a();
                            break;
                        }
                        case 15: 
                        case 16: 
                        case 17: 
                        case 18: 
                        case 19: 
                        case 20: 
                        case 21: 
                        case 22: 
                        case 23: {
                            g0 = new j(s6);
                            n0.a();
                            break;
                        }
                        default: {
                            throw new a("Unsupported pseudo class: " + s6);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                        }
                    }
                    if(o0.d == null) {
                        o0.d = new ArrayList();
                    }
                    o0.d.add(g0);
                }
            }
            if(o0 == null) {
                this.b = v;
                if(true) {
                    break;
                }
            }
            else {
                if(n0.a == null) {
                    n0.a = new ArrayList();
                }
                n0.a.add(o0);
                if(!this.E()) {
                    continue;
                }
                arrayList0.add(n0);
                n0 = new n();
            }
        }
        if(n0.a != null && !n0.a.isEmpty()) {
            arrayList0.add(n0);
        }
        return arrayList0;
    }
}

