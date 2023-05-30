/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Nasse
 */
public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) throws Exception {
        this();
        this.file = file;
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
                    .map(l -> l.split(":"))
                    .forEach(parts -> {
                        this.dictionary.put(parts[0], parts[1]);
                        this.dictionary.put(parts[1], parts[0]);
                    });
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new File(file));
            saveWords(writer);
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void add(String words, String translation) {
        if (!this.dictionary.containsKey(words)) {
            this.dictionary.put(words, translation);
        }

    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }

        for (HashMap.Entry entry : dictionary.entrySet()) {
            if (word.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    public void delete(String word) {
        this.dictionary.remove(word);
        for (HashMap.Entry entry : dictionary.entrySet()) {
            if (word.equals(entry.getValue())) {
                this.dictionary.remove(entry.getKey());
                break;
            }
        }
    }

    private void saveWords(PrintWriter writer) throws IOException {

        List<String> alreadySaved = new ArrayList<>();
        dictionary.keySet().stream().forEach(word -> {
            if (alreadySaved.contains(word)) {
                return;
            }
            String paired = word + ":" + dictionary.get(word);
            writer.println(paired);
            alreadySaved.add(word);
            alreadySaved.add(dictionary.get(word));
        });

    }

}
