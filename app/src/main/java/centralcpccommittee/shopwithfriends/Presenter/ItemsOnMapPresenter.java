package centralcpccommittee.shopwithfriends.Presenter;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Yuhui on 4/19/2015.
 */
public interface ItemsOnMapPresenter {
    public void setUpMapIfNeeded();
    public void setUpMap();
    public void focusLocation();
    public void setMyLocationEnabled();
    public void noItem(LatLng curLocation);
    public void addMarker(LatLng curLocation,String name);
    public void itemOnMap(LatLng curLocation);
}
