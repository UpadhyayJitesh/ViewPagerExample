package demoapp.vp.com.viewpagerexample;

import java.util.List;

/**
 * Created by jitesh.upadhyay on 8/7/2017.
 */

public class DataEvent {
    public static final String DATA_OBTAINED = "response";
    public static final String DATA_RESPONSE = "responseObject";
    public static final String DATA_ERROR = "error";
    public List<JsonDummyRepresentation> responseObject;
    public String action;

    DataEvent(String action, List<JsonDummyRepresentation> responseObject) {
        this.responseObject = responseObject;
        this.action = action;
    }

    DataEvent(String action) {
        this.action = action;
    }
}
