package homework.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(fileSearch());
        contentSearch();
        findLines();
        printSizeOfPackage();
        createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static boolean fileSearch() {
        String folderPath = scanner.nextLine();
        String fileName = scanner.nextLine();
        String path = folderPath + "//" + fileName + ".txt";
        File file = new File(path);
        if (file.exists()) {
            return true;
        }
        return false;
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        String folderPath = scanner.nextLine();
        String keyword = scanner.nextLine();
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().contains(".txt")) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println(file.getName());
                            break;
                        } else {
                            System.out.println("wrong");
                        }
                    }
                } catch (IOException e) {
                    System.out.println("null");
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        String txtPath = scanner.nextLine();
        String keyword = scanner.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(txtPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("null");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        String path = scanner.nextLine();
        File directory = new File(path);
        if (directory.isDirectory()) {
            int size = 0;
            File file = new File(path);
            File[] files = directory.listFiles();
            for (File file1 : files) {
                if (file1.isFile()) {
                    size += file1.length();
                }
            }
            System.out.println(size);
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        String path = scanner.nextLine();
        String fileName = scanner.nextLine();
        String content = scanner.nextLine();
        String filePath = path + File.separator + fileName;
        File newFile = new File(filePath);
        try {
            FileWriter writer = new FileWriter(newFile);
            writer.write(content);
            writer.close();
        } catch (Exception e) {
            System.out.println("null");
        }
    }
}

