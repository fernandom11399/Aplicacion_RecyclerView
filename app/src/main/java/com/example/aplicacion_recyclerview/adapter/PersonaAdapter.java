package com.example.aplicacion_recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplicacion_recyclerview.R;
import com.example.aplicacion_recyclerview.models.Persona;

import java.util.List;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.ViewHolder> {

    private List<Persona> personas;

    public PersonaAdapter(List<Persona> personas){
        this.personas = personas;
    }


    @NonNull
    @Override
    public PersonaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.personaitem, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonaAdapter.ViewHolder holder, int position) {
        Persona p = personas.get(position);
        holder.setData(p);
    }

    @Override
    public int getItemCount() {
        return personas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        Persona personaHolder;
        TextView txtnombre, txtgenero, txthabilidad, txtocupacion;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            txtnombre = itemView.findViewById(R.id.tvNombre);
            txtgenero = itemView.findViewById(R.id.tvGenero);
            txthabilidad = itemView.findViewById(R.id.tvHabilidad);
            txtocupacion = itemView.findViewById(R.id.tvOcupacion);
        }

        public void setData(Persona p) {
            this.personaHolder = p;
            txtnombre.setText(p.getNombre());
            txtgenero.setText(p.getGenero());
            txthabilidad.setText(p.getPoder());
            txtocupacion.setText(p.getOcupacion().getActividad());
        }
    }
}
