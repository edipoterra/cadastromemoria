package com.example.AgendaActivity;

import java.util.ArrayList;
import java.util.List;
import android.app.Application;
import com.example.AgendaActivity.Contato;

public class Agenda extends Application{
	private ArrayList listAgenda;

	public Agenda(){
		listAgenda = new ArrayList();
	}

	public void addContato(Contato contato){
		listAgenda.add(contato);
	}
	
	public ArrayList getListaContato(){
		return listAgenda;
	}
	
	public Contato getContato(int i){
		return ((Contato) listAgenda.get(i));
	}
	
	public int getTamanho(){
		return listAgenda.size();
	}

}
