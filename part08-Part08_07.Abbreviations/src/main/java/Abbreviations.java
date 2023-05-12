
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
public class Abbreviations {

    private HashMap<String, String> abbr;

    public Abbreviations() {
        this.abbr = new HashMap<>();
    }

    public void addAbbreviation(String abbrev, String expl) {
        if (!hasAbbreviation(abbrev)) {
          this.abbr.put(abbrev, expl);  
        }      
    }

    public boolean hasAbbreviation(String abbrev) {
        if (this.abbr.containsKey(abbrev)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbrev) {
        if (hasAbbreviation(abbrev)) {
            String explanation = this.abbr.get(abbrev);
            return explanation;
        }
        return null;
    }
}
