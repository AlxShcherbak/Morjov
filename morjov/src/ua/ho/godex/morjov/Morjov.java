package ua.ho.godex.morjov;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.Toast;
import functions.Lab1Func;

public class Morjov extends Activity {
    EditText tab1Par1;
    /**
     * Called when the activity is first created.
     */
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.);
        tab1Par1= (EditText) findViewById(R.id.tab1Par1);

        TabHost tabs = (TabHost) findViewById(android.R.id.tabhost);

        tabs.setup();

        TabHost.TabSpec spec = tabs.newTabSpec("tag1");

        spec.setContent(R.id.tab1);
        spec.setIndicator("Lab1");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("tag2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("HomeWork");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("tag3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Lab2");
        tabs.addTab(spec);
        tabs.setCurrentTab(0);*/
    }

    public void lab1Calc(View view) {
        Lab1Func lab1Func=new Lab1Func();
        lab1Func.doInterpolationEnterValues(Double.parseDouble(tab1Par1.getText().toString()));

    }
}
