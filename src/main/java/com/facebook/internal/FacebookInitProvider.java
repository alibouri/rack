package com.facebook.internal;

import M4.l;
import Nb.j;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

public final class FacebookInitProvider extends ContentProvider {
    @Override  // android.content.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        j.f(uri0, "uri");
        return 0;
    }

    @Override  // android.content.ContentProvider
    public final String getType(Uri uri0) {
        j.f(uri0, "uri");
        return null;
    }

    @Override  // android.content.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        j.f(uri0, "uri");
        return null;
    }

    @Override  // android.content.ContentProvider
    public final boolean onCreate() {
        try {
            Context context0 = this.getContext();
            if(context0 != null) {
                synchronized(l.class) {
                    l.i(context0);
                    return false;
                }
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        catch(Exception exception0) {
        }
        Log.i("FacebookInitProvider", "Failed to auto initialize the Facebook SDK", exception0);
        return false;
    }

    @Override  // android.content.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        j.f(uri0, "uri");
        return null;
    }

    @Override  // android.content.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        j.f(uri0, "uri");
        return 0;
    }
}

