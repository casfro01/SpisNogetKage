module dk.caspersting.spisnogetkaget {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.caspersting.spisnogetkaget to javafx.fxml;
    exports dk.caspersting.spisnogetkaget;
}