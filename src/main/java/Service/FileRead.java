package Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public String readFromFile(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String path=reader.readLine();
        reader.close();
        return path;
    }
}
