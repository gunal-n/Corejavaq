// 01).File input / output Strem of the collection//
//to create  the folder in the path we give //
import java.io.File;

// class Filestrem{
//     public static void main(String[] args) {
//         File file = new File("E:\\File\\JAVA");//Make the folder name as // in frent of name// and creat the folder in path//

//         boolean present = file.exists();
//         System.out.println("file present " + present);

//         if(present == false){
//             file.mkdirs();
//         }

//         present = file.exists();
//         System.out.println("file present " + present);

//     }
// }

//02)To creat the file in the folder//

// class Filestrem{
//     public static void main(String[] args) {
//         File file = new File("E:\\File\\JAVA\\text.txt");//After the folder name give the file name as .txt etc..//

//         boolean present = file.exists();
        

//         if(present == false){
//             try{
//                 boolean created = file.createNewFile(); // To create the file in folder path try and catch is used//
//                 System.out.println("File create " + created);
//             }
//             catch (Exception e){
//                                  System.out.println(e);
//             }
//         }
//     }
// }

//03)To delete the file through this//

// class Filestrem{
//     public static void main(String[] args) {
//         File file = new File("E:\\File\\JAVA\\text.txt");//After the folder name give the file name as .txt etc..//
//         file.delete(); // to delete the file in path//

//         boolean present = file.exists();
//         System.out.println("File deleted " + present);
//     }
// }

//04)To delete the file into the folder through path//

class Filestrem{
    public static void main(String[] args) {
        File file = new File("E:\\File\\JAVA\\text.txt");//After the folder name give the file name as .txt etc..//
        file.delete(); // to delete the file in path//

        boolean present = file.exists();
        System.out.println("File deleted " + present);
    }
}

