package qz.lompat;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;
import android.view.View;
import qz.lompat.activity_kedua;
import qz.lompat.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // Inflate and get instance of binding
    binding = ActivityMainBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());
    binding.lompat.setText("Lompat Activity Ke dua");
    
    binding.lompat.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View arg0) {
            //Menuju Ke Class Activity Kedua yaitu activity_kedua.class
            startActivity(new Intent(arg0.getContext(), activity_kedua.class));
            
            //ini untuk menutup Activity yang saat ini digunakan MainActivity.class atau Activity Utama
            finish();
        }
        });
  }
}
