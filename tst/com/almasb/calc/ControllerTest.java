package com.almasb.calc;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest {

    private Controller c;

    @Before
    public void setUp() throws Exception {
        c = new Controller();
        new JFXPanel(); // Créer un panel qui ne sert à rien, mais permet d'initialiser le toolkit JavaFX (https://stackoverflow.com/questions/11273773/javafx-2-1-toolkit-not-initialized).
        c.output = new Text("");
    }

    @Test
    public void processNumpadAppendsNumberToOutput() {
        // Arrange
        c.output.setText("9");
        c.start = false;
        // Act
        c.processNumpad(new ActionEvent(new Button("7"), null));
        // Assert
        assertEquals("97", c.output.getText());
    }

}