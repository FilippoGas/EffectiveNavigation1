package com.example.android.effectivenavigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Adapter personalizzato per interfacciare un array di progetti con una ListView
 *
 * @author Alessandro Fort, Filippo Gastaldello
 */
public class ProgettiListViewAdapter extends ArrayAdapter<Progetto> {
    private final Context context;
    private final Progetto[] progetti;

    public ProgettiListViewAdapter(Context context, Progetto[] progetti){
        super(context, -1 ,progetti);
        this.context=context;
        this.progetti=progetti;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.listview_attivita_element, parent, false);
        TextView tv_oggetto = (TextView) convertView.findViewById(R.id.lv_tv_oggetto);
        TextView tv_propcliente = (TextView) convertView.findViewById(R.id.lv_tv_propcliente);
        TextView tv_data = (TextView) convertView.findViewById(R.id.lv_tv_data);
        tv_oggetto.setText(getItem(position).getTitolo());
        tv_propcliente.setText("Per "+getItem(position).getCliente().toString());

        tv_data.setText(getItem(position).getData());
        return convertView;
    }

}

