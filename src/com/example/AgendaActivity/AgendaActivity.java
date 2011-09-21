package com.example.AgendaActivity;

import com.example.AgendaActivity.R;
import com.example.AgendaActivity.Cadastro;
import com.example.AgendaActivity.Visualiza;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class AgendaActivity extends TabActivity {
    
    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Resources res = getResources();
        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;

        Intent intent;
        intent = new Intent(this, Cadastro.class);
        spec = tabHost.newTabSpec("cadastro").setIndicator("Cadastro", 
                res.getDrawable(R.drawable.microfone_sel)).setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent(this, Visualiza.class);
        spec = tabHost.newTabSpec("Visualiza").setIndicator("Visualiza", res.getDrawable(R.drawable.microfone_sel)).setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(0);

    }
}
