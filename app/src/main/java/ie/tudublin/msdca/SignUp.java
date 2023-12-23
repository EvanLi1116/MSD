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

public class SignUp extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        Window window = getWindow();
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        EditText studentNo = findViewById(R.id.signupstudentnoButton);
        EditText name = findViewById(R.id.signupnameButton);
        EditText password = findViewById(R.id.signuppasswordButton);
        Button backButtonS = findViewById(R.id.backButtonS);
        Button confirmButton = findViewById(R.id.confirmButton);

        backButtonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View v) {
                Intent intent = new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View v) {

            }
        });

    }
}
