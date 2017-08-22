package co.br.adsim.api;

/**
 * Created by fernandofagundes on 22/08/17.
 */
public class Main {


    public static void main(String[] ags){

        try {
            AdsimApi adsimApi = new AdsimApi(new Credential("fagundes@adsim.com.br", "live0102"), Enviroment.LOCAL);
            adsimApi.content(new ReservaProgramacao());
            adsimApi.send();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
