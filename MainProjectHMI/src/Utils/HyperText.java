package Utils;

import java.awt.*;
import java.net.URISyntaxException;
import java.net.URL;

public class HyperText {
    public static void openWebpage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
