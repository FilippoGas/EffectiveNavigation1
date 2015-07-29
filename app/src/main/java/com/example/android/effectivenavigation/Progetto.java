package com.example.android.effectivenavigation;

import java.io.Serializable;

/**
 * Rappresenta un progetto.
 *
 * @author Alessandro Fort, Filippo Gastaldello
 */
public class Progetto implements Serializable {

    private String titolo;
    private Contatto cliente;
    private String proprietario;
    private String data;
    private String stato;
    private String data_creazione;
    private String note;
    private int id_cliente;
    private int id_proprietario;
    private int id;

    public Progetto(){}

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_proprietario() {
        return id_proprietario;
    }

    public void setId_proprietario(int id_proprietario) {
        this.id_proprietario = id_proprietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Contatto getCliente() {
        return cliente;
    }

    public void setCliente(Contatto cliente) {
        this.cliente = cliente;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getData_creazione() {
        return data_creazione;
    }

    public void setData_creazione(String data_creazione) {
        this.data_creazione = data_creazione;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return titolo;
    }
}
