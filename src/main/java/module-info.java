module SimpleLibraryCRM {


    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires javafx.media;
    requires java.sql;
    requires mysql.connector.java;

    exports simplelibrary;
    exports simplelibrary.controller.introStage;
    exports simplelibrary.controller.appStage;
}