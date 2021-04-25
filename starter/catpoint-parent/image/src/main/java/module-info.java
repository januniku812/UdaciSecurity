module com.udacity.image{
    requires com.udacity.security;
    requires java.desktop;
    requires com.google.gson;
    requires java.prefs;
    requires com.google.common;
    requires software.amazon.awssdk.services.rekognition;
    requires software.amazon.awssdk.core;
    requires software.amazon.awssdk.regions;
    requires software.amazon.awssdk.auth;
    requires org.slf4j;
    requires miglayout;
    exports com.udacity.image to com.udacity.security;
}