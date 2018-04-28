package tarea1inter.com.clase3inter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Switch sw1 = findViewById(R.id.sw1);
        if(PreferenceManager.checkPref(this,PreferenceManager.PREF_SW1)) {
                sw1.setChecked(true);
        }

        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    PreferenceManager.setPref(compoundButton.getContext(),
                            PreferenceManager.PREF_SW1,
                            "1");
                }else{
                    PreferenceManager.delPref(compoundButton.getContext(),
                            PreferenceManager.PREF_SW1);
                }
            }
        });
    }




}
