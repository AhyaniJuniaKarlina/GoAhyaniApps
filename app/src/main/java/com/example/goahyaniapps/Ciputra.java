package com.example.goahyaniapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ciputra extends ListActivity {
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
                String nomortel = "tel:+62761868888";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));
            }else if (pilihan.equals("SMS Center")){
                String smstext = "Saya Belanja di Mal Ciputra Seraya";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:+62761868888"));
                a.putExtra("sms_body", smstext);
            }else if (pilihan.equals("Driving Direction")){
                String lokasirs = "google.navigation:q=0.5362363924374532, 101.43061794270503";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));
            }else if (pilihan.equals("Website")) {
                String website = "https://www.malciputraseraya.com/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            }else if (pilihan.equals("Info di Goggle")){
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Mal Ciputra Seraya Pekanbaru");
            }
            startActivity(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

