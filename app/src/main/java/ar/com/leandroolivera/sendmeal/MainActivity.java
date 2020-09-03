package ar.com.leandroolivera.sendmeal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn = findViewById(R.id.buttonRegistrar);
        CheckBox terminosCheckBox = findViewById(R.id.checkBoxTerminos);
        @SuppressLint("UseSwitchCompatOrMaterialCode") final Switch cargaSwitch = findViewById(R.id.swHabilitaCarga);
        final SeekBar sbMonto = findViewById(R.id.seekBarDineroInicial);


        terminosCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    btn.setEnabled(true);
                }
                else{
                    btn.setEnabled(false);
                }
            }
        });

        cargaSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(cargaSwitch.isChecked()){
                    sbMonto.setVisibility(View.VISIBLE);
                }
                else{
                    sbMonto.setVisibility(View.GONE);
                }
            }
        });
    }
}