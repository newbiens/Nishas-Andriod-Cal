// Generated by view binder compiler. Do not edit!
package com.DataFlair.mycalculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.DataFlair.mycalculator.R;
import com.google.android.gms.ads.AdView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button BRemain;

  @NonNull
  public final AdView adView;

  @NonNull
  public final Button b0;

  @NonNull
  public final Button b1;

  @NonNull
  public final Button b2;

  @NonNull
  public final Button b3;

  @NonNull
  public final Button b4;

  @NonNull
  public final Button b5;

  @NonNull
  public final Button b6;

  @NonNull
  public final Button b7;

  @NonNull
  public final Button b8;

  @NonNull
  public final Button b9;

  @NonNull
  public final Button bDot;

  @NonNull
  public final Button badd;

  @NonNull
  public final Button biv;

  @NonNull
  public final Button bmul;

  @NonNull
  public final Button bsub;

  @NonNull
  public final Button buttonDel;

  @NonNull
  public final Button buttoneql;

  @NonNull
  public final TextView display;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button BRemain,
      @NonNull AdView adView, @NonNull Button b0, @NonNull Button b1, @NonNull Button b2,
      @NonNull Button b3, @NonNull Button b4, @NonNull Button b5, @NonNull Button b6,
      @NonNull Button b7, @NonNull Button b8, @NonNull Button b9, @NonNull Button bDot,
      @NonNull Button badd, @NonNull Button biv, @NonNull Button bmul, @NonNull Button bsub,
      @NonNull Button buttonDel, @NonNull Button buttoneql, @NonNull TextView display) {
    this.rootView = rootView;
    this.BRemain = BRemain;
    this.adView = adView;
    this.b0 = b0;
    this.b1 = b1;
    this.b2 = b2;
    this.b3 = b3;
    this.b4 = b4;
    this.b5 = b5;
    this.b6 = b6;
    this.b7 = b7;
    this.b8 = b8;
    this.b9 = b9;
    this.bDot = bDot;
    this.badd = badd;
    this.biv = biv;
    this.bmul = bmul;
    this.bsub = bsub;
    this.buttonDel = buttonDel;
    this.buttoneql = buttoneql;
    this.display = display;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.BRemain;
      Button BRemain = rootView.findViewById(id);
      if (BRemain == null) {
        break missingId;
      }

      id = R.id.adView;
      AdView adView = rootView.findViewById(id);
      if (adView == null) {
        break missingId;
      }

      id = R.id.b0;
      Button b0 = rootView.findViewById(id);
      if (b0 == null) {
        break missingId;
      }

      id = R.id.b1;
      Button b1 = rootView.findViewById(id);
      if (b1 == null) {
        break missingId;
      }

      id = R.id.b2;
      Button b2 = rootView.findViewById(id);
      if (b2 == null) {
        break missingId;
      }

      id = R.id.b3;
      Button b3 = rootView.findViewById(id);
      if (b3 == null) {
        break missingId;
      }

      id = R.id.b4;
      Button b4 = rootView.findViewById(id);
      if (b4 == null) {
        break missingId;
      }

      id = R.id.b5;
      Button b5 = rootView.findViewById(id);
      if (b5 == null) {
        break missingId;
      }

      id = R.id.b6;
      Button b6 = rootView.findViewById(id);
      if (b6 == null) {
        break missingId;
      }

      id = R.id.b7;
      Button b7 = rootView.findViewById(id);
      if (b7 == null) {
        break missingId;
      }

      id = R.id.b8;
      Button b8 = rootView.findViewById(id);
      if (b8 == null) {
        break missingId;
      }

      id = R.id.b9;
      Button b9 = rootView.findViewById(id);
      if (b9 == null) {
        break missingId;
      }

      id = R.id.bDot;
      Button bDot = rootView.findViewById(id);
      if (bDot == null) {
        break missingId;
      }

      id = R.id.badd;
      Button badd = rootView.findViewById(id);
      if (badd == null) {
        break missingId;
      }

      id = R.id.biv;
      Button biv = rootView.findViewById(id);
      if (biv == null) {
        break missingId;
      }

      id = R.id.bmul;
      Button bmul = rootView.findViewById(id);
      if (bmul == null) {
        break missingId;
      }

      id = R.id.bsub;
      Button bsub = rootView.findViewById(id);
      if (bsub == null) {
        break missingId;
      }

      id = R.id.buttonDel;
      Button buttonDel = rootView.findViewById(id);
      if (buttonDel == null) {
        break missingId;
      }

      id = R.id.buttoneql;
      Button buttoneql = rootView.findViewById(id);
      if (buttoneql == null) {
        break missingId;
      }

      id = R.id.display;
      TextView display = rootView.findViewById(id);
      if (display == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, BRemain, adView, b0, b1, b2, b3, b4,
          b5, b6, b7, b8, b9, bDot, badd, biv, bmul, bsub, buttonDel, buttoneql, display);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
