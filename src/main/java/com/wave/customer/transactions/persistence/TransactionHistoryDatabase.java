package com.wave.customer.transactions.persistence;

import Ma.w;
import io.sentry.hints.i;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import q2.v;

public abstract class TransactionHistoryDatabase extends v {
    public static final i m;
    public static final ReentrantLock n;
    public static final LinkedHashMap o;

    static {
    }

    public abstract w s();
}

