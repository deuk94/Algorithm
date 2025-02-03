import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] strArr = str.split("");

        String a = "ABC";
        String b = "DEF";
        String c = "GHI";
        String d = "JKL";
        String e = "MNO";
        String f = "PQRS";
        String g = "TUV";
        String h = "WXYZ";
        String i = "operator";

        int num = 0;
        for (int j = 0; j < strArr.length; j++) {
            if (a.contains(strArr[j])) {
                num += 3;
            } else if (b.contains(strArr[j])) {
                num += 4;
            } else if (c.contains(strArr[j])) {
                num += 5;
            } else if (d.contains(strArr[j])) {
                num += 6;
            } else if (e.contains(strArr[j])) {
                num += 7;
            } else if (f.contains(strArr[j])) {
                num += 8;
            } else if (g.contains(strArr[j])) {
                num += 9;
            } else if (h.contains(strArr[j])) {
                num += 10;
            } else if (i.contains(strArr[j])) {
                num += 11;
            } else {
                num += 1;
            }
        }

        bw.write(num + "");

        br.close();
        bw.flush();
        bw.close();
    }
}