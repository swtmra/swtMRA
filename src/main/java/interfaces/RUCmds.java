package interfaces;

import dbadapter.MovieDatabase;
import datatypes.User;
import java.util.Date;
import java.util.List;

public interface RUCmds {
    boolean forwardAddMovie(String title, String director, String actor, Date publishingDate);
    boolean movieExists(String title, String director, Date publishingDate);
    boolean forwardRateMovie(User user, int movieID, int ratingsValue, String optMsg);
    boolean userRatingExists(int movieID, String username);

    //TODO can we use the MovieDatabase as Datatype here or should we use Movie
    List<MovieDatabase> forwardBrowseMovies();
}
