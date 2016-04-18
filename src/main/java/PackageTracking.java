/**
 * Created by chaoliu on 4/11/16.
 */
public class PackageTracking {
    public class Location
    {
        public String city;
        public String state;
        public String zip;
        public String country;
    }

    public class TrackingStatus
    {
        public Date object_created;
        public Date object_updated;
        public String object_id;
        public String status;
        public String status_details;
        public Date status_date;
        public Location location;
    }

    public class TrackingHistory
    {
        public Date object_created;
        public String object_id;
        public String status;
        public String status_details;
        public Date status_date;
        public  location;
    }


        public String carrier;
        public String tracking_number;
        public TrackingStatus tracking_status;
        public List<TrackingHistory> tracking_history;

}
