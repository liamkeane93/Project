package com.example.Club_Gaa;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import org.json.JSONObject;

/**
 * Created by Liam on 25/03/2016.
 */
public class IntermediateTeams extends Clubteams implements AdapterView.OnItemSelectedListener {

    private String[] state = { "Oranmore/Maree", "Clarenbridge"};

    Spinner spinnerOsversions;
    TextView selVersion;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intermediate);
        System.out.println(state.length);
        selVersion = (TextView) findViewById(R.id.selVersion);
        spinnerOsversions = (Spinner) findViewById(R.id.osversions);
        ArrayAdapter<String> adapter_state = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, state);
        adapter_state
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOsversions.setAdapter(adapter_state);
        spinnerOsversions.setOnItemSelectedListener(this);

    }

    public void onItemSelected(AdapterView<?> parent, View view, int position,
                               long id) {
        spinnerOsversions.setSelection(position);
        String selState = (String) spinnerOsversions.getSelectedItem();
       // selVersion.setText("Selected Android OS:" + selState);

        JSONObject post_dict = new JSONObject();

        new httpAsyncTask().execute("http://10.12.2.216:8090/SurveyServlet", post_dict.toString());

        selVersion.setText(new httpAsyncTask().getDatabaseInfo());
}

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

}

