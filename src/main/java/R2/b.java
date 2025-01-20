package R2;

import Ab.e;
import M.J;
import q2.k;
import q2.v;
import v.h;
import x2.g;

public final class b extends k {
    public final int d;

    public b(v v0, int v1) {
        this.d = v1;
        super(v0);
    }

    @Override  // q2.E
    public final String b() {
        switch(this.d) {
            case 0: {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }
            case 1: {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }
            case 2: {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }
            case 3: {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }
            case 4: {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }
            case 5: {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            case 6: {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }
            default: {
                return "INSERT OR REPLACE INTO `agent_location` (`agent_id`,`principalMobile`,`principalName`,`agentCity`,`agentSubcity`) VALUES (?,?,?,?,?)";
            }
        }
    }

    @Override  // q2.k
    public final void d(g g0, Object object0) {
        int v2;
        int v = 1;
        switch(this.d) {
            case 0: {
                g0.c(1, ((a)object0).a);
                g0.c(2, ((a)object0).b);
                return;
            }
            case 1: {
                g0.c(1, ((d)object0).a);
                g0.H(2, ((long)((d)object0).b));
                return;
            }
            case 2: {
                g0.c(1, ((R2.g)object0).a);
                g0.H(2, ((long)((R2.g)object0).b));
                g0.H(3, ((long)((R2.g)object0).c));
                return;
            }
            case 3: {
                g0.c(1, ((j)object0).a);
                g0.c(2, ((j)object0).b);
                return;
            }
            case 4: {
                g0.c(1, ((l)object0).a);
                g0.P(2, yc.d.H(((l)object0).b));
                return;
            }
            case 5: {
                g0.c(1, ((p)object0).a);
                g0.H(2, ((long)M6.b.R(((p)object0).b)));
                g0.c(3, ((p)object0).c);
                g0.c(4, ((p)object0).d);
                g0.P(5, yc.d.H(((p)object0).e));
                g0.P(6, yc.d.H(((p)object0).f));
                g0.H(7, ((p)object0).g);
                g0.H(8, ((p)object0).h);
                g0.H(9, ((p)object0).i);
                g0.H(10, ((long)((p)object0).k));
                int v1 = ((p)object0).l;
                J.l(v1, "backoffPolicy");
                switch(h.d(v1)) {
                    case 0: {
                        v2 = 0;
                        break;
                    }
                    case 1: {
                        v2 = 1;
                        break;
                    }
                    default: {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
                g0.H(11, ((long)v2));
                g0.H(12, ((p)object0).m);
                g0.H(13, ((p)object0).n);
                g0.H(14, ((p)object0).o);
                g0.H(15, ((p)object0).p);
                g0.H(16, ((long)((p)object0).q));
                int v3 = ((p)object0).r;
                J.l(v3, "policy");
                int v4 = h.d(v3);
                if(v4 == 0) {
                    v = 0;
                }
                else if(v4 != 1) {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                g0.H(17, ((long)v));
                g0.H(18, ((long)((p)object0).s));
                g0.H(19, ((long)((p)object0).t));
                g0.H(20, ((p)object0).u);
                g0.H(21, ((long)((p)object0).v));
                g0.H(22, ((long)((p)object0).w));
                String s = ((p)object0).x;
                if(s == null) {
                    g0.s(23);
                }
                else {
                    g0.c(23, s);
                }
                I2.g g1 = ((p)object0).j;
                g0.H(24, ((long)M6.b.O(g1.a)));
                g0.P(25, M6.b.y(g1.b));
                g0.H(26, ((long)g1.c));
                g0.H(27, ((long)g1.d));
                g0.H(28, ((long)g1.e));
                g0.H(29, ((long)g1.f));
                g0.H(30, g1.g);
                g0.H(0x1F, g1.h);
                g0.P(0x20, M6.b.Q(g1.i));
                return;
            }
            case 6: {
                g0.c(1, ((R2.v)object0).a);
                g0.c(2, ((R2.v)object0).b);
                return;
            }
            default: {
                Nb.j.f(g0, "statement");
                Nb.j.f(((q9.j)object0), "entity");
                g0.c(1, ((q9.j)object0).a);
                g0.c(2, ((q9.j)object0).b);
                g0.c(3, ((q9.j)object0).c);
                g0.c(4, ((q9.j)object0).d);
                g0.c(5, ((q9.j)object0).e);
            }
        }
    }
}

