package myapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CsvProcessor {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        Path p = Paths.get(args[0]);
        File f = p.toFile();

        Map<String, Integer> records = new HashMap<>();

        InputStream is = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader (is);
        BufferedReader br = new BufferedReader(isr);
        String line;
        int numWords = 0;

        while ((line = br.readLine()) != null) {
            String[] values = line.split(" ");
            numWords += values.length;

            // Iterate all the words in the line
            for (String w: values) {
                String t = w.trim().toLowerCase();
                if (t.length() <= 0) {
                    continue;
                }
                if (!records.containsKey(t)) {
                    // If word is not in map, initialize the word with freq 1
                    records.put(t,1);
                } else {
                    // If word is in map, the increment the count
                    int c = records.get(t);
                    records.put(t, c+1);}
                }
                Set<String> words = records.keySet();
                for(String w: words) {
                    int count = records.get(w);
                    System.out.printf(": %s = %d \n", w, count);
                }
        
                System.out.printf("Number of columns: %d\n", numWords);
                
        
                br.close();
                isr.close();
                is.close();


    }
    
    }
}
