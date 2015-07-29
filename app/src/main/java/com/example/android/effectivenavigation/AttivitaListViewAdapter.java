package com.example.android.effectivenavigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Adapter personalizzato per la ListView delle Attività
 *
 * @author Alessandro Fort, Filippo Gastaldello
 */
public class AttivitaListViewAdapter extends ArrayAdapter<Attivita> {

    private final Context context;
    private final Attivita[] attivita;

    public AttivitaListViewAdapter(Context context, Attivita[] attivita){
        super(context, -1 ,attivita);
        this.context=context;
        this.attivita=attivita;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.listview_attivita_element, parent, false);          /* Imposta il layout di un singolo elemento */
        TextView tv_oggetto = (TextView) convertView.findViewById(R.id.lv_tv_oggetto);
        TextView tv_propcliente = (TextView) convertView.findViewById(R.id.lv_tv_propcliente);
        TextView tv_data = (TextView) convertView.findViewById(R.id.lv_tv_data);
        tv_oggetto.setText(getItem(position).getOggetto());
        tv_propcliente.setText("Di "+getItem(position).getProprietario()+" per "+getItem(position).getCliente().toString());

        tv_data.setText(getItem(position).getData());
        return convertView;
    }

}

