package caio.cotts.n01415150;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);
        button.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), textView.getText().toString(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("name", textView.getText().toString());
            startActivity(intent);
        });
    }
}