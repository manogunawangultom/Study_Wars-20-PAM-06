package android.jplas.apkelmasyarakat;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FormDAO {
    @Insert
    public void insert(Form... forms);

    @Update
    public void update(Form... forms);

    @Delete
    public void delete(Form... forms);

    @Query("SELECT * FROM form")
    public List<Form> getForms();

    @Query("SELECT * FROM form WHERE phoneNumber = :number")
    public Form getFormWithId(String number);
}
