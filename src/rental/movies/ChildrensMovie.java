package rental.movies;

public class ChildrensMovie extends Movie {

    public static final int NUM_DAYS_BASE_CONST = 3;
    public static final int FREQUENT_RENTER_POINTS = 1;
    public static final double BASE_RENTAL_COST = 1.5;
    public static final double LONG_TERM_RENTAL_COST = 1.25;

    public ChildrensMovie(String title) {
        super(title);
    }

    public double getCharge(int _daysRented) {
        double result = BASE_RENTAL_COST;
        if (_daysRented > NUM_DAYS_BASE_CONST)
            result += (_daysRented - NUM_DAYS_BASE_CONST) * LONG_TERM_RENTAL_COST;

        return result;
    }

    public int getFrequentRenterPoints(int _daysRented) {
        return FREQUENT_RENTER_POINTS;
    }
}
