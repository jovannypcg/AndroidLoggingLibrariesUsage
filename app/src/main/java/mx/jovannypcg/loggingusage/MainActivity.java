package mx.jovannypcg.loggingusage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.orhanobut.logger.Logger;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import mx.jovannypcg.loggingusage.util.Constant;
import mx.jovannypcg.loggingusage.util.Utilities;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Logger.init(Constant.APP_TAG);

        Utilities.average(4, 5, 3);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Logger.i("En el metodo onResume()");

        JSONObject jo = new JSONObject();
        JSONArray ja = new JSONArray();

        ja.put("Arturo");
        ja.put("Franc");
        ja.put("Soria");
        ja.put("Arlette");
        ja.put("Saul");
        ja.put("Ochoa");

        try {
            jo.put("Programmers", ja);
            Logger.json(jo.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
