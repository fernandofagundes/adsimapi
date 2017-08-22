package co.br.adsim.api;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.StringUtils;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fernandofagundes on 22/08/17.
 */
public class AdsimApi {


    private ReservaProgramacao reservaProgramacao;
    private String enviroment;
    private Credential credential;
    private RestTemplate restTemplate;
    private ObjectMapper objectMapper;
    private String autorization;

    public AdsimApi(Credential credential, String enviroment){
        this.credential = credential;
        this.enviroment = enviroment;
        this.restTemplate = new RestTemplate();
        this.objectMapper = new ObjectMapper();
        MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
        messageConverter.setPrettyPrint(false);
        messageConverter.setObjectMapper(objectMapper);
        restTemplate.getMessageConverters().removeIf(m -> m.getClass().getName().equals(MappingJackson2HttpMessageConverter.class.getName()));
        restTemplate.getMessageConverters().add(messageConverter);
    }



    public void content(ReservaProgramacao reservaProgramacao){
        this.reservaProgramacao = reservaProgramacao;
    }


    private void autorization() throws HttpServerErrorException, Exception {
        if(this.enviroment == null || StringUtils.isEmpty(this.enviroment)){
            throw new Exception("enviroment não pode ser null nem vaziu");
        }

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Credential> httpEntity = new HttpEntity<Credential>(credential, httpHeaders);

        ResponseEntity<Object> response = null;
        try {
            response = restTemplate.exchange(this.enviroment + "/login", HttpMethod.POST, httpEntity, Object.class);
        }catch (HttpServerErrorException e){
            e.printStackTrace();
            throw new Exception(e.getResponseBodyAsString());
        } catch (Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }

        if(response != null){
            this.autorization = response.getHeaders().get("authorization").get(0);
        }
    }

    public ResponseEntity<AdsimResponse> send() throws HttpServerErrorException, Exception {

        this.autorization();

        if(this.autorization == null){
            throw new Exception("Não foi possível conseguir a autorização");
        }

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
        httpHeaders.set("Authorization", this.autorization);
        HttpEntity<ReservaProgramacao> requestForCharge =  new HttpEntity<ReservaProgramacao>(reservaProgramacao, httpHeaders);

        try {
            return this.restTemplate.exchange(this.enviroment + "/media/rp", HttpMethod.POST, requestForCharge, AdsimResponse.class);
        }catch (HttpServerErrorException e){
            e.printStackTrace();
            throw new Exception(e.getResponseBodyAsString());
        } catch (Exception e){
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }

     }


}
