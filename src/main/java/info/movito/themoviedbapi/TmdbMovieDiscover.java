package info.movito.themoviedbapi;

import info.movito.themoviedbapi.model.MovieDb;
import info.movito.themoviedbapi.model.core.MovieResultsPage;

public class TmdbMovieDiscover extends TmdbDiscover<MovieDb> {

    public TmdbMovieDiscover(TmdbApi tmdbApi) {
        super(tmdbApi);
    }

    @Override
    public String getMethod() {
        return "movie";
    }

    @Override
    protected Class<MovieResultsPage> getType() {
        return MovieResultsPage.class;
    }

}
