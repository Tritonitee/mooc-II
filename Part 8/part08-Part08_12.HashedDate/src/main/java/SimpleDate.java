
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }
    @Override
    public boolean equals(Object obj) {
//        SimpleDate comparedDate = (SimpleDate) obj;
//        if (this == obj) {
//            return true;
//        }
        if (!(obj instanceof SimpleDate)) {
            return false;
        }
        SimpleDate compared = (SimpleDate) obj;
//
//        if (this.day == compared.day && this.month == compared.month && this.year == compared.year) {
//            return true;
//        }
        if(this.hashCode() == compared.hashCode()){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.year * this.day * this.month; //To change body of generated methods, choose Tools | Templates.
    }
    

}
