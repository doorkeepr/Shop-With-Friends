package centralcpccommittee.shopwithfriends;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Yuhui on 4/22/2015.
 */
public interface SalesOnMapView {
    public void setUpMapIfNeeded();
    public void setUpMap();
    public void setMyLocationEnabled();
    public void noItem(LatLng curLocation);
    public void addMarker(LatLng curLocation,String name);
    public void itemOnMap(LatLng curLocation);
}
