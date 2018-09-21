package it.step.service;

import it.step.Entity.KontaktBook;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WareHouseKontaktBook {

    List currentUser = new ArrayList<KontaktBook>();

    public void add(KontaktBook kontaktBook){
        currentUser.add(kontaktBook);
    }

    public void delete(int index){
        currentUser.remove(index);
    }

    public List getAll(){
       return currentUser;
    }


}
