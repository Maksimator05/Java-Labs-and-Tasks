import java.io.*;

public class FileClone {
    public static void main(String[] args) {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try {
            fileIn = new FileInputStream("D:\\Apps\\Доклады и работы по универу\\ИТ 2 семак\\Лабы\\Labs\\Lab4\\file.txt");
            fileOut = new FileOutputStream("D:\\Apps\\Доклады и работы по универу\\ИТ 2 семак\\Лабы\\Labs\\Lab4\\copied_file.txt");
            int a;
            
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (SecurityException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        finally {
            try {
                fileIn.close();
            }
            catch (IOException e) {
                System.out.println(e);
            }

            try {
                fileOut.close();
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
