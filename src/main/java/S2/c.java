package S2;

import R2.d;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

public final class c implements Callable {
    public final B3.c a;
    public final int b;

    public c(B3.c c0, int v) {
        this.a = c0;
        this.b = v;
    }

    @Override
    public final Object call() {
        B3.c c0 = this.a;
        WorkDatabase workDatabase0 = (WorkDatabase)c0.Y;
        Long long0 = workDatabase0.t().g("next_job_scheduler_id");
        int v = long0 == null ? 0 : ((int)(((long)long0)));
        workDatabase0.t().h(new d("next_job_scheduler_id", ((long)(v == 0x7FFFFFFF ? 0 : v + 1))));
        if(v >= 0 && v <= this.b) {
            return v;
        }
        ((WorkDatabase)c0.Y).t().h(new d("next_job_scheduler_id", 1L));
        return 0;
    }
}

