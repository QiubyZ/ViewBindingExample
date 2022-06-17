package qz.lompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import qz.lompat.MainActivity;
import qz.lompat.databinding.ActivityKeduaBinding;
import android.view.View;

public class activity_kedua extends AppCompatActivity {
  private ActivityKeduaBinding binding;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    binding = ActivityKeduaBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());
    binding.lompatpertama.setText("Lompat ke Activity Pertama");
    
    binding.lompatpertama.setOnClickListener(
        new View.OnClickListener() {
          @Override
          public void onClick(View arg0) {
            // Menuju ke class Activity x
            startActivity(new Intent(arg0.getContext(), MainActivity.class));

            // Ini untuk menutup Activity kedua atau activity saat ini (activity_kedua.class)
            finish();
          }
        });
  }
}
