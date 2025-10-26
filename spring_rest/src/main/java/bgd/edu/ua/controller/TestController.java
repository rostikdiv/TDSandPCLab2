package bgd.edu.ua.controller;

import bgd.edu.ua.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resources")
public class TestController {

    @GetMapping
    public ResponseEntity<String> checkGet(){
        return ResponseEntity.ok("Hello");
    }
    @GetMapping("/classInfo")
    public ResponseEntity<String> checkGetClassInfo(){
        return ResponseEntity.ok(UserDto.getClassInfo());
    }
    @GetMapping("/{id}")
    public ResponseEntity<String> checkGetById(@PathVariable Long id){
        return ResponseEntity.ok("id "+ id);
    }
    @PostMapping
    public ResponseEntity<String> checkPost(@RequestParam String user){
        return ResponseEntity.ok("Hello "+ user);
    }
    @PostMapping("/users")
    public ResponseEntity<String> checkPostBody(@RequestBody UserDto user){
        return ResponseEntity.ok("Hello "+ user.toString());
    }
    @PutMapping("/classInfo/{data}")
    public ResponseEntity<String> checkPut(@PathVariable String data){
        UserDto.setClassInfo(data);
        return ResponseEntity.ok("Class info set to: "+ data);
    }
    @DeleteMapping("/classInfo")
    public ResponseEntity<String> checkDeleteClassInfo(){
        UserDto.clearClassInfo();
        return ResponseEntity.ok("Class info deleted");
    }
}
