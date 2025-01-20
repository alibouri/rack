package i9;

import R1.c;
import R1.g;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.sendwave.components.CodeEntryEditText;
import com.sendwave.util.supportChannels.SupportChannelsModalComposeView;
import o9.s2;

public abstract class t0 extends g {
    public final Button q;
    public final Button r;
    public final Button s;
    public final TextView t;
    public final ProgressBar u;
    public final CodeEntryEditText v;
    public final SupportChannelsModalComposeView w;
    public final Toolbar x;
    public final RelativeLayout y;
    public s2 z;

    public t0(c c0, View view0, Button button0, Button button1, Button button2, TextView textView0, ProgressBar progressBar0, CodeEntryEditText codeEntryEditText0, SupportChannelsModalComposeView supportChannelsModalComposeView0, Toolbar toolbar0, RelativeLayout relativeLayout0) {
        super(c0, view0, 6);
        this.q = button0;
        this.r = button1;
        this.s = button2;
        this.t = textView0;
        this.u = progressBar0;
        this.v = codeEntryEditText0;
        this.w = supportChannelsModalComposeView0;
        this.x = toolbar0;
        this.y = relativeLayout0;
    }

    public abstract void u(s2 arg1);
}

