package com.example.goahyaniapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSTabrani extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listAction = new String[] {
                "Call Center",
                "SMS Center",
                "Driving Direction",
                "Website",
                "Info di Goggle",
                "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAction));
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
            if (pilihan.equals("Call Center")){
                String nomortel = "tel:0761 35464";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));
            }else if (pilihan.equals("SMS Center")){
                String smstext = "Ahyani Junia Karlina /P";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:0761 35464"));
                a.putExtra("sms_body", smstext);
            }else if (pilihan.equals("Driving Direction")){
                String lokasirs = "google.navigation:q=0.508463482667147, 101.45034087523547";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));
            }else if (pilihan.equals("Website")) {
                String website = "http://rstabrani.co.id/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            }else if (pilihan.equals("Info di Goggle")){
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Tabrani Pekanbaru");
            }
            startActivity(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
