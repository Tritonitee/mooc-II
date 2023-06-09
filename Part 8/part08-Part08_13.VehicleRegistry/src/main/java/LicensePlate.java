
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public int hashCode() {
        return this.liNumber.hashCode() + this.country.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LicensePlate)) {
            return false;
        }
        LicensePlate compared = (LicensePlate) obj;

        if (this.liNumber.equals(compared.liNumber) && this.country.equals(compared.country)) {
            return true;
        }
        if(this.hashCode() == compared.hashCode()){
            return true;
        }
        return false;
    }
    

}
