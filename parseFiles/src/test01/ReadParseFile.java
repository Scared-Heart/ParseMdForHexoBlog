package test01;

import java.io.*;

public class ReadParseFile {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Users\\Breeze\\Desktop\\test");
        File[] files = folder.listFiles();
        //遍历文件
        for (File file : files) {

            BufferedReader br = new BufferedReader(new FileReader(file));
//            BufferedWriter bw = new BufferedWriter(new FileWriter(file,false));
//            System.out.println(br.readLine());
            String name = file.getName().substring(0, file.getName().length() - 3);
            StringBuilder sb = new StringBuilder();
            String line;
            boolean flag = true;

            while ((line = br.readLine()) != null) {

                if (flag) {
                    line = "---\r\n" +
                            "title: " + name + "\r\n" +
                            "---\r\n" +
                            line
                    ;
//                    System.out.println(line);
                    flag = false;
                }

                if (!flag) {
                    //非首行,加换行
                    sb.append(line + "\r\n");
                } else {
                    //如果是首行,不加换行
                    sb.append(line);
                }
            }
            OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream(file));

            os.write(sb.toString());
            os.close();

        }


    }

}
