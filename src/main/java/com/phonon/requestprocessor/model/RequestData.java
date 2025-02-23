package com.phonon.requestprocessor.model;


import com.phonon.requestprocessor.enums.RequestStatus;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

public class RequestData implements Serializable {

    private UUID uuid;


    private String name;

    private Timestamp timestamp;

    private String url;

    private RequestStatus requestStatus;

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "RequestData{" + "uuid=" + uuid + ", name='" + name + '\'' +
                ", timestamp=" + timestamp + ", url='" + url + '\'' + '}';
    }
}
