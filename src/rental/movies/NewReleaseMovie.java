package rental.movies;

public class NewReleaseMovie extends Movie {
    public static final double RENTAL_COST = 3;
    public static final int FREQUENT_RENTER_POINTS = 1;
    public static final int LONG_TERM_FREQUENT_RENTER_POINTS = 2;

    public NewReleaseMovie(String title) {
        super(title);
    }

    public double getCharge(int _daysRented) {
        return (double) (_daysRented * RENTAL_COST);
    }

    public int getFrequentRenterPoints(int _daysRented) {
        return _daysRented > 1 ? LONG_TERM_FREQUENT_RENTER_POINTS : FREQUENT_RENTER_POINTS;
    }
}
