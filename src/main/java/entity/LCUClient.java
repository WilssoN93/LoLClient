package entity;

import com.stirante.lolclient.ClientApi;
import com.stirante.lolclient.ClientConnectionListener;

import java.io.IOException;

public class LCUClient {

    ClientApi api;

    public LCUClient() {
        api = new ClientApi();
    }

    public String getCurrentSummoner() {
        api.addClientConnectionListener(new ClientConnectionListener() {
            @Override
            public void onClientConnected() {

                try {
                    if(!api.isAuthorized()){
                        System.out.println("Not logged in!");
                        return;
                    }
                    System.out.println("logged in");


                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            @Override
            public void onClientDisconnected() {
                System.out.println("client disconnected!");
            }
        });

        return null;
    }
}
