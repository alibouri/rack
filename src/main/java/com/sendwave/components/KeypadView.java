package com.sendwave.components;

import E5.d;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import f9.k;
import java.util.ArrayList;
import java.util.List;

public class KeypadView extends LinearLayout implements View.OnClickListener, View.OnTouchListener {
    public final AudioManager b0;
    public boolean c0;
    public final Handler d0;
    public View e0;
    public k f0;
    public k g0;
    public EditText h0;
    public final d i0;
    public final B3.d j0;

    public KeypadView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c0 = false;
        this.d0 = new Handler();
        this.h0 = null;
        this.i0 = new d(18, this);
        B3.d d0 = new B3.d(27, this);
        this.j0 = d0;
        this.b0 = (AudioManager)this.getContext().getSystemService("audio");
        LayoutInflater.from(context0).inflate(0x7F0D0063, this, true);  // layout:item_keypad
        this.d(0x7F0801D9, d0);  // drawable:ic_backspace_white
        for(Object object0: this.getButtons()) {
            ((View)object0).setOnClickListener(this);
            ((View)object0).setOnTouchListener(this);
        }
    }

    public static void b(View view0, boolean z, long v) {
        view0.animate().scaleX((z ? 1.7f : 1.0f)).scaleY((z ? 1.7f : 1.0f)).setDuration(v).start();
    }

    public static ArrayList c(ViewGroup viewGroup0) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < viewGroup0.getChildCount(); ++v) {
            View view0 = viewGroup0.getChildAt(v);
            if(view0 instanceof Button || view0 instanceof ImageButton) {
                arrayList0.add(view0);
            }
            else if(view0 instanceof ViewGroup) {
                arrayList0.addAll(KeypadView.c(((ViewGroup)view0)));
            }
        }
        return arrayList0;
    }

    public final void d(int v, k k0) {
        AppCompatImageButton appCompatImageButton0 = (AppCompatImageButton)this.findViewById(0x7F0A0273);  // id:right_aux
        appCompatImageButton0.setImageResource(v);
        this.g0 = k0;
        if(k0 != this.j0) {
            KeypadView.b(appCompatImageButton0, false, 0L);
        }
    }

    private List getButtons() {
        return KeypadView.c(this);
    }

    private EditText getEditText() {
        for(Object object0: this.getRootView().getFocusables(130)) {
            View view0 = (View)object0;
            EditText editText0 = this.h0;
            if(editText0 != null) {
                editText0.requestFocus();
                return this.h0;
            }
            if(view0.hasFocus() && view0 instanceof EditText) {
                return (EditText)view0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        EditText editText0 = this.getEditText();
        if(editText0 == null) {
            return;
        }
        CharSequence charSequence0 = view0 instanceof Button ? ((Button)view0).getText() : "<backspace>";
        int v = editText0.getSelectionStart();
        int v1 = editText0.getSelectionEnd();
        if(view0.getId() == 0x7F0A0273) {  // id:right_aux
            this.g0.a();
            return;
        }
        if(view0.getId() == 0x7F0A01A1) {  // id:left_aux
            k k0 = this.f0;
            if(k0 != null) {
                k0.a();
            }
        }
        else {
            if(v1 == -1) {
                v = editText0.getText().length();
                v1 = v;
            }
            editText0.getText().replace(v, v1, charSequence0);
        }
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        if(this.c0 && view0.getId() != 0x7F0A0273) {  // id:right_aux
            return true;
        }
        switch(motionEvent0.getAction()) {
            case 0: {
                KeypadView.b(view0, true, 1L);
                if(view0.getId() == 0x7F0A0273) {  // id:right_aux
                    this.c0 = true;
                    this.e0 = view0;
                    view0.performClick();
                    this.d0.postDelayed(this.i0, 500L);
                    return view0.getId() == 0x7F0A0273;  // id:right_aux
                }
                this.b0.playSoundEffect(0);
                this.performHapticFeedback(3);
                return view0.getId() == 0x7F0A0273;  // id:right_aux
            }
            case 1: {
                KeypadView.b(view0, false, 50L);
                if(view0.getId() == 0x7F0A0273) {  // id:right_aux
                    this.c0 = false;
                    this.e0 = view0;
                    this.d0.removeCallbacksAndMessages(null);
                    return view0.getId() == 0x7F0A0273;  // id:right_aux
                }
                return view0.getId() == 0x7F0A0273;  // id:right_aux
            }
            default: {
                return view0.getId() == 0x7F0A0273;  // id:right_aux
            }
        }
    }

    public void setInputEditText(EditText editText0) {
        this.h0 = editText0;
    }
}

