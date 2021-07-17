package kg.megacom.natvservice.service;

import java.util.List;

public interface BaseService<S, T> {

    S save(S s);
    S update(S s);
    List<S> findAll();
    S findBy(T id);

}
