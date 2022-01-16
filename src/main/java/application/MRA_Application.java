package application;

import datatypes.User;
import dbadapter.Movie;
import interfaces.PCmds;
import interfaces.RUCmds;

import java.util.Date;
import java.util.List;

public class MRA_Application implements PCmds, RUCmds {

    @Override
    public void registerUser(String email, int age, String username) {

    }

    @Override
    public boolean usernameExists(String username) {
        return false;
    }

    @Override
    public boolean forwardAddMovie(String title, String director, String actor, Date publishingDate) {
        return false;
    }

    @Override
    public boolean movieExists(String title, String director, Date publishingDate) {
        return false;
    }

    @Override
    public boolean forwardRateMovie(User user, int movieID, int ratingsValue, String optMsg) {
        return false;
    }

    @Override
    public boolean userRatingExists(int movieID, String username) {
        return false;
    }

    @Override
    public List<Movie> forwardBrowseMovies() {
        return null;
    }
}
