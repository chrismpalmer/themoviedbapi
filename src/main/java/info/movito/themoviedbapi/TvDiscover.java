package info.movito.themoviedbapi;

import info.movito.themoviedbapi.model.Discover;
import org.apache.commons.lang3.StringUtils;

public class TvDiscover extends Discover {

    private static final String PARAM_AIR_DATE_GTE = "air_date.gte";
    private static final String PARAM_AIR_DATE_LTE = "air_date.lte";
    private static final String PARAM_FIRST_AIR_DATE_GTE = "air_date.gte";
    private static final String PARAM_FIRST_AIR_DATE_LTE = "air_date.lte";
    private static final String PARAM_TIMEZONE = "timezone";
    private static final String PARAM_INCLUDE_NULL_FIRST_AIRDATES = "include_null_first_air_dates";


    /**
     * Available options are <br> vote_average.desc<br> vote_average.asc<br> first_air_date.desc<br> first_air_date.asc<br>
     * popularity.desc<br> popularity.asc
     *
     * @param sortBy
     * @return
     */
    @Override
    public Discover sortBy(String sortBy) {
        return super.sortBy(sortBy);
    }

    /**
     * The maximum air date to include.
     * <p/>
     * Expected format is YYYY-MM-DD.
     *
     * @param airDateLte
     * @return
     */
    public Discover airDateLte(String airDateLte) {
        if (StringUtils.isNotBlank(airDateLte)) {
            params.put(PARAM_AIR_DATE_LTE, airDateLte);
        }
        return this;
    }

    /**
     * The minimum air date to include.
     * <p/>
     * Expected format is YYYY-MM-DD.
     *
     * @param airDateGte
     * @return
     */
    public Discover airDateGte(String airDateGte) {
        if (StringUtils.isNotBlank(airDateGte)) {
            params.put(PARAM_AIR_DATE_GTE, airDateGte);
        }
        return this;
    }

    /**
     *
     * @param timezone
     * @return
     */
    public Discover timezone(String timezone) {
        if ( StringUtils.isNotBlank(timezone)) {
            params.put(PARAM_TIMEZONE,timezone);
        }
        return this;
    }

    /**
     * The maximum air date to include.
     * <p/>
     * Expected format is YYYY-MM-DD.
     *
     * @param firstAirDateLte
     * @return
     */
    public Discover firstAirDateLte(String firstAirDateLte) {
        if (StringUtils.isNotBlank(firstAirDateLte)) {
            params.put(PARAM_FIRST_AIR_DATE_LTE, firstAirDateLte);
        }
        return this;
    }

    /**
     * The minimum air date to include.
     * <p/>
     * Expected format is YYYY-MM-DD.
     *
     * @param firstAirDateGte
     * @return
     */
    public Discover firstAirDateGte(String firstAirDateGte) {
        if (StringUtils.isNotBlank(firstAirDateGte)) {
            params.put(PARAM_FIRST_AIR_DATE_GTE, firstAirDateGte);
        }
        return this;
    }

}
