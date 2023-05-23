package sg.edu.rp.c346.id22020860.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSemester;
    TextView tvCredit;
    TextView tvVenue;
    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textviewName);
        tvYear = findViewById(R.id.textviewYear);
        tvSemester = findViewById(R.id.textviewSemester);
        tvCredit = findViewById(R.id.textviewCredit);
        tvVenue = findViewById(R.id.textviewVenue);
        buttonBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String code =intentReceived.getStringExtra("code");
        tvCode.setText("Module Code:" + code);

        String Name = intentReceived.getStringExtra("name");
        tvName.setText("Module Name:" + Name);

        int Year = intentReceived.getIntExtra("year",2020);
        tvYear.setText("Academic Year:" + Year);

        int Semester = intentReceived.getIntExtra("semester",1);
        tvSemester.setText("Module Semester:" + Semester);

        int Credit = intentReceived.getIntExtra("credit",1);
        tvCredit.setText("Module Credit:" + Credit);

        String Venue = intentReceived.getStringExtra("venue");
        tvVenue.setText("Venue:" + Venue);


        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivityIntent = new Intent(ModuleDetailActivity.this,MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });

    }
}