package rental.videogames;


public class VideoGameRental {
	private VideoGame _videoGame;
    private int _daysRented;
    private boolean _consoleRented;

    public VideoGameRental(VideoGame videoGame, int daysRented, boolean consoleRented) {
    	if(videoGame.getClass().isAssignableFrom(Ps3Game.class)||
    	   videoGame.getClass().isAssignableFrom(Xbox360Game.class)||
    	   videoGame.getClass().isAssignableFrom(WiiGame.class))
    		_videoGame = videoGame;
        _daysRented = daysRented;
        _consoleRented = consoleRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Object getVideoGame() {
        return _videoGame;
    }
    
    public double getCharge(){
    	return _videoGame.getCharge(_daysRented, _consoleRented);
    }
    
    public int getFrequentRenterPoints(){
    	return _videoGame.getFrequentRenterPoints(_daysRented, _consoleRented);
    }
}