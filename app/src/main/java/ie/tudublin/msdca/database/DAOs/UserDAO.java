package ie.tudublin.msdca.database.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Index;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import ie.tudublin.msdca.database.entities.User;
import java.util.List;

@Dao
public interface UserDAO
{
    @Insert
    public void insertUser(User user);

    @Update
    public void updateUser(User user);

    @Delete
    public void deleteUser(User user);

    @Query("Select * FROM USer")
    public List<User> loadAllUsers();

    @Query("Select * FROM User WHERE firstname = :firstName")
    public User getUserByName(String firstName);

}
