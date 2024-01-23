// Generated by view binder compiler. Do not edit!
package com.example.appmirenda.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.appmirenda.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListPaysBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView icone;

  @NonNull
  public final TextView itemCountri;

  private ListPaysBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView icone,
      @NonNull TextView itemCountri) {
    this.rootView = rootView;
    this.icone = icone;
    this.itemCountri = itemCountri;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListPaysBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListPaysBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_pays, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListPaysBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.icone;
      ImageView icone = ViewBindings.findChildViewById(rootView, id);
      if (icone == null) {
        break missingId;
      }

      id = R.id.itemCountri;
      TextView itemCountri = ViewBindings.findChildViewById(rootView, id);
      if (itemCountri == null) {
        break missingId;
      }

      return new ListPaysBinding((ConstraintLayout) rootView, icone, itemCountri);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
