package ie.tudublin.msdca;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login  extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Window window = getWindow();
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        EditText studentnoField = findViewById(R.id.studentnoField);
        EditText passwordField = findViewById(R.id.passwordField);
        Button backButtonL = findViewById(R.id.backButtonL);
        Button loginButton = findViewById(R.id.loginButton);

        backButtonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View v) {
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
            }
        });





    }
}
