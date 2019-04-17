package work.shmobile.servicefeign.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import work.shmobile.servicefeign.service.SchedualService;

@RestController
public class HiController{

    @Autowired
    SchedualService schedualService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return schedualService.sayHiFromClient(name);
    }
}