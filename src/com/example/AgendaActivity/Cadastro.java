package com.example.AgendaActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;
import android.content.Context;
import com.example.AgendaActivity.Contato;
import com.example.AgendaActivity.Agenda;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Cadastro extends Activity {
    private EditText nome;
    private EditText telefone;
	private EditText tpTelefone;
	Agenda agenda;
	private int qtde;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.xml.cadastro);     
        nome = (EditText) findViewById(R.id.edtNome);
        telefone = (EditText) findViewById(R.id.edtFone);
		tpTelefone = (EditText) findViewById(R.id.edtTipoFone);
		agenda = ((Agenda) getApplicationContext());

    }

    public void myClickHandler(View view){
        switch (view.getId()){
            case R.id.btnSalvar:
                String sNome = nome.getText().toString();
                int sTelefone = Integer.parseInt(telefone.getText().toString());
				String sTpTelefone = tpTelefone.getText().toString();

				Contato contato = new Contato();

				contato.setNome(sNome);
				contato.setTelefone(sTelefone);
				contato.setTipoFone(sTpTelefone);
				
				agenda.addContato(contato);
				
				nome.setText("");
				telefone.setText("");
				tpTelefone.setText("");
				
                Toast.makeText(this, "Salvo novo contato", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
