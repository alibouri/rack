package com.google.android.gms.common.api.internal;

import M5.o;
import android.app.Activity;
import android.content.Intent;

public interface LifecycleFragment {
    void b(o arg1);

    LifecycleCallback e();

    Activity f();

    void startActivityForResult(Intent arg1, int arg2);
}

