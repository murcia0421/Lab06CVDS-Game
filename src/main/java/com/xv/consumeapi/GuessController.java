package com.xv.consumeapi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class GuessController {

    private int prize = 100000;
    private String message = "";

    @RequestMapping("/guess")
    public String showGuessForm(Model model) {
        model.addAttribute("prize", prize);
        return "guess_form";
    }

    @PostMapping("/guess")
    public String handleGuess(@RequestParam int number, Model model) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        if (number == randomNumber) {
            message = "¡Felicidades! Has ganado $" + prize + ".";
            prize = 100000;
        } else {
            prize -= 10000;
            if (prize < 0) {
                prize = 0;
            }
            message = "Lo siento, el número correcto era " + randomNumber + ". Inténtalo de nuevo.";
        }

        model.addAttribute("prize", prize);
        model.addAttribute("message", message);
        return "guess_form";
    }

    @RequestMapping("/reset")
    public String resetGame() {
        prize = 100000;
        message = "";
        return "redirect:/guess";
    }
}
