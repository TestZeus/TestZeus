package sft.sfData.apps;

import org.junit.Test;
import sft.httpclient.GetRequest;
import sft.sfData.BaseSFData;
import sft.sfData.apps.describeAppsPOJO.Apps;

import java.io.IOException;

public class GetSFApps {
    Apps apps = new Apps();
    BaseSFData jsonMap = new BaseSFData();

    private String getAppsData() {
        String endpoint = "ui-api/apps?formFactor=Large";
        GetRequest getRequest = new GetRequest();
        return getRequest.getResponseWithOauth(endpoint).getBody().asString();
    }

    public Apps get() {
        apps = jsonMap.getDescriptionInstance(getAppsData(), Apps.class);
        return apps;
    }

    @Test
    public void checkAppData() {
        GetSFApps getSfApps = new GetSFApps();
        Apps apps = getSfApps.get();
        System.out.println(apps.getApps().get(1).getLabel());
    }
}
