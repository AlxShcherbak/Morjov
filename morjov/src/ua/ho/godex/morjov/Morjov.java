package ua.ho.godex.morjov;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import functions.Lab1Func;

public class Morjov extends Activity {
    EditText tab1Var;
    EditText tab1Par1;
    EditText tab1Output;
    TextView tab1Log;

    EditText tab2Par1;
    EditText tab2Output;
    TextView tab2Log;
    /**
     * Called when the activity is first created.
     */
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tab1Var=(EditText) findViewById(R.id.tab1Var);
        tab1Par1= (EditText) findViewById(R.id.tab1Par1);
        tab1Output= (EditText) findViewById(R.id.tab1Output);
        tab1Log= (TextView) findViewById(R.id.tab1Log);

        tab2Par1= (EditText) findViewById(R.id.tab2Par1);
        tab2Output= (EditText) findViewById(R.id.tab2Output);
        tab2Log= (TextView) findViewById(R.id.tab2Log);

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
        tabs.setCurrentTab(0);
    }

    public void lab1Calc(View view) {
        Lab1Func lab1Func=new Lab1Func();
        try {
            tab1Output.setText(lab1Func.doInterpolationEnterValues(Double.parseDouble(tab1Par1.getText().toString()),Integer.parseInt(tab1Var.getText().toString())).toString());

            tab1Log.setText("...");
        } catch (Exception e) {
            tab1Log.setText(e.toString());
        }
    }
}
