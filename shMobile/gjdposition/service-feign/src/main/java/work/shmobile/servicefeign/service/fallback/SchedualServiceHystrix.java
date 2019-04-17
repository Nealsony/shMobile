package work.shmobile.servicefeign.service.fallback;


import org.springframework.stereotype.Component;
import work.shmobile.servicefeign.service.SchedualService;

@Component
public class SchedualServiceHystrix implements SchedualService {

    @Override
    public String sayHiFromClient(String name) {
        return "sorry, you are fail!" + name;
    }
}
