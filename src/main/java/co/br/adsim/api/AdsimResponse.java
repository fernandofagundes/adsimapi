package co.br.adsim.api;

import java.io.Serializable;

/**
 * Created by fernandofagundes on 22/08/17.
 */
public class AdsimResponse implements Serializable {

    private Long id;
    private String status;


    public AdsimResponse() {
    }

    public AdsimResponse(Long id, String status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
