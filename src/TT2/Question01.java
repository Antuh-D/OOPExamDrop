package TT2;

import java.io.File;
import java.util.Scanner;

public class Question01 {
    static File file=new File("C:\\Users\\Asus\\Desktop\\AntuSad\\src\\TT2\\joybangla.txt");

    public static void main(String[] args) {
        try {
            Scanner Reader = new Scanner(file);
            while(Reader.hasNextLine()){
                String data= Reader.nextLine();
                System.out.println(data);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
