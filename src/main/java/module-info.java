module br.profigor.gerenciadorestagios {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens br.profigor.gerenciadorestagios to javafx.fxml;
    opens br.profigor.gerenciadorestagios.controller to javafx.fxml;
    exports br.profigor.gerenciadorestagios;
}