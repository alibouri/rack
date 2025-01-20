package U2;

import I2.A;
import M6.b;
import Nb.j;
import P4.c;
import R2.g;
import R2.h;
import R2.k;
import R2.p;
import R2.w;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import q2.C;

public abstract class m {
    public static final String a;

    static {
        String s = A.g("DiagnosticsWrkr");
        j.e(s, "tagWithPrefix(\"DiagnosticsWrkr\")");
        m.a = s;
    }

    public static final String a(k k0, w w0, h h0, ArrayList arrayList0) {
        ArrayList arrayList1;
        String s3;
        StringBuilder stringBuilder0 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for(Object object0: arrayList0) {
            g g0 = h0.c(J2.w.D(((p)object0)));
            Integer integer0 = g0 == null ? null : ((int)g0.c);
            k0.getClass();
            C c0 = b.o(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String s = ((p)object0).a;
            c0.c(1, s);
            WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)k0.Y;
            workDatabase_Impl0.b();
            Cursor cursor0 = c.O(workDatabase_Impl0, c0, false);
            try {
                arrayList1 = new ArrayList(cursor0.getCount());
                while(cursor0.moveToNext()) {
                    arrayList1.add(cursor0.getString(0));
                }
            }
            finally {
                cursor0.close();
                c0.f();
            }
            String s1 = Bb.p.v0(arrayList1, ",", null, null, null, 62);
            String s2 = Bb.p.v0(w0.t(s), ",", null, null, null, 62);
            StringBuilder stringBuilder1 = com.apollographql.apollo.api.b.s("\n", s, "\t ");
            stringBuilder1.append(((p)object0).c);
            stringBuilder1.append("\t ");
            stringBuilder1.append(integer0);
            stringBuilder1.append("\t ");
            switch(((p)object0).b) {
                case 1: {
                    s3 = "ENQUEUED";
                    break;
                }
                case 2: {
                    s3 = "RUNNING";
                    break;
                }
                case 3: {
                    s3 = "SUCCEEDED";
                    break;
                }
                case 4: {
                    s3 = "FAILED";
                    break;
                }
                case 5: {
                    s3 = "BLOCKED";
                    break;
                }
                case 6: {
                    s3 = "CANCELLED";
                    break;
                }
                default: {
                    throw null;
                }
            }
            stringBuilder1.append(s3);
            stringBuilder1.append("\t ");
            stringBuilder1.append(s1);
            stringBuilder1.append("\t ");
            stringBuilder1.append(s2);
            stringBuilder1.append('\t');
            stringBuilder0.append(stringBuilder1.toString());
        }
        String s4 = stringBuilder0.toString();
        j.e(s4, "StringBuilder().apply(builderAction).toString()");
        return s4;
    }
}

