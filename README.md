# EPQTestingNotWorking

This is the logcat error I get when I press button to navigate to 'activity_timetable.xml' (the activity I want to have the timetable HTML thing).


04-05 22:24:59.525  18286-18300/comepqtesting.wix.socot.epqtesting E/Surface﹕ getSlotFromBufferLocked: unknown buffer: 0xaaad27a0
04-05 22:25:00.296  18286-18286/comepqtesting.wix.socot.epqtesting E/AndroidRuntime﹕ FATAL EXCEPTION: main
    Process: comepqtesting.wix.socot.epqtesting, PID: 18286
    java.lang.RuntimeException: Unable to instantiate activity ComponentInfo{comepqtesting.wix.socot.epqtesting/comepqtesting.wix.socot.epqtesting.Timetable}: java.lang.NullPointerException: Attempt to invoke virtual method 'android.view.View android.view.Window.findViewById(int)' on a null object reference
            at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2327)
            at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2476)
            at android.app.ActivityThread.-wrap11(ActivityThread.java)
            at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1344)
            at android.os.Handler.dispatchMessage(Handler.java:102)
            at android.os.Looper.loop(Looper.java:148)
            at android.app.ActivityThread.main(ActivityThread.java:5417)
            at java.lang.reflect.Method.invoke(Native Method)
            at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:726)
            at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:616)
     Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'android.view.View android.view.Window.findViewById(int)' on a null object reference
            at android.app.Activity.findViewById(Activity.java:2090)
            at comepqtesting.wix.socot.epqtesting.Timetable.<init>(Timetable.java:14)
            at java.lang.Class.newInstance(Native Method)
            at android.app.Instrumentation.newActivity(Instrumentation.java:1067)
            at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2317)
            at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2476)
            at android.app.ActivityThread.-wrap11(ActivityThread.java)
            at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1344)
            at android.os.Handler.dispatchMessage(Handler.java:102)
            at android.os.Looper.loop(Looper.java:148)
            at android.app.ActivityThread.main(ActivityThread.java:5417)
            at java.lang.reflect.Method.invoke(Native Method)
            at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:726)
            at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:616)



Here is the LogCat when attempting to add a new 'Revision Task' in 'activity_revision.xml'

04-05 23:16:50.573    5395-5409/comepqtesting.wix.socot.epqtesting E/Surface﹕ getSlotFromBufferLocked: unknown buffer: 0xaaad2490
04-05 23:16:52.533    5395-5395/comepqtesting.wix.socot.epqtesting E/AndroidRuntime﹕ FATAL EXCEPTION: main
    Process: comepqtesting.wix.socot.epqtesting, PID: 5395
    java.lang.NullPointerException: Attempt to invoke virtual method 'android.text.Editable android.widget.EditText.getText()' on a null object reference
            at comepqtesting.wix.socot.epqtesting.Revision$1.onClick(Revision.java:58)
            at android.view.View.performClick(View.java:5198)
            at android.view.View$PerformClick.run(View.java:21147)
            at android.os.Handler.handleCallback(Handler.java:739)
            at android.os.Handler.dispatchMessage(Handler.java:95)
            at android.os.Looper.loop(Looper.java:148)
            at android.app.ActivityThread.main(ActivityThread.java:5417)
            at java.lang.reflect.Method.invoke(Native Method)





