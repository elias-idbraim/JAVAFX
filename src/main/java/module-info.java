module appli.todolistfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens appli.todolistfx to javafx.fxml;
    exports appli.todolistfx;
    exports appli.todolistfx.acceuil;
    opens appli.todolistfx.acceuil to javafx.fxml;
}