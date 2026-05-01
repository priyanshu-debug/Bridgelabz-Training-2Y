import java.util.*;

class FileItem {
    String name;
    int size;
    boolean isFile;
    ArrayList<FileItem> children = new ArrayList<>();

    FileItem(String name, int size, boolean isFile) {
        this.name = name;
        this.size = size;
        this.isFile = isFile;
    }
}

public class DirectorySize {
    static int getSize(FileItem item) {
        if (item.isFile) {
            return item.size;   // base case
        }

        int total = 0;
        for (FileItem child : item.children) {
            total += getSize(child); 
        }

        return total;
    }

    public static void main(String[] args) {
        FileItem project = new FileItem("project", 0, false);

        FileItem src = new FileItem("src", 0, false);
        src.children.add(new FileItem("main.java", 100, true));
        src.children.add(new FileItem("utils.java", 50, true));

        FileItem docs = new FileItem("docs", 0, false);
        docs.children.add(new FileItem("readme.txt", 10, true));

        FileItem guides = new FileItem("guides", 0, false);
        guides.children.add(new FileItem("setup.pdf", 200, true));

        docs.children.add(guides);

        project.children.add(src);
        project.children.add(docs);
        project.children.add(new FileItem("config.xml", 20, true));

        System.out.println("Total Size = " + getSize(project) + " KB");
    }
}