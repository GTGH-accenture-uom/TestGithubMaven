import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            String data = FileUtils.readFileToString(
                    new File("./src/main/resources/file.txt"),
                    "UTF-8");

            System.out.println("data: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Test for commit and Push");
        System.out.println("Hello Maria");


        //Log4j
        Logger logger = LogManager.getLogger(Main.class);
        logger.info("This is an info");
        logger.error("This is an error");

        logger.info("Geia me lene Grigori");
    }

}
