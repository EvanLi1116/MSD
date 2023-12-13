package ie.tudublin.msdca.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import ie.tudublin.msdca.database.DAOs.UserDAO;
import ie.tudublin.msdca.database.entities.User;

@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {
    public abstract UserDAO getUserDAO();
}
