module com.udacity.security{
    requires com.udacity.image;
    requires java.desktop;
    requires com.google.gson;
    requires java.prefs;
    requires com.google.common;
    exports com.udacity.security to com.udacity.image;
}