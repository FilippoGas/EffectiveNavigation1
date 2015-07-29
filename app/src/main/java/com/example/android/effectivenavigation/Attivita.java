package com.example.android.effectivenavigation;

import java.io.Serializable;

/**
 * Rappresenta un' attività.
 *
 * @author Alessandro Fort, Filippo Gastaldello
 */
public class Attivita implements Serializable {         /* Implementa Serializable per compatibilià con Gson */


    private String oggetto;
    private String data;
    private String ora_inizio;
    private String ora_fine;
    private Contatto cliente;
    private Progetto progetto;
    private String proprietario;
    private String stato;
    private String data_creazione;
    private String note;
    private int id_cliente;
    private int id_progetto;
    private int id_proprietario;
    private int id;

    public Attivita() {
    }

    public Attivita(String oggetto, String data, String ora_inizio, String ora_fine, Contatto cliente, Progetto progetto, String proprietario, String stato, String data_creazione, String note, int id_cliente, int id_progetto, int id_proprietario, int id) {
        this.oggetto = oggetto;
        this.data = data;
        this.ora_inizio = ora_inizio;
        this.ora_fine = ora_fine;
        this.cliente = cliente;
        this.progetto = progetto;
        this.proprietario = proprietario;
        this.stato = stato;
        this.data_creazione = data_creazione;
        this.note = note;
        this.id_cliente = id_cliente;
        this.id_progetto = id_progetto;
        this.id_proprietario = id_proprietario;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_progetto() {
        return id_progetto;
    }

    public void setId_progetto(int id_progetto) {
        this.id_progetto = id_progetto;
    }

    public int getId_proprietario() {
        return id_proprietario;
    }

    public void setId_proprietario(int id_proprietario) {
        this.id_proprietario = id_proprietario;
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOra_inizio() {
        return ora_inizio;
    }

    public void setOra_inizio(String ora_inizio) {
        this.ora_inizio = ora_inizio;
    }

    public String getOra_fine() {
        return ora_fine;
    }

    public void setOra_fine(String ora_fine) {
        this.ora_fine = ora_fine;
    }

    public Contatto getCliente() {
        return cliente;
    }

    public void setCliente(Contatto cliente) {
        this.cliente = cliente;
    }

    public Progetto getProgetto() {
        return progetto;
    }

    public void setProgetto(Progetto progetto) {
        this.progetto = progetto;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getData_creazione() {
        return data_creazione;
    }

    public void setData_creazione(String sata_creazione) {
        this.data_creazione = sata_creazione;
    }

    @Override
    public String toString() {
        return "Attivita{" +
                "oggetto='" + oggetto + '\'' +
                ", data='" + data + '\'' +
                ", ora_inizio='" + ora_inizio + '\'' +
                ", ora_fine='" + ora_fine + '\'' +
                ", cliente=" + cliente +
                ", progetto=" + progetto +
                ", proprietario=" + proprietario +
                ", stato='" + stato + '\'' +
                ", data_creazione='" + data_creazione + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
