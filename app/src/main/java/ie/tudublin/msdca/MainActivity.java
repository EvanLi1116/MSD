package ie.tudublin.msdca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

import ie.tudublin.msdca.database.DAOs.UserDAO;
import ie.tudublin.msdca.database.UserDatabase;
import ie.tudublin.msdca.database.entities.User;

public class MainActivity extends AppCompatActivity {
    private String user = "Log In";
    private String welcome = "Welcome! Please login to continue.";
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
        TextView userText = findViewById(R.id.userText);
        userText.setText(user);
        welcomeText.setText(welcome);
    }
}
