package android.jplas.apkelmasyarakat;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {Form.class}, version = 1)
@TypeConverters({DateTypeConverter.class})
public  abstract class AppDatabase extends RoomDatabase {
    public abstract FormDAO getFormDAO();
}
