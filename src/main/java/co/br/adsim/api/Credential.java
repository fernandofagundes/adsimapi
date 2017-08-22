package co.br.adsim.api;

import java.io.Serializable;

/**
 * Created by fernandofagundes on 22/08/17.
 */
public class Credential implements Serializable {

    private final String username;
    private final String password;

    public Credential(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
