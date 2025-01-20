package c2;

import J1.q;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

public final class y extends AnimationSet implements Runnable {
    public final ViewGroup X;
    public final View Y;
    public boolean Z;
    public boolean b0;
    public boolean c0;

    public y(Animation animation0, ViewGroup viewGroup0, View view0) {
        super(false);
        this.c0 = true;
        this.X = viewGroup0;
        this.Y = view0;
        this.addAnimation(animation0);
        viewGroup0.post(this);
    }

    @Override  // android.view.animation.AnimationSet
    public final boolean getTransformation(long v, Transformation transformation0) {
        this.c0 = true;
        if(this.Z) {
            return !this.b0;
        }
        if(!super.getTransformation(v, transformation0)) {
            this.Z = true;
            q.a(this.X, this);
        }
        return true;
    }

    @Override  // android.view.animation.Animation
    public final boolean getTransformation(long v, Transformation transformation0, float f) {
        this.c0 = true;
        if(this.Z) {
            return !this.b0;
        }
        if(!super.getTransformation(v, transformation0, f)) {
            this.Z = true;
            q.a(this.X, this);
        }
        return true;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup0 = this.X;
        if(!this.Z && this.c0) {
            this.c0 = false;
            viewGroup0.post(this);
            return;
        }
        viewGroup0.endViewTransition(this.Y);
        this.b0 = true;
    }
}

