package com.naveen.ticket;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    private boolean enabled;
    @Column(nullable = false,unique = true,length = 45)
    private String ticketTitle;
    @Column(nullable = false,unique = true,length = 45)
    private String ticketDesc;
    @Column(nullable = false,unique = false)
    private LocalDate ticketCreatedOn;
    public Integer getId() {
        return id;
    }

    public String getTicketTitle() {
        return ticketTitle;
    }

    public String getTicketDesc() {
        return ticketDesc;
    }

    public LocalDate getTicketCreatedOn() {
        return ticketCreatedOn;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setTicketTitle(String ticketTitle) {
        this.ticketTitle = ticketTitle;
    }

    public void setTicketDesc(String ticketDesc) {
        this.ticketDesc = ticketDesc;
    }

    public void setTicketCreatedOn(LocalDate ticketCreatedOn) {
        this.ticketCreatedOn = ticketCreatedOn;
    }
}