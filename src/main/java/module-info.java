module com.example.javaproject3 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.javaproject3 to javafx.fxml;
    exports com.example.javaproject3;
}