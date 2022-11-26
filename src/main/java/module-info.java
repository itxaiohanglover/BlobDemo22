module com.example.blobdemo2022 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.blobdemo2022 to javafx.fxml;
    exports com.example.blobdemo2022;
}