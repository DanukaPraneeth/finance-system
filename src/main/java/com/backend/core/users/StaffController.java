package com.backend.core.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StaffController {

    @Autowired
    private StaffService staffService;

    public List<Staff> newStaff = new ArrayList<Staff>(Arrays.asList(
            new Staff(1,"Rs 750","Bill 1", "string1",2),
            new Staff(2,"Rs 578","Bill 2","string 2",3)
    ));

    @RequestMapping("/staff")
    public List<Staff> getAllStaff(){
        return staffService.getAllStaff();
    }

    @RequestMapping("/staff/{id}")
    public Staff getStaff(@PathVariable int id){
        return staffService.getStaff(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/staff")
    public void addStaff(@RequestBody Staff employee){
        staffService.addStaff(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/staff/{id}")
    public void updateStaff(@PathVariable int id, @RequestBody Staff employee){
        staffService.updateStaff(id, employee);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/staff/{id}")
    public void removeStaff(@PathVariable int id){
        staffService.remveStaff(id);
    }
}
