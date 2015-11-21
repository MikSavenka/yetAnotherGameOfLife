package edu.coderetreat.yagol.rest;

import edu.coderetreat.yagol.model.Cell;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController implements BoardApi {

    @RequestMapping("/board")
    @Override
    public Cell[][] getBoard() {
        return new Cell[1][1];
    }
}
