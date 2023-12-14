package ie.tudublin.msdca.database.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Books {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int bookid;

    @NonNull
    @ColumnInfo(name = "bookName")
    private String bookName;

    @NonNull
    @ColumnInfo(name = "author")
    private String author;

    @NonNull
    @ColumnInfo(name = "reserved")
    private boolean reserved;

    public int getBookid() {
        return bookid;
    }


    public String getBookName() {
        return bookName;
    }


    public String getAuthor() {
        return author;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
