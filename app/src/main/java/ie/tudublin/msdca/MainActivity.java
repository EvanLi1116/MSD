package ie.tudublin.msdca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

import ie.tudublin.msdca.database.DAOs.UserDAO;
import ie.tudublin.msdca.database.UserDatabase;

public class MainActivity extends AppCompatActivity {
    private String welcome;
    private String serviceStatus;
    private String campus;
    private boolean loggedin = false;
    public UserDAO userDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = getWindow();
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        // Database setup
        userDAO = Room.databaseBuilder(this, UserDatabase.class, "user-database")
                .allowMainThreadQueries().build().getUserDAO();

        TextView welcomeText = findViewById(R.id.welcomeText);
        TextView statusText = findViewById(R.id.statusText);
        TextView campusText = findViewById(R.id.campusText);
        Button websiteButton = findViewById(R.id.websiteButton);
        Button libraryButton = findViewById(R.id.libraryButton);
        Button reservedButton = findViewById(R.id.reservedButton);
        Button accountButton = findViewById(R.id.accountButton);

        if (loggedin == true){
            setWelcome("Welcome, ");
            setServiceStatus("Please select a service...");
            setCampus("Your campus is: ");
        }
        else {
            setWelcome("Welcome!");
            setServiceStatus("Please login to access services.");
            setCampus("No campus selected.");
        }

        welcomeText.setText(welcome);
        statusText.setText(serviceStatus);
        campusText.setText(campus);

        websiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View v) { openWebsite(); }
        });

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View v) {
                if (loggedin == true) {
                    Intent intent = new Intent(MainActivity.this, Library.class);
                    startActivity(intent);
                }
                else { signinError(); }
            }
        });

        reservedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View v) {
                if (loggedin == true) {
                    Intent intent = new Intent(MainActivity.this, Reserved.class);
                    startActivity(intent);
                }
                else { signinError(); }
            }
        });

        accountButton.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View v) {
                if (loggedin == true) {
                    Intent intent = new Intent(MainActivity.this, AccountInfo.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(MainActivity.this, Login.class);
                    startActivity(intent);
                }

            }
        });


    }

    private void openWebsite() {
        String url = "https://www.tudublin.ie";
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(webIntent);
    }

    private void signinError() {
        Toast.makeText((Context) MainActivity.this, "Please login to access services.", Toast.LENGTH_LONG).show();
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    public void setServiceStatus(String status) {
        this.serviceStatus = status;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void setloggedin(boolean login) {
        this.loggedin = login;
    }
    public boolean getloggedin() {
        return loggedin;
    }
}
