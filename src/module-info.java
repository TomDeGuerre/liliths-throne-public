module liliths_throne_public {
	requires javafx.fxml;
    requires javafx.controls;
    requires javafx.web;
    requires java.xml;
    requires java.rmi;
    requires java.desktop;
    requires java.scripting;
    requires org.graalvm.js.scriptengine;
	requires org.graalvm.sdk;
    
    opens com.lilithsthrone.main to javafx.graphics;
    exports com.lilithsthrone.main;
}