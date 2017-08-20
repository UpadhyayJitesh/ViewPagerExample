package demoapp.vp.com.viewpagerexample;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by jitesh.upadhyay on 8/7/2017.
 */

public class ApiRequester {
    public void doRequest(final String obtainer,final String error,int albumId) {
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<List<JsonDummyRepresentation>> call = apiService.getDetails(albumId);
        call.enqueue(new Callback<List<JsonDummyRepresentation>>() {
            @Override
            public void onResponse(Call<List<JsonDummyRepresentation>> call, Response<List<JsonDummyRepresentation>> response) {
                List<JsonDummyRepresentation> responseObject = (List<JsonDummyRepresentation>) response.body();
                EventBus.getDefault().post(new DataEvent(obtainer, responseObject));
            }

            @Override
            public void onFailure(Call<List<JsonDummyRepresentation>> call, Throwable t) {
                EventBus.getDefault().post(new DataEvent(error));
            }
        });
    }
}
