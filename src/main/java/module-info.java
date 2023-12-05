module sunat.gob.pe.ejercicio03g6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens sunat.gob.pe.ejercicio03g6.controller to javafx.fxml;
    exports sunat.gob.pe.ejercicio03g6;
}

//Modelo
//acceso a la bd
//correspondencia con las tablas de bd
//las consulta hacia base de datos
//donde se encuentra la conexión hacia la base de datos