package com.backend.core.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffRepo staffRepo;

/*    public List<Staff> newStaff = new ArrayList<Staff>(Arrays.asList(
                    new Staff(1,"Rs 750","Bill 1", "string1",2),
                    new Staff(2,"Rs 578","Bill 2","string 2",3)
            ));
*/
    public List<Staff> getAllStaff(){

        List<Staff> staff = new ArrayList<>();
        staffRepo.findAll()
                .forEach(staff::add);

        return staff;
    }

    public Staff getStaff (int id){

        return staffRepo.findOne(id);
    }

    public void addStaff(Staff employee){
        staffRepo.save(employee);
    }

    public void updateStaff (int id , Staff employee){
        staffRepo.save(employee);
    }

    public void remveStaff (int id){
        staffRepo.delete(id);
    }

}
