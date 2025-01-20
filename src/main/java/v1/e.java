package v1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import i.j;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public abstract class e {
    public static final Object a;

    static {
        e.a = new Object();
    }

    public static Intent a(j j0) {
        String s;
        Intent intent0 = j0.getParentActivityIntent();
        if(intent0 != null) {
            return intent0;
        }
        try {
            s = e.c(j0, j0.getComponentName());
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            throw new IllegalArgumentException(packageManager$NameNotFoundException0);
        }
        if(s == null) {
            return null;
        }
        ComponentName componentName0 = new ComponentName(j0, s);
        try {
            return e.c(j0, componentName0) == null ? Intent.makeMainActivity(componentName0) : new Intent().setComponent(componentName0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName \'" + s + "\' in manifest");
            return null;
        }
    }

    public static Intent b(j j0, ComponentName componentName0) {
        String s = e.c(j0, componentName0);
        if(s == null) {
            return null;
        }
        ComponentName componentName1 = new ComponentName(componentName0.getPackageName(), s);
        return e.c(j0, componentName1) == null ? Intent.makeMainActivity(componentName1) : new Intent().setComponent(componentName1);
    }

    public static String c(Activity activity0, ComponentName componentName0) {
        int v1;
        PackageManager packageManager0 = activity0.getPackageManager();
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            v1 = 0x100C0280;
        }
        else {
            v1 = v < 24 ? 640 : 0xC0280;
        }
        ActivityInfo activityInfo0 = packageManager0.getActivityInfo(componentName0, v1);
        String s = activityInfo0.parentActivityName;
        if(s != null) {
            return s;
        }
        Bundle bundle0 = activityInfo0.metaData;
        if(bundle0 == null) {
            return null;
        }
        String s1 = bundle0.getString("android.support.PARENT_ACTIVITY");
        if(s1 == null) {
            return null;
        }
        return s1.charAt(0) == 46 ? "com.wave.personal" + s1 : s1;
    }

    public static void d(Context context0, String s) {
        XmlSerializer xmlSerializer0;
        FileOutputStream fileOutputStream0;
        synchronized(e.a) {
            if(s.equals("")) {
                context0.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            fileOutputStream0 = context0.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            goto label_11;
        }
        return;
        try {
            fileOutputStream0 = context0.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
        }
        catch(FileNotFoundException unused_ex) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            return;
        }
    label_11:
        xmlSerializer0 = Xml.newSerializer();
        try {
            try {
                xmlSerializer0.setOutput(fileOutputStream0, null);
                xmlSerializer0.startDocument("UTF-8", Boolean.TRUE);
                xmlSerializer0.startTag(null, "locales");
                xmlSerializer0.attribute(null, "application_locales", s);
                xmlSerializer0.endTag(null, "locales");
                xmlSerializer0.endDocument();
                goto label_28;
            }
            catch(Exception exception0) {
            }
            Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", exception0);
            if(fileOutputStream0 != null) {
                goto label_22;
            }
            return;
        }
        catch(Throwable throwable1) {
            goto label_25;
        }
        try {
        label_22:
            fileOutputStream0.close();
            return;
        }
        catch(IOException unused_ex) {
            return;
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
    label_25:
        if(fileOutputStream0 == null) {
            throw throwable1;
        }
        try {
            fileOutputStream0.close();
        }
        catch(IOException unused_ex) {
        }
        throw throwable1;
    label_28:
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
                return;
            }
            catch(IOException unused_ex) {
                return;
            }
            catch(Throwable throwable0) {
            }
            throw throwable0;
        }
    }

    public static String e(Context context0) {
        FileInputStream fileInputStream0;
        String s;
        synchronized(e.a) {
            s = "";
            try {
                fileInputStream0 = context0.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                goto label_7;
            }
            catch(FileNotFoundException unused_ex) {
            }
        }
        return "";
        try {
        label_7:
            XmlPullParser xmlPullParser0 = Xml.newPullParser();
            xmlPullParser0.setInput(fileInputStream0, "UTF-8");
            int v = xmlPullParser0.getDepth();
            while(true) {
                int v1 = xmlPullParser0.next();
                if(v1 == 1 || v1 == 3 && xmlPullParser0.getDepth() <= v) {
                    break;
                }
                if(v1 != 3 && v1 != 4 && xmlPullParser0.getName().equals("locales")) {
                    s = xmlPullParser0.getAttributeValue(null, "application_locales");
                    break;
                }
            }
            if(fileInputStream0 != null) {
                goto label_26;
            }
            goto label_27;
        }
        catch(XmlPullParserException | IOException unused_ex) {
            goto label_20;
        }
        catch(Throwable throwable1) {
        }
        try {
            try {
                goto label_23;
            }
            catch(XmlPullParserException | IOException unused_ex) {
            }
        label_20:
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            if(fileInputStream0 != null) {
                goto label_26;
            }
            goto label_27;
        }
        catch(Throwable throwable1) {
            goto label_23;
        }
        goto label_26;
    label_23:
        if(fileInputStream0 == null) {
            throw throwable1;
        }
        else {
            try {
                try {
                    fileInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
                throw throwable1;
                try {
                label_26:
                    fileInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            label_27:
                if(s.isEmpty()) {
                    context0.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                }
                return s;
            }
            catch(Throwable throwable0) {
            }
        }
        throw throwable0;
    }
}

