
package demoapp.vp.com.viewpagerexample;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class JsonDummyRepresentation implements Serializable, Parcelable
{

    private Integer albumId;
    private Integer id;
    private String title;
    private String url;
    private String thumbnailUrl;
    public final static Creator<JsonDummyRepresentation> CREATOR = new Creator<JsonDummyRepresentation>() {


        @SuppressWarnings({
            "unchecked"
        })
        public JsonDummyRepresentation createFromParcel(Parcel in) {
            JsonDummyRepresentation instance = new JsonDummyRepresentation();
            instance.albumId = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.title = ((String) in.readValue((String.class.getClassLoader())));
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.thumbnailUrl = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public JsonDummyRepresentation[] newArray(int size) {
            return (new JsonDummyRepresentation[size]);
        }

    }
    ;
    private final static long serialVersionUID = -6307453698308439625L;

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(albumId);
        dest.writeValue(id);
        dest.writeValue(title);
        dest.writeValue(url);
        dest.writeValue(thumbnailUrl);
    }

    public int describeContents() {
        return  0;
    }

}
