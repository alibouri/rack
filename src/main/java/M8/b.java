package m8;

import M.J;
import R2.f;
import R2.h;
import R9.V0;
import T6.e;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import g.a;
import i.s;
import io.sentry.g1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b {
    public final g1 a;
    public final HashMap b;
    public final s c;
    public final HashSet d;
    public final a e;
    public final HashSet f;
    public final HashSet g;
    public static final Logger h;
    public static final Map i;
    public static final Map j;
    public static final Pattern k;
    public static final Pattern l;
    public static final Pattern m;
    public static final Pattern n;
    public static final Pattern o;
    public static final Pattern p;
    public static final Pattern q;
    public static final Pattern r;
    public static final Pattern s;
    public static final Pattern t;
    public static final Pattern u;
    public static final Pattern v;
    public static b w;

    static {
        b.h = Logger.getLogger(b.class.getName());
        HashMap hashMap0 = new HashMap();
        Integer integer0 = 54;
        Character character0 = Character.valueOf('6');
        hashMap0.put(integer0, "9");
        Collections.unmodifiableMap(hashMap0);
        HashSet hashSet0 = new HashSet();
        hashSet0.add(86);
        Collections.unmodifiableSet(hashSet0);
        HashSet hashSet1 = new HashSet();
        Integer integer1 = 52;
        Character character1 = Character.valueOf('4');
        hashSet1.add(integer1);
        Collections.unmodifiableSet(hashSet1);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(integer1);
        hashSet2.add(integer0);
        Character character2 = Character.valueOf('7');
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet0);
        Collections.unmodifiableSet(hashSet2);
        HashMap hashMap1 = new HashMap();
        Character character3 = Character.valueOf('0');
        hashMap1.put(character3, character3);
        Character character4 = Character.valueOf('1');
        hashMap1.put(character4, character4);
        Character character5 = Character.valueOf('2');
        hashMap1.put(character5, character5);
        Character character6 = Character.valueOf('3');
        hashMap1.put(character6, character6);
        hashMap1.put(character1, character1);
        Character character7 = Character.valueOf('5');
        hashMap1.put(character7, character7);
        hashMap1.put(character0, character0);
        hashMap1.put(character2, character2);
        Character character8 = Character.valueOf('8');
        hashMap1.put(character8, character8);
        Character character9 = Character.valueOf('9');
        hashMap1.put(character9, character9);
        HashMap hashMap2 = new HashMap(40);
        hashMap2.put(Character.valueOf('A'), character5);
        hashMap2.put(Character.valueOf('B'), character5);
        hashMap2.put(Character.valueOf('C'), character5);
        hashMap2.put(Character.valueOf('D'), character6);
        hashMap2.put(Character.valueOf('E'), character6);
        hashMap2.put(Character.valueOf('F'), character6);
        hashMap2.put(Character.valueOf('G'), character1);
        hashMap2.put(Character.valueOf('H'), character1);
        hashMap2.put(Character.valueOf('I'), character1);
        hashMap2.put(Character.valueOf('J'), character7);
        hashMap2.put(Character.valueOf('K'), character7);
        hashMap2.put(Character.valueOf('L'), character7);
        hashMap2.put(Character.valueOf('M'), character0);
        hashMap2.put(Character.valueOf('N'), character0);
        hashMap2.put(Character.valueOf('O'), character0);
        hashMap2.put(Character.valueOf('P'), character2);
        hashMap2.put(Character.valueOf('Q'), character2);
        hashMap2.put(Character.valueOf('R'), character2);
        hashMap2.put(Character.valueOf('S'), character2);
        hashMap2.put(Character.valueOf('T'), character8);
        hashMap2.put(Character.valueOf('U'), character8);
        hashMap2.put(Character.valueOf('V'), character8);
        hashMap2.put(Character.valueOf('W'), character9);
        hashMap2.put(Character.valueOf('X'), character9);
        hashMap2.put(Character.valueOf('Y'), character9);
        hashMap2.put(Character.valueOf('Z'), character9);
        Map map0 = Collections.unmodifiableMap(hashMap2);
        b.i = map0;
        HashMap hashMap3 = new HashMap(100);
        hashMap3.putAll(map0);
        hashMap3.putAll(hashMap1);
        b.j = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.putAll(hashMap1);
        Character character10 = Character.valueOf('+');
        hashMap4.put(character10, character10);
        Character character11 = Character.valueOf('*');
        hashMap4.put(character11, character11);
        Character character12 = Character.valueOf('#');
        hashMap4.put(character12, character12);
        Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        for(Object object0: map0.keySet()) {
            hashMap5.put(Character.valueOf(Character.toLowerCase(((Character)object0).charValue())), ((Character)object0));
            hashMap5.put(((Character)object0), ((Character)object0));
        }
        hashMap5.putAll(hashMap1);
        hashMap5.put(Character.valueOf('-'), Character.valueOf('-'));
        hashMap5.put(Character.valueOf('－'), Character.valueOf('-'));
        hashMap5.put(Character.valueOf('‐'), Character.valueOf('-'));
        hashMap5.put(Character.valueOf('‑'), Character.valueOf('-'));
        hashMap5.put(Character.valueOf('‒'), Character.valueOf('-'));
        hashMap5.put(Character.valueOf('–'), Character.valueOf('-'));
        hashMap5.put(Character.valueOf('—'), Character.valueOf('-'));
        hashMap5.put(Character.valueOf('―'), Character.valueOf('-'));
        hashMap5.put(Character.valueOf('−'), Character.valueOf('-'));
        hashMap5.put(Character.valueOf('/'), Character.valueOf('/'));
        hashMap5.put(Character.valueOf('／'), Character.valueOf('/'));
        hashMap5.put(Character.valueOf(' '), Character.valueOf(' '));
        hashMap5.put(Character.valueOf('　'), Character.valueOf(' '));
        hashMap5.put(Character.valueOf('⁠'), Character.valueOf(' '));
        hashMap5.put(Character.valueOf('.'), Character.valueOf('.'));
        hashMap5.put(Character.valueOf('．'), Character.valueOf('.'));
        Collections.unmodifiableMap(hashMap5);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        String s = Arrays.toString(b.i.keySet().toArray()).replaceAll("[, \\[\\]]", "") + Arrays.toString(b.i.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", "");
        b.k = Pattern.compile("[+＋]+");
        b.l = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
        b.m = Pattern.compile("(\\p{Nd})");
        b.n = Pattern.compile("[+＋\\p{Nd}]");
        b.o = Pattern.compile("[\\\\/] *x");
        b.p = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        b.q = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String s1 = b.a(true);
        b.a(false);
        b.r = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        b.s = Pattern.compile(("^(" + ("[" + (s + "\\p{Nd}") + "]+((\\-)*[" + (s + "\\p{Nd}") + "])*") + "\\.)*" + ("[" + s + "]+((\\-)*[" + (s + "\\p{Nd}") + "])*") + "\\.?$"));
        b.t = Pattern.compile(("(?:" + s1 + ")$"), 66);
        b.u = Pattern.compile((J.e("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*", s, "\\p{Nd}]*") + "(?:" + s1 + ")?"), 66);
        Pattern.compile("(\\D+)");
        b.v = Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        b.w = null;
    }

    public b(g1 g10, HashMap hashMap0) {
        this.c = new s(12);
        this.d = new HashSet(35);
        this.e = new a(16, 0);
        this.f = new HashSet(320);
        this.g = new HashSet();
        this.a = g10;
        this.b = hashMap0;
        for(Object object0: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            List list0 = (List)map$Entry0.getValue();
            if(list0.size() == 1 && "001".equals(list0.get(0))) {
                Object object1 = map$Entry0.getKey();
                this.g.add(object1);
            }
            else {
                this.f.addAll(list0);
            }
        }
        if(this.f.remove("001")) {
            b.h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.d.addAll(((Collection)hashMap0.get(1)));
    }

    public static String a(boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(";ext=" + b.b(20));
        stringBuilder0.append("|");
        stringBuilder0.append("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + b.b(20) + "#?");
        stringBuilder0.append("|");
        stringBuilder0.append("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + b.b(9) + "#?");
        String s = m5.b.y(stringBuilder0, "|", "[- ]+" + b.b(6) + "#");
        return z ? s + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + b.b(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + b.b(9) + "#?") : s;
    }

    public static String b(int v) {
        return J.d(v, "(\\p{Nd}{1,", "})");
    }

    public final String c(Phonenumber.PhoneNumber phonenumber$PhoneNumber0, int v) {
        c c0;
        a a0;
        if(phonenumber$PhoneNumber0.Z == 0L) {
            String s = phonenumber$PhoneNumber0.h0;
            if(s.length() > 0 || !phonenumber$PhoneNumber0.X) {
                return s;
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder(20);
        stringBuilder0.setLength(0);
        int v1 = phonenumber$PhoneNumber0.Y;
        String s1 = b.g(phonenumber$PhoneNumber0);
        if(v == 1) {
            stringBuilder0.append(s1);
            b.r(v1, 1, stringBuilder0);
            return stringBuilder0.toString();
        }
        HashMap hashMap0 = this.b;
        if(!hashMap0.containsKey(v1)) {
            stringBuilder0.append(s1);
            return stringBuilder0.toString();
        }
        List list0 = (List)hashMap0.get(v1);
        d d0 = this.f(v1, (list0 == null ? "ZZ" : ((String)list0.get(0))));
        Iterator iterator0 = (d0.V0.size() == 0 || v == 3 ? d0.U0 : d0.V0).iterator();
        do {
            boolean z = iterator0.hasNext();
            a0 = this.e;
            if(!z) {
                goto label_27;
            }
            Object object0 = iterator0.next();
            c0 = (c)object0;
            int v2 = c0.Z.size();
        }
        while(v2 != 0 && !a0.v(((String)c0.Z.get(v2 - 1))).matcher(s1).lookingAt() || !a0.v(c0.X).matcher(s1).matches());
        goto label_28;
    label_27:
        c0 = null;
    label_28:
        if(c0 != null) {
            String s2 = c0.Y;
            Matcher matcher0 = a0.v(c0.X).matcher(s1);
            String s3 = c0.c0;
            s1 = v != 3 || s3 == null || s3.length() <= 0 ? matcher0.replaceAll(s2) : matcher0.replaceAll(b.v.matcher(s2).replaceFirst(s3));
            if(v == 4) {
                Matcher matcher1 = b.l.matcher(s1);
                if(matcher1.lookingAt()) {
                    s1 = matcher1.replaceFirst("");
                }
                s1 = matcher1.reset(s1).replaceAll("-");
            }
        }
        stringBuilder0.append(s1);
        if(phonenumber$PhoneNumber0.b0 && phonenumber$PhoneNumber0.c0.length() > 0) {
            if(v == 4) {
                stringBuilder0.append(";ext=");
            }
            else if(d0.N0) {
                stringBuilder0.append(d0.O0);
            }
            else {
                stringBuilder0.append(" ext. ");
            }
            stringBuilder0.append(phonenumber$PhoneNumber0.c0);
        }
        b.r(v1, v, stringBuilder0);
        return stringBuilder0.toString();
    }

    public static b d() {
        synchronized(b.class) {
            if(b.w == null) {
                o8.a a0 = o8.a.d;
                p8.a a1 = a0.b;
                if(a1 == null) {
                    throw new IllegalArgumentException("metadataLoader could not be null.");
                }
                b.s(new b(new g1(a0.c, a1, a0.a), f.s()));
            }
            return b.w;
        }
    }

    public final d e(String s) {
        if(s != null && this.f.contains(s)) {
            g1 g10 = this.a;
            g10.getClass();
            if(s.equals("001")) {
                throw new IllegalArgumentException(s + " region code is a non-geo entity");
            }
            String s1 = ((e)g10.Y).a(s);
            d d0 = (d)((ConcurrentHashMap)((q8.a)((h)g10.Z).b(s1)).Y.Y).get(s);
            if(d0 == null) {
                throw new V0("Missing metadata for region code " + s);  // initializer: Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
            }
            return d0;
        }
        return null;
    }

    public final d f(int v, String s) {
        if("001".equals(s)) {
            if(!this.g.contains(v)) {
                return null;
            }
            g1 g10 = this.a;
            g10.getClass();
            List list0 = (List)f.s().get(v);
            if(list0 != null && !list0.contains("001")) {
                throw new IllegalArgumentException(v + " calling code belongs to a geo entity");
            }
            String s1 = ((e)g10.Y).a(v);
            d d0 = (d)((ConcurrentHashMap)((q8.a)((h)g10.Z).b(s1)).X.Y).get(v);
            if(d0 == null) {
                throw new V0("Missing metadata for country code " + v);  // initializer: Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
            }
            return d0;
        }
        return this.e(s);
    }

    public static String g(Phonenumber.PhoneNumber phonenumber$PhoneNumber0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(phonenumber$PhoneNumber0.e0) {
            int v = phonenumber$PhoneNumber0.g0;
            if(v > 0) {
                char[] arr_c = new char[v];
                Arrays.fill(arr_c, '0');
                stringBuilder0.append(new String(arr_c));
            }
        }
        stringBuilder0.append(phonenumber$PhoneNumber0.Z);
        return stringBuilder0.toString();
    }

    public static m8.f h(d d0, int v) {
        switch(v.h.d(v)) {
            case 1: {
                return d0.d0;
            }
            case 0: 
            case 2: {
                return d0.b0;
            }
            case 3: {
                return d0.f0;
            }
            case 4: {
                return d0.h0;
            }
            case 5: {
                return d0.j0;
            }
            case 6: {
                return d0.n0;
            }
            case 7: {
                return d0.l0;
            }
            case 8: {
                return d0.p0;
            }
            case 9: {
                return d0.r0;
            }
            case 10: {
                return d0.v0;
            }
            default: {
                return d0.Y;
            }
        }
    }

    public final int i(String s, d d0) {
        if(!this.j(s, d0.Y)) {
            return 12;
        }
        if(this.j(s, d0.h0)) {
            return 5;
        }
        if(this.j(s, d0.f0)) {
            return 4;
        }
        if(this.j(s, d0.j0)) {
            return 6;
        }
        if(this.j(s, d0.n0)) {
            return 7;
        }
        if(this.j(s, d0.l0)) {
            return 8;
        }
        if(this.j(s, d0.p0)) {
            return 9;
        }
        if(this.j(s, d0.r0)) {
            return 10;
        }
        if(this.j(s, d0.v0)) {
            return 11;
        }
        if(this.j(s, d0.b0)) {
            if(d0.T0) {
                return 3;
            }
            return this.j(s, d0.d0) ? 3 : 1;
        }
        return d0.T0 || !this.j(s, d0.d0) ? 12 : 2;
    }

    public final boolean j(String s, m8.f f0) {
        return f0.Z.size() <= 0 || f0.Z.contains(s.length()) ? this.c.F(s, f0) : false;
    }

    public final boolean k(Phonenumber.PhoneNumber phonenumber$PhoneNumber0) {
        int v = phonenumber$PhoneNumber0.Y;
        List list0 = (List)this.b.get(v);
        String s = null;
        if(list0 == null) {
            b.h.log(Level.INFO, J.d(v, "Missing/invalid country_code (", ")"));
        }
        else if(list0.size() == 1) {
            s = (String)list0.get(0);
        }
        else {
            String s1 = b.g(phonenumber$PhoneNumber0);
            for(Object object0: list0) {
                String s2 = (String)object0;
                d d0 = this.e(s2);
                if(!d0.X0) {
                    if(this.i(s1, d0) != 12) {
                        s = s2;
                        break;
                    }
                    goto label_21;
                }
                else if(this.e.v(d0.Y0).matcher(s1).lookingAt()) {
                }
                else {
                    continue;
                }
                s = s2;
                break;
            label_21:
                if(false) {
                    break;
                }
            }
        }
        int v1 = phonenumber$PhoneNumber0.Y;
        d d1 = this.f(v1, s);
        if(d1 != null) {
            if(!"001".equals(s)) {
                d d2 = this.e(s);
                if(d2 == null) {
                    throw new IllegalArgumentException("Invalid region code: " + s);
                }
                return v1 == d2.H0 ? this.i(b.g(phonenumber$PhoneNumber0), d1) != 12 : false;
            }
            return this.i(b.g(phonenumber$PhoneNumber0), d1) != 12;
        }
        return false;
    }

    public final int l(CharSequence charSequence0, d d0, StringBuilder stringBuilder0, Phonenumber.PhoneNumber phonenumber$PhoneNumber0) {
        int v = 0;
        if(charSequence0.length() == 0) {
            return 0;
        }
        StringBuilder stringBuilder1 = new StringBuilder(charSequence0);
        String s = d0 == null ? "NonMatch" : d0.I0;
        if(stringBuilder1.length() != 0) {
            Matcher matcher0 = b.k.matcher(stringBuilder1);
            if(matcher0.lookingAt()) {
                stringBuilder1.delete(0, matcher0.end());
                b.n(stringBuilder1);
                goto label_20;
            }
            Pattern pattern0 = this.e.v(s);
            b.n(stringBuilder1);
            Matcher matcher1 = pattern0.matcher(stringBuilder1);
            if(matcher1.lookingAt()) {
                int v1 = matcher1.end();
                String s1 = stringBuilder1.substring(v1);
                Matcher matcher2 = b.m.matcher(s1);
                if(!matcher2.find() || !b.o(matcher2.group(1)).equals("0")) {
                    stringBuilder1.delete(0, v1);
                label_20:
                    if(stringBuilder1.length() <= 2) {
                        throw new m8.a(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
                    }
                    if(stringBuilder1.length() != 0 && stringBuilder1.charAt(0) != 0x30) {
                        int v2 = stringBuilder1.length();
                        for(int v3 = 1; v3 <= 3 && v3 <= v2; ++v3) {
                            int v4 = Integer.parseInt(stringBuilder1.substring(0, v3));
                            if(this.b.containsKey(v4)) {
                                stringBuilder0.append(stringBuilder1.substring(v3));
                                v = v4;
                                break;
                            }
                        }
                    }
                    if(v == 0) {
                        throw new m8.a(1, "Country calling code supplied was not recognised.");
                    }
                    phonenumber$PhoneNumber0.X = true;
                    phonenumber$PhoneNumber0.Y = v;
                    return v;
                }
            }
        }
        if(d0 != null) {
            int v5 = d0.H0;
            String s2 = String.valueOf(v5);
            String s3 = stringBuilder1.toString();
            if(s3.startsWith(s2)) {
                StringBuilder stringBuilder2 = new StringBuilder(s3.substring(s2.length()));
                m8.f f0 = d0.Y;
                this.m(stringBuilder2, d0, null);
                if(!this.c.F(stringBuilder1, f0) && this.c.F(stringBuilder2, f0) || b.t(stringBuilder1, d0, 12) == 6) {
                    stringBuilder0.append(stringBuilder2);
                    phonenumber$PhoneNumber0.X = true;
                    phonenumber$PhoneNumber0.Y = v5;
                    return v5;
                }
            }
        }
        phonenumber$PhoneNumber0.X = true;
        phonenumber$PhoneNumber0.Y = 0;
        return 0;
    }

    public final void m(StringBuilder stringBuilder0, d d0, StringBuilder stringBuilder1) {
        int v = stringBuilder0.length();
        String s = d0.Q0;
        if(v != 0 && s.length() != 0) {
            Matcher matcher0 = this.e.v(s).matcher(stringBuilder0);
            if(matcher0.lookingAt()) {
                m8.f f0 = d0.Y;
                s s1 = this.c;
                boolean z = s1.F(stringBuilder0, f0);
                int v1 = matcher0.groupCount();
                String s2 = d0.S0;
                if(s2 != null && s2.length() != 0 && matcher0.group(v1) != null) {
                    StringBuilder stringBuilder2 = new StringBuilder(stringBuilder0);
                    stringBuilder2.replace(0, v, matcher0.replaceFirst(s2));
                    if(z && !s1.F(stringBuilder2.toString(), f0)) {
                        return;
                    }
                    if(stringBuilder1 != null && v1 > 1) {
                        stringBuilder1.append(matcher0.group(1));
                    }
                    stringBuilder0.replace(0, stringBuilder0.length(), stringBuilder2.toString());
                    return;
                }
                if(z && !s1.F(stringBuilder0.substring(matcher0.end()), f0)) {
                    return;
                }
                if(stringBuilder1 != null && v1 > 0 && matcher0.group(v1) != null) {
                    stringBuilder1.append(matcher0.group(1));
                }
                stringBuilder0.delete(0, matcher0.end());
            }
        }
    }

    public static void n(StringBuilder stringBuilder0) {
        if(b.q.matcher(stringBuilder0).matches()) {
            int v = stringBuilder0.length();
            StringBuilder stringBuilder1 = new StringBuilder(stringBuilder0.length());
            for(int v1 = 0; v1 < stringBuilder0.length(); ++v1) {
                Character character0 = Character.valueOf(Character.toUpperCase(stringBuilder0.charAt(v1)));
                Character character1 = (Character)b.j.get(character0);
                if(character1 != null) {
                    stringBuilder1.append(character1);
                }
            }
            stringBuilder0.replace(0, v, stringBuilder1.toString());
            return;
        }
        stringBuilder0.replace(0, stringBuilder0.length(), b.o(stringBuilder0));
    }

    public static String o(CharSequence charSequence0) {
        StringBuilder stringBuilder0 = new StringBuilder(charSequence0.length());
        for(int v = 0; v < charSequence0.length(); ++v) {
            int v1 = Character.digit(charSequence0.charAt(v), 10);
            if(v1 != -1) {
                stringBuilder0.append(v1);
            }
        }
        return stringBuilder0.toString();
    }

    public final Phonenumber.PhoneNumber p(String s, String s1) {
        Phonenumber.PhoneNumber phonenumber$PhoneNumber0 = new Phonenumber.PhoneNumber();  // initializer: Ljava/lang/Object;-><init>()V
        phonenumber$PhoneNumber0.Y = 0;
        phonenumber$PhoneNumber0.Z = 0L;
        phonenumber$PhoneNumber0.c0 = "";
        phonenumber$PhoneNumber0.e0 = false;
        phonenumber$PhoneNumber0.g0 = 1;
        phonenumber$PhoneNumber0.h0 = "";
        phonenumber$PhoneNumber0.j0 = "";
        phonenumber$PhoneNumber0.i0 = 5;
        this.q(s, s1, phonenumber$PhoneNumber0);
        return phonenumber$PhoneNumber0;
    }

    public final void q(String s, String s1, Phonenumber.PhoneNumber phonenumber$PhoneNumber0) {
        int v6;
        CharSequence charSequence0;
        String s4;
        if(s == null) {
            throw new m8.a(2, "The phone number supplied was null.");
        }
        if(s.length() > 0xFA) {
            throw new m8.a(5, "The string supplied was too long to parse.");
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        String s2 = s.toString();
        int v = s2.indexOf(";phone-context=");
        String s3 = "";
        if(v == -1) {
            s4 = null;
        }
        else if(v + 15 >= s2.length()) {
            s4 = "";
        }
        else {
            int v1 = s2.indexOf(59, v + 15);
            s4 = v1 == -1 ? s2.substring(v + 15) : s2.substring(v + 15, v1);
        }
        if(s4 != null && (s4.length() == 0 || !b.r.matcher(s4).matches() && !b.s.matcher(s4).matches())) {
            throw new m8.a(2, "The phone-context value is invalid.");
        }
        if(s4 == null) {
            Matcher matcher0 = b.n.matcher(s2);
            if(matcher0.find()) {
                charSequence0 = s2.subSequence(matcher0.start(), s2.length());
                Matcher matcher1 = b.p.matcher(charSequence0);
                if(matcher1.find()) {
                    charSequence0 = charSequence0.subSequence(0, matcher1.start());
                }
                Matcher matcher2 = b.o.matcher(charSequence0);
                if(matcher2.find()) {
                    charSequence0 = charSequence0.subSequence(0, matcher2.start());
                }
            }
            else {
                charSequence0 = "";
            }
            stringBuilder0.append(charSequence0);
        }
        else {
            if(s4.charAt(0) == 43) {
                stringBuilder0.append(s4);
            }
            int v2 = s2.indexOf("tel:");
            stringBuilder0.append(s2.substring((v2 < 0 ? 0 : v2 + 4), v));
        }
        int v3 = stringBuilder0.indexOf(";isub=");
        if(v3 > 0) {
            stringBuilder0.delete(v3, stringBuilder0.length());
        }
        Pattern pattern0 = b.u;
        if(!(stringBuilder0.length() >= 2 ? pattern0.matcher(stringBuilder0).matches() : false)) {
            throw new m8.a(2, "The string supplied did not seem to be a phone number.");
        }
        boolean z = s1 != null && this.f.contains(s1);
        Pattern pattern1 = b.k;
        if(!z && (stringBuilder0.length() == 0 || !pattern1.matcher(stringBuilder0).lookingAt())) {
            throw new m8.a(1, "Missing or invalid default region.");
        }
        Matcher matcher3 = b.t.matcher(stringBuilder0);
        if(matcher3.find()) {
            String s5 = stringBuilder0.substring(0, matcher3.start());
            if((s5.length() >= 2 ? pattern0.matcher(s5).matches() : false)) {
                int v4 = matcher3.groupCount();
                for(int v5 = 1; v5 <= v4; ++v5) {
                    if(matcher3.group(v5) != null) {
                        s3 = matcher3.group(v5);
                        stringBuilder0.delete(matcher3.start(), stringBuilder0.length());
                        break;
                    }
                }
            }
        }
        if(s3.length() > 0) {
            phonenumber$PhoneNumber0.b0 = true;
            phonenumber$PhoneNumber0.c0 = s3;
        }
        d d0 = this.e(s1);
        StringBuilder stringBuilder1 = new StringBuilder();
        try {
            v6 = this.l(stringBuilder0, d0, stringBuilder1, phonenumber$PhoneNumber0);
        }
        catch(m8.a a0) {
            Matcher matcher4 = pattern1.matcher(stringBuilder0);
            int v7 = a0.X;
            if(v7 != 1 || !matcher4.lookingAt()) {
                throw new m8.a(v7, a0.getMessage());
            }
            v6 = this.l(stringBuilder0.substring(matcher4.end()), d0, stringBuilder1, phonenumber$PhoneNumber0);
            if(v6 == 0) {
                throw new m8.a(1, "Could not interpret numbers after plus-sign.");
            }
        }
        if(v6 == 0) {
            b.n(stringBuilder0);
            stringBuilder1.append(stringBuilder0);
            if(s1 != null) {
                phonenumber$PhoneNumber0.X = true;
                phonenumber$PhoneNumber0.Y = d0.H0;
            }
        }
        else {
            List list0 = (List)this.b.get(v6);
            String s6 = list0 == null ? "ZZ" : ((String)list0.get(0));
            if(!s6.equals(s1)) {
                d0 = this.f(v6, s6);
            }
        }
        if(stringBuilder1.length() < 2) {
            throw new m8.a(4, "The string supplied is too short to be a phone number.");
        }
        if(d0 != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            StringBuilder stringBuilder3 = new StringBuilder(stringBuilder1);
            this.m(stringBuilder3, d0, stringBuilder2);
            switch(b.t(stringBuilder3, d0, 12)) {
                case 2: 
                case 4: 
                case 5: {
                    break;
                }
                default: {
                    stringBuilder1 = stringBuilder3;
                }
            }
        }
        int v8 = stringBuilder1.length();
        if(v8 < 2) {
            throw new m8.a(4, "The string supplied is too short to be a phone number.");
        }
        if(v8 > 17) {
            throw new m8.a(5, "The string supplied is too long to be a phone number.");
        }
        if(stringBuilder1.length() > 1 && stringBuilder1.charAt(0) == 0x30) {
            phonenumber$PhoneNumber0.d0 = true;
            phonenumber$PhoneNumber0.e0 = true;
            int v9;
            for(v9 = 1; v9 < stringBuilder1.length() - 1 && stringBuilder1.charAt(v9) == 0x30; ++v9) {
            }
            if(v9 != 1) {
                phonenumber$PhoneNumber0.f0 = true;
                phonenumber$PhoneNumber0.g0 = v9;
            }
        }
        phonenumber$PhoneNumber0.Z = Long.parseLong(stringBuilder1.toString());
    }

    public static void r(int v, int v1, StringBuilder stringBuilder0) {
        switch(v.h.d(v1)) {
            case 0: {
                stringBuilder0.insert(0, v).insert(0, '+');
                return;
            }
            case 1: {
                stringBuilder0.insert(0, " ").insert(0, v).insert(0, '+');
                return;
            }
            case 3: {
                stringBuilder0.insert(0, "-").insert(0, v).insert(0, '+').insert(0, "tel:");
            }
        }
    }

    public static void s(b b0) {
        synchronized(b.class) {
            b.w = b0;
        }
    }

    public static int t(StringBuilder stringBuilder0, d d0, int v) {
        m8.f f0 = b.h(d0, v);
        ArrayList arrayList0 = f0.Z.isEmpty() ? d0.Y.Z : f0.Z;
        ArrayList arrayList1 = f0.b0;
        if(v == 3) {
            m8.f f1 = b.h(d0, 1);
            if(f1.Z.size() == 1 && ((int)(((Integer)f1.Z.get(0)))) == -1) {
                return b.t(stringBuilder0, d0, 2);
            }
            m8.f f2 = b.h(d0, 2);
            if(f2.Z.size() != 1 || ((int)(((Integer)f2.Z.get(0)))) != -1) {
                ArrayList arrayList2 = new ArrayList(arrayList0);
                arrayList2.addAll((f2.Z.size() == 0 ? d0.Y.Z : f2.Z));
                Collections.sort(arrayList2);
                ArrayList arrayList3 = f2.b0;
                if(arrayList1.isEmpty()) {
                    arrayList1 = arrayList3;
                }
                else {
                    ArrayList arrayList4 = new ArrayList(arrayList1);
                    arrayList4.addAll(arrayList3);
                    Collections.sort(arrayList4);
                    arrayList1 = arrayList4;
                }
                arrayList0 = arrayList2;
            }
        }
        if(((int)(((Integer)arrayList0.get(0)))) == -1) {
            return 5;
        }
        int v1 = stringBuilder0.length();
        if(arrayList1.contains(v1)) {
            return 2;
        }
        int v2 = (int)(((Integer)arrayList0.get(0)));
        if(v2 == v1) {
            return 1;
        }
        if(v2 > v1) {
            return 4;
        }
        if(((int)(((Integer)arrayList0.get(arrayList0.size() - 1)))) < v1) {
            return 6;
        }
        return arrayList0.subList(1, arrayList0.size()).contains(v1) ? 1 : 5;
    }
}

