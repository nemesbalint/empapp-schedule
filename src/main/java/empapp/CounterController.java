package empapp;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/counter")
@AllArgsConstructor
public class CounterController {
    private final CounterService counterService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void count() {
        counterService.count();
    }
}
