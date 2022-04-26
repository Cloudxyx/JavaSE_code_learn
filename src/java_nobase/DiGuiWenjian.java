package java_nobase;

import java.io.File;

public class DiGuiWenjian {
    public static void main(String[] args) {
        File srcfile = new File("D:\\JetBrains\\IdeaProjects\\JavaSE_code\\src");
        getAllFilePath(srcfile);
    }
    public static void getAllFilePath(File srcfile){
        File[] filearray = srcfile.listFiles();
        if (filearray != null){
            for (File file:filearray){
                if (file.isDirectory()){
                    getAllFilePath(file);
                }else{
                    System.out.println(file.getAbsoluteFile());
                }
            }
        }
    }
}
