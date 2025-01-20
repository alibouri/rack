package f9;

import Ea.E0;
import M6.b;
import Nb.j;
import Nb.p;
import Nb.x;
import R9.b1;
import Tb.e;
import Vb.q;
import ac.B0;
import ac.e0;
import ac.h;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.SubViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.WatchedProperty;
import com.sendwave.backend.type.Currency;
import com.sendwave.models.CurrencyAmount;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import q9.M0;
import q9.o0;
import v7.d;

public final class a extends SubViewModel {
    public final WatchedProperty Y;
    public final WatchedProperty Z;
    public final B0 b0;
    public final B0 c0;
    public final e0 d0;
    public final B0 e0;
    public static final d f0;
    public static final e[] g0;

    static {
        p p0 = new p(a.class, "wFormatter", "getWFormatter()Ljava/text/DecimalFormat;", 0);
        x.a.getClass();
        a.g0 = new e[]{p0, new p(a.class, "wCurrency", "getWCurrency()Lcom/sendwave/backend/type/Currency;", 0)};
        a.f0 = new d(19);
    }

    public a(ViewModel viewModel0, h h0) {
        this(viewModel0, h0, o0.a(null));
    }

    public a(ViewModel viewModel0, h h0, h h1) {
        j.f(viewModel0, "parent");
        j.f(h1, "customFormatter");
        super(viewModel0);
        this.Y = FlowWatcherKt.b(new e0(h0, h1, new E0(this, null, 1), 0)).a(this, a.g0[0]);
        this.Z = FlowWatcherKt.b(h0).a(this, a.g0[1]);
        this.b0 = ac.o0.c("");
        B0 b00 = ac.o0.c(BigDecimal.ZERO);
        this.c0 = b00;
        this.d0 = new e0(h0, b00, new b1(3, null, 1), 0);
        this.e0 = ac.o0.c(0);
    }

    public static DecimalFormat c(Currency currency0, DecimalFormat decimalFormat0) {
        if(decimalFormat0 == null) {
            decimalFormat0 = M0.d(currency0);
        }
        Object object0 = decimalFormat0.clone();
        j.d(object0, "null cannot be cast to non-null type java.text.DecimalFormat");
        ((DecimalFormat)object0).setParseBigDecimal(true);
        ((DecimalFormat)object0).setNegativePrefix("-");
        ((DecimalFormat)object0).setNegativeSuffix("");
        ((DecimalFormat)object0).setPositivePrefix("");
        ((DecimalFormat)object0).setPositiveSuffix("");
        return (DecimalFormat)object0;
    }

    public final Currency d() {
        return (Currency)this.Z.a(a.g0[1], this);
    }

    public final void e(int v, int v1, String s, String s1) {
        BigDecimal bigDecimal0;
        j.f(s, "newText");
        j.f(s1, "oldText");
        DecimalFormat decimalFormat0 = (DecimalFormat)this.Y.a(a.g0[0], this);
        if(decimalFormat0 == null) {
            NumberFormat numberFormat0 = NumberFormat.getInstance();
            j.d(numberFormat0, "null cannot be cast to non-null type java.text.DecimalFormat");
            decimalFormat0 = (DecimalFormat)numberFormat0;
            decimalFormat0.setParseBigDecimal(true);
        }
        int v2 = decimalFormat0.getDecimalFormatSymbols().getGroupingSeparator();
        String s2 = "";
        String s3 = q.M(Vb.j.l0(s1, v, v1, s).toString(), String.valueOf(((char)v2)), "");
        try {
            Number number0 = decimalFormat0.parse(s3);
            j.d(number0, "null cannot be cast to non-null type java.math.BigDecimal");
            bigDecimal0 = (BigDecimal)number0;
        }
        catch(ParseException unused_ex) {
            bigDecimal0 = BigDecimal.ZERO;
        }
        this.c0.k(bigDecimal0);
        if(!s3.equals("")) {
            String s4 = decimalFormat0.format(bigDecimal0);
            j.e(s4, "format(...)");
            s2 = q.M(s4, " ", " ");
        }
        String s5 = s1.substring(Math.max(0, 0), Math.min(v, s1.length()));
        j.e(s5, "substring(...)");
        int v3 = b.r(s5, ((char)v2));
        String s6 = s2.substring(Math.max(0, 0), Math.min(s.length() + v, s2.length()));
        j.e(s6, "substring(...)");
        int v4 = b.r(s6, ((char)v2));
        this.b0.getClass();
        this.b0.l(null, s2);
        this.e0.getClass();
        this.e0.l(null, Math.min(s.length() + v + (v4 - v3), s2.length()));
    }

    public static void g(a a0, BigDecimal bigDecimal0) {
        a0.getClass();
        j.f(bigDecimal0, "amount");
        DecimalFormat decimalFormat0 = (DecimalFormat)a0.Y.a(a.g0[0], a0);
        if(decimalFormat0 == null) {
            NumberFormat numberFormat0 = NumberFormat.getInstance();
            j.d(numberFormat0, "null cannot be cast to non-null type java.text.DecimalFormat");
            decimalFormat0 = (DecimalFormat)numberFormat0;
        }
        a0.c0.getClass();
        a0.c0.l(null, bigDecimal0);
        String s = decimalFormat0.format(bigDecimal0);
        j.e(s, "format(...)");
        String s1 = q.M(s, " ", " ");
        a0.b0.getClass();
        a0.b0.l(null, s1);
        a0.e0.getClass();
        a0.e0.l(null, 0);
    }

    public final void i(CurrencyAmount currencyAmount0) {
        DecimalFormat decimalFormat0 = (DecimalFormat)this.Y.a(a.g0[0], this);
        Currency currency0 = currencyAmount0.X;
        if(decimalFormat0 == null) {
            j.e(currency0, "currency");
            decimalFormat0 = a.c(currency0, null);
        }
        this.c0.k(currencyAmount0.Y);
        String s = decimalFormat0.format(currencyAmount0.Y);
        String s1 = currency0.a();
        this.b0.k(s + " " + s1);
    }
}

