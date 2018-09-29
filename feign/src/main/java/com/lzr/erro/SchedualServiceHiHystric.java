package com.lzr.erro;

import com.lzr.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by kongr on 2018/7/20.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {


    @Override
    public String sayHiFromClientOne(String name) {
        return "feign error" + name;
    }
}
