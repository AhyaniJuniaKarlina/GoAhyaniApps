package com.example.goahyaniapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Sekolah extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listSekolah = new String[] {
                "SMA Negeri 8 Pekanbaru",
                "SMAN Plus Provinsi Riau",
                "SMA Negeri 1 Pekanbaru",
                "SMA Negeri 4 Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listSekolah));
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
            if (pilihan.equals("SMA Negeri 8 Pekanbaru")){
                a = new Intent(this, sma8.class);
            }else if (pilihan.equals("SMAN Plus Provinsi Riau")){
                a = new Intent(this, smaplus.class);
            }else if (pilihan.equals("SMA Negeri 1 Pekanbaru")){
                a = new Intent(this, sma1.class);
            }else if (pilihan.equals("SMA Negeri 4 Pekanbaru")){
                a = new Intent(this, sma4.class);
            }

            startActivity(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
