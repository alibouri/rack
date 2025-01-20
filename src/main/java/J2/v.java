package J2;

import Bb.q;
import I2.A;
import I2.b;
import K2.c;
import M2.d;
import Mb.g;
import Nb.h;
import Nb.j;
import P2.m;
import S2.f;
import T2.a;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

public final class v extends h implements g {
    public static final v g0;

    static {
        v.g0 = new v(6, w.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);  // initializer: LNb/h;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // Mb.g
    public final Object f(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        j.f(((Context)object0), "p0");
        j.f(((b)object1), "p1");
        j.f(((a)object2), "p2");
        j.f(((WorkDatabase)object3), "p3");
        j.f(((m)object4), "p4");
        d d0 = new d(((Context)object0), ((WorkDatabase)object3), ((b)object1));
        f.a(((Context)object0), SystemJobService.class, true);
        A.e().a(J2.j.a, "Created SystemJobScheduler and enabled SystemJobService");
        return q.L(new J2.g[]{d0, new c(((Context)object0), ((b)object1), ((m)object4), ((e)object5), new K.v(((e)object5), ((a)object2)), ((a)object2))});
    }
}

