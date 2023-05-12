
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nasse
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dick;

    public DictionaryOfManyTranslations() {
        this.dick = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dick.putIfAbsent(word, new ArrayList<>());
        this.dick.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (this.dick.containsKey(word)) {
            return this.dick.get(word);
        }
        return new ArrayList<>();
    }

    public void remove(String word) {
        this.dick.remove(word);

    }
}
