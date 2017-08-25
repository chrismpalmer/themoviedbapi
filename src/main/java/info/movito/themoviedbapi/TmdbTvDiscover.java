package info.movito.themoviedbapi;

import info.movito.themoviedbapi.model.tv.TvSeries;

public class TmdbTvDiscover extends TmdbDiscover<TvSeries> {

    public TmdbTvDiscover(TmdbApi tmdbApi) {
        super(tmdbApi);
    }

    @Override
    public String getMethod() {
        return "tv";
    }

    @Override
    protected Class<TvResultsPage> getType() {
        return TvResultsPage.class;
    }
}
