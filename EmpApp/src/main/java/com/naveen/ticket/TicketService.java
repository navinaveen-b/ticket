package com.naveen.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired private TicketRepository repo;
    public List<Ticket> listAll(){
        return(List<Ticket>) repo.findAll();

    }
    public void save(Ticket ticket){
        repo.save(ticket);
    }
}
