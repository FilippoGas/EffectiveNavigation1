package com.example.android.effectivenavigation;

import java.io.Serializable;

/**
 * Rappresenta un contatto.
 *
 * @author Alessandro Fort, Filippo Gastaldello
 */
public class Contatto implements Serializable {
    private String nome;
    private String cognome;
    private String tipo;
    private int idproprietario;
    private String note;
    private String ragione_sociale;
    private int id;

    public Contatto(String nome, String cognome, String tipo, int idproprietario, String note, String ragione_sociale, int id) {
        this.nome = nome;
        this.cognome = cognome;
        this.tipo = tipo;
        this.idproprietario = idproprietario;
        this.note = note;
        this.ragione_sociale = ragione_sociale;
        this.id = id;
    }

    public Contatto() {
    }

    public String getRagioneSociale() {
        return ragione_sociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragione_sociale = ragioneSociale;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdproprietario() {
        return idproprietario;
    }

    public void setIdproprietario(int idproprietario) {
        this.idproprietario = idproprietario;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        if(tipo.equals("azienda")){
            return ragione_sociale;
        }
        else{
            return nome+" "+cognome;
        }
    }

}
