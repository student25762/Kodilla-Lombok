package com.crud.tasks.controller;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {

    @RequestMapping(method = RequestMethod.GET, value = "getTasks")
    public List<TaskDto> getTasks(){
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "getTask")
    public TaskDto getTask(Long taskId){
        return new TaskDto(1L, "example title", "some content");
    }

    @RequestMapping(method = RequestMethod.GET, value = "deleteTask")
    public void deleteTask(Long taskId){

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "updateTask")
    public TaskDto updateTask(TaskDto taskDto){
        return new TaskDto(1L, "edited title", "edited content");
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTask")
    public void createTask(TaskDto taskDto){

    }
}