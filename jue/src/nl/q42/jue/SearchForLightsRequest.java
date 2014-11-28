package nl.q42.jue;

import java.util.List;

@SuppressWarnings("unused")
class SearchForLightsRequest {
    private List<String> deviceid;

    public SearchForLightsRequest(List<String> deviceid) {
        if (deviceid != null && (deviceid.size() == 0 || deviceid.size() > 16)) {
            throw new IllegalArgumentException(
                    "Group cannot be empty and cannot have more than 16 lights");
        }
        if (deviceid != null) {
            this.deviceid = deviceid;
        }
    }
}
