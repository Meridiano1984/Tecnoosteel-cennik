module com.example.tecnoosteelcennik {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tecnoosteelcennik to javafx.fxml;
    exports com.example.tecnoosteelcennik;
//    exports com.example.tecnoosteelcennik.depricated;
//    opens com.example.tecnoosteelcennik.depricated to javafx.fxml;
}