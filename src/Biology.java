import java.io.*;
import java.util.Scanner;

public class Biology {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("INPUT.TXT"));
        PrintWriter pw = new PrintWriter(new File("OUTPUT.TXT"));
        try {
            String seqS = scanner.next();
            String seqT = scanner.next();
            int mark = seqS.length();
            int remainLentSeqT = seqT.length();
            for (int j = remainLentSeqT - 1; (j >= 0) && (mark != 0); j--) {
                if ((seqS.charAt(mark - 1) == seqT.charAt(j))) {
                    mark--;
                }
            }
            if (mark == 0) {
                pw.print("YES");
            } else pw.print("NO");
        } catch (Exception ex) {
            pw.print("NO");
        } finally {
            pw.close();
        }

    }
}
