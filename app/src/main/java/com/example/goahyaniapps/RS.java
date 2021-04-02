package com.example.goahyaniapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listRS = new String[] {
                "RS Awal Bros",
                "RS Eka Hospital",
                "RS Jiwa Tampan",
                "RS Tabrani"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listRS));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try{
            Intent a = null;
            if (pilihan.equals("RS Awal Bros")){
                a = new Intent(this, RSAwalBros.class);
            }else if (pilihan.equals("RS Eka Hospital")){
                a = new Intent(this, RSEkaHospital.class);
            }else if (pilihan.equals("RS Jiwa Tampan")){
                a = new Intent(this, RSJiwaTampan.class);
            }else if (pilihan.equals("RS Tabrani")){
                a = new Intent(this, RSTabrani.class);
            }

            startActivity(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
