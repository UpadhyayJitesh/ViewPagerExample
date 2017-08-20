package demoapp.vp.com.viewpagerexample;

import java.util.List;

/**
 * Created by jitesh.upadhyay on 8/7/2017.
 */

public class DataEvent {
    public static final String DATA_OBTAINED1 = "response1";
    public static final String DATA_OBTAINED2 = "response2";
    public static final String DATA_RESPONSE = "responseObject";
    public static final String DATA_ERROR1 = "error1";
    public static final String DATA_ERROR2 = "error2";
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
