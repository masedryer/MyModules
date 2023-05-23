package sg.edu.rp.c346.id22020860.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Android;
    TextView Software;
    TextView PHP;
    TextView Security;
    TextView UI;
    TextView Portfolio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Android = findViewById(R.id.textViewAndroid);
        Software = findViewById(R.id.textViewSoftware);
        PHP = findViewById(R.id.textViewPHP);
        Security = findViewById(R.id.textViewSecurity);
        UI = findViewById(R.id.textViewUI);
        Portfolio = findViewById(R.id.textViewPortfolio);


        Android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","C346");
                intent.putExtra("name","Mobile App Development");
                intent.putExtra("year",2023);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","E63A");
                startActivity(intent);

            }


        });
        Software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","C206");
                intent.putExtra("name","Software Development Process");
                intent.putExtra("year",2023);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W64P");
                startActivity(intent);

            }


        });
        PHP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","C203");
                intent.putExtra("name","Web Development in PHP ");
                intent.putExtra("year",2023);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W64P");
                startActivity(intent);

            }


        });
        UI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","C218");
                intent.putExtra("name","UI/UX designs for apps");
                intent.putExtra("year",2023);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W64P");
                startActivity(intent);

            }


        });
        Security.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","C235");
                intent.putExtra("name","IT Security and Management");
                intent.putExtra("year",2023);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W64P");
                startActivity(intent);

            }


        });
        Portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code","C390");
                intent.putExtra("name","Portfolio Development");
                intent.putExtra("year",2023);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","N/A");
                startActivity(intent);

            }


        });


    }


}