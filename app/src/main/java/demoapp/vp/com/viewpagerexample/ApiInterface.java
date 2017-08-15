package demoapp.vp.com.viewpagerexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jitesh.upadhyay on 8/7/2017.
 */

public interface ApiInterface {
    @GET("albums/{albumId}/photos")
    Call<List<JsonDummyRepresentation>> getDetails(@Path("albumId") int albumId);
}
