package service2.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kongr on 2018/7/20.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "serverError")
    public String hi(String name){
        return restTemplate.getForObject("http://SERVICE/hi?name="+name,String.class);
    }


    public String serverError(String name){
        return "hi,"+name+",sorry,server error!";
    }
}
