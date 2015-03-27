package ua.ho.godex.morjov;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import ua.ho.godex.morjov.functions.HomeWork1;
import ua.ho.godex.morjov.functions.Lab1;
import ua.ho.godex.morjov.functions.Variants;

import java.io.File;

/**
 * Created by godex
 * on  24.03.2015.19:50
 * for Morjov
 */

public class Morjov extends Activity {
    EditText tab1Var;
    EditText tab1Par1;
    EditText tab1Output;
    TextView tab1Log;
    EditText tab2Par1;
    EditText tab2Par2;
    EditText tab2Output;
    EditText tab2FilePath;

    /**
     * Called when the activity is first created.
     */
    TextView tab2Log;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tab1Var = (EditText) findViewById(R.id.tab1Var);
        tab1Par1 = (EditText) findViewById(R.id.tab1Par1);
        tab1Output = (EditText) findViewById(R.id.tab1Output);
        tab1Log = (TextView) findViewById(R.id.tab1Log);

        tab2Par1 = (EditText) findViewById(R.id.tab2Par1);

        tab2Par2 = (EditText) findViewById(R.id.tab2Par2);
        tab2Output = (EditText) findViewById(R.id.tab2Output);
        tab2Log = (TextView) findViewById(R.id.tab2Log);

        tab2FilePath = (EditText) findViewById(R.id.tab2FilePath);

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
        try {
            tab1Output.setText(Lab1.doInterpolation(tab1Par1.getText().toString(), tab1Var.getText().toString()).toString());
            tab1Log.setText("...");
        } catch (Exception e) {
            tab1Log.setText(e.toString());
            tab1Output.setText("");
        }
    }

    public void HWCalc(View view) {
        try {
            tab2Output.setText(HomeWork1.doBilinearInterpolation(tab2Par1.getText().toString(), tab2Par2.getText().toString(), new File(tab2FilePath.getText().toString())).toString());
            tab2Log.setText("...");
        } catch (Exception e) {
            for(StackTraceElement stackTraceElement:e.getStackTrace())
            tab2Log.setText(tab2Log.getText()+"\n"+stackTraceElement.toString());
            tab2Output.setText("");
        }
    }

    public void HWShowDataFile(View view) {
        try {
            for (Trio trio : Variants.getHW1Data(new File(tab2FilePath.getText().toString()))) {
                tab2Log.setText(tab2Log.getText() + "\n" + trio.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDataFile(View view) {
        int FILE_SELECT_CODE = 0;
        Intent intent1 = new Intent(Intent.ACTION_GET_CONTENT);
        intent1.setType("*/*");
        intent1.addCategory(Intent.CATEGORY_OPENABLE);
        try {
            startActivityForResult(
                    Intent.createChooser(intent1, "Выберите ФК"),
                    FILE_SELECT_CODE);
        } catch (android.content.ActivityNotFoundException ex) {
            // Potentially direct the user to the Market with a Dialog
            Toast.makeText(this, "Please install a File Manager.",
                    Toast.LENGTH_SHORT).show();
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            Uri chosenFileUri = data.getData();
            Cursor cursor = getContentResolver().query(chosenFileUri, null, null, null, null);
            cursor.moveToLast();
            switch (requestCode) {
                case 0:
                    EditText editText = (EditText) findViewById(R.id.tab2FilePath);
                    editText.setText(cursor.getString(0), TextView.BufferType.EDITABLE);
                    break;
            }
            cursor.close();
        }
    }

}
