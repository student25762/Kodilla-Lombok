package com.crud.tasks.controller;

import com.crud.tasks.domain.CreatedTrelloCard;
import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.trello.client.TrelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1/trello")
public class TrelloController {

    @Autowired
    private TrelloClient trelloClient;

    @RequestMapping(method = RequestMethod.GET, value = "getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloClient.getTrelloBoards();
//
//        List<TrelloBoardDto> trelloBoards = trelloClient.getTrelloBoards().stream()
//                .filter(t -> t.getId() != null && !t.getName().isEmpty())
//                .filter(t -> t.getName().contains("Kodilla"))
//                .collect(Collectors.toList());
//
//        trelloBoards.forEach(trelloBoardDto -> {
//            System.out.println(trelloBoardDto.getName() + " - " + trelloBoardDto.getId());
//
//            System.out.println("This board contains: ");
//
//            trelloBoardDto.getLists().forEach(trelloList -> System.out.println(trelloList.getId() + " - " + trelloList.getName() + " - " + trelloList.isClosed()));
//        });
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTrelloCard")
    public CreatedTrelloCard createTrelloCard(@RequestBody TrelloCardDto trelloCardDto){
        return trelloClient.createNewCard(trelloCardDto);
    }
        
}