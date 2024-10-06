import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    static Image imgPlayerOne, imgPlayerTwo;

    public ImageLoader(){

        try{
            imgPlayerOne = ImageIO.read(new File("rsc/cross.png"));
            imgPlayerTwo = ImageIO.read(new File("rsc/circle.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
