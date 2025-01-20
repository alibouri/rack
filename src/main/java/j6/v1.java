package j6;

import N5.r;
import com.google.android.gms.internal.measurement.c2;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.y0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import v.h;

public final class v1 {
    public Boolean a;
    public Boolean b;
    public Long c;
    public Long d;
    public final int e;
    public c2 f;

    public v1(int v) {
        this.e = v;
        super();
    }

    public static Boolean a(long v, v0 v00) {
        try {
            return v1.d(new BigDecimal(v), v00, 0.0);
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    public static Boolean b(Boolean boolean0, boolean z) {
        if(boolean0 == null) {
            return null;
        }
        return boolean0.booleanValue() == z ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }

    public static Boolean c(String s, y0 y00, L l0) {
        List list0;
        r.j(y00);
        if(s == null) {
            return null;
        }
        if(y00.w() && y00.p() != 1) {
            if(y00.p() == 7) {
                if(y00.o() == 0) {
                    return null;
                }
            }
            else if(!y00.v()) {
                return null;
            }
            int v = y00.p();
            boolean z = y00.t();
            String s1 = z || (v == 2 || v == 7) ? y00.r() : y00.r().toUpperCase(Locale.ENGLISH);
            if(y00.o() == 0) {
                list0 = null;
            }
            else {
                list0 = y00.s();
                if(!z) {
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    for(Object object0: list0) {
                        arrayList0.add(((String)object0).toUpperCase(Locale.ENGLISH));
                    }
                    list0 = Collections.unmodifiableList(arrayList0);
                }
            }
            String s2 = v == 2 ? s1 : null;
            if(v == 7) {
                if(list0 != null && !list0.isEmpty()) {
                    goto label_29;
                }
                return null;
            }
            else if(s1 != null) {
            label_29:
                if(!z && v != 2) {
                    s = s.toUpperCase(Locale.ENGLISH);
                }
                switch(u1.a[h.d(v)]) {
                    case 1: {
                        if(s2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(s2, (z ? 0 : 66)).matcher(s).matches());
                            }
                            catch(PatternSyntaxException unused_ex) {
                                l0.h0.b(s2, "Invalid regular expression in REGEXP audience filter. expression");
                            }
                        }
                        break;
                    }
                    case 2: {
                        return Boolean.valueOf(s.startsWith(s1));
                    }
                    case 3: {
                        return Boolean.valueOf(s.endsWith(s1));
                    }
                    case 4: {
                        return Boolean.valueOf(s.contains(s1));
                    }
                    case 5: {
                        return Boolean.valueOf(s.equals(s1));
                    }
                    case 6: {
                        return list0 == null ? null : Boolean.valueOf(list0.contains(s));
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public static Boolean d(BigDecimal bigDecimal0, v0 v00, double f) {
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal1;
        boolean z = true;
        r.j(v00);
        if(v00.u() && v00.o() != 1) {
            if(v00.o() == 5) {
                if(!v00.y() || !v00.x()) {
                    return null;
                }
            }
            else if(!v00.v()) {
                return null;
            }
            int v = v00.o();
            if(v00.o() == 5) {
                if(O.c0(v00.s()) && O.c0(v00.r())) {
                    try {
                        bigDecimal1 = new BigDecimal(v00.r());
                        bigDecimal2 = new BigDecimal(v00.s());
                        bigDecimal3 = null;
                        goto label_21;
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                }
                return null;
            }
            else {
                if(!O.c0(v00.q())) {
                    return null;
                }
                try {
                    bigDecimal3 = new BigDecimal(v00.q());
                    bigDecimal2 = null;
                    bigDecimal1 = null;
                }
                catch(NumberFormatException unused_ex) {
                    return null;
                }
            }
        label_21:
            if(v == 5) {
                if(bigDecimal2 != null) {
                    goto label_25;
                }
                return null;
            }
            else if(bigDecimal3 != null) {
            label_25:
                switch(u1.b[h.d(v)]) {
                    case 1: {
                        if(bigDecimal3 != null) {
                            if(bigDecimal0.compareTo(bigDecimal3) >= 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                        break;
                    }
                    case 2: {
                        if(bigDecimal3 != null) {
                            if(bigDecimal0.compareTo(bigDecimal3) <= 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                        break;
                    }
                    case 3: {
                        if(bigDecimal3 != null) {
                            if(f != 0.0) {
                                if(bigDecimal0.compareTo(bigDecimal3.subtract(new BigDecimal(f).multiply(new BigDecimal(2)))) <= 0 || bigDecimal0.compareTo(bigDecimal3.add(new BigDecimal(f).multiply(new BigDecimal(2)))) >= 0) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                            if(bigDecimal0.compareTo(bigDecimal3) != 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                        break;
                    }
                    case 4: {
                        if(bigDecimal2 == null) {
                            return null;
                        }
                        if(bigDecimal0.compareTo(bigDecimal2) < 0 || bigDecimal0.compareTo(bigDecimal1) > 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
        return null;
    }
}

