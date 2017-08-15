package demoapp.vp.com.viewpagerexample;

/**
 * Created by jitesh.upadhyay on 8/7/2017.
 */


import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Ravi Tamada on 18/05/16.
 */
public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {

    private Context mContext;
    private List<JsonDummyRepresentation> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, albumid,id;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title_data);
            albumid = (TextView) view.findViewById(R.id.albumid);
            id = (TextView) view.findViewById(R.id.id);
            thumbnail = (ImageView) view.findViewById(R.id.list_image);
        }
    }


    public AlbumsAdapter(Context mContext, List<JsonDummyRepresentation> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_response, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        JsonDummyRepresentation album = albumList.get(position);
        holder.title.setText(album.getTitle());
        holder.albumid.setText(album.getAlbumId() + " is the AlbumId");
        holder.id.setText(album.getId().toString() );
        Glide.with(mContext).load(album.getThumbnailUrl()).into(holder.thumbnail);

    }



    @Override
    public int getItemCount() {
        return albumList.size();
    }
}