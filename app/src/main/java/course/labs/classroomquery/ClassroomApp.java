package course.labs.classroomquery;

import android.app.Application;

import com.orhanobut.hawk.Hawk;

/**
 * Created by Administrator on 2017/2/19.
 */

public class ClassroomApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Hawk.init(this).build();
    }
}
