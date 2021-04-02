package com.example.goahyaniapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Supermarket extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listSupermarket = new String[] {
                "Mal SKA Pekanbaru",
                "Mal Ciputra Seraya Pekanbaru",
                "Living World Pekanbaru",
                "Transmart Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listSupermarket));
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
            if (pilihan.equals("Mal SKA Pekanbaru")){
                a = new Intent(this, SKA.class);
            }else if (pilihan.equals("Mal Ciputra Seraya Pekanbaru")){
                a = new Intent(this, Ciputra.class);
            }else if (pilihan.equals("Living World Pekanbaru")){
                a = new Intent(this, Living.class);
            }else if (pilihan.equals("Transmart Pekanbaru")){
                a = new Intent(this, Transmart.class);
            }

            startActivity(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
