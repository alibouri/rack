package i;

import J1.F;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController.RecycleListView;
import androidx.core.widget.NestedScrollView;
import o.i0;

public final class g extends D implements DialogInterface {
    public final e d0;

    public g(ContextThemeWrapper contextThemeWrapper0, int v) {
        super(contextThemeWrapper0, g.k(contextThemeWrapper0, v));
        this.d0 = new e(this.getContext(), this, this.getWindow());
    }

    public final Button j(int v) {
        e e0 = this.d0;
        switch(v) {
            case -3: {
                return e0.o;
            }
            case -2: {
                return e0.l;
            }
            case -1: {
                return e0.i;
            }
            default: {
                e0.getClass();
                return null;
            }
        }
    }

    public static int k(Context context0, int v) {
        if((v >>> 24 & 0xFF) >= 1) {
            return v;
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(0x7F04002D, typedValue0, true);  // attr:alertDialogTheme
        return typedValue0.resourceId;
    }

    @Override  // i.D
    public final void onCreate(Bundle bundle0) {
        int v2;
        super.onCreate(bundle0);
        e e0 = this.d0;
        e0.b.setContentView(e0.z);
        Window window0 = e0.c;
        View view0 = window0.findViewById(0x7F0A0232);  // id:parentPanel
        View view1 = view0.findViewById(0x7F0A0309);  // id:topPanel
        View view2 = view0.findViewById(0x7F0A00F7);  // id:contentPanel
        View view3 = view0.findViewById(0x7F0A00AD);  // id:buttonPanel
        ViewGroup viewGroup0 = (ViewGroup)view0.findViewById(0x7F0A0101);  // id:customPanel
        View view4 = e0.g == null ? null : e0.g;
        int v = 0;
        if(view4 == null || !e.a(view4)) {
            window0.setFlags(0x20000, 0x20000);
        }
        if(view4 == null) {
            viewGroup0.setVisibility(8);
        }
        else {
            FrameLayout frameLayout0 = (FrameLayout)window0.findViewById(0x7F0A0100);  // id:custom
            frameLayout0.addView(view4, new ViewGroup.LayoutParams(-1, -1));
            if(e0.h) {
                frameLayout0.setPadding(0, 0, 0, 0);
            }
            if(e0.f != null) {
                ((i0)viewGroup0.getLayoutParams()).weight = 0.0f;
            }
        }
        View view5 = viewGroup0.findViewById(0x7F0A0309);  // id:topPanel
        View view6 = viewGroup0.findViewById(0x7F0A00F7);  // id:contentPanel
        View view7 = viewGroup0.findViewById(0x7F0A00AD);  // id:buttonPanel
        ViewGroup viewGroup1 = e.b(view5, view1);
        ViewGroup viewGroup2 = e.b(view6, view2);
        ViewGroup viewGroup3 = e.b(view7, view3);
        NestedScrollView nestedScrollView0 = (NestedScrollView)window0.findViewById(0x7F0A0283);  // id:scrollView
        e0.r = nestedScrollView0;
        nestedScrollView0.setFocusable(false);
        e0.r.setNestedScrollingEnabled(false);
        TextView textView0 = (TextView)viewGroup2.findViewById(0x102000B);
        e0.v = textView0;
        if(textView0 != null) {
            CharSequence charSequence0 = e0.e;
            if(charSequence0 == null) {
                textView0.setVisibility(8);
                e0.r.removeView(e0.v);
                if(e0.f == null) {
                    viewGroup2.setVisibility(8);
                }
                else {
                    ViewGroup viewGroup4 = (ViewGroup)e0.r.getParent();
                    int v1 = viewGroup4.indexOfChild(e0.r);
                    viewGroup4.removeViewAt(v1);
                    viewGroup4.addView(e0.f, v1, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            else {
                textView0.setText(charSequence0);
            }
        }
        Button button0 = (Button)viewGroup3.findViewById(0x1020019);
        e0.i = button0;
        K6.e e1 = e0.G;
        button0.setOnClickListener(e1);
        if(TextUtils.isEmpty(e0.j)) {
            e0.i.setVisibility(8);
            v2 = 0;
        }
        else {
            e0.i.setText(e0.j);
            e0.i.setVisibility(0);
            v2 = 1;
        }
        Button button1 = (Button)viewGroup3.findViewById(0x102001A);
        e0.l = button1;
        button1.setOnClickListener(e1);
        if(TextUtils.isEmpty(e0.m)) {
            e0.l.setVisibility(8);
        }
        else {
            e0.l.setText(e0.m);
            e0.l.setVisibility(0);
            v2 |= 2;
        }
        Button button2 = (Button)viewGroup3.findViewById(0x102001B);
        e0.o = button2;
        button2.setOnClickListener(e1);
        if(TextUtils.isEmpty(e0.p)) {
            e0.o.setVisibility(8);
        }
        else {
            e0.o.setText(e0.p);
            e0.o.setVisibility(0);
            v2 |= 4;
        }
        TypedValue typedValue0 = new TypedValue();
        e0.a.getTheme().resolveAttribute(0x7F04002B, typedValue0, true);  // attr:alertDialogCenterButtons
        if(typedValue0.data != 0) {
            switch(v2) {
                case 1: {
                    Button button3 = e0.i;
                    LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)button3.getLayoutParams();
                    linearLayout$LayoutParams0.gravity = 1;
                    linearLayout$LayoutParams0.weight = 0.5f;
                    button3.setLayoutParams(linearLayout$LayoutParams0);
                    break;
                }
                case 2: {
                    Button button4 = e0.l;
                    LinearLayout.LayoutParams linearLayout$LayoutParams1 = (LinearLayout.LayoutParams)button4.getLayoutParams();
                    linearLayout$LayoutParams1.gravity = 1;
                    linearLayout$LayoutParams1.weight = 0.5f;
                    button4.setLayoutParams(linearLayout$LayoutParams1);
                    break;
                }
                case 4: {
                    Button button5 = e0.o;
                    LinearLayout.LayoutParams linearLayout$LayoutParams2 = (LinearLayout.LayoutParams)button5.getLayoutParams();
                    linearLayout$LayoutParams2.gravity = 1;
                    linearLayout$LayoutParams2.weight = 0.5f;
                    button5.setLayoutParams(linearLayout$LayoutParams2);
                }
            }
        }
        if(v2 == 0) {
            viewGroup3.setVisibility(8);
        }
        if(e0.w == null) {
            e0.t = (ImageView)window0.findViewById(0x1020006);
            if(TextUtils.isEmpty(e0.d) || !e0.E) {
                window0.findViewById(0x7F0A0304).setVisibility(8);  // id:title_template
                e0.t.setVisibility(8);
                viewGroup1.setVisibility(8);
            }
            else {
                TextView textView1 = (TextView)window0.findViewById(0x7F0A005D);  // id:alertTitle
                e0.u = textView1;
                textView1.setText(e0.d);
                Drawable drawable0 = e0.s;
                if(drawable0 == null) {
                    e0.u.setPadding(e0.t.getPaddingLeft(), e0.t.getPaddingTop(), e0.t.getPaddingRight(), e0.t.getPaddingBottom());
                    e0.t.setVisibility(8);
                }
                else {
                    e0.t.setImageDrawable(drawable0);
                }
            }
        }
        else {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -2);
            viewGroup1.addView(e0.w, 0, viewGroup$LayoutParams0);
            window0.findViewById(0x7F0A0304).setVisibility(8);  // id:title_template
        }
        boolean z = viewGroup0.getVisibility() != 8;
        int v3 = viewGroup1 == null || viewGroup1.getVisibility() == 8 ? 0 : 1;
        boolean z1 = viewGroup3.getVisibility() != 8;
        if(!z1) {
            View view8 = viewGroup2.findViewById(0x7F0A02F1);  // id:textSpacerNoButtons
            if(view8 != null) {
                view8.setVisibility(0);
            }
        }
        if(v3 == 0) {
            View view10 = viewGroup2.findViewById(0x7F0A02F2);  // id:textSpacerNoTitle
            if(view10 != null) {
                view10.setVisibility(0);
            }
        }
        else {
            NestedScrollView nestedScrollView1 = e0.r;
            if(nestedScrollView1 != null) {
                nestedScrollView1.setClipToPadding(true);
            }
            View view9 = e0.e != null || e0.f != null ? viewGroup1.findViewById(0x7F0A0303) : null;  // id:titleDividerNoCustom
            if(view9 != null) {
                view9.setVisibility(0);
            }
        }
        AlertController.RecycleListView alertController$RecycleListView0 = e0.f;
        if(alertController$RecycleListView0 instanceof AlertController.RecycleListView) {
            alertController$RecycleListView0.getClass();
            if(!z1 || v3 == 0) {
                alertController$RecycleListView0.setPadding(alertController$RecycleListView0.getPaddingLeft(), (v3 == 0 ? alertController$RecycleListView0.b0 : alertController$RecycleListView0.getPaddingTop()), alertController$RecycleListView0.getPaddingRight(), (z1 ? alertController$RecycleListView0.getPaddingBottom() : alertController$RecycleListView0.c0));
            }
        }
        if(!z) {
            AlertController.RecycleListView alertController$RecycleListView1 = e0.f;
            if(alertController$RecycleListView1 == null) {
                alertController$RecycleListView1 = e0.r;
            }
            if(alertController$RecycleListView1 != null) {
                if(z1) {
                    v = 2;
                }
                View view11 = window0.findViewById(0x7F0A0282);  // id:scrollIndicatorUp
                View view12 = window0.findViewById(0x7F0A0281);  // id:scrollIndicatorDown
                F.b(alertController$RecycleListView1, v3 | v, 3);
                if(view11 != null) {
                    viewGroup2.removeView(view11);
                }
                if(view12 != null) {
                    viewGroup2.removeView(view12);
                }
            }
        }
        AlertController.RecycleListView alertController$RecycleListView2 = e0.f;
        if(alertController$RecycleListView2 != null) {
            ListAdapter listAdapter0 = e0.x;
            if(listAdapter0 != null) {
                alertController$RecycleListView2.setAdapter(listAdapter0);
                int v4 = e0.y;
                if(v4 > -1) {
                    alertController$RecycleListView2.setItemChecked(v4, true);
                    alertController$RecycleListView2.setSelection(v4);
                }
            }
        }
    }

    @Override  // android.app.Dialog
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        NestedScrollView nestedScrollView0 = this.d0.r;
        return nestedScrollView0 == null || !nestedScrollView0.f(keyEvent0) ? super.onKeyDown(v, keyEvent0) : true;
    }

    @Override  // android.app.Dialog
    public final boolean onKeyUp(int v, KeyEvent keyEvent0) {
        NestedScrollView nestedScrollView0 = this.d0.r;
        return nestedScrollView0 == null || !nestedScrollView0.f(keyEvent0) ? super.onKeyUp(v, keyEvent0) : true;
    }

    @Override  // i.D
    public final void setTitle(CharSequence charSequence0) {
        super.setTitle(charSequence0);
        this.d0.d = charSequence0;
        TextView textView0 = this.d0.u;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
    }
}

