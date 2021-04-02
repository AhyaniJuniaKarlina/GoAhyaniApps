package com.example.goahyaniapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Polisi extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listPolisi = new String[] {
                "Polsek Pekanbaru Kota",
                "Polresta Pekanbaru",
                "Polsek Tampan",
                "Polda Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listPolisi));
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
            if (pilihan.equals("Polsek Pekanbaru Kota")){
                a = new Intent(this, Polsekkota.class);
            }else if (pilihan.equals("Polresta Pekanbaru")){
                a = new Intent(this, Polres.class);
            }else if (pilihan.equals("Polsek Tampan")){
                a = new Intent(this, Polsektampan.class);
            }else if (pilihan.equals("Polda Pekanbaru")){
                a = new Intent(this, Polda.class);
            }

            startActivity(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
