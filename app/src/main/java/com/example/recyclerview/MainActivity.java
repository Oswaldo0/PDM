package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerview.adapters.PersonaAdapter;
import com.example.recyclerview.models.Persona;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private PersonaAdapter personaAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    public static ArrayList<Persona> lstPersonas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Rellenando listado de personas
        lstPersonas.add(new Persona(lstPersonas.size() + 1, "Miguel Angel García Sosa",35));
                lstPersonas.add(new Persona(lstPersonas.size() + 1, "Karla Antonieta Lue Gomez", 24));
                        lstPersonas.add(new Persona(lstPersonas.size() + 1, "Monica Angelina Flores García", 23));
                                Toast.makeText(this, "DATOS: " + lstPersonas,
                                        Toast.LENGTH_SHORT).show();
        // Configurando adaptador
        personaAdapter = new PersonaAdapter(lstPersonas);
        layoutManager = new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.rcvPersona);
        recyclerView.setAdapter(personaAdapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
    }
}