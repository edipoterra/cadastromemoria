package com.example.AgendaActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import com.example.AgendaActivity.Agenda;
import com.example.AgendaActivity.Contato;

public class Visualiza extends Activity {
	private int qtde;
	ListView lista;
	Agenda agenda;
	ArrayAdapter<String> adapter;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.xml.visualizar);
		agenda = ((Agenda) getApplicationContext());

		String[] listaContatos = new String[agenda.getTamanho()];

		for (int i = 0; i < agenda.getTamanho(); i++) {
			Contato nome = agenda.getContato(i);
			listaContatos[i] = nome.getNome() + " - " + nome.getTelefone() + " - " + nome.getTipoFone();
		}
		
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaContatos); 
        lista = (ListView) findViewById(R.id.android_listContato);
        lista.setAdapter(adapter);
    }

	public void onResume(){
		super.onResume();
		
		agenda = ((Agenda) getApplicationContext());

		String[] listaContatos = new String[agenda.getTamanho()];

		for (int i = 0; i < agenda.getTamanho(); i++) {
			Contato nome = agenda.getContato(i);
			listaContatos[i] = nome.getNome() + " - " + nome.getTelefone() + " - " + nome.getTipoFone();
		}
		
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaContatos); 
        lista = (ListView) findViewById(R.id.android_listContato);
        lista.setAdapter(adapter);		
	}

}
