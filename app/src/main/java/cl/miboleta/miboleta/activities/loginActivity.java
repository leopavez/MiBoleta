package cl.miboleta.miboleta.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cl.miboleta.miboleta.R;
import cl.miboleta.miboleta.menu.MenuDrawer_Activity;


public class loginActivity extends AppCompatActivity {

    Button acceder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        acceder = (Button)findViewById(R.id.btnAcceder);

        acceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginActivity.this,MenuDrawer_Activity.class);
                startActivity(intent);
                finish();

                }
        });
    }
}
