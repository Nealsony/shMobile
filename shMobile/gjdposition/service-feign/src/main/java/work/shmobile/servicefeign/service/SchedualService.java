package work.shmobile.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import work.shmobile.servicefeign.service.fallback.SchedualServiceHystrix;

@FeignClient(value = "eureka-client",fallback = SchedualServiceHystrix.class)
public interface SchedualService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClient(@RequestParam(value = "name") String name);
}
