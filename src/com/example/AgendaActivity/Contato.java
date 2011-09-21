package com.example.AgendaActivity;

import java.util.ArrayList;
import java.util.List;

public class Contato{
    private String nome;
    private int telefone;
    private String tipoFone;
	private ArrayList listContato;

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getTipoFone() {
        return tipoFone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public void setTipoFone(String tipoFone){
        this.tipoFone = tipoFone;
    }

}
