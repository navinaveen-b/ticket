package com.naveen.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class TicketController {
    @Autowired private TicketService service;
    @GetMapping("/tickets")
    public String showTicketList(Model model){
        List<Ticket> listTickets = service.listAll();
        model.addAttribute("listTickets",listTickets);
        return "tickets";
    }
    @GetMapping("/tickets/new")
    public String showNewForm(Model model){
        model.addAttribute("ticket",new Ticket());
        return "ticket_form";
    }
    @PostMapping("/tickets/save")
    public String saveTicket(Ticket ticket){
        service.save(ticket);
        return "redirect:/tickets";
    }
}
