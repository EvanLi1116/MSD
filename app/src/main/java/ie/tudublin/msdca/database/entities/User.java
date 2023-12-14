package ie.tudublin.msdca.database.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User
{
    @NonNull
    @PrimaryKey
    private String studentNo;

    @NonNull
    @ColumnInfo(name = "name")
    private String name;

    @NonNull
    @ColumnInfo(name = "password")
    private String password;

    public String getFirstName()
    {
        return name;
    }

    public void setFirstName(String firstName)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getUid()
    {
        return studentNo;
    }

    public void setUid(String studentNo)
    {
        this.studentNo = studentNo;
    }
}
