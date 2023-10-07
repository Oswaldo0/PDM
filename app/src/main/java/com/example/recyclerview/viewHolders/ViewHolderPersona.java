package com.example.recyclerview.viewHolders;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

public class ViewHolderPersona extends RecyclerView.ViewHolder {
    private TextView nombrePersona;
    private TextView edadPersona;
    public ViewHolderPersona(@NonNull View itemView) {
        super(itemView);
        this.nombrePersona = itemView.findViewById(R.id.txvNombreComp);
        this.edadPersona = itemView.findViewById(R.id.txvEdadPersona);
    }
    public TextView getNombrePersona(){
        return this.nombrePersona;
    }
    public TextView getEdadPersona(){
        return this.edadPersona;
    }
}
