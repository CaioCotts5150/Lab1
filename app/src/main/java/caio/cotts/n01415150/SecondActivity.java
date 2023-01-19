package caio.cotts.n01415150;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        TextView textView = findViewById(R.id.textView);
        textView.setText((CharSequence) getIntent().getSerializableExtra("name"));
    }
}