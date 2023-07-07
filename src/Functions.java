import java.io.File;

public class Functions {
    public static void navigate (String filePath) {
        File folder = new File(filePath);

        File[] files = folder.listFiles();

        if (folder.exists()) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.printf("%s. Type is file \n", file);
                } else if (file.isDirectory()) {
                    System.out.printf("%s. Type is folder \n", file);
                }
            }

        } else {
            System.out.println("File path dosen't exist");
        }
    }

}
