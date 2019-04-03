package alegeay.shassedetails;

public interface GerritAPI {

import retrofit2.Call;
import retrofit2.http.GET;
    public interface GerritAPI {

        @GET("")
        Call<RestPokemonResponse> getListPokemon();
    }
}
