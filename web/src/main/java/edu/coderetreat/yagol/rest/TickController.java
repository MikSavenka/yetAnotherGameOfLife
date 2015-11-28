package edu.coderetreat.yagol.rest;

import edu.coderetreat.yagol.model.PlainWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//todo move some annotations to interface
@RestController
public class TickController implements TickApi {

    @RequestMapping(value = "/nextGeneration", method = RequestMethod.POST)
    @Override
    public PlainWorld getNextWorldGeneration(PlainWorld currentGeneration) {
        return null;
    }
}
