package J2;

import J8.j;
import N5.A;
import P4.c;
import T4.l;
import androidx.work.impl.WorkDatabase_Impl;
import com.sendwave.util.AgentLocationDatabase_Impl;
import com.wave.customer.transactions.persistence.TransactionHistoryDatabase_Impl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import q2.v;
import u2.d;
import u2.e;
import x2.b;

public final class t extends j {
    public final int b;
    public final v c;

    public t(WorkDatabase_Impl workDatabase_Impl0) {
        this.b = 0;
        this.c = workDatabase_Impl0;
        super(23);
    }

    public t(AgentLocationDatabase_Impl agentLocationDatabase_Impl0) {
        this.b = 2;
        this.c = agentLocationDatabase_Impl0;
        super(2);
    }

    public t(TransactionHistoryDatabase_Impl transactionHistoryDatabase_Impl0) {
        this.b = 1;
        this.c = transactionHistoryDatabase_Impl0;
        super(5);
    }

    @Override  // J8.j
    public final void a(b b0) {
        switch(this.b) {
            case 0: {
                b0.l("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                b0.l("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                b0.l("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                b0.l("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x\'\', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                b0.l("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                b0.l("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                b0.l("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                b0.l("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                b0.l("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                b0.l("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                b0.l("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                b0.l("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                b0.l("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                b0.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                b0.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'86254750241babac4b8d52996a675549\')");
                return;
            }
            case 1: {
                b0.l("CREATE TABLE IF NOT EXISTS `history_entries` (`id` TEXT NOT NULL, `cursor_id` TEXT NOT NULL, `type` TEXT NOT NULL, `summary` TEXT, `amount` TEXT NOT NULL, `when_entered` INTEGER NOT NULL, `status_description` TEXT, `should_display_date` INTEGER, `is_cancelled` INTEGER NOT NULL, `is_pending` INTEGER NOT NULL, `is_freezing_funds` INTEGER NOT NULL, `is_reversed` INTEGER NOT NULL, `identifier1` TEXT, `identifier2` TEXT, `identifier3` TEXT, `transaction_id` TEXT, `receipt_template_id` TEXT, `extra_field_1` TEXT, `extra_field_2` TEXT, `wallet_id` TEXT, `wallet_type` TEXT NOT NULL DEFAULT \'PERSONAL\', `date_or_status` TEXT, PRIMARY KEY(`id`))");
                b0.l("CREATE TABLE IF NOT EXISTS `receipt_fields` (`entry_id` TEXT NOT NULL, `label` TEXT NOT NULL, `value` TEXT NOT NULL, `format_type` TEXT, `internal_value` TEXT, `template_slot` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
                b0.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                b0.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'e9e64e7a02cba5552220f9cb750f646c\')");
                return;
            }
            default: {
                b0.l("CREATE TABLE IF NOT EXISTS `agent_location` (`agent_id` TEXT NOT NULL, `principalMobile` TEXT NOT NULL, `principalName` TEXT NOT NULL, `agentCity` TEXT NOT NULL, `agentSubcity` TEXT NOT NULL, PRIMARY KEY(`agent_id`))");
                b0.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                b0.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'1fda58d003aaf8f1db7381f88581fd6f\')");
            }
        }
    }

    @Override  // J8.j
    public final void c(b b0) {
        v v0 = this.c;
        switch(this.b) {
            case 0: {
                b0.l("DROP TABLE IF EXISTS `Dependency`");
                b0.l("DROP TABLE IF EXISTS `WorkSpec`");
                b0.l("DROP TABLE IF EXISTS `WorkTag`");
                b0.l("DROP TABLE IF EXISTS `SystemIdInfo`");
                b0.l("DROP TABLE IF EXISTS `WorkName`");
                b0.l("DROP TABLE IF EXISTS `WorkProgress`");
                b0.l("DROP TABLE IF EXISTS `Preference`");
                ArrayList arrayList1 = ((WorkDatabase_Impl)v0).g;
                if(arrayList1 != null) {
                    for(Object object1: arrayList1) {
                        ((a)object1).getClass();
                    }
                }
                return;
            }
            case 1: {
                b0.l("DROP TABLE IF EXISTS `history_entries`");
                b0.l("DROP TABLE IF EXISTS `receipt_fields`");
                ArrayList arrayList2 = ((TransactionHistoryDatabase_Impl)v0).g;
                if(arrayList2 != null) {
                    for(Object object2: arrayList2) {
                        ((a)object2).getClass();
                    }
                }
                return;
            }
            default: {
                b0.l("DROP TABLE IF EXISTS `agent_location`");
                ArrayList arrayList0 = ((AgentLocationDatabase_Impl)v0).g;
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        ((a)object0).getClass();
                    }
                }
            }
        }
    }

    @Override  // J8.j
    public final void e(b b0) {
        v v0 = this.c;
        switch(this.b) {
            case 0: {
                ArrayList arrayList1 = ((WorkDatabase_Impl)v0).g;
                if(arrayList1 != null) {
                    for(Object object1: arrayList1) {
                        ((a)object1).getClass();
                    }
                }
                return;
            }
            case 1: {
                ArrayList arrayList2 = ((TransactionHistoryDatabase_Impl)v0).g;
                if(arrayList2 != null) {
                    for(Object object2: arrayList2) {
                        ((a)object2).getClass();
                    }
                }
                return;
            }
            default: {
                ArrayList arrayList0 = ((AgentLocationDatabase_Impl)v0).g;
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        ((a)object0).getClass();
                    }
                }
            }
        }
    }

    @Override  // J8.j
    public final void g(b b0) {
        switch(this.b) {
            case 0: {
                ((WorkDatabase_Impl)this.c).a = b0;
                b0.l("PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl)this.c).l(b0);
                ArrayList arrayList1 = ((WorkDatabase_Impl)this.c).g;
                if(arrayList1 != null) {
                    for(Object object1: arrayList1) {
                        ((a)object1).a(b0);
                    }
                }
                return;
            }
            case 1: {
                ((TransactionHistoryDatabase_Impl)this.c).a = b0;
                ((TransactionHistoryDatabase_Impl)this.c).l(b0);
                ArrayList arrayList2 = ((TransactionHistoryDatabase_Impl)this.c).g;
                if(arrayList2 != null) {
                    for(Object object2: arrayList2) {
                        ((a)object2).a(b0);
                    }
                }
                return;
            }
            default: {
                ((AgentLocationDatabase_Impl)this.c).a = b0;
                ((AgentLocationDatabase_Impl)this.c).l(b0);
                ArrayList arrayList0 = ((AgentLocationDatabase_Impl)this.c).g;
                if(arrayList0 != null) {
                    for(Object object0: arrayList0) {
                        ((a)object0).a(b0);
                    }
                }
            }
        }
    }

    @Override  // J8.j
    public final void h(b b0) {
    }

    @Override  // J8.j
    public final void i(b b0) {
        switch(this.b) {
            case 0: {
                c.y(b0);
                return;
            }
            case 1: {
                c.y(b0);
                return;
            }
            default: {
                c.y(b0);
            }
        }
    }

    @Override  // J8.j
    public final A k(b b0) {
        switch(this.b) {
            case 0: {
                HashMap hashMap1 = new HashMap(2);
                hashMap1.put("work_spec_id", new u2.a("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap1.put("prerequisite_id", new u2.a("prerequisite_id", "TEXT", true, 2, null, 1));
                HashSet hashSet0 = new HashSet(2);
                hashSet0.add(new u2.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                hashSet0.add(new u2.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet1 = new HashSet(2);
                hashSet1.add(new d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                hashSet1.add(new d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
                e e2 = new e("Dependency", hashMap1, hashSet0, hashSet1);
                e e3 = l.R(b0, "Dependency");
                if(!e2.equals(e3)) {
                    return new A(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + e2 + "\n Found:\n" + e3, 3);
                }
                HashMap hashMap2 = new HashMap(0x20);
                hashMap2.put("id", new u2.a("id", "TEXT", true, 1, null, 1));
                hashMap2.put("state", new u2.a("state", "INTEGER", true, 0, null, 1));
                hashMap2.put("worker_class_name", new u2.a("worker_class_name", "TEXT", true, 0, null, 1));
                hashMap2.put("input_merger_class_name", new u2.a("input_merger_class_name", "TEXT", true, 0, null, 1));
                hashMap2.put("input", new u2.a("input", "BLOB", true, 0, null, 1));
                hashMap2.put("output", new u2.a("output", "BLOB", true, 0, null, 1));
                hashMap2.put("initial_delay", new u2.a("initial_delay", "INTEGER", true, 0, null, 1));
                hashMap2.put("interval_duration", new u2.a("interval_duration", "INTEGER", true, 0, null, 1));
                hashMap2.put("flex_duration", new u2.a("flex_duration", "INTEGER", true, 0, null, 1));
                hashMap2.put("run_attempt_count", new u2.a("run_attempt_count", "INTEGER", true, 0, null, 1));
                hashMap2.put("backoff_policy", new u2.a("backoff_policy", "INTEGER", true, 0, null, 1));
                hashMap2.put("backoff_delay_duration", new u2.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                hashMap2.put("last_enqueue_time", new u2.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
                hashMap2.put("minimum_retention_duration", new u2.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                hashMap2.put("schedule_requested_at", new u2.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
                hashMap2.put("run_in_foreground", new u2.a("run_in_foreground", "INTEGER", true, 0, null, 1));
                hashMap2.put("out_of_quota_policy", new u2.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
                hashMap2.put("period_count", new u2.a("period_count", "INTEGER", true, 0, "0", 1));
                hashMap2.put("generation", new u2.a("generation", "INTEGER", true, 0, "0", 1));
                hashMap2.put("next_schedule_time_override", new u2.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
                hashMap2.put("next_schedule_time_override_generation", new u2.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
                hashMap2.put("stop_reason", new u2.a("stop_reason", "INTEGER", true, 0, "-256", 1));
                hashMap2.put("trace_tag", new u2.a("trace_tag", "TEXT", false, 0, null, 1));
                hashMap2.put("required_network_type", new u2.a("required_network_type", "INTEGER", true, 0, null, 1));
                hashMap2.put("required_network_request", new u2.a("required_network_request", "BLOB", true, 0, "x\'\'", 1));
                hashMap2.put("requires_charging", new u2.a("requires_charging", "INTEGER", true, 0, null, 1));
                hashMap2.put("requires_device_idle", new u2.a("requires_device_idle", "INTEGER", true, 0, null, 1));
                hashMap2.put("requires_battery_not_low", new u2.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                hashMap2.put("requires_storage_not_low", new u2.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                hashMap2.put("trigger_content_update_delay", new u2.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                hashMap2.put("trigger_max_content_delay", new u2.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                hashMap2.put("content_uri_triggers", new u2.a("content_uri_triggers", "BLOB", true, 0, null, 1));
                HashSet hashSet2 = new HashSet(0);
                HashSet hashSet3 = new HashSet(2);
                hashSet3.add(new d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
                hashSet3.add(new d("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
                e e4 = new e("WorkSpec", hashMap2, hashSet2, hashSet3);
                e e5 = l.R(b0, "WorkSpec");
                if(!e4.equals(e5)) {
                    return new A(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + e4 + "\n Found:\n" + e5, 3);
                }
                HashMap hashMap3 = new HashMap(2);
                hashMap3.put("tag", new u2.a("tag", "TEXT", true, 1, null, 1));
                hashMap3.put("work_spec_id", new u2.a("work_spec_id", "TEXT", true, 2, null, 1));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new u2.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                e e6 = new e("WorkTag", hashMap3, hashSet4, hashSet5);
                e e7 = l.R(b0, "WorkTag");
                if(!e6.equals(e7)) {
                    return new A(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + e6 + "\n Found:\n" + e7, 3);
                }
                HashMap hashMap4 = new HashMap(3);
                hashMap4.put("work_spec_id", new u2.a("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap4.put("generation", new u2.a("generation", "INTEGER", true, 2, "0", 1));
                hashMap4.put("system_id", new u2.a("system_id", "INTEGER", true, 0, null, 1));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new u2.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                e e8 = new e("SystemIdInfo", hashMap4, hashSet6, new HashSet(0));
                e e9 = l.R(b0, "SystemIdInfo");
                if(!e8.equals(e9)) {
                    return new A(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + e8 + "\n Found:\n" + e9, 3);
                }
                HashMap hashMap5 = new HashMap(2);
                hashMap5.put("name", new u2.a("name", "TEXT", true, 1, null, 1));
                hashMap5.put("work_spec_id", new u2.a("work_spec_id", "TEXT", true, 2, null, 1));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new u2.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                e e10 = new e("WorkName", hashMap5, hashSet7, hashSet8);
                e e11 = l.R(b0, "WorkName");
                if(!e10.equals(e11)) {
                    return new A(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + e10 + "\n Found:\n" + e11, 3);
                }
                HashMap hashMap6 = new HashMap(2);
                hashMap6.put("work_spec_id", new u2.a("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap6.put("progress", new u2.a("progress", "BLOB", true, 0, null, 1));
                HashSet hashSet9 = new HashSet(1);
                hashSet9.add(new u2.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                e e12 = new e("WorkProgress", hashMap6, hashSet9, new HashSet(0));
                e e13 = l.R(b0, "WorkProgress");
                if(!e12.equals(e13)) {
                    return new A(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + e12 + "\n Found:\n" + e13, 3);
                }
                HashMap hashMap7 = new HashMap(2);
                hashMap7.put("key", new u2.a("key", "TEXT", true, 1, null, 1));
                hashMap7.put("long_value", new u2.a("long_value", "INTEGER", false, 0, null, 1));
                e e14 = new e("Preference", hashMap7, new HashSet(0), new HashSet(0));
                e e15 = l.R(b0, "Preference");
                return e14.equals(e15) ? new A(true, null, 3) : new A(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + e14 + "\n Found:\n" + e15, 3);
            }
            case 1: {
                HashMap hashMap8 = new HashMap(22);
                hashMap8.put("id", new u2.a("id", "TEXT", true, 1, null, 1));
                hashMap8.put("cursor_id", new u2.a("cursor_id", "TEXT", true, 0, null, 1));
                hashMap8.put("type", new u2.a("type", "TEXT", true, 0, null, 1));
                hashMap8.put("summary", new u2.a("summary", "TEXT", false, 0, null, 1));
                hashMap8.put("amount", new u2.a("amount", "TEXT", true, 0, null, 1));
                hashMap8.put("when_entered", new u2.a("when_entered", "INTEGER", true, 0, null, 1));
                hashMap8.put("status_description", new u2.a("status_description", "TEXT", false, 0, null, 1));
                hashMap8.put("should_display_date", new u2.a("should_display_date", "INTEGER", false, 0, null, 1));
                hashMap8.put("is_cancelled", new u2.a("is_cancelled", "INTEGER", true, 0, null, 1));
                hashMap8.put("is_pending", new u2.a("is_pending", "INTEGER", true, 0, null, 1));
                hashMap8.put("is_freezing_funds", new u2.a("is_freezing_funds", "INTEGER", true, 0, null, 1));
                hashMap8.put("is_reversed", new u2.a("is_reversed", "INTEGER", true, 0, null, 1));
                hashMap8.put("identifier1", new u2.a("identifier1", "TEXT", false, 0, null, 1));
                hashMap8.put("identifier2", new u2.a("identifier2", "TEXT", false, 0, null, 1));
                hashMap8.put("identifier3", new u2.a("identifier3", "TEXT", false, 0, null, 1));
                hashMap8.put("transaction_id", new u2.a("transaction_id", "TEXT", false, 0, null, 1));
                hashMap8.put("receipt_template_id", new u2.a("receipt_template_id", "TEXT", false, 0, null, 1));
                hashMap8.put("extra_field_1", new u2.a("extra_field_1", "TEXT", false, 0, null, 1));
                hashMap8.put("extra_field_2", new u2.a("extra_field_2", "TEXT", false, 0, null, 1));
                hashMap8.put("wallet_id", new u2.a("wallet_id", "TEXT", false, 0, null, 1));
                hashMap8.put("wallet_type", new u2.a("wallet_type", "TEXT", true, 0, "\'PERSONAL\'", 1));
                hashMap8.put("date_or_status", new u2.a("date_or_status", "TEXT", false, 0, null, 1));
                e e16 = new e("history_entries", hashMap8, new HashSet(0), new HashSet(0));
                e e17 = l.R(b0, "history_entries");
                if(!e16.equals(e17)) {
                    return new A(false, "history_entries(com.wave.customer.transactions.persistence.HistoryEntryEntity).\n Expected:\n" + e16 + "\n Found:\n" + e17, 3);
                }
                HashMap hashMap9 = new HashMap(7);
                hashMap9.put("entry_id", new u2.a("entry_id", "TEXT", true, 0, null, 1));
                hashMap9.put("label", new u2.a("label", "TEXT", true, 0, null, 1));
                hashMap9.put("value", new u2.a("value", "TEXT", true, 0, null, 1));
                hashMap9.put("format_type", new u2.a("format_type", "TEXT", false, 0, null, 1));
                hashMap9.put("internal_value", new u2.a("internal_value", "TEXT", false, 0, null, 1));
                hashMap9.put("template_slot", new u2.a("template_slot", "TEXT", false, 0, null, 1));
                hashMap9.put("id", new u2.a("id", "INTEGER", true, 1, null, 1));
                e e18 = new e("receipt_fields", hashMap9, new HashSet(0), new HashSet(0));
                e e19 = l.R(b0, "receipt_fields");
                return e18.equals(e19) ? new A(true, null, 3) : new A(false, "receipt_fields(com.wave.customer.transactions.persistence.ReceiptFieldEntity).\n Expected:\n" + e18 + "\n Found:\n" + e19, 3);
            }
            default: {
                HashMap hashMap0 = new HashMap(5);
                hashMap0.put("agent_id", new u2.a("agent_id", "TEXT", true, 1, null, 1));
                hashMap0.put("principalMobile", new u2.a("principalMobile", "TEXT", true, 0, null, 1));
                hashMap0.put("principalName", new u2.a("principalName", "TEXT", true, 0, null, 1));
                hashMap0.put("agentCity", new u2.a("agentCity", "TEXT", true, 0, null, 1));
                hashMap0.put("agentSubcity", new u2.a("agentSubcity", "TEXT", true, 0, null, 1));
                e e0 = new e("agent_location", hashMap0, new HashSet(0), new HashSet(0));
                e e1 = l.R(b0, "agent_location");
                return e0.equals(e1) ? new A(true, null, 3) : new A(false, "agent_location(com.sendwave.util.AgentLocation).\n Expected:\n" + e0 + "\n Found:\n" + e1, 3);
            }
        }
    }

    private final void l(b b0) {
    }

    private final void m(b b0) {
    }

    private final void n(b b0) {
    }
}

