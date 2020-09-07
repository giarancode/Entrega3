package com.example.semana3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class Interface2 extends AppCompatActivity {
    ArrayList<InformacionAtributos> datos;
    RecyclerView rvReciclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface2);
        rvReciclerView = findViewById(R.id.rvReciclerView);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvReciclerView.setLayoutManager(llm);
        Toolbar toolbar1 = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listaInformacion();
        inicializaAdaptador();
    }
    public void inicializaAdaptador(){
        AdaptadorCardView adaptador = new AdaptadorCardView(datos,this);
        rvReciclerView.setAdapter(adaptador);
    }
    public void listaInformacion(){
        datos = new ArrayList<>();
        datos.add(new InformacionAtributos("Rafaela Arandia", R.drawable.perrito_arreglado_1,"1"));
        datos.add(new InformacionAtributos("Carmen Ayala",R.drawable.perro_arreglado_2,"2"));
        datos.add(new InformacionAtributos("Giovanny Arandia",R.drawable.perro_arreglado_3,"3"));
        datos.add(new InformacionAtributos("Wilmer Arandia",R.drawable.perro_arreglado_4,"4"));
        datos.add(new InformacionAtributos("Andres Arandia",R.drawable.perro_arreglado_5,"5"));
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_interface2, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.puntos_3) {
            Toast.makeText(getBaseContext(),"Estas en la 2 interface", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}