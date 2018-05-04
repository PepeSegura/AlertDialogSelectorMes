package com.eni.android.custom.alertdialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Date;

public class CustomAlertDialogExampleActivity extends Activity {
    /** Called when the activity is first created. */


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

      /*  int[] anos = new int[2030];
        for (int i = 2000; i < anos.length; i++){
            anos[i] = i + 1;
            System.out.println(anos[i]);
        }*/

        Dialog dialog = new Dialog(CustomAlertDialogExampleActivity.this);
        dialog.setContentView(R.layout.custom_alert);
        dialog.setTitle("Popup personalizado");

      //  Spinner anosSpinner = (Spinner) dialog.findViewById(R.id.anos);
        Spinner yearSpinner = (Spinner) dialog.findViewById(R.id.year);
        Spinner monthSpinner = (Spinner) dialog.findViewById(R.id.month);

        String ejem;
        int numero = 3;
        
        ejem = String.valueOf(numero);
        String[] year = {"2000","2001","2002","2003","2004"};
        String[] month = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

        yearSpinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, year));
        monthSpinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, month));

       // anosSpinner.setAdapter(new ArrayAdapter<Integer>( this,android.R.layout.simple_spinner_item,anos ));


        
        dialog.show();
    }
}