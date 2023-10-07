package com.example.recyclerview.adapters;

import static com.example.recyclerview.MainActivity.lstPersonas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerview.R;
import com.example.recyclerview.models.Persona;
import com.example.recyclerview.viewHolders.ViewHolderPersona;
import java.util.ArrayList;
public class PersonaAdapter extends RecyclerView.Adapter<ViewHolderPersona> {
    private ArrayList<Persona> datos;
    public PersonaAdapter(ArrayList<Persona> datos) {
        this.datos = datos;
    }
    @NonNull
    @Override
    public ViewHolderPersona onCreateViewHolder(@NonNull ViewGroup parent, int
            viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personas,parent,false);
        return new ViewHolderPersona(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolderPersona holder, int
            position) {

        holder.getNombrePersona().setText(datos.get(position).getmombrePersona());

        holder.getEdadPersona().setText(String.valueOf(datos.get(position).getEdadPersona()));
    }
    @Override
    public int getItemCount() {
        return lstPersonas.size();
    }


}
