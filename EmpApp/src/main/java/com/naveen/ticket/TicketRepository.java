package com.naveen.ticket;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TicketRepository extends CrudRepository<Ticket,Integer> {

    @Override
    <S extends Ticket> S save(S entity);

    @Override
    <S extends Ticket> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    Optional<Ticket> findById(Integer integer);

    @Override
    boolean existsById(Integer integer);

    @Override
    Iterable<Ticket> findAll();

    @Override
    Iterable<Ticket> findAllById(Iterable<Integer> integers);

    @Override
    long count();

    @Override
    void deleteById(Integer integer);

    @Override
    void delete(Ticket entity);

    @Override
    void deleteAllById(Iterable<? extends Integer> integers);

    @Override
    void deleteAll(Iterable<? extends Ticket> entities);

    @Override
    void deleteAll();
}
