import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(new File("blocks.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
        StringTokenizer st = new StringTokenizer(sc1.nextLine());

        int N = Integer.parseInt(st.nextToken());    // first integer
        int[] ret = new int[26];
        for(int i = 0; i < N; i ++) {
            st = new StringTokenizer(sc1.nextLine());
            int[] count1 = new int[26];
            int[] count2 = new int[26];
            String word1 = st.nextToken();
            for (int j = 0; j < word1.length(); j++) {
                count1[(int) word1.charAt(j) - 97]++;
            }
            String word2 = st.nextToken();
            for (int j = 0; j < word2.length(); j++) {
                count2[(int) word2.charAt(j) - 97]++;
            }
            for (int j = 0; j < 26; j++) {
                ret[j] += Math.max(count1[j], count2[j]);
            }
        }

        for(int i : ret){
            pw.println(i);
        }
        pw.close();
    }
}
