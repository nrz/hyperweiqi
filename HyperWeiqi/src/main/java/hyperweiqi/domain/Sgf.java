package hyperweiqi.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Sgf class provides functions for processing files in Smart Game Format (SGF).
 * http://senseis.xmp.net/?SGFFile
 */
public class Sgf {

    private String filename;
    private File file;
    private List<String> content;

    public Sgf(String filename) throws FileNotFoundException {
        this.filename = filename;
        this.file = new File(this.filename);
        this.content = new ArrayList<>();

        if (this.file.isFile()) {
            Scanner scanner = new Scanner(this.file);
            while (scanner.hasNextLine()) {
                this.content.add(scanner.nextLine());
            }
        }
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public List<String> getContent() {
        return this.content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }
}
