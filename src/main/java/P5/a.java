package p5;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import o5.c;
import r5.j;

public final class a implements j {
    public final String a;
    public final String b;
    public static final String c;
    public static final Set d;
    public static final a e;
    public static final a f;

    static {
        String s = N4.j.z("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        a.c = s;
        String s1 = N4.j.z("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String s2 = N4.j.z("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        a.d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c[]{new c("proto"), new c("json")})));
        a.e = new a(s, null);
        a.f = new a(s1, s2);
    }

    public a(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    public static a a(byte[] arr_b) {
        String s = new String(arr_b, Charset.forName("UTF-8"));
        if(!s.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] arr_s = s.substring(2).split(Pattern.quote("\\"), 2);
        if(arr_s.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String s1 = arr_s[0];
        if(s1.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String s2 = arr_s[1];
        if(s2.isEmpty()) {
            s2 = null;
        }
        return new a(s1, s2);
    }
}

