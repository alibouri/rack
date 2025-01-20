package d5;

import Bb.p;
import F0.A;
import I2.J;
import a5.v;
import a5.w;
import f5.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

public abstract class c {
    public static final AtomicBoolean a;

    static {
        c.a = new AtomicBoolean(false);
    }

    public static final void a() {
        File[] arr_file;
        Class class0 = c.class;
        if(a.b(class0)) {
            return;
        }
        try {
            if(w.N()) {
                return;
            }
            File file0 = J2.w.I();
            if(file0 == null) {
                arr_file = new File[0];
            }
            else {
                arr_file = file0.listFiles(new v(2));
                if(arr_file == null) {
                    arr_file = new File[0];
                }
            }
            ArrayList arrayList0 = new ArrayList(arr_file.length);
            for(int v = 0; v < arr_file.length; ++v) {
                arrayList0.add(J.I(arr_file[v]));
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                if(((c5.c)object0).a()) {
                    arrayList1.add(object0);
                }
            }
            List list0 = p.K0(arrayList1, new A(5));
            JSONArray jSONArray0 = new JSONArray();
            Sb.c c0 = J.R(0, Math.min(list0.size(), 5)).a();
            while(c0.Z) {
                jSONArray0.put(list0.get(c0.a()));
            }
            J2.w.R("anr_reports", jSONArray0, new b(0, list0));
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
    }
}

