# EPQTestingNotWorking
I was trying to add this SQLiteDatabasing from this guys videos (see videos 8-11) https://www.youtube.com/watch?v=xKuM3cHO7G8&index=9&list=PL_PaSTBkUwk4PXlhZIe4COpwnWeCRnw2F

But when I try to run the application in android studio, after I have added all the code he mentions, I get this in the Logcat, when I press to activity (homework activity) which I was editing.


    --------- beginning of system
04-04 18:29:50.117    2529-2529/? E/SQLiteLog﹕ (1) duplicate column name: address
04-04 18:29:50.118    2529-2529/? E/AndroidRuntime﹕ FATAL EXCEPTION: main
    Process: comepqtesting.wix.socot.epqtesting, PID: 2529
    java.lang.RuntimeException: Unable to start activity ComponentInfo{comepqtesting.wix.socot.epqtesting/comepqtesting.wix.socot.epqtesting.Homework}: android.database.sqlite.SQLiteException: duplicate column name: address (code 1): , while compiling: CREATE TABLE contacts(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,phone TEXT,email TEXT,address TEXT,address TEXTimageUriTEXT)
            at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2416)
            at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2476)
            at android.app.ActivityThread.-wrap11(ActivityThread.java)
            at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1344)
            at android.os.Handler.dispatchMessage(Handler.java:102)
            at android.os.Looper.loop(Looper.java:148)
            at android.app.ActivityThread.main(ActivityThread.java:5417)
            at java.lang.reflect.Method.invoke(Native Method)
            at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:726)
            at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:616)
     Caused by: android.database.sqlite.SQLiteException: duplicate column name: address (code 1): , while compiling: CREATE TABLE contacts(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,phone TEXT,email TEXT,address TEXT,address TEXTimageUriTEXT)
            at android.database.sqlite.SQLiteConnection.nativePrepareStatement(Native Method)
            at android.database.sqlite.SQLiteConnection.acquirePreparedStatement(SQLiteConnection.java:887)
            at android.database.sqlite.SQLiteConnection.prepare(SQLiteConnection.java:498)
            at android.database.sqlite.SQLiteSession.prepare(SQLiteSession.java:588)
            at android.database.sqlite.SQLiteProgram.<init>(SQLiteProgram.java:58)
            at android.database.sqlite.SQLiteStatement.<init>(SQLiteStatement.java:31)
            at android.database.sqlite.SQLiteDatabase.executeSql(SQLiteDatabase.java:1674)
            at android.database.sqlite.SQLiteDatabase.execSQL(SQLiteDatabase.java:1605)
            at comepqtesting.wix.socot.epqtesting.DatabaseHandler.onCreate(DatabaseHandler.java:35)
            at android.database.sqlite.SQLiteOpenHelper.getDatabaseLocked(SQLiteOpenHelper.java:251)
            at android.database.sqlite.SQLiteOpenHelper.getWritableDatabase(SQLiteOpenHelper.java:163)
            at comepqtesting.wix.socot.epqtesting.DatabaseHandler.getAllContacts(DatabaseHandler.java:107)
            at comepqtesting.wix.socot.epqtesting.Homework.onCreate(Homework.java:104)
            at android.app.Activity.performCreate(Activity.java:6237)
            at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1107)
            at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2369)
            at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2476)
            at android.app.ActivityThread.-wrap11(ActivityThread.java)
            at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1344)
            at android.os.Handler.dispatchMessage(Handler.java:102)
            at android.os.Looper.loop(Looper.java:148)
            at android.app.ActivityThread.main(ActivityThread.java:5417)
            at java.lang.reflect.Method.invoke(Native Method)
            at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:726)
            at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:616)
