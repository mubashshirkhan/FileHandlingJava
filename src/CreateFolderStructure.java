import java.io.File;
import java.io.IOException;

public class CreateFolderStructure {

    public static void main(String[] args) throws IOException {

        // Root folder
        File abc = new File("abc");
        abc.mkdir();

        // Folders inside abc
        File pqr = new File(abc, "pqr");
        File stv = new File(abc, "stv");

        pqr.mkdir();
        stv.mkdir();

        // Folders inside pqr
        File dbc = new File(pqr, "dbc");
        File ebc = new File(pqr, "ebc");

        dbc.mkdir();
        ebc.mkdir();

        // Files inside dbc
        new File(dbc, "p.txt").createNewFile();
        new File(dbc, "q.zip").createNewFile();

        // Files inside abc
        new File(abc, "a.txt").createNewFile();
        new File(abc, "b.docx").createNewFile();
        new File(abc, "c.xlsx").createNewFile();
        new File(abc, "d.pptx").createNewFile();

        System.out.println("Folder structure created successfully!");
    }
}

