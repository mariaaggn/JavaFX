module org.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires jakarta.persistence;
  //  requires org.hibernate.orm.core;
    requires java.naming;
   // requires java.sql;

    opens org.example.javafx to javafx.fxml;
    exports org.example.javafx;
}