import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final DrawPanel dp;

    //
    public MainWindow() throws HeadlessException {
        dp = new DrawPanel(this.getWidth(), this.getHeight(), 100);
        this.add(dp);
    }
}
