package com.example.aplicacion_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.aplicacion_recyclerview.adapter.PersonaAdapter;
import com.example.aplicacion_recyclerview.models.Ocupacion;
import com.example.aplicacion_recyclerview.models.Persona;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Denji", "Masculino", "Puede tranformarse en motocierra", new Ocupacion("Devil Hunter")));
        personas.add(new Persona("Aki", "Masculino", "Puede invocar a un perro", new Ocupacion("Devil Hunter")));
        personas.add(new Persona("Pochita", "Masculino", "Demonio de las motocierras", new Ocupacion("Devil Hunter")));
        personas.add(new Persona("Makima", "Femenino", "Cazadora de demonios líder en Japón", new Ocupacion("Devil Hunter")));
        personas.add(new Persona("Power", "Femenino", "Demonio de sangre", new Ocupacion("Devil Hunter")));
        personas.add(new Persona("Himeno", "Femenino", "Cazadora de demonios", new Ocupacion("Devil Hunter")));
        personas.add(new Persona("Kobeni Higashiyama", "Femenino", "Cazadora de demonios", new Ocupacion("Devil Hunter")));
        personas.add(new Persona("Reze", "Femenino", "Demonio Bomba", new Ocupacion("Devil Hunter")));
        personas.add(new Persona("Asa Mitaka", "Femenino", "Cazadora de demonios", new Ocupacion("Devil Hunter")));
        personas.add(new Persona("Akane Sawatari", "Femenino", "Cazadora de demonios", new Ocupacion("Devil Hunter")));
        personas.add(new Persona("Cosmo", "Femenino", "Demonio Espacial", new Ocupacion("Demonio")));
        personas.add(new Persona("Demonio Aguja", "Masculino", "Demonio Aguja", new Ocupacion("Demonio")));
        personas.add(new Persona("Demonio Castigo", "Masculino", "Demonio Castigo", new Ocupacion("Demonio")));
        personas.add(new Persona("Demonio Cerdo", "Masculino", "Demonio Cerdo", new Ocupacion("Demonio")));
        personas.add(new Persona("Demonio Cucaracha", "Masculino", "Demonio Cucaracha", new Ocupacion("Demonio")));
        personas.add(new Persona("Demonio Cuchillo", "Masculino", "Demonio Cuchillo", new Ocupacion("Demonio")));
        personas.add(new Persona("Demonio de la Caída","Masculino","Demonio de la Caída",new Ocupacion("Demonio")));
        personas.add(new Persona("Demonio de la Justicia","Masculino","Demonio de la Justicia",new Ocupacion("Demonio")));
        personas.add(new Persona("Demonio de la Muerte","Masculino","Demonio de la Muerte",new Ocupacion("Demonio")));
        personas.add(new Persona("Demonio de la Oscuridad","Masculino","Demonio de la Oscuridad",new Ocupacion("Demonio")));
        personas.add(new Persona("Beam","Masculino","Tiburón Demoníaco",new Ocupacion("Devil Hunter")));
        personas.add(new Persona("Kishibe","Masculino","Ex-Devil Hunter",new Ocupacion("Retirado")));
        personas.add(new Persona("Katana Man","Masculino","Híbrido Katana Demoníaco",new Ocupacion("Asesino")));

        PersonaAdapter pa = new PersonaAdapter(personas);
        RecyclerView rv = findViewById(R.id.rvDevilHunter);
        rv.setAdapter(pa);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
    }
}