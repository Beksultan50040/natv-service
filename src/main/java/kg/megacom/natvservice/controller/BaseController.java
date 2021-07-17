package kg.megacom.natvservice.controller;


import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BaseController<S, T> {

    @PostMapping("/save")
    public S save(@RequestBody S s);

    @PutMapping("update")
    public S update(@RequestBody S s);

    @GetMapping("/findAll")
    public List<S> findAll();

    @GetMapping("/finById")
    public S findById (@RequestBody T id);
}
