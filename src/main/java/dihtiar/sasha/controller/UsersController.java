package dihtiar.sasha.controller;


import dihtiar.sasha.model.Users;
import dihtiar.sasha.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersService usersService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<Users> getUsers() {
        List<Users> users = usersService.getAll();
        return users;
    }

    @RequestMapping(value = "/users/finduserbyid", method = RequestMethod.GET)
    public Users findUser(@RequestParam("id") Long id) {
        return usersService.findUserById(id);
    }

    @RequestMapping(value = "/users/delete", method = RequestMethod.DELETE)
    public void deleteUser(@RequestBody Long id) {
        usersService.deleteUser(id);
    }

    @RequestMapping(value = "/users/new",method = RequestMethod.POST)
    public Users addUser(@RequestBody Users user){
        usersService.addUser(user);
        return user;
    }

    @RequestMapping(value = "/users/update",method = RequestMethod.POST)
    public Users updateUser(@RequestBody Users user){
        usersService.addUser(user);
        return user;
    }
}
